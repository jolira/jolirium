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
    private final String browser;
    private final File profile;
    private final Jolirium cached = null;

    public JoliriumServer() {
        this(CHROME, null);
    }

    public JoliriumServer(final String browser, final File profile) {
        this.browser = browser;
        this.profile = profile;
    }

    public synchronized Jolirium getJolirium() {
        final Selenium x;
        
        final x.
        final EmbeddedServer server = EmbeddedServer
                .getServer(browser, profile);
        final int port = server.getPort();

        return null;
    }
}
