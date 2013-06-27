package com.omniture.uiautomation.adminconsole.reportsuite.pages;

import org.openqa.selenium.WebElement;

import com.omniture.uiautomation.adminconsole.reportsuite.ui.AdminMarketingChannelsUI;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.SiteCatalystPage;

public class AdminMarketingChannelsPage extends SiteCatalystPage{
	
//	public static String SelectedRS="asc-test1";
//	public static String SelectedRSID="ascauto01";
//	
	public void navigateToAdminConsole() {
		this.getWebDriver().get(TestEnvironment.current.getBaseUrl() 
				+ "/p/am/1.3/index.html?a=ReportSuite.Index"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
		if(!this.checkLanguage("en_US"))
			this.switchLanguage("en_US");
		this.waitUntilPageLoad();
	}
	
	public void navigateToMarketingChannelManagerPage(){
		this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/p/am/1.3/index.html?a=ReportSuite.Manager&feature=MarketingChannels&="
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
        if (!this.checkLanguage("en_US")) {
            this.switchLanguage("en_US");
        this.waitUntilPageLoad();
        }
	}
	
	public void navigateToMarketingChannelProcessingRulesPage(){
		this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/p/am/1.3/index.html?a=ReportSuite.Manager"+"&feature=MarketingChannelRules"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
        if (!this.checkLanguage("en_US")) {
            this.switchLanguage("en_US");
        this.waitUntilPageLoad();
        }
	}
	
	public void navigateToMarketingChannelCostsPage(){
		this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/p/am/1.3/index.html?a=ReportSuite.Manager"+"&feature=MarketingChannelCost"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
        if (!this.checkLanguage("en_US")) {
            this.switchLanguage("en_US");
        this.waitUntilPageLoad();
        }
	}
	
	public void navigateToMarketingChannelClassificationsPage(){
		this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/p/am/1.3/index.html?a=ReportSuite.Manager"+"&feature=Classifications"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
        if (!this.checkLanguage("en_US")) {
            this.switchLanguage("en_US");
        this.waitUntilPageLoad();
        }
	}
	
	public void navigateToVisitorEngagementExpirationPage(){
		this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/p/am/1.3/index.html?a=ReportSuite.Manager"+"&feature=MarketingChannelExpiration"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
        if (!this.checkLanguage("en_US")) {
            this.switchLanguage("en_US");
        this.waitUntilPageLoad();
        }
	}
	
	public void selectRS() {
		WebElement element = this.webDriver.findElement(AdminMarketingChannelsUI.getReportSuite(this.getDefaultReportSuiteName()));
		element.click();
	}
	
	public void navigateToMarketingChannelManager(){
		this.navigateToAdminConsole();
		this.selectRS();
		this.navigateToMarketingChannelManagerPage();
		this.click(AdminMarketingChannelsUI.ADDCHANNEL_LINK);
		this.click(AdminMarketingChannelsUI.CANCLE_BUTTON_1);
		this.waitUntilPageLoad();
	}
	
	public void navigateToMarketingChannelProcessingRules(){
		this.navigateToMarketingChannelProcessingRulesPage();
		this.click(AdminMarketingChannelsUI.ADDNEWRULE_SET);
		this.click(AdminMarketingChannelsUI.ADDNEWRULE_OPTION);
		this.click(AdminMarketingChannelsUI.RULE_SET_CHANNEL);
		this.click(AdminMarketingChannelsUI.RULE_SET_OPTION);
		this.click(AdminMarketingChannelsUI.SAVE_BUTTON);
		this.click(AdminMarketingChannelsUI.RULE_SET_DELETE);
		this.click(AdminMarketingChannelsUI.SAVE_BUTTON);
	}
	
	public void navigateToMarketingChannelCosts(){
		this.navigateToMarketingChannelCostsPage();
		this.click(AdminMarketingChannelsUI.ADDITEM_LINK);
		this.click(AdminMarketingChannelsUI.CANCLE_BUTTON_3);
	}
	
	public void navigateToMarketingChannelClassifications(){
		this.navigateToMarketingChannelClassificationsPage();
		this.click(AdminMarketingChannelsUI.CLASSIFICATION_ACTIONS_TARGET);
		this.click(AdminMarketingChannelsUI.ADDCLASSIFICATION_LINK);
		this.click(AdminMarketingChannelsUI.CLOSE_SAVE_POPUP);
	}
	
}
