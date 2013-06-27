package com.omniture.uiautomation.adminconsole.company.tests.bvt;

import org.junit.Test;

import com.omniture.uiautomation.adminconsole.company.Company;

/**
 * @author ligyu
 */

public class SupportTest extends Company {

    @Test //TC_1267899 and TC_1267929
    public void testUpdateSupportInformation() {
        supportPage.navigateToSupportPage();
        supportPage.enableContactInformation();
        supportPage.enableMainHelp();
        supportPage.save();
        supportPage.assertSuccessMessage();
        supportPage.assertContactInfoShowInFooter();
    }
}
