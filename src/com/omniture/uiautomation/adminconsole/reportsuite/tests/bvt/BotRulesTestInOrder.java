package com.omniture.uiautomation.adminconsole.reportsuite.tests.bvt;

import junit.framework.TestSuite;

import org.junit.Test;

import com.omniture.uiautomation.adminconsole.reportsuite.pages.BotRulesPage;
import com.omniture.uiautomation.tests.OmnitureTest;

/**
 * @author qyzhu 
 */

public class BotRulesTestInOrder extends OmnitureTest {
	private BotRulesPage page;
	
	public BotRulesTestInOrder(String name)
    {
        super(name);
        page = new BotRulesPage();
        page.setWebDriver(this.webDriver);
    }
	
	@Test // TC_1268904
	public void checkIABBotTest() {
		page.navigateToAdminConsole();
		page.navigateToBotrules();
		page.checkIABBot();
		page.assertIABBot();
	}
	
	@Test // TC_1268912
	public void cancelButtonTest() {
		page.navigateToAdminConsole();
		page.navigateToBotrules();
		page.cancelButton();
		page.assertCancelButton();
	}
	
	
	public static TestSuite suite(){
		TestSuite suite = new TestSuite("bot rules test...");
		suite.addTest(new BotRulesTestInOrder("checkIABBotTest"));
		suite.addTest(new BotRulesTestInOrder("cancelButtonTest"));
		return suite;
	}
}
