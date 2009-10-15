/*
 * Format for Selenium Remote Control Java client (TestNG)
 */

load('java-rc.js');

this.name = "java-rc-testng";

// TestNG reverses the order of assert functions
Equals.prototype.assert = function() {
	return "assertEquals(" + this.e2.toString() + ", " + this.e1.toString() + ");";
}

Equals.prototype.verify = function() {
	return "assertEquals(" + this.e2.toString() + ", " + this.e1.toString() + ");";
}

options.header =
	"package ${packageName};\n" +
	"\n" +
	"import com.thoughtworks.selenium.*;\n" +
	"import org.testng.annotations.*;\n" +
	"import com.google.code.joliratools.jolirium.*;\n" +
	"import com.wm.mobile.regression.utils.*;\n" +
	"import static org.testng.Assert.*;\n" +
	"import java.util.regex.Pattern;\n" +
	"\n" +
    "public class ${className} {\n" + 
    "\tprivate Jolirium selenium;\n"
    "\n"
    "\t@BeforeMethod(alwaysRun = true)\n"+
    "\t@Parameters( { \"browser\", \"profile\" })\n" +
    "\tpublic void setupBrowser(final String browser, final String profile) {\n" +
    "\t\selenium = MobileTestUtil.getJollirium(browser, profile);\n" +
    "\t}\n" +
    "\t@Test public void ${methodName}() throws Exception {\n";
