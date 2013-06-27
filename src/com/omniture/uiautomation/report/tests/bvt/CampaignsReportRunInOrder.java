package com.omniture.uiautomation.report.tests.bvt;

import junit.framework.Test;
import junit.framework.TestSuite;

import com.omniture.uiautomation.report.pages.CampaignsPage;
import com.omniture.uiautomation.report.testcases.ARSSwitchTest;
import com.omniture.uiautomation.tests.OmnitureTest;

public class CampaignsReportRunInOrder  extends OmnitureTest {
	private CampaignsPage campaignsPage;
	private ARSSwitchTest rsSwitch;
	public CampaignsReportRunInOrder(String name) {
		super(name);
		this.campaignsPage = new CampaignsPage();
		this.campaignsPage.setWebDriver(this.webDriver);
		this.rsSwitch = new ARSSwitchTest();
	}
	public void testCampaingsFunnelLoad() {
		this.rsSwitch.testRSSwitch();
        this.campaignsPage.assertCampaingsFunnelLoad();
    }
    public void testCreativeElementsReportLoad() {
        this.campaignsPage.assertCreativeElementsReportLoad();
    }
    public void testCampaignsReportLoad() {
        this.campaignsPage.assertCampaignsReportLoad();
    }
    public void testTrackingCodeReportLoad() {
        this.campaignsPage.assertTrackingCodeReportLoad();
    }
	public static Test suite() {
        TestSuite suite = new TestSuite("campaigns report test...");
        suite.addTest(new CampaignsReportRunInOrder("testCampaingsFunnelLoad"));
        suite.addTest(new CampaignsReportRunInOrder("testCreativeElementsReportLoad"));
        suite.addTest(new CampaignsReportRunInOrder("testCampaignsReportLoad"));
        suite.addTest(new CampaignsReportRunInOrder("testTrackingCodeReportLoad"));
        return suite;
	}
}
