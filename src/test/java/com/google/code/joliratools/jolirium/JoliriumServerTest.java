package com.google.code.joliratools.jolirium;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class JoliriumServerTest {
    @Test
    public void testCreate() throws IOException {
        JoliriumServer.setNextPortNumber(14567);

        final JoliriumServer server = new JoliriumServer();
        final Jolirium jolirium = server.getJolirium();

        jolirium.open("http://eztv.it/shows/327/eastwick/");

        final File tmp = File.createTempFile("screenshot", ".png");
        final String path = tmp.getAbsolutePath();

        jolirium.captureScreenshot(path);
        jolirium.close();

        System.out.print("Screenshot at ");
        System.out.println(path);
    }
}
