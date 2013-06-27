package com.omniture.uiautomation.adminconsole.usermanagement.tests.bvt;

import junit.framework.Test;
import junit.framework.TestSuite;

import com.omniture.uiautomation.adminconsole.usermanagement.pages.UserManagementPage;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.OmniturePage;
import com.omniture.uiautomation.tests.OmnitureTest;
import com.omniture.uiautomation.util.dao.ScUser;

/**
 * @author ligyu
 */

public class UsersTest extends OmnitureTest {

    private UserManagementPage userManagement;
    private OmniturePage omniturePage;
    private ScUser adminUser = new ScUser();
    private ScUser limitedUser = new ScUser();
    public UsersTest(String name) {
        super(name);
        userManagement = new UserManagementPage();
        omniturePage = new OmniturePage();

        adminUser.setLoginID("SCAuto_AdminUser");
        adminUser.setIsAdmin(true);
        limitedUser.setLoginID("SCAuto_LimitedUser");
        limitedUser.setIsAdmin(false);
        this.userManagement.setWebDriver(this.webDriver);
        this.omniturePage.setWebDriver(this.webDriver);
    }

    //@Test //TC_1268308
    public void testAddAdminUser() {
        userManagement.addNewUser(adminUser);
    }

    //@Test //TC_1268347
    public void testAddLimitedUser() {
        userManagement.addNewUser(limitedUser);
    }
    
    //@Test //TC_1268337
    public void testEditLimitedUser() {
        limitedUser.setFirstName(limitedUser.getFirstName() + "_update");
        userManagement.editUser(limitedUser);
    }

    //@Test //TC_1268343, TC_1268344
    public void testSearchUser() {
        userManagement.searchUser(adminUser);
        userManagement.searchUser(limitedUser);
    }

    //@Test //TC_1268332
    public void testRemoveOwnUser() {
        ScUser ownerUser = new ScUser();
        ownerUser.setLoginID(TestEnvironment.current.getUsername());
        userManagement.removeUserByLoginID(ownerUser);
        userManagement.assertFailtoRemoveOwnUser();
    }

    //@Test //TC_1268338
    public void testRemoveUser() {
        userManagement.removeUserByLoginID(adminUser);
        userManagement.removeUserByLoginID(limitedUser);
    }

    //@Test //TC_1268331
    public void testRecquiredFieldsError() {
        ScUser missingRequiredUser = new ScUser();
        missingRequiredUser.setLoginID("");
        userManagement.addNewUser(missingRequiredUser);
        userManagement.assertMissingRequiredField("Login");

        missingRequiredUser.setLoginID("temp");
        missingRequiredUser.setFirstName("");
        userManagement.addNewUser(missingRequiredUser);
        userManagement.assertMissingRequiredField("First Name");
    }

    //@Test //TC_1268340
    public void testSort() {
        userManagement.sortByFirstName();
        userManagement.sortByAdmin();
        userManagement.sortByLoginTime();
        userManagement.sortByLogin();
    }

    public static Test suite() {
        TestSuite suite = new TestSuite("User Test...");
        suite.addTest(new UsersTest("testAddAdminUser"));
        suite.addTest(new UsersTest("testAddLimitedUser"));
        suite.addTest(new UsersTest("testEditLimitedUser"));
        suite.addTest(new UsersTest("testSearchUser"));
        suite.addTest(new UsersTest("testRemoveOwnUser"));
        suite.addTest(new UsersTest("testRemoveUser"));
        suite.addTest(new UsersTest("testRecquiredFieldsError"));
        suite.addTest(new UsersTest("testSort"));
        return suite;
    }
}
