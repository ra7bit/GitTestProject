package com.omniture.uiautomation.adminconsole.reportsuite;

import com.omniture.uiautomation.adminconsole.reportsuite.pages.AdminMarketingChannelsPage;
import com.omniture.uiautomation.tests.OmnitureTest;

public class AdminMarketingChannels extends OmnitureTest{
	
	protected AdminMarketingChannelsPage marketingChannelsPage;
	
	public AdminMarketingChannels(){
		
		this.marketingChannelsPage = new AdminMarketingChannelsPage();
		this.marketingChannelsPage.setWebDriver(this.webDriver);
	}

}
