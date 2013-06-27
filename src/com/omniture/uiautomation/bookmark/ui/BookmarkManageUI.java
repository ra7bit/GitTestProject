package com.omniture.uiautomation.bookmark.ui;

import org.openqa.selenium.By;

import com.omniture.uiautomation.ui.OmnitureUI;

/**
 * 
 * @author dandanj
 *
 */
public class BookmarkManageUI extends OmnitureUI{
    
    //For adding bookmark
    public static By BOOKMARK_LINK = By.xpath("//*[@id='bookmark_tool']/a[.='Bookmark']");
    public static By BOOKMARKNAME_INPUT = By.xpath("//div[@id='save_bookmark_container']/form/div[2]/div/div[1]/input[@name='name']");
    public static By BOOKMARK_ADDTOFOLDER = By.id("bm_folder_sel");
    public static By BOOKMARKFOLDERNAME_INPUT = By.name("new_folder");
    public static By BOOKMARK_SAVE = By.id("bm_add");
    public static By CONFIRM_MESSAGE =By.id("yui-gen4");
    
    //For access bookmark from folder
    public static By getByBkLable(String bkName){
        return By.xpath("//a[.='" + bkName + "']/../../input/../span/a");
    }
    public static By BOOKMARK_REPORT_TITLE = By.id("report_title");
    
    //Edit bookmark   
    public static By getByBkEdit(String bkName){
        return By.xpath("//a[.='" + bkName + "']/../../input/../../td[6]/a/img");
    }
    public static By BOOKMARK_EDIT_INPUT = By.name("bookmark_name");
    public static By BOOKMARK_EDIT_LOCATION = By.name("folder_id");
    public static By BOOKMARK_EDIT_OK = By.name("ok");
  
    //For creating bookmark folder
    public static By BOOKMARKFOLDER_ADDICON =By.xpath("//*[@id='bookmark_options_container']/a[1]/img");
    public static By BOOKMARKFOLDER_INPUT =By.name("folder_name");
    public static By BOOKMARKFOLDER_SAVE = By.name("submit");
    public static By getByAssertFolder(String folderName){
        return By.xpath("//span[contains(text(),'" + folderName + "')]");
    }
    
    //Move bookmark to another folder
    public static By getByForFolderName(String folderName){
        return By.xpath("//span[contains(text(),'" + folderName + "')]/../a/img");
    }
    public static By getByBkCheckbox(String bkName){
        return By.xpath("//a[.='" + bkName + "']/../../input");
    }
    public static By BOOKMARK_MOVETOFOLDER = By.name("move_to_folder_top");
      
    //Edit bookmark folder
    public static By getByBkFolderEdit(String bkFolderName){
        return By.xpath("//span[contains(text(),'" + bkFolderName + "')]/../../td[3]/a/img");
    }
    
    //Delete bookmark folder
    public static By getByBkFolderCheckbox(String bkFolderName){
        return By.xpath("//span[contains(text(),'" + bkFolderName + "')]/../input");
    }
    public static By getByBkFolderDelete(String bkFolderName){
        return By.xpath("//span[contains(text(),'" + bkFolderName + "')]/../../td[3]/a[2]/img");
    }
    
    //Delete bookmark
    public static By getByBkDelete(String bkName){
        return By.xpath("//a[.='" + bkName + "']/../../input/../../td[6]/a[2]/img");
    }
    //Direct Access
    public static By getByDirectAccess(String bkName){
    	return By.xpath("//a[.='" + bkName + "']/../../input/../../td[3]/a/img");
    }
    
    //Make public bookmark
    public static By getByBkMakePublic(String bkName){
        return By.xpath("//a[.='" + bkName + "']/../../input/../../td[4]/a/img");
    }
    //public static By BOOKMARKSHARD_NEWFOLDER_SELECT = By.name("fid");
    public static By BOOKMARKSHARD_NEWFOLDER_INPUT = By.name("new_folder_name");
    public static By BOOKMARKSHARD_SAVE = By.name("share");
    
    //Make private bookmark
    public static By getByBkMakePrivate(String bkFolderName){
        return By.xpath("//span[contains(text(),'" + bkFolderName + "')]/../../td[7]/a/img");
    }
    
    //Copy Me
    public static By getBySharedFolder(String bkFolderName){
        return By.xpath("//span[contains(text(),'" + bkFolderName + "')]/../a/img");
    }
    public static By getByCopyMe(String bkName){
    	return By.xpath("//a[.='" + bkName + "']/../../../td[4]/a/img");
    }
    
    //On Menu
    public static By getByOnMenu(String bkName){
    	return By.xpath("//a[.='" + bkName + "']/../../../td[5]/a/img");
    }
    
    //Schedule bookmark
    public static By getByBkSchedule(String bkName){
        return By.xpath("//a[.='" + bkName + "']/../../input/../../td[5]/img");
    }
    public static By getByBkScheduleFormat(String format){
        return By.id("c_file_type_" + format);
    }
    
    public static By SCHEDULE_EMAIL = By.id("send_type_email_radio");
    public static By SCHEDULE_EMAIL_TO = By.name("email_to");
    
    public static By SCHEDULE_FTP = By.id("send_type_ftp_radio");
    public static By SCHEDULE_FTP_HOST = By.name("ftp_host");
    public static By SCHEDULE_FTP_DIRECTORY = By.name("ftp_dir");
    public static By SCHEDULE_FTP_USERNAME = By.name("ftp_usrname");
    public static By SCHEDULE_FTP_PASSWORD = By.name("ftp_usrpswd");
    
    public static By SCHEDULE_SEND = By.id("bottom_send_button");
    
}