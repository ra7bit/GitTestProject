package com.omniture.uiautomation.report.tests.bvt;

import junit.framework.TestSuite;
import junit.framework.Test;
import com.omniture.uiautomation.report.pages.SiteMetricsPage;
import com.omniture.uiautomation.report.testcases.ARSSwitchTest;
import com.omniture.uiautomation.tests.OmnitureTest;

public class SiteMetricsReportRunInOrder extends OmnitureTest {
	private SiteMetricsPage siteMetricsPage;
	private ARSSwitchTest rsSwitch;
	public SiteMetricsReportRunInOrder(String name) {
		super(name);
		this.siteMetricsPage = new SiteMetricsPage();
		this.siteMetricsPage.setWebDriver(this.webDriver);
		this.rsSwitch = new ARSSwitchTest();
	}
    public void testPageViewsReportLoad() {
    	this.rsSwitch.testRSSwitch();
        this.siteMetricsPage.assertPageViewsReportLoad();
    }
    public void testVisitReportLoad() {
        this.siteMetricsPage.assertVisitReportLoad();
    }
    public void testUniqueVisitorsReportLoad() {
        this.siteMetricsPage.assertUniqueVisitorsReportLoad();
    }
    public void testHourlyUniqueVisitorsReportLoad() {
        this.siteMetricsPage.assertHourlyUniqueVisitorsReportLoad();
    }
    public void testDailyUniqueVisitorsReportLoad() {
        this.siteMetricsPage.assertDailyUniqueVisitorsReportLoad();
    }
    public void testMonthlyUniqueVisitorsReportLoad() {
        this.siteMetricsPage.assertMonthlyUniqueVisitorsReportLoad();
    }
    public void testQuaterlyUniqueVisitorsReportLoad() {
        this.siteMetricsPage.assertQuaterlyUniqueVisitorsReportLoad();
    }
    public void testYearlyUniqueVisitorsReportLoad() {
        this.siteMetricsPage.assertYearlyUniqueVisitorsReportLoad();
    }
    public void testTimeSpentPerVisitReportLoad() {
        this.siteMetricsPage.assertTimeSpentPerVisitReportLoad();
    }
    public static Test suite() {
        TestSuite suite = new TestSuite("site content test...");
        suite.addTest(new SiteMetricsReportRunInOrder("testPageViewsReportLoad"));
        suite.addTest(new SiteMetricsReportRunInOrder("testVisitReportLoad"));
        suite.addTest(new SiteMetricsReportRunInOrder("testUniqueVisitorsReportLoad"));
        suite.addTest(new SiteMetricsReportRunInOrder("testHourlyUniqueVisitorsReportLoad"));
        suite.addTest(new SiteMetricsReportRunInOrder("testDailyUniqueVisitorsReportLoad"));
        suite.addTest(new SiteMetricsReportRunInOrder("testMonthlyUniqueVisitorsReportLoad"));
        suite.addTest(new SiteMetricsReportRunInOrder("testQuaterlyUniqueVisitorsReportLoad"));
        suite.addTest(new SiteMetricsReportRunInOrder("testYearlyUniqueVisitorsReportLoad"));       
        suite.addTest(new SiteMetricsReportRunInOrder("testTimeSpentPerVisitReportLoad"));
        return suite;
    }
}
