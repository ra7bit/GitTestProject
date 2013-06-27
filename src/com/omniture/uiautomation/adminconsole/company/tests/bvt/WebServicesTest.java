package com.omniture.uiautomation.adminconsole.company.tests.bvt;

import org.junit.Test;

import com.omniture.uiautomation.adminconsole.company.Company;

public class WebServicesTest extends Company {

    @Test //TC_1267901
    public void testEnableFilterChar() {
        webServicesPage.navigateToWebServicesPage();
        webServicesPage.enableFilterChar();
    }

    @Test //TC_1267901
    public void testEnableFilterUtf8() {
        webServicesPage.navigateToWebServicesPage();
        webServicesPage.enableFilterUtf8();
    }
}
