package com.omniture.uiautomation.adminconsole.codemanager.tests.bvt;

import org.junit.Test;

import com.omniture.uiautomation.adminconsole.codemanager.pages.CodeManagerPage;
import com.omniture.uiautomation.tests.OmnitureTest;

public class CodeManagerTest extends OmnitureTest {
    private CodeManagerPage codeManagerPage = new CodeManagerPage();
    
    public CodeManagerTest(){
    	this.codeManagerPage.setWebDriver(this.webDriver);
    }
    
    @Test //TC_1267940
    public void testJavascript() {
        codeManagerPage.generateJavascriptCode();
        codeManagerPage.saveTrackingCode();
        codeManagerPage.assertTrackingCodeSavedCorrectly();
        codeManagerPage.sendMail();
        codeManagerPage.removeTrackingCode();
        codeManagerPage.assertRemoveTrackingCodeCorrectly();
    }
}
