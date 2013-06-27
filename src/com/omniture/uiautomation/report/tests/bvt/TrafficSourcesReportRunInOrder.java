package com.omniture.uiautomation.report.tests.bvt;

import junit.framework.TestSuite;
import junit.framework.Test;

import com.omniture.uiautomation.report.pages.TrafficSourcesPage;
import com.omniture.uiautomation.report.testcases.ARSSwitchTest;
import com.omniture.uiautomation.tests.OmnitureTest;

public class TrafficSourcesReportRunInOrder extends OmnitureTest {
	private TrafficSourcesPage trafficSourcesPage;
	private ARSSwitchTest rsSwitch;
	public TrafficSourcesReportRunInOrder(String name) {
		super(name);
		this.trafficSourcesPage = new TrafficSourcesPage();
		this.trafficSourcesPage.setWebDriver(this.webDriver);
		this.rsSwitch = new ARSSwitchTest();
	}
	    public void testSearchKeywordsAllReportLoad() {
	    	this.rsSwitch.testRSSwitch();
	        this.trafficSourcesPage.assertSearchKeywordsAllReportLoad();
	    }
	    public void testSearchKeywordsPaidReportLoad() {
	        this.trafficSourcesPage.assertSearchKeywordsPaidReportLoad();
	    }
	    public void testSearchKeywordsNaturalReportLoad() {
	        this.trafficSourcesPage.assertSearchKeywordsNaturalReportLoad();
	    }
	    public void testSearchEnginesAllReportLoad() {
	        this.trafficSourcesPage.assertSearchEnginesAllReportLoad();
	    }
	    public void testSearchEnginesPaidReportLoad() {
	        this.trafficSourcesPage.assertSearchEnginesPaidReportLoad();
	    }
	    public void testSearchEnginesNaturalReportLoad() {
	        this.trafficSourcesPage.assertSearchEnginesNaturalReportLoad();
	    }
	    public void testAllSearchPageRankingReportLoad() {
	        this.trafficSourcesPage.assertAllSearchPageRankingReportLoad();
	    }
	    public void testReferringDomainsReportLoad() {
	        this.trafficSourcesPage.assertReferringDomainsReportLoad();
	    }
	    public void testOriginalReferringDomainsReportLoad() {
	        this.trafficSourcesPage.assertOriginalReferringDomainsReportLoad();
	    }
	    public void testReferrersReportLoad() {
	        this.trafficSourcesPage.assertReferrersReportLoad();
	    }
	    public void testReferrerTypesReportLoad() {
	        this.trafficSourcesPage.assertReferrerTypesReportLoad();
	    }
	    public static Test suite() {
	        TestSuite suite = new TestSuite("paths test...");
	        suite.addTest(new TrafficSourcesReportRunInOrder("testSearchKeywordsAllReportLoad"));
	        suite.addTest(new TrafficSourcesReportRunInOrder("testSearchKeywordsPaidReportLoad"));
	        suite.addTest(new TrafficSourcesReportRunInOrder("testSearchKeywordsNaturalReportLoad"));
	        suite.addTest(new TrafficSourcesReportRunInOrder("testSearchEnginesAllReportLoad"));
	        suite.addTest(new TrafficSourcesReportRunInOrder("testSearchEnginesPaidReportLoad"));	        
	        suite.addTest(new TrafficSourcesReportRunInOrder("testSearchEnginesNaturalReportLoad"));
	        suite.addTest(new TrafficSourcesReportRunInOrder("testAllSearchPageRankingReportLoad"));
	        suite.addTest(new TrafficSourcesReportRunInOrder("testReferringDomainsReportLoad"));
	        suite.addTest(new TrafficSourcesReportRunInOrder("testOriginalReferringDomainsReportLoad"));
	        suite.addTest(new TrafficSourcesReportRunInOrder("testReferrersReportLoad"));
	        suite.addTest(new TrafficSourcesReportRunInOrder("testReferrerTypesReportLoad"));	        
	        return suite;
	    }
}
