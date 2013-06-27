package com.omniture.uiautomation.adminconsole.company.tests.bvt;

import org.junit.Test;

import com.omniture.uiautomation.adminconsole.company.Company;

/**
 * @author ligyu
 */

public class SsoTest extends Company {

    @Test //TC_1267944
    public void testEnableSso() {
        ssoPage.navigateToSsoPage();
        ssoPage.enableSso();
        ssoPage.assertSuccessMessage();
        ssoPage.assertNormalUserFailToLoginWithPwd();
    }
}
