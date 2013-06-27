package com.omniture.uiautomation.adminconsole.reportsuite.pages;

import com.omniture.uiautomation.adminconsole.reportsuite.ui.TrafficManagmentUI;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.OmniturePage;

/**
 * @author ligyu
 *
 */

public class TrafficManagmentPage extends OmniturePage {
    
    
    public void navigateToTrafficManagementOverview() {
    	this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/p/am/1.3/index.html?a=ReportSuite.Manager&feature=Traffic.Overview"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
        if (!this.checkLanguage("en_US")) {
            this.switchLanguage("en_US");
        }
        this.waitUntilPageLoad();
    }
    
    public void navigateToScheduleSpike() {
    	this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/p/am/1.3/index.html?a=ReportSuite.Manager&feature=ScheduledSpike"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
        if (!this.checkLanguage("en_US")) {
            this.switchLanguage("en_US");
        }
        this.waitUntilPageLoad();
    }

    public void addScheduleSpike(){
        this.navigateToScheduleSpike();
        this.type(TrafficManagmentUI.DAILYPAGEVIEWSSPIKE_INPUT, "1234567");
        this.click(TrafficManagmentUI.SUBMIT_BUTTON);
    }
}
