package com.omniture.uiautomation.report.testcases;


import com.omniture.uiautomation.report.Report;
import com.omniture.uiautomation.report.ui.ReportUI;

public class ARSSwitchTest extends Report {
	public ARSSwitchTest() {
		this.reportToolbarPage.setWebDriver(this.webDriver);
	}
    public void testRSSwitch() {
        this.reportToolbarPage.rsSwitch("asc-test1", ReportUI.RS_ASC_TEST1);
        System.out.println("e1");
    }
}
