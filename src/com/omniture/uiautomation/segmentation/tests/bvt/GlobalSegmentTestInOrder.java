package com.omniture.uiautomation.segmentation.tests.bvt;
import junit.framework.TestSuite;

import org.junit.Test;

import com.omniture.uiautomation.segmentation.Segmentation;
import com.omniture.uiautomation.segmentation.pages.GlobalSegmentPage;
import com.omniture.uiautomation.tests.OmnitureTest;

/**
 * @author qyzhu
 */


public class GlobalSegmentTestInOrder extends OmnitureTest {
	
	private Segmentation segmentationPage;
	
	public GlobalSegmentTestInOrder(String name)
    {
        super(name);
        segmentationPage = new Segmentation();
    }
	
	@Test //TC_1270000 add global segment in admin console
	public void testaddGlobalSegment() {
		segmentationPage.globalSegmentPage.navigateToAdminConsole();
		segmentationPage.globalSegmentPage.navigateToSegmentManager();
		segmentationPage.globalSegmentPage.addGlobalSegment();
		segmentationPage.globalSegmentPage.assertGlobalSegmentExists(GlobalSegmentPage.SegmentTitle);
	}
	
	@Test //TC_1270001 delete global segment in admin console
	public void testdeleteGlobalSegment() {
		segmentationPage.globalSegmentPage.navigateToAdminConsole();
		segmentationPage.globalSegmentPage.navigateToSegmentManager();
		segmentationPage.globalSegmentPage.deleteGlobalSegment(GlobalSegmentPage.SegmentTitle);
		assert segmentationPage.globalSegmentPage.isGlobalSegmentExists(GlobalSegmentPage.SegmentTitle): 
			"Global Segment"+segmentationPage.globalSegmentPage.SegmentTitle+" failed to delete!";
	}
	
	@Test //TC_1290047 edit global segment in admin console
	public void testeditGlobalSegment() {
		segmentationPage.globalSegmentPage.navigateToAdminConsole();
		segmentationPage.globalSegmentPage.navigateToSegmentManager();
		segmentationPage.globalSegmentPage.editGlobalSegment();
		segmentationPage.globalSegmentPage.assertGlobalSegmentExists(GlobalSegmentPage.NewSegmentTitle);
		segmentationPage.globalSegmentPage.deleteGlobalSegment(GlobalSegmentPage.NewSegmentTitle);
	}
	
	public static TestSuite suite(){
		TestSuite suite = new TestSuite("global segment test...");
		suite.addTest(new GlobalSegmentTestInOrder("testaddGlobalSegment"));
		suite.addTest(new GlobalSegmentTestInOrder("testeditGlobalSegment"));
		suite.addTest(new GlobalSegmentTestInOrder("testdeleteGlobalSegment"));
		return suite;
	}
}
