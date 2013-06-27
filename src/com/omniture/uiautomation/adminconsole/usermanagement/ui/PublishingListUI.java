/*******************************************************************************
 * Adobe CONFIDENTIAL INFORMATION
 * 
 * Copyright (c) 2012 Adobe LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 * 
 * ***************************************************************************
 * PublishingListUI
 * 
 * $Id: PublishingListUI.java, v 1.0 Aug 13, 2012 5:28:34 PM$
 * 
 * Created on Aug 13, 2012
 * 
 * @author ligyu
 ******************************************************************************/
package com.omniture.uiautomation.adminconsole.usermanagement.ui;

import org.openqa.selenium.By;

import com.omniture.uiautomation.adminconsole.ui.AdminConsoleUI;

/**
 * @author ligyu
 */

public class PublishingListUI extends AdminConsoleUI {

    public static By SEARCH_INPUT = By.id("txt_search_name");
    public static By SEARCHGO_BUTTON = By.xpath("//input[@type='submit' and @value='Go']");

    public static By ADD_LINK = By.xpath("//a[.='Add Publishing List']");

    public static By GetDeleteLinkByName(String name){
        return By.xpath("//td[contains(text(), '"+name+"')]/../td[2]/ul/li[3]/a");
    }

    public static By GetEditLinkByName(String name){
        return By.xpath("//td[contains(text(), '"+name+"')]/../td[2]/ul/li[2]/a");
    }

    public static By GetDuplicateLinkByName(String name){
        return By.xpath("//td[contains(text(), '"+name+"')]/../td[2]/ul/li[1]/a");
    }

    public static By MESSAGE_TEXT = By.xpath("//div[@id='validation_summary']/ul[1]/li");

    //Add Publishing List Page
    public static By NAME_INPUT = By.name("delivery_list_name");
    public static By EDITEMAIL_LINK = By.id("new0_lnk");
    public static By EMAIL_TEXTAREA = By.id("new0_txa");
    public static By EDITEMAIL1_LINK = By.id("new1_lnk");
    public static By EMAIL1_TEXTAREA = By.id("new1_txa");    
    public static By SAVE_BUTTON = By.xpath("//input[@type='submit' and @value='Save']");
    public static By ERROR_TEXT = By.id("new0_error");
}

