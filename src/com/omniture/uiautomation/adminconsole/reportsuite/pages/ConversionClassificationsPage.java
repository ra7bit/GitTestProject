package com.omniture.uiautomation.adminconsole.reportsuite.pages;

import org.openqa.selenium.support.ui.Select;

import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.OmniturePage;
import com.omniture.uiautomation.adminconsole.reportsuite.ui.*;
import org.openqa.selenium.By;


/*
 * author: Weizhi Yang (wyang@adobe.com)
 * 
 * */

public class ConversionClassificationsPage extends OmniturePage {
	
	public void navigateToConClassificationsPage() 
	{
		this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/p/am/1.3/index.html?a=ReportSuite.Manager&feature=Classifications&type=ecommerce&ssSession="
                + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
        this.waitUntilPageLoad();
    }
	
	public void selectReportSuiteByRSID(String rsid)
	{
		ReportSuiteManagerPage rsPage = new ReportSuiteManagerPage();
		rsPage.navigateToReportSuiteManagerPage();
		rsPage.selectReportSuiteByRSID(rsid);
	}
	
	public void selectClassificationType(String typeName)
	{
		Select select = new Select(this.findElement(ConversionClassificationsUI.SELECT_TYPE));
		select.selectByVisibleText(typeName);
	}
	
	public void mouseToActionTarget(String classificationName)
	{
		this.mouseTo(ConversionClassificationsUI.getActionTargetByClassificationName(classificationName));
		this.sleep(1000);
	}
	
	public void addClassification(String rel)
	{
		By testBy = ConversionClassificationsUI.getAddClassificationLinkButtonByRel(rel);
		this.click(testBy);
		this.sleep(1000);
	}
	
	public void newClassificationSelectType(String type)
	{
		Select select = new Select(this.findElement(ConversionClassificationsUI.getNewClassificationTypeSelecter()));
		select.selectByVisibleText(type);		
	}
	
	public void newClassificationSetNameAs(String name)
	{
		this.type(ConversionClassificationsUI.getNewClassificationNameInputer(), name);
	}
	
	public void newClassificationCheckDataEnable(Boolean isEnable)
	{
		
	}
}
