
package com.omniture.uiautomation.report.testcases2;

import java.io.IOException;

import org.junit.Test;

import com.omniture.uiautomation.framework.SeleniumTest;
import com.omniture.uiautomation.report.Report;
import com.omniture.uiautomation.report.pages.MarketingChannelsMetricsPage;

public class TestNewResultName extends SeleniumTest {

	@Test
	public void testReName(){
		MarketingChannelsMetricsPage marketingChannelsMetricsPage = new MarketingChannelsMetricsPage();
		marketingChannelsMetricsPage.setWebDriver(this.webDriver);
		this.webDriver.get("http:\\www.google.com");
		try {
			marketingChannelsMetricsPage.screenshot("ddddd");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assert(true);
	}
}

