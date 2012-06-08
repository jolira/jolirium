Jolirium [<img src="https://secure.travis-ci.org/jolira/jolirium.png" />](http://travis-ci.org/#!/jolira/jolirium)
=================

This is a small wrapper that manages Selenium instances and embedded servers. Multiple 
embedded servers are supported to be able to support scenarios that require such things 
(such as testing mobile applications).

Download
---------

Binaries can be download from http://repo1.maven.org/maven2/com/jolira/jolirium/

Maven
--------

Jolirium is available from the Central Maven Repository and all the mirrors using the 
following dependency:

```
<dependencies>
  <dependency>
    <groupId>com.jolira</groupId>
    <artifactId>jolirium</artifactId>
    <version>1.1.1</version>
  </dependency>
</dependencies>
```

Usage Example
-------------------

Here is a handy utility class I often use. It reuses a JoliriumServer instance for all tests.

```
package com.jolira.test;
	private static JoliriumServer server = null;

	private static URL getBaseURL() {
		final String url = System.getenv("MY_BASE_URL");

		if (url == null) {
			throw new Error("Please define environment variable MY_BASE_URL");
		}

		try {
			return new URL(url);
		} catch (final MalformedURLException e) {
			throw new Error("TUX_BASE_URL is not valid", e);
		}
	}

	private static synchronized JoliriumServer getServer() {
		if (server != null) {
			return server;
		}

		final URL url = getBaseURL();

		return server = new JoliriumServer("*chrome", null, url);
	}

	public static Jolirium start() throws Exception {
		final JoliriumServer svr = getServer();

		return svr.getJolirium();
	}
```

Here is a real-life example with a test that uses Jolirium:

```
package com.jolira.test;

import static com.tmw.tuxrentalweb.test.JoliriumUtil.start;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.code.joliratools.jolirium.Jolirium;

public class MySpecialTest {
	private static Jolirium selenium;

	@BeforeClass
	public static void setUp() throws Exception {
		selenium = start();
	}

	@AfterClass
	public static void teardown() throws Exception {
		selenium.close();
	}

	@Test
	public void testUntitled() throws Exception {
		selenium.open("/home.do");
		selenium.click("link=Create an Account");
		selenium.waitForPageToLoad("30000");
		selenium.type("name=nameFirst", "Barry");
		selenium.type("name=nameLast", "Flue");
		selenium.type("id=emailID", "sales@jolira.com");
		selenium.type("name=password", "badpassword1");
		selenium.select("id=eventType", "label=Special Event");
		selenium.select("name=eventMonth", "label=April");
		selenium.select("name=eventDay", "label=16");
		selenium.select("name=eventYear", "label=2014");
		selenium.type("name=phone", "000-000-0000");
		selenium.type("name=address1", "2380 Duckdale Rd");
		selenium.type("name=address2", "1099");
		selenium.type("name=city", "Houston");
		selenium.select("name=state", "label=Texas");
		selenium.type("name=zip", "77072");
		selenium.click("name=termsConditions");
		selenium.click("css=button.btn_account.create_account");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Your Dashboard");
		selenium.click("link=SIGN OUT");
		selenium.waitForPageToLoad("30000");
	}
}
```


