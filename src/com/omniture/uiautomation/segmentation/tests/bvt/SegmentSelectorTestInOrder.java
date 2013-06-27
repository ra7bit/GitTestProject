package com.omniture.uiautomation.segmentation.tests.bvt;
import junit.framework.TestSuite;

import org.junit.Test;

import com.omniture.uiautomation.pages.OmniturePage;
import com.omniture.uiautomation.segmentation.Segmentation;
import com.omniture.uiautomation.segmentation.pages.SegmentPage;
import com.omniture.uiautomation.segmentation.ui.SegmentationUI;
import com.omniture.uiautomation.tests.OmnitureTest;

/**
 * @author qyzhu
 */

public class SegmentSelectorTestInOrder extends OmnitureTest {
	
	private Segmentation segmentationPage;
	private OmniturePage omniturePage;
	
	public SegmentSelectorTestInOrder (String name)
    {
        super(name);
        segmentationPage = new Segmentation();
        omniturePage = new OmniturePage();
        this.omniturePage.setWebDriver(this.webDriver);
    }
	
	@Test //TC_1269993
	public void testviewPurchasersSegTest() {
		segmentationPage.segmentSelectorPage.rsAndPageViewsReport();
		segmentationPage.segmentSelectorPage.selectSegment("Purchasers");
		segmentationPage.segmentSelectorPage.assertSegmentInSelector("Purchasers");
		
	}
	
	@Test //TC_1289732
	public void testclearSpecificSegTest() {
		segmentationPage.segmentSelectorPage.clearSegment();
		segmentationPage.segmentSelectorPage.assertSegmentInSelector("All Visits (No Segment)");
	}
	
	@Test //TC_1269990, create segment in segment selector
	public void testaddSegmentInSegSelectorTest() {
		segmentationPage.segmentSelectorPage.rsSwitch(new SegmentPage().getDefaultReportSuiteName(), SegmentationUI.RS_POS);
		segmentationPage.segmentSelectorPage.addSegment();
		segmentationPage.segmentSelectorPage.rsAndPageViewsReport();
		segmentationPage.segmentSelectorPage.assertSegmentAdded(SegmentPage.getSegmentTitle());
	}
	
	@Test //TC_1269990, create segment in segment selector
	public void testeditSegmentInSegSelectorTest() {
		segmentationPage.segmentSelectorPage.rsAndPageViewsReport();
		segmentationPage.segmentSelectorPage.editSegment();
		segmentationPage.segmentSelectorPage.rsAndPageViewsReport();
		segmentationPage.segmentSelectorPage.assertSegmentAdded(SegmentPage.getNewSegmentTitle());
		segmentationPage.segmentSelectorPage.rsAndPageViewsReport();
		segmentationPage.segmentSelectorPage.removeSegment(SegmentPage.getNewSegmentTitle());
		segmentationPage.segmentSelectorPage.assertSuccessMessage("Segment successfully removed.");
	}
		
	@Test //TC_1272737 
	public void testremoveSegmentInSegSelectorTest() {
		segmentationPage.segmentSelectorPage.rsAndPageViewsReport();
		segmentationPage.segmentSelectorPage.removeSegment(SegmentPage.getSegmentTitle());
		segmentationPage.segmentSelectorPage.assertSuccessMessage("Segment successfully removed.");
	}
	
	@Test //TC_1275613 
	public void testviewPurchasersSegDefinitiontTest() {
		segmentationPage.segmentSelectorPage.rsAndPageViewsReport();
		segmentationPage.segmentSelectorPage.viewPurchasersSegDefinition("Purchasers");
		segmentationPage.segmentSelectorPage.assertPurchasersSegmentDef();
	}
	
	public static TestSuite suite(){
		TestSuite suite = new TestSuite("segment selector test...");
		suite.addTest(new SegmentSelectorTestInOrder("testviewPurchasersSegTest"));
		suite.addTest(new SegmentSelectorTestInOrder("testclearSpecificSegTest"));
		suite.addTest(new SegmentSelectorTestInOrder("testaddSegmentInSegSelectorTest"));
		suite.addTest(new SegmentSelectorTestInOrder("testeditSegmentInSegSelectorTest"));
		suite.addTest(new SegmentSelectorTestInOrder("testremoveSegmentInSegSelectorTest"));	
		suite.addTest(new SegmentSelectorTestInOrder("testviewPurchasersSegDefinitiontTest"));
		return suite;
	}
	
	

}
