package com.omniture.uiautomation.adminconsole.reportsuite.pages;

import com.omniture.uiautomation.adminconsole.reportsuite.ui.BotRulesUI;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.OmniturePage;
import com.omniture.uiautomation.segmentation.ui.SegmentationUI;

/**
 * @author qyzhu
 *
 */

public class BotRulesPage extends OmniturePage{

	public boolean IABcheckbox = true;
//	public static final String SELECTED_RS="asc-test1";
//	public static final String SELECTED_RS_ID="ascauto01";
	public static final String RULE_NAME = "test";
	public static final String RULE_STARTS = "test";
	
	
	public void navigateToAdminConsole() {
		this.getWebDriver().get(TestEnvironment.current.getBaseUrl() 
				+ "/p/am/1.3/index.html?a=ReportSuite.Index"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
		this.waitUntilPageLoad();
	}
	
	public void navigateToBotRulesPage() {
		this.getWebDriver().get(TestEnvironment.current.getBaseUrl() 
				+ "/p/am/1.3/index.html?a=ReportSuite.Manager&feature=BotRules&="
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
		if(!this.checkLanguage("en_US"))
			this.switchLanguage("en_US");
		this.waitUntilPageLoad();
	}
	
//	public void selectRS() {
//		WebElement element = TestEnvironment.driver.findElement(BotRulesUI.getReportSuite(SELECTED_RS_ID));
//		element.click();
//	}
	
	public void navigateToBotrules() {
		this.selectRS();
		this.navigateToBotRulesPage();
	}
	
	public void selectRS() {
		this.waitUntilElementClickable(SegmentationUI.getReportSuite());
		this.click(SegmentationUI.getReportSuite());
		this.waitUntilPageLoad();
	}
	
	public void originalValue() {
		this.IABcheckbox = this.findElement(BotRulesUI.BOTRULE_FORM).getAttribute("value").equals(1)?true:false;
	}
	
	public void checkIABBot() {
		this.originalValue();
		this.click(BotRulesUI.BOTRULE_FORM);
		this.waitUntilPageLoad();
		this.click(BotRulesUI.SAVE_BUTTON);
		this.waitUntilPageLoad();		
	}
	
	public void cancelButton() {
		this.click(BotRulesUI.ADD_RULE_LINK);
		this.waitUntilPageLoad();
		this.click(BotRulesUI.CANCEL_BUTTON);
		this.waitUntilPageLoad();		
	}
	
	public void assertIABBot() {
		if(this.IABcheckbox == true)
			this.assertElementAttributeContains(BotRulesUI.BOTRULE_FORM,"value","0");
		else
			this.assertElementAttributeContains(BotRulesUI.BOTRULE_FORM,"value","1");
		this.assertElementTextContain(BotRulesUI.SUCCESS_MESSAGE, 
				"\"Bot Rules UI\" was approved.");
	}
	
	public void assertCancelButton() {
		this.assertElementNotExists(BotRulesUI.SUCCESS_MESSAGE);
	}
	
	public void inputRule() {
		this.click(BotRulesUI.ADD_RULE_LINK);
		this.waitUntilElement(BotRulesUI.RULE_NAME_INPUT);
		this.type(BotRulesUI.RULE_NAME_INPUT,BotRulesPage.RULE_NAME);
		this.type(BotRulesUI.RULE_INPUT, BotRulesPage.RULE_STARTS);
		this.click(BotRulesUI.SAVE_BUTTON);
	}
	
	public void deleteRule() {
		this.click(BotRulesUI.RULE_DELETE_BUTTON);
		this.sleep(3000);
		this.click(BotRulesUI.SAVE_BUTTON);
	}
	
	public void assertBotRule() {
		this.waitUntilElement(BotRulesUI.SUCCESS_MESSAGE);
		this.assertElementTextContain(BotRulesUI.SUCCESS_MESSAGE, 
				"\"Bot Rules UI\" was approved.");
	}
}
