package com.omniture.uiautomation.report.tests.bvt;

import junit.framework.Test;
import junit.framework.TestSuite;

import com.omniture.uiautomation.report.pages.VisitorRetentionPage;
import com.omniture.uiautomation.report.testcases.ARSSwitchTest;
import com.omniture.uiautomation.tests.OmnitureTest;

public class VisitorRetentionRunInOrder extends OmnitureTest {
	private VisitorRetentionPage visitorRetentionPage;
	private ARSSwitchTest rsSwitch;
	public VisitorRetentionRunInOrder(String name) {
		super(name);
		this.visitorRetentionPage = new VisitorRetentionPage();
		this.visitorRetentionPage.setWebDriver(this.webDriver);
		this.rsSwitch = new ARSSwitchTest();
	}
    public void testReturnFrequencyReportLoad() {
    	this.rsSwitch.testRSSwitch();
        this.visitorRetentionPage.assertReturnFrequencyReportLoad();
    }
    public void testReturnVisitsReportLoad() {
        this.visitorRetentionPage.assertReturnVisitsReportLoad();
    }
    public void testDailyReturnVisitsReportLoad() {
        this.visitorRetentionPage.assertDailyReturnVisitsReportLoad();
    }
    public void testVisitNumberReportLoad() {
        this.visitorRetentionPage.assertVisitNumberReportLoad();
    }
    public void testCustomerLoyaltyReportLoad() {
        this.visitorRetentionPage.assertCustomerLoyaltyReportLoad();
    }
    public void testDailyBeforeFirstPurchaseReportLoad() {
        this.visitorRetentionPage.assertDailyBeforeFirstPurchaseReportLoad();
    }
    public void testDailyUniqueCustomersReportLoad() {
        this.visitorRetentionPage.assertDailyUniqueCustomersReportLoad();
    }
    public void testWeeklyUniqueCustomersReportLoad() {
        this.visitorRetentionPage.assertWeeklyUniqueCustomersReportLoad();
    }
    public void testMonthlyUniqueCustomersReportLoad() {
        this.visitorRetentionPage.assertMonthlyUniqueCustomersReportLoad();
    }
    public void testQuarterlyUniqueCustomersReportLoad() {
        this.visitorRetentionPage.assertQuarterlyUniqueCustomersReportLoad();
    }
    public void testYearlyUniqueCustomersReportLoad() {
        this.visitorRetentionPage.assertYearlyUniqueCustomersReportLoad();
    }
    public static Test suite() {
        TestSuite suite = new TestSuite("visitor retentions test...");
        suite.addTest(new VisitorRetentionRunInOrder("testReturnFrequencyReportLoad"));
        suite.addTest(new VisitorRetentionRunInOrder("testReturnVisitsReportLoad"));
        suite.addTest(new VisitorRetentionRunInOrder("testDailyReturnVisitsReportLoad"));
        suite.addTest(new VisitorRetentionRunInOrder("testVisitNumberReportLoad"));
        suite.addTest(new VisitorRetentionRunInOrder("testCustomerLoyaltyReportLoad"));
        suite.addTest(new VisitorRetentionRunInOrder("testDailyBeforeFirstPurchaseReportLoad"));
        suite.addTest(new VisitorRetentionRunInOrder("testDailyUniqueCustomersReportLoad"));
        suite.addTest(new VisitorRetentionRunInOrder("testWeeklyUniqueCustomersReportLoad"));
        suite.addTest(new VisitorRetentionRunInOrder("testMonthlyUniqueCustomersReportLoad"));
        suite.addTest(new VisitorRetentionRunInOrder("testQuarterlyUniqueCustomersReportLoad"));
        suite.addTest(new VisitorRetentionRunInOrder("testYearlyUniqueCustomersReportLoad"));
        return suite;
    }
}
