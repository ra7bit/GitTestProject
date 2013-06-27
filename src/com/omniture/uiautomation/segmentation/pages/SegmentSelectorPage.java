package com.omniture.uiautomation.segmentation.pages;


import com.omniture.uiautomation.segmentation.ui.*;
import com.omniture.uiautomation.ui.SiteCatalystUI;

/**
 * @author qyzhu
 */

public class SegmentSelectorPage extends SegmentPage {
	
	public void addSegment() {
		this.mouseToSegment("Add Segment");
		this.click(SegmentationUI.addSegmentIndicator("Add Segment"));
		this.switchTab();
		
		this.addSegmentAction();
		this.switchTab();
	}
	
	public void rsAndPageViewsReport()
	{
		this.navigateToReport();
		this.rsSwitch(this.getDefaultReportSuiteName(), SegmentationUI.RS_POS);
	}
	
	public void assertSegmentAdded(String name) {
		this.waitUntilElementClickable(SegmentationUI.SEGMENT_SELECTION_DROPDOWN_BUTTON);
		this.click(SegmentationUI.SEGMENT_SELECTION_DROPDOWN_BUTTON);
		this.sleep(3000);
		this.waitUntilElement(SegmentationUI.getSegmentInSegmentList(name));
		
		this.assertElementExists(SegmentationUI.getSegmentInSegmentList(name));
	}
	
	public boolean isSegmentExists(String name) {
		return this.isElementExists(SegmentationUI.getSegmentInList(name));
	}
	
	public void clickSegmentSelector() {
		this.sleep(2000);
		this.waitUntilElementClickable(SegmentationUI.SEGMENT_SELECTION_DROPDOWN_BUTTON);
		this.click(SegmentationUI.SEGMENT_SELECTION_DROPDOWN_BUTTON);
	}
		
	
	public void mouseToSegment(String segmentName) {
		this.waitUntilElementClickable(SegmentationUI.SEGMENT_SELECTION_DROPDOWN_BUTTON);
		this.click(SegmentationUI.SEGMENT_SELECTION_DROPDOWN_BUTTON);
		this.waitUntilElement(SegmentationUI.getSegmentInList(segmentName));
		this.mouseTo(SegmentationUI.getSegmentInList(segmentName));
	}
	public void removeSegment(String segmentName) {			
		this.mouseToSegment(segmentName);
		this.sleep(3000);
		this.click(SegmentationUI.removeSegmentIndicator(segmentName));
		this.sleep(2000);
		this.getLocator().alert().accept();
		this.waitUntilPageLoad();
	}
	

	public void assertSuccessMessage(String message) {	
		this.waitUntilElement(SegmentationUI.SUCCESS_MESSAGE);
		this.assertElementTextContain(SegmentationUI.SUCCESS_MESSAGE, message);
	}
	
	public void selectSegment(String segmentName) {
		this.waitUntilElementClickable(SegmentationUI.SEGMENT_SELECTION_DROPDOWN_BUTTON);
		this.click(SegmentationUI.SEGMENT_SELECTION_DROPDOWN_BUTTON);
		
		this.waitUntilElementClickable(SegmentationUI.getSegmentInList(segmentName));
		this.click(SegmentationUI.getSegmentInList(segmentName));
		this.waitUntilElement(SiteCatalystUI.REPORT_TITLE);
	}
	
	
	public void clearSegment() {
		this.waitUntilElementClickable(SegmentationUI.SEGMENT_CLEAR_LINK);
		this.click(SegmentationUI.SEGMENT_CLEAR_LINK);
		this.waitUntilPageLoad();
	}
	
	public void assertSegmentInSelector(String segmentName) {
		this.sleep(3000);
		this.assertElementAttributeContains(SegmentationUI.SEGMENT_CURRENT_INPUT, "value", segmentName);
	}
		
	public void editSegment() {
		this.mouseToSegment(SegmentPage.getSegmentTitle());
		this.click(SegmentationUI.getSegmentModifier(SegmentPage.getSegmentTitle()));
		this.switchTab();
		this.clear(SegmentationUI.SEGMENT_TITLE_INPUT);
		this.type(SegmentationUI.SEGMENT_TITLE_INPUT, SegmentPage.getNewSegmentTitle());
		this.click(SegmentationUI.SEGMENT_SAVE_BUTTON);
		this.switchTab();
	}
	
	public void viewPurchasersSegDefinition(String segment) {
		this.mouseToSegment(segment);
		this.click(SegmentationUI.getSegmentDef(segment));
		this.switchTab();
	}
	
	public void assertPurchasersSegmentDef() {
		this.assertElementTextContain(SegmentationUI.SEGMENT_DEFINITION_TITLE, "Segment Definition: Purchasers");
		assert this.findElement(SegmentationUI.INCLUDE_BOLD).getAttribute("style").contains("bold"): "Include criteria is not bold";
		this.assertElementsTextContain(SegmentationUI.CONTAINER_VISITOR, "Visitor");
		this.assertElementsTextContain(SegmentationUI.EVENT_ORDER, "Order");
		this.closeTab();
		
	}
}
