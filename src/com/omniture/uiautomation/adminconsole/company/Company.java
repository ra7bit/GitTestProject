package com.omniture.uiautomation.adminconsole.company;

import com.omniture.uiautomation.adminconsole.company.pages.CompanyIndexPage;
import com.omniture.uiautomation.adminconsole.company.pages.PendingActionsPage;
import com.omniture.uiautomation.adminconsole.company.pages.SecurityPage;
import com.omniture.uiautomation.adminconsole.company.pages.SsoPage;
import com.omniture.uiautomation.adminconsole.company.pages.SupportPage;
import com.omniture.uiautomation.adminconsole.company.pages.WebServicesPage;

import com.omniture.uiautomation.tests.OmnitureTest;

/**
 * @author ligyu
 */

public class Company extends OmnitureTest {

    protected CompanyIndexPage companyIndex;
    protected SecurityPage securityPage;
    
    protected SsoPage ssoPage;
    protected SupportPage supportPage;
    protected PendingActionsPage pendingActionsPage;
    protected WebServicesPage webServicesPage;

    public Company() {
        this.companyIndex = new CompanyIndexPage();
        this.securityPage = new SecurityPage();
        
        this.ssoPage = new SsoPage();
        this.supportPage = new SupportPage();
        this.pendingActionsPage = new PendingActionsPage();
        this.webServicesPage = new WebServicesPage();
        
        this.companyIndex.setWebDriver(this.webDriver);
        this.securityPage.setWebDriver(this.webDriver);
        this.ssoPage.setWebDriver(this.webDriver);
        this.supportPage.setWebDriver(this.webDriver);
        this.pendingActionsPage.setWebDriver(this.webDriver);
        this.webServicesPage.setWebDriver(this.webDriver);
    }
}
