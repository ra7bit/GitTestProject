package com.omniture.uiautomation.general.tests;

import junit.framework.TestSuite;

import org.junit.Test;
import com.omniture.uiautomation.general.Target;
import com.omniture.uiautomation.general.pages.TargetPage;
import com.omniture.uiautomation.general.ui.TargetUI;
import com.omniture.uiautomation.pages.OmniturePage;
import com.omniture.uiautomation.tests.OmnitureTest;

/**
 * @author qyzhu
 */



public class TargetTestInOrder extends OmnitureTest {
	
	private Target targetPage;
	private OmniturePage omniturePage;
	
//	private static boolean targetAdded =  false;
	
	public TargetTestInOrder(String name)
    {
        super(name);
        targetPage = new Target();
        omniturePage = new OmniturePage();
//        this.targetPage.setWebDriver(this.webDriver);
        this.omniturePage.setWebDriver(this.webDriver);
        
    }
	@Test //TC_1268088
	public void testAddTargetTest() {
		targetPage.targetManagerPage.navigateToSelectedReportSuite();
		targetPage.targetManagerPage.navigateToTargetManagerPage();
		targetPage.targetManagerPage.addNewTarget();
		targetPage.targetManagerPage.assetTargetExists(TargetUI.getTargetByName(TargetPage.TargetName));
	}
	
	@Test //TC_1268092
	public void testShareTargetTest() {
		targetPage.targetManagerPage.navigateToTargetManagerPage();
		targetPage.targetManagerPage.toggleShareTarget(TargetPage.TargetName);
		targetPage.targetManagerPage.asserttoggleShareTarget(TargetPage.TargetName);
	}
	
	
	//TODO: add another check point for target in list
	@Test //TC_1290560
	public void testDeleteSharedTargetTest() {
		targetPage.targetManagerPage.navigateToTargetManagerPage();
		targetPage.targetManagerPage.deleteSharedTarget();
		targetPage.targetManagerPage.assertTargetNotExists(TargetUI.getTargetByName(TargetPage.TargetName));
	}
	
	@Test //TC_1268094
	public void testModifyTargetTest() {
		targetPage.targetManagerPage.navigateToSelectedReportSuite();
		targetPage.targetManagerPage.navigateToTargetManagerPage();
		targetPage.targetManagerPage.addNewTarget();
		targetPage.targetManagerPage.modifyTargetTitle();
		targetPage.targetManagerPage.assetTargetExists(TargetUI.getTargetByName(TargetPage.NewTargetName));
	}
		
	@Test //TC_1268095
	public void testUnshareTargetTest() {
		targetPage.targetManagerPage.navigateToTargetManagerPage();
		targetPage.targetManagerPage.toggleShareTarget(TargetPage.NewTargetName);
		targetPage.targetManagerPage.toggleShareTarget(TargetPage.NewTargetName); 
		targetPage.targetManagerPage.asserttoggleShareTarget(TargetPage.NewTargetName);
	}
	
	@Test //TC_1268093
	public void testDeleteNoneSharedTargetTest() {
		targetPage.targetManagerPage.navigateToTargetManagerPage();
		targetPage.targetManagerPage.deleteNoneSharedTarget(TargetPage.NewTargetName);
		targetPage.targetManagerPage.assertTargetNotExists(TargetUI.getTargetByName(TargetPage.NewTargetName));
	}
	
	@Test //TC_1268090
	public void viewTargetTest() {
		targetPage.targetManagerPage.navigateToSelectedReportSuite();
		targetPage.targetManagerPage.navigateToTargetManagerPage();
		targetPage.targetManagerPage.addNewTarget();
		targetPage.targetManagerPage.viewTarget();
		targetPage.targetManagerPage.assertTargetTitle();	
	}
	
	
	public static TestSuite suite(){
		TestSuite suite = new TestSuite("target test...");
		suite.addTest(new TargetTestInOrder("testAddTargetTest"));
		suite.addTest(new TargetTestInOrder("testShareTargetTest"));		
		suite.addTest(new TargetTestInOrder("testDeleteSharedTargetTest"));		
		suite.addTest(new TargetTestInOrder("testModifyTargetTest"));
		suite.addTest(new TargetTestInOrder("testUnshareTargetTest"));		
		suite.addTest(new TargetTestInOrder("testDeleteNoneSharedTargetTest"));
		return suite;
	}

}
