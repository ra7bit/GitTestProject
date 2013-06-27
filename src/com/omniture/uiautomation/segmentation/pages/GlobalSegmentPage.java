package com.omniture.uiautomation.segmentation.pages;

import com.omniture.uiautomation.segmentation.ui.*;

/**
 * @author qyzhu
 */

public class GlobalSegmentPage extends SegmentPage {
	
	public static String NewSegmentTitle = SegmentPage.SegmentTitle + "1"; 
	
	public void assertSegmentAdded() {
		this.waitUntilElementClickable(SegmentationUI.SEGMENT_SELECTION_DROPDOWN_BUTTON);
		this.click(SegmentationUI.SEGMENT_SELECTION_DROPDOWN_BUTTON);
		this.waitUntilElement(SegmentationUI.getSegmentInSegmentList(SegmentTitle));
		
		this.assertElementExists(SegmentationUI.getSegmentInSegmentList(SegmentTitle));
	}
	
	public void selectRS() {
		this.waitUntilElementClickable(SegmentationUI.getReportSuite());
		this.click(SegmentationUI.getReportSuite());
		this.waitUntilPageLoad();
	}
	
	
	public void navigateToSegmentManager() {
		this.selectRS();
		this.navigateToSegmentManagerPage();
	}
	
	public void addGlobalSegment() {
		this.waitUntilElementClickable(SegmentationUI.SEGMENT_GLOBAL_ADD);
		this.click(SegmentationUI.SEGMENT_GLOBAL_ADD);
		this.waitUntilPageLoad();
		this.switchTab();	
		
		this.addSegmentAction();
		this.switchTab();
	}

	public void deleteGlobalSegment(String segmentTitle) {
		this.selectByVisibleText(SegmentationUI.SEGMENT_GLOBAL_LIST, segmentTitle);
		this.waitUntilElementClickable(SegmentationUI.SEGMENT_GLOBAL_DELETE);
		this.click(SegmentationUI.SEGMENT_GLOBAL_DELETE);
		this.sleep(1000);
		this.getLocator().alert().accept();
	}
	
	
	public void editGlobalSegment() {
		this.selectByVisibleText(SegmentationUI.SEGMENT_GLOBAL_LIST, SegmentTitle);
		this.waitUntilElementClickable(SegmentationUI.SEGMENT_GLOBAL_EDIT);
		this.click(SegmentationUI.SEGMENT_GLOBAL_EDIT);
		this.switchTab();
		this.waitUntilElement(SegmentationUI.SEGMENT_TITLE_INPUT);
		
		this.clear(SegmentationUI.SEGMENT_TITLE_INPUT);
		this.type(SegmentationUI.SEGMENT_TITLE_INPUT, this.NewSegmentTitle);
		this.waitUntilElementClickable(SegmentationUI.SEGMENT_SAVE_BUTTON);
		this.click(SegmentationUI.SEGMENT_SAVE_BUTTON);
		this.sleep(1000);
		this.switchTab();
	}
	
	
		
	public void assertGlobalSegmentExists(String segmentTitle) {
		this.assertElementExists(SegmentationUI.getGlobalSegment(segmentTitle));
	}
	
	public boolean isGlobalSegmentExists(String segmentTitle) {
		return this.isElementExists(SegmentationUI.getGlobalSegment(segmentTitle));
	}

}
