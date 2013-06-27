package com.omniture.uiautomation.report.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import com.omniture.uiautomation.report.pages.ReportDataComparePage;
import com.omniture.uiautomation.report.pages.SiteMetricsPage;
import com.omniture.uiautomation.report.testcases.ARSSwitchTest;
import com.omniture.uiautomation.tests.OmnitureTest;

public class ReportDataCompare extends OmnitureTest {
	private ReportDataComparePage rdcPage;
	private ARSSwitchTest rsSwitch;
	private SiteMetricsPage siteMetricsPage;
	public ReportDataCompare(String name) {
		super(name);
		this.siteMetricsPage = new SiteMetricsPage();
		this.siteMetricsPage.setWebDriver(this.webDriver);
		this.rdcPage = new ReportDataComparePage();
		this.rdcPage.setWebDriver(this.webDriver);
		this.rsSwitch = new ARSSwitchTest();
	}
	public void testPageViewsGraphLoad() {
		this.rsSwitch.testRSSwitch();
		this.siteMetricsPage.assertPageViewsReportLoad();
		this.rdcPage.changeDateToLastMonth();
		ReportDataCompare.assertTrue(this.rdcPage.graphExists("pageViews"));
	}
	public void testVisitsGraphLoad() {
		ReportDataCompare.assertTrue(this.rdcPage.graphExists("visits"));
	}
	public static Test suite() {
		TestSuite suite = new TestSuite("data compare testing...");
		suite.addTest(new ReportDataCompare("testPageViewsGraphLoad"));
		suite.addTest(new ReportDataCompare("testVisitsGraphLoad"));
		return suite;
	}
}
