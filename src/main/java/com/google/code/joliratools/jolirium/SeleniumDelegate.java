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

    @Override
    public void addCustomRequestHeader(final String key, final String value) {
        check();
        selenium.addCustomRequestHeader(key, value);
    }

    @Override
    public void addLocationStrategy(final String strategyName, final String functionDefinition) {
        check();
        selenium.addLocationStrategy(strategyName, functionDefinition);
    }

    @Override
    public void addScript(final String scriptContent, final String scriptTagId) {
        check();
        selenium.addScript(scriptContent, scriptTagId);
    }

    @Override
    public void addSelection(final String locator, final String optionLocator) {
        check();
        selenium.addSelection(locator, optionLocator);
    }

    @Override
    public void allowNativeXpath(final String allow) {
        check();
        selenium.allowNativeXpath(allow);
    }

    @Override
    public void altKeyDown() {
        check();
        selenium.altKeyDown();
    }

    @Override
    public void altKeyUp() {
        check();
        selenium.altKeyUp();
    }

    @Override
    public void answerOnNextPrompt(final String answer) {
        check();
        selenium.answerOnNextPrompt(answer);
    }

    @Override
    public void assignId(final String locator, final String identifier) {
        check();
        selenium.assignId(locator, identifier);
    }

    @Override
    public void attachFile(final String fieldLocator, final String fileLocator) {
        check();
        selenium.attachFile(fieldLocator, fileLocator);
    }

    @Override
    public void captureEntirePageScreenshot(final String filename, final String kwargs) {
        check();
        selenium.captureEntirePageScreenshot(filename, kwargs);
    }

    @Override
    public String captureEntirePageScreenshotToString(final String kwargs) {
        check();
        return selenium.captureEntirePageScreenshotToString(kwargs);
    }

    @Override
    public String captureNetworkTraffic(final String type) {
        check();
        return selenium.captureNetworkTraffic(type);
    }

    @Override
    public void captureScreenshot(final String filename) {
        check();
        selenium.captureScreenshot(filename);
    }

    @Override
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

    @Override
    public void check(final String locator) {
        check();
        selenium.check(locator);
    }

    private void checkClosed() {
        if (isClosed) {
            throw new IllegalStateException("jolirium already closed");
        }
    }

    @Override
    public void chooseCancelOnNextConfirmation() {
        check();
        selenium.chooseCancelOnNextConfirmation();
    }

    @Override
    public void chooseOkOnNextConfirmation() {
        check();
        selenium.chooseOkOnNextConfirmation();
    }

    @Override
    public void click(final String locator) {
        check();
        selenium.click(locator);
    }

    @Override
    public void clickAt(final String locator, final String coordString) {
        check();
        selenium.clickAt(locator, coordString);
    }

    @Override
    public void close() {
        check();

        isClosed = true;
        selenium.close();
        selenium.stop();
    }

    @Override
    public void contextMenu(final String locator) {
        check();
        selenium.contextMenu(locator);
    }

    @Override
    public void contextMenuAt(final String locator, final String coordString) {
        check();
        selenium.contextMenuAt(locator, coordString);
    }

    @Override
    public void controlKeyDown() {
        check();
        selenium.controlKeyDown();
    }

    @Override
    public void controlKeyUp() {
        check();
        selenium.controlKeyUp();
    }

    @Override
    public void createCookie(final String nameValuePair, final String optionsString) {
        check();
        selenium.createCookie(nameValuePair, optionsString);
    }

    @Override
    public void deleteAllVisibleCookies() {
        check();
        selenium.deleteAllVisibleCookies();
    }

    @Override
    public void deleteCookie(final String name, final String optionsString) {
        check();
        selenium.deleteCookie(name, optionsString);
    }

    @Override
    public void deselectPopUp() {
        check();
        selenium.deselectPopUp();
    }

    @Override
    public void doubleClick(final String locator) {
        check();
        selenium.doubleClick(locator);
    }

    @Override
    public void doubleClickAt(final String locator, final String coordString) {
        check();
        selenium.doubleClickAt(locator, coordString);
    }

    @Override
    public void dragAndDrop(final String locator, final String movementsString) {
        check();
        selenium.dragAndDrop(locator, movementsString);
    }

    @Override
    public void dragAndDropToObject(final String locatorOfObjectToBeDragged, final String locatorOfDragDestinationObject) {
        check();
        selenium.dragAndDropToObject(locatorOfObjectToBeDragged, locatorOfDragDestinationObject);
    }

    @Override
    public void dragdrop(final String locator, final String movementsString) {
        check();
        selenium.dragdrop(locator, movementsString);
    }

    @Override
    public void fireEvent(final String locator, final String eventName) {
        selenium.fireEvent(locator, eventName);
    }

    @Override
    public void focus(final String locator) {
        check();
        selenium.focus(locator);
    }

    @Override
    public String getAlert() {
        check();
        return selenium.getAlert();
    }

    @Override
    public String[] getAllButtons() {
        check();
        return selenium.getAllButtons();
    }

    @Override
    public String[] getAllFields() {
        check();
        return selenium.getAllFields();
    }

    @Override
    public String[] getAllLinks() {
        check();
        return selenium.getAllLinks();
    }

    @Override
    public String[] getAllWindowIds() {
        check();
        return selenium.getAllWindowIds();
    }

    @Override
    public String[] getAllWindowNames() {
        check();
        return selenium.getAllWindowNames();
    }

    @Override
    public String[] getAllWindowTitles() {
        check();
        return selenium.getAllWindowTitles();
    }

    @Override
    public String getAttribute(final String attributeLocator) {
        check();
        return selenium.getAttribute(attributeLocator);
    }

    @Override
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
            throw new Error("invalid URL " + url + "; please specify a base-URL", e);
        }
    }

    @Override
    public String getBodyText() {
        check();
        return selenium.getBodyText();
    }

    @Override
    public String getConfirmation() {
        check();
        return selenium.getConfirmation();
    }

    @Override
    public String getCookie() {
        check();
        return selenium.getCookie();
    }

    @Override
    public String getCookieByName(final String name) {
        check();
        return selenium.getCookieByName(name);
    }

    @Override
    public Number getCursorPosition(final String locator) {
        check();
        return selenium.getCursorPosition(locator);
    }

    @Override
    public Number getElementHeight(final String locator) {
        check();
        return selenium.getElementHeight(locator);
    }

    @Override
    public Number getElementIndex(final String locator) {
        check();
        return selenium.getElementIndex(locator);
    }

    @Override
    public Number getElementPositionLeft(final String locator) {
        check();
        return selenium.getElementPositionLeft(locator);
    }

    @Override
    public Number getElementPositionTop(final String locator) {
        check();
        return selenium.getElementPositionTop(locator);
    }

    @Override
    public Number getElementWidth(final String locator) {
        check();
        return selenium.getElementWidth(locator);
    }

    @Override
    public String getEval(final String script) {
        check();
        return selenium.getEval(script);
    }

    @Override
    public String getExpression(final String expression) {
        check();
        return selenium.getExpression(expression);
    }

    @Override
    public String getHtmlSource() {
        check();
        return selenium.getHtmlSource();
    }

    @Override
    public String getLocation() {
        check();
        return selenium.getLocation();
    }

    @Override
    public Number getMouseSpeed() {
        check();
        return selenium.getMouseSpeed();
    }

    @Override
    public String getPrompt() {
        check();
        return selenium.getPrompt();
    }

    @Override
    public String getSelectedId(final String selectLocator) {
        check();
        return selenium.getSelectedId(selectLocator);
    }

    @Override
    public String[] getSelectedIds(final String selectLocator) {
        check();
        return selenium.getSelectedIds(selectLocator);
    }

    @Override
    public String getSelectedIndex(final String selectLocator) {
        check();
        return selenium.getSelectedIndex(selectLocator);
    }

    @Override
    public String[] getSelectedIndexes(final String selectLocator) {
        check();
        return selenium.getSelectedIndexes(selectLocator);
    }

    @Override
    public String getSelectedLabel(final String selectLocator) {
        check();
        return selenium.getSelectedLabel(selectLocator);
    }

    @Override
    public String[] getSelectedLabels(final String selectLocator) {
        check();
        return selenium.getSelectedLabels(selectLocator);
    }

    @Override
    public String getSelectedValue(final String selectLocator) {
        check();
        return selenium.getSelectedValue(selectLocator);
    }

    @Override
    public String[] getSelectedValues(final String selectLocator) {
        check();
        return selenium.getSelectedValues(selectLocator);
    }

    @Override
    public String[] getSelectOptions(final String selectLocator) {
        check();
        return selenium.getSelectOptions(selectLocator);
    }

    @Override
    public String getSpeed() {
        check();
        return selenium.getSpeed();
    }

    @Override
    public String getTable(final String tableCellAddress) {
        check();
        return selenium.getTable(tableCellAddress);
    }

    @Override
    public String getText(final String locator) {
        check();
        return selenium.getText(locator);
    }

    @Override
    public String getTitle() {
        check();
        return selenium.getTitle();
    }

    @Override
    public String getValue(final String locator) {
        check();
        return selenium.getValue(locator);
    }

    @Override
    public boolean getWhetherThisFrameMatchFrameExpression(final String currentFrameString, final String target) {
        check();
        return selenium.getWhetherThisFrameMatchFrameExpression(currentFrameString, target);
    }

    @Override
    public boolean getWhetherThisWindowMatchWindowExpression(final String currentWindowString, final String target) {
        check();
        return selenium.getWhetherThisWindowMatchWindowExpression(currentWindowString, target);
    }

    @Override
    public Number getXpathCount(final String xpath) {
        check();
        return selenium.getXpathCount(xpath);
    }

    @Override
    public void goBack() {
        check();
        selenium.goBack();
    }

    @Override
    public void highlight(final String locator) {
        check();
        selenium.highlight(locator);
    }

    @Override
    public void ignoreAttributesWithoutValue(final String ignore) {
        check();
        selenium.ignoreAttributesWithoutValue(ignore);
    }

    @Override
    public boolean isAlertPresent() {
        check();
        return selenium.isAlertPresent();
    }

    @Override
    public boolean isChecked(final String locator) {
        check();
        return selenium.isChecked(locator);
    }

    @Override
    public boolean isConfirmationPresent() {
        check();
        return selenium.isConfirmationPresent();
    }

    @Override
    public boolean isCookiePresent(final String name) {
        check();
        return selenium.isCookiePresent(name);
    }

    @Override
    public boolean isEditable(final String locator) {
        check();
        return selenium.isEditable(locator);
    }

    @Override
    public boolean isElementPresent(final String locator) {
        check();
        return selenium.isElementPresent(locator);
    }

    @Override
    public boolean isOrdered(final String locator1, final String locator2) {
        check();
        return selenium.isOrdered(locator1, locator2);
    }

    @Override
    public boolean isPromptPresent() {
        check();
        return selenium.isPromptPresent();
    }

    @Override
    public boolean isSomethingSelected(final String selectLocator) {
        check();
        return selenium.isSomethingSelected(selectLocator);
    }

    @Override
    public boolean isTextPresent(final String pattern) {
        check();
        return selenium.isTextPresent(pattern);
    }

    @Override
    public boolean isVisible(final String locator) {
        check();
        return selenium.isVisible(locator);
    }

    @Override
    public void keyDown(final String locator, final String keySequence) {
        check();
        selenium.keyDown(locator, keySequence);
    }

    @Override
    public void keyDownNative(final String keycode) {
        check();
        selenium.keyDownNative(keycode);
    }

    @Override
    public void keyPress(final String locator, final String keySequence) {
        check();
        selenium.keyPress(locator, keySequence);
    }

    @Override
    public void keyPressNative(final String keycode) {
        check();
        selenium.keyPressNative(keycode);
    }

    @Override
    public void keyUp(final String locator, final String keySequence) {
        check();
        selenium.keyUp(locator, keySequence);
    }

    @Override
    public void keyUpNative(final String keycode) {
        check();
        selenium.keyUpNative(keycode);
    }

    @Override
    public void metaKeyDown() {
        check();
        selenium.metaKeyDown();
    }

    @Override
    public void metaKeyUp() {
        check();
        selenium.metaKeyUp();
    }

    @Override
    public void mouseDown(final String locator) {
        check();
        selenium.mouseDown(locator);
    }

    @Override
    public void mouseDownAt(final String locator, final String coordString) {
        check();
        selenium.mouseDownAt(locator, coordString);
    }

    @Override
    public void mouseDownRight(final String locator) {
        check();
        selenium.mouseDownRight(locator);
    }

    @Override
    public void mouseDownRightAt(final String locator, final String coordString) {
        check();
        selenium.mouseDownRightAt(locator, coordString);
    }

    @Override
    public void mouseMove(final String locator) {
        check();
        selenium.mouseMove(locator);
    }

    @Override
    public void mouseMoveAt(final String locator, final String coordString) {
        check();
        selenium.mouseMoveAt(locator, coordString);
    }

    @Override
    public void mouseOut(final String locator) {
        check();
        selenium.mouseOut(locator);
    }

    @Override
    public void mouseOver(final String locator) {
        check();
        selenium.mouseOver(locator);
    }

    @Override
    public void mouseUp(final String locator) {
        check();
        selenium.mouseUp(locator);
    }

    @Override
    public void mouseUpAt(final String locator, final String coordString) {
        check();
        selenium.mouseUpAt(locator, coordString);
    }

    @Override
    public void mouseUpRight(final String locator) {
        check();
        selenium.mouseUpRight(locator);
    }

    @Override
    public void mouseUpRightAt(final String locator, final String coordString) {
        check();
        selenium.mouseUpRightAt(locator, coordString);
    }

    @Override
    public synchronized void open(final String url) {
        checkClosed();

        if (selenium == null) {
            final String baseUrl = getBaseUrl(url);

            selenium = new DefaultSelenium("localhost", port, browser, baseUrl);

            selenium.start();
        }

        selenium.open(url);
    }

    @Override
    public void openWindow(final String url, final String windowID) {
        check();
        selenium.openWindow(url, windowID);
    }

    @Override
    public void refresh() {
        check();
        selenium.refresh();
    }

    @Override
    public void removeAllSelections(final String locator) {
        check();
        selenium.removeAllSelections(locator);
    }

    @Override
    public void removeScript(final String scriptTagId) {
        check();
        selenium.removeScript(scriptTagId);
    }

    @Override
    public void removeSelection(final String locator, final String optionLocator) {
        check();
        selenium.removeSelection(locator, optionLocator);
    }

    @Override
    public String retrieveLastRemoteControlLogs() {
        check();
        return selenium.retrieveLastRemoteControlLogs();
    }

    @Override
    public void rollup(final String rollupName, final String kwargs) {
        check();
        selenium.rollup(rollupName, kwargs);
    }

    @Override
    public void runScript(final String script) {
        check();
        selenium.runScript(script);
    }

    @Override
    public void select(final String selectLocator, final String optionLocator) {
        check();
        selenium.select(selectLocator, optionLocator);
    }

    @Override
    public void selectFrame(final String locator) {
        check();
        selenium.selectFrame(locator);
    }

    @Override
    public void selectPopUp(final String windowID) {
        check();
        selenium.selectPopUp(windowID);
    }

    @Override
    public void selectWindow(final String windowID) {
        check();
        selenium.selectWindow(windowID);
    }

    @Override
    public void setBrowserLogLevel(final String logLevel) {
        check();
        selenium.setBrowserLogLevel(logLevel);
    }

    @Override
    public void setContext(final String context) {
        check();
        selenium.setContext(context);
    }

    @Override
    public void setCursorPosition(final String locator, final String position) {
        check();
        selenium.setCursorPosition(locator, position);
    }

    @Override
    public void setExtensionJs(final String extensionJs) {
        check();
        selenium.setExtensionJs(extensionJs);
    }

    @Override
    public void setMouseSpeed(final String pixels) {
        check();
        selenium.setMouseSpeed(pixels);
    }

    @Override
    public void setSpeed(final String value) {
        check();
        selenium.setSpeed(value);
    }

    @Override
    public void setTimeout(final String timeout) {
        check();
        selenium.setTimeout(timeout);
    }

    @Override
    public void shiftKeyDown() {
        check();
        selenium.shiftKeyDown();
    }

    @Override
    public void shiftKeyUp() {
        check();
        selenium.shiftKeyUp();
    }

    @Override
    public void showContextualBanner() {
        check();
        selenium.showContextualBanner();
    }

    @Override
    public void showContextualBanner(final String className, final String methodName) {
        check();
        selenium.showContextualBanner(className, methodName);
    }

    @Override
    public void shutDownSeleniumServer() {
        check();
        selenium.shutDownSeleniumServer();
    }

    @Override
    public void submit(final String formLocator) {
        check();
        selenium.submit(formLocator);
    }

    @Override
    public void type(final String locator, final String value) {
        check();
        selenium.type(locator, value);
    }

    @Override
    public void typeKeys(final String locator, final String value) {
        check();
        selenium.typeKeys(locator, value);
    }

    @Override
    public void uncheck(final String locator) {
        check();
        selenium.uncheck(locator);
    }

    @Override
    public void useXpathLibrary(final String libraryName) {
        check();
        selenium.useXpathLibrary(libraryName);
    }

    @Override
    public void waitForCondition(final String script, final String timeout) {

        check();
        selenium.waitForCondition(script, timeout);
    }

    @Override
    public void waitForFrameToLoad(final String frameAddress, final String timeout) {
        check();
        selenium.waitForFrameToLoad(frameAddress, timeout);
    }

    @Override
    public void waitForPageToLoad(final String timeout) {
        check();
        selenium.waitForPageToLoad(timeout);
    }

    @Override
    public void waitForPopUp(final String windowID, final String timeout) {
        check();
        selenium.waitForPopUp(windowID, timeout);
    }

    @Override
    public void windowFocus() {
        check();
        selenium.windowFocus();
    }

    @Override
    public void windowMaximize() {
        check();
        selenium.windowMaximize();
    }
}
