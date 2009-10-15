package com.google.code.joliratools.jolirium;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.security.CodeSource;
import java.security.ProtectionDomain;

import org.junit.Test;

public class JoliriumServerTest {
    @Test
    public void testBasic() throws IOException {
        JoliriumServer.setNextPortNumber(14567);

        final JoliriumServer server = new JoliriumServer();
        final Jolirium jolirium = server.getJolirium();

        jolirium.open("http://code.google.com/p/jolira-tools/wiki/jolirium");

        final File tmp = File.createTempFile("screenshot", ".png");
        final String path = tmp.getAbsolutePath();

        jolirium.captureScreenshot(path);
        jolirium.close();

        System.out.print("Screenshot at ");
        System.out.println(path);
    }

    @Test
    public void testProfile() throws IOException {
        JoliriumServer.setNextPortNumber(14567);

        final ProtectionDomain pd = JoliriumServerTest.class
                .getProtectionDomain();
        final CodeSource cs = pd.getCodeSource();
        final URL location = cs.getLocation();
        final String _file = location.getFile();
        final File base = new File(_file);
        final File profile = new File(base, "test");
        final JoliriumServer server = new JoliriumServer("*firefox", profile);
        final Jolirium jolirium = server.getJolirium();

        jolirium.open("http://code.google.com/p/jolira-tools/wiki/jolirium");

        final File tmp = File.createTempFile("screenshot", ".png");
        final String path = tmp.getAbsolutePath();

        jolirium.captureScreenshot(path);
        jolirium.close();

        System.out.print("Screenshot at ");
        System.out.println(path);
    }

    @Test
    public void testProfileWithBaseURL() throws IOException {
        JoliriumServer.setNextPortNumber(14567);

        final ProtectionDomain pd = JoliriumServerTest.class
                .getProtectionDomain();
        final CodeSource cs = pd.getCodeSource();
        final URL location = cs.getLocation();
        final String _file = location.getFile();
        final File base = new File(_file);
        final File profile = new File(base, "test");
        final JoliriumServer server = new JoliriumServer("*firefox", profile,
                new URL("http://code.google.com"));
        final Jolirium jolirium = server.getJolirium();

        jolirium.open("/p/jolira-tools/wiki/jolirium");

        final File tmp = File.createTempFile("screenshot", ".png");
        final String path = tmp.getAbsolutePath();

        jolirium.captureScreenshot(path);
        jolirium.close();

        System.out.print("Screenshot at ");
        System.out.println(path);
    }
}
