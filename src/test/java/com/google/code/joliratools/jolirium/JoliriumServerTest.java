package com.google.code.joliratools.jolirium;

import org.junit.Test;

public class JoliriumServerTest {
    @Test
    public void testCreate() {
        JoliriumServer.setNextPortNumber(14567);

        final JoliriumServer server = new JoliriumServer();
        final Jolirium jolirium = server.getJolirium();

        jolirium.open("http://www.google.com");
        jolirium.close();
    }
}
