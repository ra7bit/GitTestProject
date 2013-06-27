package com.omniture.uiautomation.adminconsole.company.tests.bvt;

import org.junit.Test;
import com.omniture.uiautomation.adminconsole.company.Company;

/**
 * @author ligyu
 */

public class SecurityManagerTest extends Company {

    @Test //TC_1267873, TC_1268342
    public void testEnableStrongPwd() {
        securityPage.navigateToSecurityManager();
        securityPage.disableStrongPwd();
        securityPage.enableStrongPwd();
        securityPage.assertFailToCreateUserWithoutStrongPwd();
    }

    @Test //TC_1267874
    public void testEnablePwdExpiration() {
        securityPage.navigateToSecurityManager();
        securityPage.disablePwdExpiration();
        securityPage.enablePwdExpiration();
        securityPage.assertPwdExpirationEnabled();
    }

    @Test //TC_1267876
    public void testPwdExpirationInterval() {
        securityPage.navigateToSecurityManager();
        securityPage.updatePwdExpirationIntervals();
        securityPage.assertPwdExpirationEnabled();
    }

    @Test //TC_1267878
    public void testEmailRestrictions() {
        securityPage.navigateToSecurityManager();
        securityPage.disableEmailRestrictions();
        securityPage.enableEmailRestrictions();
        securityPage.assertEmailRestrictionsEnabled();
    }

    @Test //TC_1267928
    public void testPwdRecoveryNotification() {
        securityPage.navigateToSecurityManager();
        securityPage.enablePasswordRecoveryNotification();
    }
}
