package com.omniture.uiautomation.adminconsole.reportsuite.ui;

import com.omniture.uiautomation.ui.OmnitureUI;
import org.openqa.selenium.By;
/*
 * author: Weizhi Yang (wyang@adobe.com)
 * 
 * */
public class ReportSuiteManagerUI extends OmnitureUI {

	public static By getReportSuiteByRSID(String rsid)
	{
		return By.xpath("//table[@id='table_data']/tbody/tr[@id='rs_"+rsid+"']");
	}
}
