package com.omniture.uiautomation.report.tests;

import org.junit.Test;

import com.omniture.uiautomation.report.Report;
import com.omniture.uiautomation.report.ui.ReportUI;

/*
 * @author yluo
 */

public class BugConvertTest extends Report {
	
	public BugConvertTest(){
		this.trafficSourcesPage.setWebDriver(this.webDriver);
		this.reportMetricsPage.setWebDriver(this.webDriver);
		this.siteMetricsPage.setWebDriver(this.webDriver);
	}	
	
    @Test
    public void testBug101668() {
    	this.trafficSourcesPage.assertOriginalReferringDomainsReportLoad();
    	String[] metrics = {"Page Views"};
    	this.reportMetricsPage.addMetricsByName(metrics, true);
    	String total1 = this.reportMetricsPage.getReportTotalValue(ReportUI.RANKED_REPORT_TOTAL);
    	this.siteMetricsPage.assertPageViewsReportLoad();
    	String total2 = this.reportMetricsPage.getReportTotalValue(ReportUI.TRENDED_REPORT_TOTAL);
    	assertEquals(total1, total2);
    }
}
