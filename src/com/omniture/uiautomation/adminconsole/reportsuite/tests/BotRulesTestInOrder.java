package com.omniture.uiautomation.adminconsole.reportsuite.tests;

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

	@Test // TC_1268910
	public void addBotRuleTest() {
		page.navigateToAdminConsole();
		page.navigateToBotrules();
		page.inputRule();
		page.assertBotRule();
	}
	
	@Test // TC_1268910
	public void deleteBotRuleTest() {
		page.navigateToAdminConsole();
		page.navigateToBotrules();
		page.deleteRule();
		page.assertBotRule();
	}
	
	public static TestSuite suite(){
		TestSuite suite = new TestSuite("bot rules test...");
		suite.addTest(new BotRulesTestInOrder("checkIABBotTest"));
		suite.addTest(new BotRulesTestInOrder("cancelButtonTest"));
		suite.addTest(new BotRulesTestInOrder("addBotRuleTest"));
		suite.addTest(new BotRulesTestInOrder("deleteBotRuleTest"));
		return suite;
	}
}
