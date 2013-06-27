package com.omniture.uiautomation.segmentation.ui;
import org.openqa.selenium.By;

/**
 * @author qyzhu
 *
 */

public class SegmentationUI {
	
	public static By REPORTSUITE_SELECTION_DROPDOWN_BUTTON = By.xpath("//div[@id='rsid_select_menu']/a");
	public static By SEGMENT_SELECTION_DROPDOWN_BUTTON = By.xpath("//div[@id='seg_select_menu']/a");
	public static By ADD_SEGMENT_LINK = By.xpath("//ul[@id='seg_select_list']/li[1]/a[contains(text(),'Add Segment')]");
	
	public static By RS_POS = By.xpath("//ul[@id='rsid_select_list']//a[@title='asc-test1']");
	
	public static By SEGMENT_TITLE_INPUT = By.id("segment_name");
	public static By SEGMENT_SAVE_BUTTON = By.xpath("//div[@id='seg_build_buttons']/input");
	public static By SEGMENT_CONTAINER_VISITOR = By.xpath("//li[@id='segment_template_visitor']");
	public static By SEGMENT_EVENTS_FIRST = By.xpath("//ul[@id='seg_build_events']/li[1]");
	public static By SEGMENT_CONTAINER_TARGET = By.xpath("//div[@id='segment_canvas_1_drop_target']/div[@class='segment_indent0']");
	public static By SEGMENT_EVENT_TARGET = By.xpath("//div[@class='segment_indent1']");
	
	public static By SEGMENT_CLEAR_LINK = By.id("seg_select_clear");
	public static By SEGMENT_ALL_VISITS = By.xpath("//div[@id='seg_select_menu']/input[@value='0']");
	
	public static By SEGMENT_GLOBAL_ADD= By.xpath("//div[@id='dw_segment_control']/input[@value='Add']");
	public static By SEGMENT_GLOBAL_EDIT= By.xpath("//div[@id='dw_segment_control']/input[@value='Edit']");
	public static By SEGMENT_GLOBAL_DELETE= By.xpath("//div[@id='dw_segment_control']/input[@value='Delete']");
	public static By SEGMENT_BUILDER_POPUP= By.id("seg_build_popup");
	public static By SEGMENT_GLOBAL_LIST= By.id("dw_segment_list");
	public static By SEGMENT_CURRENT_INPUT = By.id("seg_select");
	public static By SEGMENT_DEFINITION_TITLE = By.xpath("//div[@id='seg_build_popup']/h2");
	
	public static By SUCCESS_MESSAGE = By.xpath("//div[@id='message_area']/div[@class='common message_success']");
	
	public static By INCLUDE_BOLD = By.xpath("//div[@id='seg_build_canvas_header']/a[1]/span");
	public static By CONTAINER_VISITOR = By.id("segment_canvas_5_name");
	public static By EVENT_ORDER = By.id("segment_canvas_7_name");
	
	public static By getGlobalSegment(String segmentID) {
		return By.xpath("//select[@id='dw_segment_list']/option[text()='"+segmentID+"']");
	}
	
	//the report suite id is changed in different environment, even their names are the same
	//Therefore, use the first report suite always
	public static By getReportSuite()
	{
		return By.xpath("//table[@id='table_data']/tbody/tr[2]");
	}
	
	public static By getSegmentInList(String segmentID) {
		return By.xpath("//ul[@id='seg_select_list']/li[*]/a[@title='"+segmentID+"']");
	}
	
	public static By removeSegmentIndicator(String segmentID) {
		return By.xpath("//ul[@id='seg_select_list']/li[*]/a[@title='"+segmentID+"']/i[@title='Remove From List']");
	}
	
	public static By addSegmentIndicator(String segmentID) {
		return By.xpath("//ul[@id='seg_select_list']/li[*]/a[@title='"+segmentID+"']/i[@title='Create New Segment']");
	}
	
	public static By getSegmentInSegmentList(String segmentID) {
		return By.xpath("//ul[@id='seg_select_list']/li[@class='seg-visitor']/a[@title='"+segmentID+"']");
	}
	
	public static By getReportSuiteButton(String reportSuiteID)
	{
		return By.xpath("//ul[@id='rsid_select_list']/li[*]/a[@title='"+reportSuiteID+"']");
	}
	
	public static By getSegmentDef(String segmentID) {
		return By.xpath("//ul[@id='seg_select_list']/li[*]/a[@title='"+segmentID+"']/i[@title='View Segment Definition']");
	}
	
	public static By getSegmentModifier(String segmentID) {
		return By.xpath("//ul[@id='seg_select_list']/li[*]/a[@title='"+segmentID+"']/i[@title='Edit Segment Definition']");
	}
	
		
}






