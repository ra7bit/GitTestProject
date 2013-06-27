package com.omniture.uiautomation.adminconsole.usermanagement.tests.bvt;

import junit.framework.Test;
import junit.framework.TestSuite;
import com.omniture.uiautomation.adminconsole.usermanagement.pages.GroupManagementPage;
import com.omniture.uiautomation.pages.OmniturePage;
import com.omniture.uiautomation.tests.OmnitureTest;

/**
 * @author ligyu
 */

public class GroupsTest extends OmnitureTest {

    private GroupManagementPage groupManagement;
    private OmniturePage omniturePage;
    public GroupsTest (String name)
    {
        super(name);
        groupManagement = new GroupManagementPage();
        omniturePage = new OmniturePage();
        this.groupManagement.setWebDriver(this.webDriver);
        this.omniturePage.setWebDriver(this.webDriver);
    }

    //@Test //TC_1268306 //Bug 100110
    public void testAddGroup() {
        groupManagement.addNewGroup();
    }

    //@Test //TC_1268334, TC_1268339
    public void testEditGroup() {
        groupManagement.editGroup();
    }

    //@Test //TC_1268328
    public void testSearchGroup() {
        groupManagement.searchGroup();
    }

    //@Test //TC_1268345
    public void testRemoveGroup() {
        groupManagement.removeGroup();
    }

    //@Test //TC_1293074
    public void testEditPreBuiltGroup() {
        groupManagement.editPreBuiltGroup();
    }

    public static Test suite(){
        TestSuite suite = new TestSuite("User Groups Test...");
        suite.addTest(new GroupsTest("testAddGroup"));
        suite.addTest(new GroupsTest("testSearchGroup"));
        suite.addTest(new GroupsTest("testEditGroup"));
        suite.addTest(new GroupsTest("testEditPreBuiltGroup"));
        suite.addTest(new GroupsTest("testRemoveGroup"));
        return suite;
    }
}
