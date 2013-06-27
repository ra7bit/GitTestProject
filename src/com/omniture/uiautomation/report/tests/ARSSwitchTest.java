package com.omniture.uiautomation.report.tests;

import org.junit.Test;

import com.omniture.uiautomation.report.Report;
import com.omniture.uiautomation.report.ui.ReportUI;

public class ARSSwitchTest extends Report {
	
	public ARSSwitchTest(){
		this.reportToolbarPage.setWebDriver(this.webDriver);
	}	
	
    @Test
    public void testRSSwitch() {
        this.reportToolbarPage.rsSwitch("asc-test1", ReportUI.RS_ASC_TEST1);
    }
}
