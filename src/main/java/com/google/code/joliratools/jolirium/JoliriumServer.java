/**
 * (C) 2009 jolira (http://www.jolira.com). Licensed under the GNU General
 * Public License, Version 3.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * http://www.gnu.org/licenses/gpl-3.0-standalone.html Unless required by
 * applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package com.google.code.joliratools.jolirium;

import java.io.File;

import org.openqa.selenium.server.SeleniumServer;

/**
 * This server simplifies the interaction with {@link SeleniumServer}s.
 * 
 * @author Joachim F. Kainz
 * 
 */
public class JoliriumServer {
    private static final String CHROME = "*chrome";

    /**
     * Set the next port number to be used for embedded servers. If this method
     * is not called the initial number is {@literal 14444} and the number is
     * incremented every time a new embedded server has to be constructed.
     * 
     * @param portNumber
     *            the next port number to be used.
     */
    public static void setNextPortNumber(final int portNumber) {
        EmbeddedServer.setNextPortNumber(portNumber);
    }

    private final String browser;

    private final File profile;

    public JoliriumServer() {
        this(CHROME, null);
    }

    public JoliriumServer(final File profile) {
        this(CHROME, profile);
    }

    public JoliriumServer(final String browser) {
        this(browser, null);
    }

    public JoliriumServer(final String browser, final File profile) {
        this.browser = browser;
        this.profile = profile;
    }

    public synchronized Jolirium getJolirium() {
        final EmbeddedServer server = EmbeddedServer.getServer(profile);
        final int port = server.getPort();

        server.clientWillOpen();

        return new SeleniumDelegate(port, browser) {
            @Override
            public void close() {
                try {
                    super.close();
                } finally {
                    server.clientDidClose();
                }
            }
        };
    }
}
