package com.omniture.uiautomation.adminconsole.reportsuite.tests;

import org.junit.Test;

import com.omniture.uiautomation.adminconsole.reportsuite.AdminMarketingChannels;
/**
 * @author xishen
 *
 */

public class AdminMarketingChannelsTest extends AdminMarketingChannels{
	
	@Test
	public void testMarketingChannelManager(){
		this.marketingChannelsPage.navigateToMarketingChannelManager();	
	}
	@Test
	public void testMarketingChannelProcessingRules(){
		this.marketingChannelsPage.navigateToMarketingChannelProcessingRulesPage();
	}
	@Test
	public void testMarketingChannelClassifications(){
		this.marketingChannelsPage.navigateToMarketingChannelClassificationsPage();
	}
	@Test
	public void testMarketingChannelCosts(){
		this.marketingChannelsPage.navigateToMarketingChannelCosts();
	}
	@Test
	public void testVisitorEngagementExpiration(){
		this.marketingChannelsPage.navigateToVisitorEngagementExpirationPage();
	}
}
