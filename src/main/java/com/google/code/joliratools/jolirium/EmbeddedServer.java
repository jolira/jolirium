package com.google.code.joliratools.jolirium;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.server.RemoteControlConfiguration;
import org.openqa.selenium.server.SeleniumServer;

final class EmbeddedServer {
    private static final Map<String, EmbeddedServer> serverByProfile = new HashMap<String, EmbeddedServer>();
    private static Object portNumberLock = new Object();
    private static int portNumber = 14444;

    private static int getNextPortNumber() {
        synchronized (portNumberLock) {
            return portNumber++;
        }
    }

    static EmbeddedServer getServer(final File profile) {
        synchronized (serverByProfile) {
            final String path = profile == null ? "" : profile
                    .getAbsolutePath();
            final EmbeddedServer existing = serverByProfile.get(path);

            if (existing != null) {
                return existing;
            }

            final EmbeddedServer server = new EmbeddedServer(path, profile);

            serverByProfile.put(path, server);

            return server;
        }
    }

    private static SeleniumServer getServer(
            final RemoteControlConfiguration config) {
        try {
            return new SeleniumServer(config);
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void removeServer(final EmbeddedServer server) {
        synchronized (serverByProfile) {
            final int count = server.getCount();

            if (count > 0) {
                return;
            }

            server.stop();
            serverByProfile.remove(server.id);
        }
    }

    static void setNextPortNumber(final int portNumber) {
        synchronized (portNumberLock) {
            EmbeddedServer.portNumber = portNumber;
        }
    }

    private int counter = 0;

    private final Object counterLock = new Object();

    private SeleniumServer server = null;
    private final String id;
    private final File profile;
    private final int port = getNextPortNumber();

    private EmbeddedServer(final String id, final File profile) {
        this.id = id;
        this.profile = profile;
    }

    public void clientDidClose() {
        int count;

        synchronized (counterLock) {
            count = --counter;
        }

        if (count <= 0) {
            removeServer(this);
        }
    }

    void clientWillOpen() {
        synchronized (counterLock) {
            start();

            counter++;
        }
    }

    private int getCount() {
        synchronized (counterLock) {
            return counter;
        }
    }

    int getPort() {
        return port;
    }

    private void start() {
        if (server != null) {
            return;
        }

        final RemoteControlConfiguration config = new RemoteControlConfiguration();

        if (profile != null) {
            config.setProfilesLocation(profile);
            config.setFirefoxProfileTemplate(profile);
        }

        config.setPort(port);
        config.setSingleWindow(true);
        config.setTrustAllSSLCertificates(true);

        final SeleniumServer svr = getServer(config);

        try {
            svr.start();
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }

        server = svr;
    }

    private void stop() {
        final SeleniumServer svr = server;

        if (svr != null) {
            svr.stop();
        }
    }
}
