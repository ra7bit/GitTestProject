/*******************************************************************************
 * ADOBE CONFIDENTIAL INFORMATION
 * 
 * Copyright (c) 2012 ADOBE LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 * 
 * ***************************************************************************
 * ProductSwitchTest
 * 
 * $Id: ProductSwitchTest.java, v 1.0 Aug 6, 2012 3:07:36 PM$
 * 
 * Created on Aug 6, 2012
 * 
 * @author qyzhu
 ******************************************************************************/

package com.omniture.uiautomation.general.tests.bvt;

import org.junit.Test;

import com.omniture.uiautomation.general.ProductSwitch;


public class ProductSwitchTest extends ProductSwitch{

	
	@Test  //TC_1272032
	public void testSwithToSearchCenter() {
		page.switchToProductFinal("SearchCenter");
	}
	
	@Test  //TC_1272032
	public void testSwithToDiscover() {
		page.switchToProductFinal("Discover");
	}
	
	@Test  //TC_1272032
	public void testSwithToTestTarget() {
		page.switchToProductFinal("TestTarget");
	}
	
	@Test  //TC_1272032
	public void testSwithToGenesis() {
		page.switchToProductFinal("Genesis");
	}
	
	@Test  //TC_1272032
	public void testSwithToInsight() {
		page.switchToProductFinal("Insight");
	}
	
	@Test  //TC_1272032
	public void testSwithToMerchandising() {
		page.switchToProductFinal("Merchandising");
	}
	
	@Test  //TC_1272032
	public void testSwithToSearchPromote() {
		page.switchToProductFinal("SearchPromote");
	}
	
	@Test  //TC_1272032
	public void testSwithToSurvey() {
		page.switchToProductFinal("Survey");
	}
	
	@Test  //TC_1272032
	public void testSwithToRecommendations() {
		page.switchToProductFinal("Recommendations");
	}
	
	@Test  //TC_1272032
	public void testSwithToDigitalPulse() {
		page.switchToProductFinal("DigitalPulse");
	}
	
	@Test  //TC_1272032
	public void testSwithToScene7() {
		page.switchToProductFinal("Scene7");
	}
	
//	@Test  //TC_1272032
//	public void swithToSocialAnalyticsTest() {
//		page.switchToProductFinal("SocialAnalytics");
//	}
	
	@Test  //TC_1272032
	public void testSwithToAudienceResearch() {
		page.switchToProductFinal("AudienceResearch");
	}
	
	@Test  //TC_1272031
	public void testSwithToSiteCatalystReporting() {
		page.switchToSubProductFinal("SiteCatalystReporting");
	}
	
	@Test  //TC_1272031
	public void testSwithToDataWarehouse() {
		page.switchToSubProductFinal("DataWarehouse");
	}
	
	@Test  //TC_1272031
	public void testSwithToClickMap() {
		page.switchToSubProductFinal("ClickMap");
	}
	
	@Test  //TC_1272031
	public void testSwithToDashboardPlayer() {
		page.switchToSubProductFinal("DashboardPlayer");
	}
	
	@Test  //TC_1272031
	public void testSwithToDirectAccess() {
		page.switchToSubProductFinal("DirectAccess");
	}
	
	@Test  //TC_1272031
	public void testSwithToWidget() {
		page.switchToSubProductFinal("Widget");
	}
	
	@Test  //TC_1272031
	public void testSwithToReportBuilder() {
		page.switchToSubProductFinal("ReportBuilder");
	}
	
	@Test  //TC_1272032
	public void testSwithToSiteCatalyst() {
		page.switchToProductFinal("SiteCatalyst");
	}
	
}
