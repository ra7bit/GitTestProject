package com.omniture.uiautomation.general.pages;

import org.openqa.selenium.By;
import com.omniture.uiautomation.general.ui.TargetUI;

/**
 * @author qyzhu
 */

public class TargetManagerPage extends TargetPage {
	
	public void addNewTarget() {
		this.waitUntilElementClickable(TargetUI.ADD_NEW_TARGET_BUTTON);
		this.click(TargetUI.ADD_NEW_TARGET_BUTTON);
		this.waitUntilPageLoad();
		this.inputTargetElements();
	}
	
	public void inputTargetElements() {
		this.clear(TargetUI.TARGET_NAME_INPUT);
		this.type(TargetUI.TARGET_NAME_INPUT, TargetPage.TargetName);
		this.waitUntilElementClickable(TargetUI.APPLYTO_ENTIRE_SITE_CHECKBOX);
		this.click(TargetUI.APPLYTO_ENTIRE_SITE_CHECKBOX);
		this.selectByVisibleText(TargetUI.METRICS_SELECT, TargetPage.TargetMetric);
		this.sleep(2000);
		this.type(TargetUI.PERIOD_FROM_INPUT, TargetPage.TargetPeriodFrom);
		this.type(TargetUI.PERIOD_TO_INPUT, TargetPage.TargetPeriodTo);
		//click anywhere on the page to load the TargetUI.TARGET_PERIOD_VALUE_INPUT
		this.click(TargetUI.APPLYTO_ENTIRE_SITE_CHECKBOX);  
		this.sleep(2000);
		this.type(TargetUI.TARGET_PERIOD_VALUE_INPUT, TargetPage.TargetPeriodValue);		
		
		this.click(TargetUI.TARGET_ADD_OK_BUTTON);
		this.waitUntilPageLoad();
	}
	
	public void assetTargetExists (By target) {
		this.assertElementExists(target);	
	}
	
	public void assertTargetNotExists (By target) {
		this.assertElementNotExists(target);
	}
	
	
	public boolean judgeTargetExists () {
		return	this.isElementExists(TargetUI.getTargetByName(TargetPage.TargetName));
	}
	
	public void setTargetSharedStatus (String name) {
		TargetPage.TargetSharedStatus = 
				Boolean.getBoolean(this.findElement(TargetUI.getTargetSharedCheckboxByName(name)).getAttribute("checked"));
	}
	
	public void toggleShareTarget (String name) {
		this.setTargetSharedStatus(name);
		this.click(TargetUI.getTargetSharedCheckboxByName(name));
	}
	
	public void asserttoggleShareTarget(String name) {
		boolean newStatus = 
				Boolean.getBoolean(this.findElement(TargetUI.getTargetSharedCheckboxByName(name)).getAttribute("checked"));
		assert newStatus != TargetPage.TargetSharedStatus: "toggle share target failed!";
		
		//if target is shared, it also displayed in the shared target list; 
		//when unsharing, it disappeared from the shared target list
		if(TargetPage.TargetSharedStatus) {
			this.assertElementExists(TargetUI.getTargetInSharedList(name));
		} else
			assert !(this.isElementExists(TargetUI.getTargetInSharedList(name))):
				"unshared target appears in the shared target list!";

	}
	
	public void deleteNoneSharedTarget(String name) {
		this.sleep(10000);
		this.click(TargetUI.getTargetDeleteButton(name));
	}
	
	public void deleteSharedTarget() {
		this.waitUntilElementClickable(TargetUI.getTargetDeleteButton(TargetPage.TargetName));
		this.click(TargetUI.getTargetDeleteButton(TargetPage.TargetName));
		this.sleep(1000);
		this.getLocator().alert().accept();
	}
	
	public void mouseToTargetMenu() {
		this.click(TargetUI.FAVORITES_LINK);
		this.waitUntilElementClickable(TargetUI.TARGETS_LINK);
		this.mouseTo(TargetUI.TARGETS_LINK);
		
	}
	
	public void viewTarget() {
		
		if(!this.isElementExists(TargetUI.getViewTargetByName(TargetPage.TargetName))) {
			this.navigateToTargetManagerPage();
			this.addNewTarget();
		}
			
		this.mouseToTargetMenu();
		this.waitUntilElementClickable(TargetUI.getViewTargetByName(TargetPage.TargetName));
		
		this.click(TargetUI.getViewTargetByName(TargetPage.TargetName));
		this.waitUntilPageLoad();
	}

	public void assertTargetTitle() {
		assert TargetPage.TargetName==this.findElement(TargetUI.TARGET_TITLE_IN_REPORT).getText():
			"View target failed!";
	}
	
	public void modifyTargetTitle() {
		this.click(TargetUI.getTargetModifyButton(TargetPage.TargetName));
		this.waitUntilElement(TargetUI.TARGET_NAME_INPUT);
		this.clear(TargetUI.TARGET_NAME_INPUT);
		this.type(TargetUI.TARGET_NAME_INPUT, TargetPage.NewTargetName);
		this.click(TargetUI.TARGET_ADD_OK_BUTTON);
		this.waitUntilPageLoad();
	}

}
