package com.google.code.joliratools.jolirium;

import java.net.MalformedURLException;
import java.net.URL;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

class SeleniumDelegate implements Jolirium {
    private Selenium selenium;
    private boolean isClosed = false;
    private final int port;
    private final String browser;
    private final URL baseURL;

    SeleniumDelegate(final int port, final String browser, final URL baseURL) {
        this.port = port;
        this.browser = browser;
        this.baseURL = baseURL;
    }

    public void addCustomRequestHeader(final String key, final String value) {
        check();
        selenium.addCustomRequestHeader(key, value);
    }

    public void addLocationStrategy(final String strategyName,
            final String functionDefinition) {
        check();
        selenium.addLocationStrategy(strategyName, functionDefinition);
    }

    public void addScript(final String scriptContent, final String scriptTagId) {
        check();
        selenium.addScript(scriptContent, scriptTagId);
    }

    public void addSelection(final String locator, final String optionLocator) {
        check();
        selenium.addSelection(locator, optionLocator);
    }

    public void allowNativeXpath(final String allow) {
        check();
        selenium.allowNativeXpath(allow);
    }

    public void altKeyDown() {
        check();
        selenium.altKeyDown();
    }

    public void altKeyUp() {
        check();
        selenium.altKeyUp();
    }

    public void answerOnNextPrompt(final String answer) {
        check();
        selenium.answerOnNextPrompt(answer);
    }

    public void assignId(final String locator, final String identifier) {
        check();
        selenium.assignId(locator, identifier);
    }

    public void attachFile(final String fieldLocator, final String fileLocator) {
        check();
        selenium.attachFile(fieldLocator, fileLocator);
    }

    public void captureEntirePageScreenshot(final String filename,
            final String kwargs) {
        check();
        selenium.captureEntirePageScreenshot(filename, kwargs);
    }

    public String captureEntirePageScreenshotToString(final String kwargs) {
        check();
        return selenium.captureEntirePageScreenshotToString(kwargs);
    }

    public String captureNetworkTraffic(final String type) {
        check();
        return selenium.captureNetworkTraffic(type);
    }

    public void captureScreenshot(final String filename) {
        check();
        selenium.captureScreenshot(filename);
    }

    public String captureScreenshotToString() {
        check();
        return selenium.captureScreenshotToString();
    }

    private void check() {
        checkClosed();

        if (selenium == null) {
            throw new IllegalStateException("jolirium has not been opened yet");
        }
    }

    public void check(final String locator) {
        check();
        selenium.check(locator);
    }

    private void checkClosed() {
        if (isClosed) {
            throw new IllegalStateException("jolirium already closed");
        }
    }

    public void chooseCancelOnNextConfirmation() {
        check();
        selenium.chooseCancelOnNextConfirmation();
    }

    public void chooseOkOnNextConfirmation() {
        check();
        selenium.chooseOkOnNextConfirmation();
    }

    public void click(final String locator) {
        check();
        selenium.click(locator);
    }

    public void clickAt(final String locator, final String coordString) {
        check();
        selenium.clickAt(locator, coordString);
    }

    public void close() {
        check();

        isClosed = true;
        selenium.close();
        selenium.stop();
    }

    public void contextMenu(final String locator) {
        check();
        selenium.contextMenu(locator);
    }

    public void contextMenuAt(final String locator, final String coordString) {
        check();
        selenium.contextMenuAt(locator, coordString);
    }

    public void controlKeyDown() {
        check();
        selenium.controlKeyDown();
    }

    public void controlKeyUp() {
        check();
        selenium.controlKeyUp();
    }

    public void createCookie(final String nameValuePair,
            final String optionsString) {
        check();
        selenium.createCookie(nameValuePair, optionsString);
    }

    public void deleteAllVisibleCookies() {
        check();
        selenium.deleteAllVisibleCookies();
    }

    public void deleteCookie(final String name, final String optionsString) {
        check();
        selenium.deleteCookie(name, optionsString);
    }

    public void deselectPopUp() {
        check();
        selenium.deselectPopUp();
    }

    public void doubleClick(final String locator) {
        check();
        selenium.doubleClick(locator);
    }

    public void doubleClickAt(final String locator, final String coordString) {
        check();
        selenium.doubleClickAt(locator, coordString);
    }

    public void dragAndDrop(final String locator, final String movementsString) {
        check();
        selenium.dragAndDrop(locator, movementsString);
    }

    public void dragAndDropToObject(final String locatorOfObjectToBeDragged,
            final String locatorOfDragDestinationObject) {
        check();
        selenium.dragAndDropToObject(locatorOfObjectToBeDragged,
                locatorOfDragDestinationObject);
    }

    public void dragdrop(final String locator, final String movementsString) {
        check();
        selenium.dragdrop(locator, movementsString);
    }

    public void fireEvent(final String locator, final String eventName) {
        selenium.fireEvent(locator, eventName);
    }

    public void focus(final String locator) {
        check();
        selenium.focus(locator);
    }

    public String getAlert() {
        check();
        return selenium.getAlert();
    }

    public String[] getAllButtons() {
        check();
        return selenium.getAllButtons();
    }

    public String[] getAllFields() {
        check();
        return selenium.getAllFields();
    }

    public String[] getAllLinks() {
        check();
        return selenium.getAllLinks();
    }

    public String[] getAllWindowIds() {
        check();
        return selenium.getAllWindowIds();
    }

    public String[] getAllWindowNames() {
        check();
        return selenium.getAllWindowNames();
    }

    public String[] getAllWindowTitles() {
        check();
        return selenium.getAllWindowTitles();
    }

    public String getAttribute(final String attributeLocator) {
        check();
        return selenium.getAttribute(attributeLocator);
    }

    public String[] getAttributeFromAllWindows(final String attributeName) {
        check();
        return selenium.getAttributeFromAllWindows(attributeName);
    }

    private String getBaseUrl(final String url) {
        if (baseURL != null) {
            return baseURL.toExternalForm();
        }

        try {
            final URL _url = new URL(url);
            final int _port = _url.getPort();
            final String host = _url.getHost();
            final String prot = _url.getProtocol();
            final URL base = new URL(prot, host, _port, "/");

            return base.toExternalForm();
        } catch (final MalformedURLException e) {
            throw new Error("invalid URL " + url
                    + "; please specify a base-URL", e);
        }
    }

    public String getBodyText() {
        check();
        return selenium.getBodyText();
    }

    public String getConfirmation() {
        check();
        return selenium.getConfirmation();
    }

    public String getCookie() {
        check();
        return selenium.getCookie();
    }

    public String getCookieByName(final String name) {
        check();
        return selenium.getCookieByName(name);
    }

    public Number getCursorPosition(final String locator) {
        check();
        return selenium.getCursorPosition(locator);
    }

    public Number getElementHeight(final String locator) {
        check();
        return selenium.getElementHeight(locator);
    }

    public Number getElementIndex(final String locator) {
        check();
        return selenium.getElementIndex(locator);
    }

    public Number getElementPositionLeft(final String locator) {
        check();
        return selenium.getElementPositionLeft(locator);
    }

    public Number getElementPositionTop(final String locator) {
        check();
        return selenium.getElementPositionTop(locator);
    }

    public Number getElementWidth(final String locator) {
        check();
        return selenium.getElementWidth(locator);
    }

    public String getEval(final String script) {
        check();
        return selenium.getEval(script);
    }

    public String getExpression(final String expression) {
        check();
        return selenium.getExpression(expression);
    }

    public String getHtmlSource() {
        check();
        return selenium.getHtmlSource();
    }

    public String getLocation() {
        check();
        return selenium.getLocation();
    }

    public Number getMouseSpeed() {
        check();
        return selenium.getMouseSpeed();
    }

    public String getPrompt() {
        check();
        return selenium.getPrompt();
    }

    public String getSelectedId(final String selectLocator) {
        check();
        return selenium.getSelectedId(selectLocator);
    }

    public String[] getSelectedIds(final String selectLocator) {
        check();
        return selenium.getSelectedIds(selectLocator);
    }

    public String getSelectedIndex(final String selectLocator) {
        check();
        return selenium.getSelectedIndex(selectLocator);
    }

    public String[] getSelectedIndexes(final String selectLocator) {
        check();
        return selenium.getSelectedIndexes(selectLocator);
    }

    public String getSelectedLabel(final String selectLocator) {
        check();
        return selenium.getSelectedLabel(selectLocator);
    }

    public String[] getSelectedLabels(final String selectLocator) {
        check();
        return selenium.getSelectedLabels(selectLocator);
    }

    public String getSelectedValue(final String selectLocator) {
        check();
        return selenium.getSelectedValue(selectLocator);
    }

    public String[] getSelectedValues(final String selectLocator) {
        check();
        return selenium.getSelectedValues(selectLocator);
    }

    public String[] getSelectOptions(final String selectLocator) {
        check();
        return selenium.getSelectOptions(selectLocator);
    }

    public String getSpeed() {
        check();
        return selenium.getSpeed();
    }

    public String getTable(final String tableCellAddress) {
        check();
        return selenium.getTable(tableCellAddress);
    }

    public String getText(final String locator) {
        check();
        return selenium.getText(locator);
    }

    public String getTitle() {
        check();
        return selenium.getTitle();
    }

    public String getValue(final String locator) {
        check();
        return selenium.getValue(locator);
    }

    public boolean getWhetherThisFrameMatchFrameExpression(
            final String currentFrameString, final String target) {
        check();
        return selenium.getWhetherThisFrameMatchFrameExpression(
                currentFrameString, target);
    }

    public boolean getWhetherThisWindowMatchWindowExpression(
            final String currentWindowString, final String target) {
        check();
        return selenium.getWhetherThisWindowMatchWindowExpression(
                currentWindowString, target);
    }

    public Number getXpathCount(final String xpath) {
        check();
        return selenium.getXpathCount(xpath);
    }

    public void goBack() {
        check();
        selenium.goBack();
    }

    public void highlight(final String locator) {
        check();
        selenium.highlight(locator);
    }

    public void ignoreAttributesWithoutValue(final String ignore) {
        check();
        selenium.ignoreAttributesWithoutValue(ignore);
    }

    public boolean isAlertPresent() {
        check();
        return selenium.isAlertPresent();
    }

    public boolean isChecked(final String locator) {
        check();
        return selenium.isChecked(locator);
    }

    public boolean isConfirmationPresent() {
        check();
        return selenium.isConfirmationPresent();
    }

    public boolean isCookiePresent(final String name) {
        check();
        return selenium.isCookiePresent(name);
    }

    public boolean isEditable(final String locator) {
        check();
        return selenium.isEditable(locator);
    }

    public boolean isElementPresent(final String locator) {
        check();
        return selenium.isElementPresent(locator);
    }

    public boolean isOrdered(final String locator1, final String locator2) {
        check();
        return selenium.isOrdered(locator1, locator2);
    }

    public boolean isPromptPresent() {
        check();
        return selenium.isPromptPresent();
    }

    public boolean isSomethingSelected(final String selectLocator) {
        check();
        return selenium.isSomethingSelected(selectLocator);
    }

    public boolean isTextPresent(final String pattern) {
        check();
        return selenium.isTextPresent(pattern);
    }

    public boolean isVisible(final String locator) {
        check();
        return selenium.isVisible(locator);
    }

    public void keyDown(final String locator, final String keySequence) {
        check();
        selenium.keyDown(locator, keySequence);
    }

    public void keyDownNative(final String keycode) {
        check();
        selenium.keyDownNative(keycode);
    }

    public void keyPress(final String locator, final String keySequence) {
        check();
        selenium.keyPress(locator, keySequence);
    }

    public void keyPressNative(final String keycode) {
        check();
        selenium.keyPressNative(keycode);
    }

    public void keyUp(final String locator, final String keySequence) {
        check();
        selenium.keyUp(locator, keySequence);
    }

    public void keyUpNative(final String keycode) {
        check();
        selenium.keyUpNative(keycode);
    }

    public void metaKeyDown() {
        check();
        selenium.metaKeyDown();
    }

    public void metaKeyUp() {
        check();
        selenium.metaKeyUp();
    }

    public void mouseDown(final String locator) {
        check();
        selenium.mouseDown(locator);
    }

    public void mouseDownAt(final String locator, final String coordString) {
        check();
        selenium.mouseDownAt(locator, coordString);
    }

    public void mouseDownRight(final String locator) {
        check();
        selenium.mouseDownRight(locator);
    }

    public void mouseDownRightAt(final String locator, final String coordString) {
        check();
        selenium.mouseDownRightAt(locator, coordString);
    }

    public void mouseMove(final String locator) {
        check();
        selenium.mouseMove(locator);
    }

    public void mouseMoveAt(final String locator, final String coordString) {
        check();
        selenium.mouseMoveAt(locator, coordString);
    }

    public void mouseOut(final String locator) {
        check();
        selenium.mouseOut(locator);
    }

    public void mouseOver(final String locator) {
        check();
        selenium.mouseOver(locator);
    }

    public void mouseUp(final String locator) {
        check();
        selenium.mouseUp(locator);
    }

    public void mouseUpAt(final String locator, final String coordString) {
        check();
        selenium.mouseUpAt(locator, coordString);
    }

    public void mouseUpRight(final String locator) {
        check();
        selenium.mouseUpRight(locator);
    }

    public void mouseUpRightAt(final String locator, final String coordString) {
        check();
        selenium.mouseUpRightAt(locator, coordString);
    }

    public synchronized void open(final String url) {
        checkClosed();

        if (selenium == null) {
            final String baseUrl = getBaseUrl(url);

            selenium = new DefaultSelenium("localhost", port, browser, baseUrl);

            selenium.start();
        }

        selenium.open(url);
    }

    public void openWindow(final String url, final String windowID) {
        check();
        selenium.openWindow(url, windowID);
    }

    public void refresh() {
        check();
        selenium.refresh();
    }

    public void removeAllSelections(final String locator) {
        check();
        selenium.removeAllSelections(locator);
    }

    public void removeScript(final String scriptTagId) {
        check();
        selenium.removeScript(scriptTagId);
    }

    public void removeSelection(final String locator, final String optionLocator) {
        check();
        selenium.removeSelection(locator, optionLocator);
    }

    public String retrieveLastRemoteControlLogs() {
        check();
        return selenium.retrieveLastRemoteControlLogs();
    }

    public void rollup(final String rollupName, final String kwargs) {
        check();
        selenium.rollup(rollupName, kwargs);
    }

    public void runScript(final String script) {
        check();
        selenium.runScript(script);
    }

    public void select(final String selectLocator, final String optionLocator) {
        check();
        selenium.select(selectLocator, optionLocator);
    }

    public void selectFrame(final String locator) {
        check();
        selenium.selectFrame(locator);
    }

    public void selectPopUp(final String windowID) {
        check();
        selenium.selectPopUp(windowID);
    }

    public void selectWindow(final String windowID) {
        check();
        selenium.selectWindow(windowID);
    }

    public void setBrowserLogLevel(final String logLevel) {
        check();
        selenium.setBrowserLogLevel(logLevel);
    }

    public void setContext(final String context) {
        check();
        selenium.setContext(context);
    }

    public void setCursorPosition(final String locator, final String position) {
        check();
        selenium.setCursorPosition(locator, position);
    }

    public void setExtensionJs(final String extensionJs) {
        check();
        selenium.setExtensionJs(extensionJs);
    }

    public void setMouseSpeed(final String pixels) {
        check();
        selenium.setMouseSpeed(pixels);
    }

    public void setSpeed(final String value) {
        check();
        selenium.setSpeed(value);
    }

    public void setTimeout(final String timeout) {
        check();
        selenium.setTimeout(timeout);
    }

    public void shiftKeyDown() {
        check();
        selenium.shiftKeyDown();
    }

    public void shiftKeyUp() {
        check();
        selenium.shiftKeyUp();
    }

    public void showContextualBanner() {
        check();
        selenium.showContextualBanner();
    }

    public void showContextualBanner(final String className,
            final String methodName) {
        check();
        selenium.showContextualBanner(className, methodName);
    }

    public void shutDownSeleniumServer() {
        check();
        selenium.shutDownSeleniumServer();
    }

    public void submit(final String formLocator) {
        check();
        selenium.submit(formLocator);
    }

    public void type(final String locator, final String value) {
        check();
        selenium.type(locator, value);
    }

    public void typeKeys(final String locator, final String value) {
        check();
        selenium.typeKeys(locator, value);
    }

    public void uncheck(final String locator) {
        check();
        selenium.uncheck(locator);
    }

    public void useXpathLibrary(final String libraryName) {
        check();
        selenium.useXpathLibrary(libraryName);
    }

    public void waitForCondition(final String script, final String timeout) {

        check();
        selenium.waitForCondition(script, timeout);
    }

    public void waitForFrameToLoad(final String frameAddress,
            final String timeout) {
        check();
        selenium.waitForFrameToLoad(frameAddress, timeout);
    }

    public void waitForPageToLoad(final String timeout) {
        check();
        selenium.waitForPageToLoad(timeout);
    }

    public void waitForPopUp(final String windowID, final String timeout) {
        check();
        selenium.waitForPopUp(windowID, timeout);
    }

    public void windowFocus() {
        check();
        selenium.windowFocus();
    }

    public void windowMaximize() {
        check();
        selenium.windowMaximize();
    }
}
