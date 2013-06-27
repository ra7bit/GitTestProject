/*******************************************************************************
 * Adobe CONFIDENTIAL INFORMATION
 *
 * Copyright (c) 2012 Adobe LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 *
 * ***************************************************************************
 * CodeManagerTest
 *
 * $Id: CodeManagerTest.java, v 1.0 Aug 7, 2012 5:30:59 PM$
 *
 * Created on Aug 7, 2012
 *
 * @author ligyu
 ******************************************************************************/
package com.omniture.uiautomation.adminconsole.codemanager.tests;
//22222222222222222222222222222222222222222222222222222
import org.junit.Test;

import com.omniture.uiautomation.adminconsole.codemanager.pages.CodeManagerPage;
import com.omniture.uiautomation.tests.OmnitureTest;

public class CodeManagerTest extends OmnitureTest {
    private CodeManagerPage codeManagerPage = new CodeManagerPage();
    
    public CodeManagerTest(){
    	this.codeManagerPage.setWebDriver(this.webDriver);
    }

    @Test //TC_1267943
    public void testMobile() {
        codeManagerPage.generateMobileCode();
    }

    @Test //TC_1267919
    public void testAndroid() {
        codeManagerPage.generateAndroidCode();
    }

    @Test //TC_1267918
    public void testIOS() {
        codeManagerPage.generateIOSCode();
    }

    @Test //TC_1267923
    public void testJava() {
        codeManagerPage.generateJavaCode();
    }

    @Test //TC_1267924
    public void testPHP() {
        codeManagerPage.generatePHPCode();
    }

    @Test //TC_1267942
    public void testFlash() {
        codeManagerPage.generateFlashCode();
    }

    @Test //TC_1267920
    public void testBlackberry() {
        codeManagerPage.generateBlackberryCode();
    }

    @Test //TC_1267921
    public void testSymbian() {
        codeManagerPage.generateSymbianCode();
    }

//    @Test //TC_1267922 , TODO:There is a popup window, maybe block others    
//    public void testFaceBook() {
//        codeManagerPage.generateFaceBookCode();
//    }
}

