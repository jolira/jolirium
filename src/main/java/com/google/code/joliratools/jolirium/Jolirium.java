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

import com.thoughtworks.selenium.Selenium;

/**
 * A wrapper for;.
 * 
 * @author Joachim F. Kainz
 */
public interface Jolirium {
    /**
     * @see Selenium#addCustomRequestHeader(String, String)
     */
    public void addCustomRequestHeader(final String key, final String value);

    /**
     * @see Selenium#addLocationStrategy(String, String)
     */
    public void addLocationStrategy(final String strategyName,
            final String functionDefinition);

    /**
     * @see Selenium#addScript(String, String)
     */
    public void addScript(final String scriptContent, final String scriptTagId);

    /**
     * @see Selenium#addSelection(String, String)
     */
    public void addSelection(final String locator, final String optionLocator);

    /**
     * @see Selenium#allowNativeXpath(String)
     */
    public void allowNativeXpath(final String allow);

    /**
     * @see Selenium#altKeyDown()
     */
    public void altKeyDown();

    /**
     * 
     * @see Selenium#altKeyUp()
     */
    public void altKeyUp();

    /**
     * @see Selenium#answerOnNextPrompt(String)
     */
    public void answerOnNextPrompt(final String answer);

    /**
     * @see Selenium#assignId(String, String)
     */
    public void assignId(final String locator, final String identifier);

    /**
     * @see Selenium#attachFile(String, String)
     */
    public void attachFile(final String fieldLocator, final String fileLocator);

    /**
     * @see Selenium#captureEntirePageScreenshot(String, String)
     */
    public void captureEntirePageScreenshot(final String filename,
            final String kwargs);

    /**
     * @see Selenium#captureEntirePageScreenshotToString(String)
     */
    public String captureEntirePageScreenshotToString(final String kwargs);

    /**
     * @see Selenium#captureNetworkTraffic(String)
     */
    public String captureNetworkTraffic(final String type);

    /**
     * @see Selenium#captureScreenshot(String)
     */
    public void captureScreenshot(final String filename);

    /**
     * @see Selenium#captureScreenshotToString()
     */
    public String captureScreenshotToString();

    /**
     * @see Selenium#check(String)
     */
    public void check(final String locator);

    /**
     * @see Selenium#chooseCancelOnNextConfirmation()
     */
    public void chooseCancelOnNextConfirmation();

    /**
     * @see Selenium#chooseOkOnNextConfirmation()
     */
    public void chooseOkOnNextConfirmation();

    /**
     * @see Selenium#click(String)
     */
    public void click(final String locator);

    /**
     * @see Selenium#clickAt(String, String)
     */
    public void clickAt(final String locator, final String coordString);

    /**
     * 
     * @see Selenium#close()
     */
    public void close();

    /**
     * @see Selenium#contextMenu(String)
     */
    public void contextMenu(final String locator);

    /**
     * @see Selenium#contextMenuAt(String, String)
     */
    public void contextMenuAt(final String locator, final String coordString);

    /**
     * 
     * @see Selenium#controlKeyDown()
     */
    public void controlKeyDown();

    /**
     * 
     * @see Selenium#controlKeyUp()
     */
    public void controlKeyUp();

    /**
     * @see Selenium#createCookie(String, String)
     */
    public void createCookie(final String nameValuePair,
            final String optionsString);

    /**
     * 
     * @see Selenium#deleteAllVisibleCookies()
     */
    public void deleteAllVisibleCookies();

    /**
     * @see Selenium#deleteCookie(String, String)
     */
    public void deleteCookie(final String name, final String optionsString);

    /**
     * 
     * @see Selenium#deselectPopUp()
     */
    public void deselectPopUp();

    /**
     * @see Selenium#doubleClick(String)
     */
    public void doubleClick(final String locator);

    /**
     * @see Selenium#doubleClickAt(String, String)
     */
    public void doubleClickAt(final String locator, final String coordString);

    /**
     * @see Selenium#dragAndDrop(String, String)
     */
    public void dragAndDrop(final String locator, final String movementsString);

    /**
     * @see Selenium#dragAndDropToObject(String, String)
     */
    public void dragAndDropToObject(final String locatorOfObjectToBeDragged,
            final String locatorOfDragDestinationObject);

    /**
     * @see Selenium#dragdrop(String, String)
     */
    public void dragdrop(final String locator, final String movementsString);

    /**
     * @see Selenium#fireEvent(String, String)
     */
    public void fireEvent(final String locator, final String eventName);

    /**
     * @see Selenium#focus(String)
     */
    public void focus(final String locator);

    /**
     * @see Selenium#getAlert()
     */
    public String getAlert();

    /**
     * @see Selenium#getAllButtons()
     */
    public String[] getAllButtons();

    /**
     * @see Selenium#getAllFields()
     */
    public String[] getAllFields();

    /**
     * @see Selenium#getAllLinks()
     */
    public String[] getAllLinks();

    /**
     * @see Selenium#getAllWindowIds()
     */
    public String[] getAllWindowIds();

    /**
     * 
     * @see Selenium#getAllWindowNames()
     */
    public String[] getAllWindowNames();

    /**
     * 
     * @see Selenium#getAllWindowTitles()
     */
    public String[] getAllWindowTitles();

    /**
     * 
     * 
     * @see Selenium#getAttribute(String)
     */
    public String getAttribute(final String attributeLocator);

    /**
     * 
     * 
     * @see Selenium#getAttributeFromAllWindows(String)
     */
    public String[] getAttributeFromAllWindows(final String attributeName);

    /**
     * 
     * @see Selenium#getBodyText()
     */
    public String getBodyText();

    /**
     * 
     * @see Selenium#getConfirmation()
     */
    public String getConfirmation();

    /**
     * 
     * @see Selenium#getCookie()
     */
    public String getCookie();

    /**
     * 
     * 
     * @see Selenium#getCookieByName(String)
     */
    public String getCookieByName(final String name);

    /**
     * 
     * 
     * @see Selenium#getCursorPosition(String)
     */
    public Number getCursorPosition(final String locator);

    /**
     * 
     * 
     * @see Selenium#getElementHeight(String)
     */
    public Number getElementHeight(final String locator);

    /**
     * 
     * 
     * @see Selenium#getElementIndex(String)
     */
    public Number getElementIndex(final String locator);

    /**
     * 
     * 
     * @see Selenium#getElementPositionLeft(String)
     */
    public Number getElementPositionLeft(final String locator);

    /**
     * 
     * 
     * @see Selenium#getElementPositionTop(String)
     */
    public Number getElementPositionTop(final String locator);

    /**
     * 
     * 
     * @see Selenium#getElementWidth(String)
     */
    public Number getElementWidth(final String locator);

    /**
     * 
     * 
     * @see Selenium#getEval(String)
     */
    public String getEval(final String script);

    /**
     * 
     * 
     * @see Selenium#getExpression(String)
     */
    public String getExpression(final String expression);

    /**
     * 
     * @see Selenium#getHtmlSource()
     */
    public String getHtmlSource();

    /**
     * 
     * @see Selenium#getLocation()
     */
    public String getLocation();

    /**
     * 
     * @see Selenium#getMouseSpeed()
     */
    public Number getMouseSpeed();

    /**
     * 
     * @see Selenium#getPrompt()
     */
    public String getPrompt();

    /**
     * 
     * 
     * @see Selenium#getSelectedId(String)
     */
    public String getSelectedId(final String selectLocator);

    /**
     * 
     * 
     * @see Selenium#getSelectedIds(String)
     */
    public String[] getSelectedIds(final String selectLocator);

    /**
     * 
     * 
     * @see Selenium#getSelectedIndex(String)
     */
    public String getSelectedIndex(final String selectLocator);

    /**
     * 
     * 
     * @see Selenium#getSelectedIndexes(String)
     */
    public String[] getSelectedIndexes(final String selectLocator);

    /**
     * 
     * 
     * @see Selenium#getSelectedLabel(String)
     */
    public String getSelectedLabel(final String selectLocator);

    /**
     * 
     * 
     * @see Selenium#getSelectedLabels(String)
     */
    public String[] getSelectedLabels(final String selectLocator);

    /**
     * 
     * 
     * @see Selenium#getSelectedValue(String)
     */
    public String getSelectedValue(final String selectLocator);

    /**
     * 
     * 
     * @see Selenium#getSelectedValues(String)
     */
    public String[] getSelectedValues(final String selectLocator);

    /**
     * 
     * 
     * @see Selenium#getSelectOptions(String)
     */
    public String[] getSelectOptions(final String selectLocator);

    /**
     * 
     * @see Selenium#getSpeed()
     */
    public String getSpeed();

    /**
     * 
     * 
     * @see Selenium#getTable(String)
     */
    public String getTable(final String tableCellAddress);

    /**
     * 
     * 
     * @see Selenium#getText(String)
     */
    public String getText(final String locator);

    /**
     * 
     * @see Selenium#getTitle()
     */
    public String getTitle();

    /**
     * 
     * 
     * @see Selenium#getValue(String)
     */
    public String getValue(final String locator);

    /**
     * 
     * 
     * 
     * @see Selenium#getWhetherThisFrameMatchFrameExpression(String, String)
     */
    public boolean getWhetherThisFrameMatchFrameExpression(
            final String currentFrameString, final String target);

    /**
     * 
     * 
     * 
     * @see Selenium#getWhetherThisWindowMatchWindowExpression(String, String)
     */
    public boolean getWhetherThisWindowMatchWindowExpression(
            final String currentWindowString, final String target);

    /**
     * 
     * 
     * @see Selenium#getXpathCount(String)
     */
    public Number getXpathCount(final String xpath);

    /**
     * 
     * @see Selenium#goBack()
     */
    public void goBack();

    /**
     * 
     * @see Selenium#highlight(String)
     */
    public void highlight(final String locator);

    /**
     * 
     * @see Selenium#ignoreAttributesWithoutValue(String)
     */
    public void ignoreAttributesWithoutValue(final String ignore);

    /**
     * 
     * @see Selenium#isAlertPresent()
     */
    public boolean isAlertPresent();

    /**
     * 
     * 
     * @see Selenium#isChecked(String)
     */
    public boolean isChecked(final String locator);

    /**
     * 
     * @see Selenium#isConfirmationPresent()
     */
    public boolean isConfirmationPresent();

    /**
     * 
     * 
     * @see Selenium#isCookiePresent(String)
     */
    public boolean isCookiePresent(final String name);

    /**
     * 
     * 
     * @see Selenium#isEditable(String)
     */
    public boolean isEditable(final String locator);

    /**
     * 
     * 
     * @see Selenium#isElementPresent(String)
     */
    public boolean isElementPresent(final String locator);

    /**
     * 
     * 
     * 
     * @see Selenium#isOrdered(String, String)
     */
    public boolean isOrdered(final String locator1, final String locator2);

    /**
     * 
     * @see Selenium#isPromptPresent()
     */
    public boolean isPromptPresent();

    /**
     * 
     * 
     * @see Selenium#isSomethingSelected(String)
     */
    public boolean isSomethingSelected(final String selectLocator);

    /**
     * 
     * 
     * @see Selenium#isTextPresent(String)
     */
    public boolean isTextPresent(final String pattern);

    /**
     * 
     * 
     * @see Selenium#isVisible(String)
     */
    public boolean isVisible(final String locator);

    /**
     * 
     * 
     * @see Selenium#keyDown(String, String)
     */
    public void keyDown(final String locator, final String keySequence);

    /**
     * 
     * @see Selenium#keyDownNative(String)
     */
    public void keyDownNative(final String keycode);

    /**
     * 
     * 
     * @see Selenium#keyPress(String, String)
     */
    public void keyPress(final String locator, final String keySequence);

    /**
     * 
     * @see Selenium#keyPressNative(String)
     */
    public void keyPressNative(final String keycode);

    /**
     * 
     * 
     * @see Selenium#keyUp(String, String)
     */
    public void keyUp(final String locator, final String keySequence);

    /**
     * 
     * @see Selenium#keyUpNative(String)
     */
    public void keyUpNative(final String keycode);

    /**
     * 
     * @see Selenium#metaKeyDown()
     */
    public void metaKeyDown();

    /**
     * 
     * @see Selenium#metaKeyUp()
     */
    public void metaKeyUp();

    /**
     * 
     * @see Selenium#mouseDown(String)
     */
    public void mouseDown(final String locator);

    /**
     * 
     * 
     * @see Selenium#mouseDownAt(String, String)
     */
    public void mouseDownAt(final String locator, final String coordString);

    /**
     * 
     * @see Selenium#mouseDownRight(String)
     */
    public void mouseDownRight(final String locator);

    /**
     * 
     * 
     * @see Selenium#mouseDownRightAt(String, String)
     */
    public void mouseDownRightAt(final String locator, final String coordString);

    /**
     * 
     * @see Selenium#mouseMove(String)
     */
    public void mouseMove(final String locator);

    /**
     * 
     * 
     * @see Selenium#mouseMoveAt(String, String)
     */
    public void mouseMoveAt(final String locator, final String coordString);

    /**
     * 
     * @see Selenium#mouseOut(String)
     */
    public void mouseOut(final String locator);

    /**
     * 
     * @see Selenium#mouseOver(String)
     */
    public void mouseOver(final String locator);

    /**
     * 
     * @see Selenium#mouseUp(String)
     */
    public void mouseUp(final String locator);

    /**
     * 
     * 
     * @see Selenium#mouseUpAt(String, String)
     */
    public void mouseUpAt(final String locator, final String coordString);

    /**
     * 
     * @see Selenium#mouseUpRight(String)
     */
    public void mouseUpRight(final String locator);

    /**
     * 
     * 
     * @see Selenium#mouseUpRightAt(String, String)
     */
    public void mouseUpRightAt(final String locator, final String coordString);

    /**
     * 
     * @see Selenium#open(String)
     */
    public void open(final String url);

    /**
     * 
     * 
     * @see Selenium#openWindow(String, String)
     */
    public void openWindow(final String url, final String windowID);

    /**
     * 
     * @see Selenium#refresh()
     */
    public void refresh();

    /**
     * 
     * @see Selenium#removeAllSelections(String)
     */
    public void removeAllSelections(final String locator);

    /**
     * 
     * @see Selenium#removeScript(String)
     */
    public void removeScript(final String scriptTagId);

    /**
     * 
     * @see Selenium#removeSelection(String, String)
     */
    public void removeSelection(final String locator, final String optionLocator);

    /**
     * 
     * @see Selenium#retrieveLastRemoteControlLogs()
     */
    public String retrieveLastRemoteControlLogs();

    /**
     * 
     * 
     * @see Selenium#rollup(String, String)
     */
    public void rollup(final String rollupName, final String kwargs);

    /**
     * 
     * @see Selenium#runScript(String)
     */
    public void runScript(final String script);

    /**
     * 
     * 
     * @see Selenium#select(String, String)
     */
    public void select(final String selectLocator, final String optionLocator);

    /**
     * 
     * @see Selenium#selectFrame(String)
     */
    public void selectFrame(final String locator);

    /**
     * 
     * @see Selenium#selectPopUp(String)
     */
    public void selectPopUp(final String windowID);

    /**
     * 
     * @see Selenium#selectWindow(String)
     */
    public void selectWindow(final String windowID);

    /**
     * 
     * @see Selenium#setBrowserLogLevel(String)
     */
    public void setBrowserLogLevel(final String logLevel);

    /**
     * 
     * @see Selenium#setContext(String)
     */
    public void setContext(final String context);

    /**
     * 
     * 
     * @see Selenium#setCursorPosition(String, String)
     */
    public void setCursorPosition(final String locator, final String position);

    /**
     * 
     * @see Selenium#setExtensionJs(String)
     */
    public void setExtensionJs(final String extensionJs);

    /**
     * 
     * @see Selenium#setMouseSpeed(String)
     */
    public void setMouseSpeed(final String pixels);

    /**
     * 
     * @see Selenium#setSpeed(String)
     */
    public void setSpeed(final String value);

    /**
     * 
     * @see Selenium#setTimeout(String)
     */
    public void setTimeout(final String timeout);

    /**
     * 
     * @see Selenium#shiftKeyDown()
     */
    public void shiftKeyDown();

    /**
     * 
     * @see Selenium#shiftKeyUp()
     */
    public void shiftKeyUp();

    /**
     * 
     * @see Selenium#showContextualBanner()
     */
    public void showContextualBanner();

    /**
     * 
     * 
     * @see Selenium#showContextualBanner(String, String)
     */
    public void showContextualBanner(final String className,
            final String methodName);

    /**
     * 
     * @see Selenium#shutDownSeleniumServer()
     */
    public void shutDownSeleniumServer();

    /**
     * 
     * @see Selenium#submit(String)
     */
    public void submit(final String formLocator);

    /**
     * 
     * 
     * @see Selenium#type(String, String)
     */
    public void type(final String locator, final String value);

    /**
     * 
     * 
     * @see Selenium#typeKeys(String, String)
     */
    public void typeKeys(final String locator, final String value);

    /**
     * 
     * @see Selenium#uncheck(String)
     */
    public void uncheck(final String locator);

    /**
     * 
     * @see Selenium#useXpathLibrary(String)
     */
    public void useXpathLibrary(final String libraryName);

    /**
     * 
     * 
     * @see Selenium#waitForCondition(String, String)
     */
    public void waitForCondition(final String script, final String timeout);

    /**
     * 
     * 
     * @see Selenium#waitForFrameToLoad(String, String)
     */
    public void waitForFrameToLoad(final String frameAddress,
            final String timeout);

    /**
     * @see Selenium#waitForPageToLoad(String)
     */
    public void waitForPageToLoad(final String timeout);

    /**
     * @see Selenium#waitForPopUp(String, String)
     */
    public void waitForPopUp(final String windowID, final String timeout);

    /**
     * 
     * @see Selenium#windowFocus()
     */
    public void windowFocus();

    /**
     * 
     * @see Selenium#windowMaximize()
     */
    public void windowMaximize();
}