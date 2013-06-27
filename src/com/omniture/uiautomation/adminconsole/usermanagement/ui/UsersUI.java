package com.omniture.uiautomation.adminconsole.usermanagement.ui;

import org.openqa.selenium.By;

import com.omniture.uiautomation.adminconsole.ui.AdminConsoleUI;

/**
 * @author ligyu
 */

public class UsersUI extends AdminConsoleUI {

	//User list page 
	public static By EDITUSER_BUTTON = By.xpath("//input[@value='Edit Users']");
	public static By ADDNEWUSER_LINK = By.xpath("//a[.='Add New User']");
	public static By GetDeleteLinkByLoginID(String loginID){
	    return By.xpath("//a[contains(text(), '"+loginID+"')]/../../td/a[contains(text(), 'Delete')]");
	}
    public static By GetEditLinkByLoginID(String loginID){
        return By.xpath("//a[contains(text(), '"+loginID+"')]/../../td/a[contains(text(), 'Edit')]");
    }
	public static By CONFIRMDELETE_LINK = By.xpath("//div[@id='confirm_delete_container']/input[@value='Delete']");
	public static By SEARCHTYPE_SECTOR = By.name("search_field");
	public static By SEARCHVALUE_INPUT = By.name("search_val");
	public static By SEARCH_BUTTON = By.name("search_submitted");
	public static By CLEAR_BUTTON = By.xpath("//input[@type='submit' and @value='Clear']");

    public static By SORTBYLOGIN_LINK = By.xpath("//table[@class='grid']/thead/tr/th/div/span/a/img");
    public static By SORTBYFIRSTNAME_LINK = By.xpath("//table[@class='grid']/thead/tr/th[2]/div/span/a/img");
    public static By SORTBYADMIN_LINK = By.xpath("//table[@class='grid']/thead/tr/th[5]/div/span/a/img");
    public static By SORTBYLOGINTIME_LINK = By.xpath("//table[@class='grid']/thead/tr/th[6]/div/span/a/img");

	//Add User page
	public static By FIRSTNAME_INPUT = By.name("first_name");
	public static By LASTNAME_INPUT = By.name("last_name");
	public static By TITLE_INPUT = By.name("title");
	public static By EMAIL_INPUT = By.name("email");
	public static By PHONE_INPUT = By.name("phone_number");
	public static By LOGINNAME_INPUT = By.name("login_uname");
	public static By LOGINPASSWORD_INPUT = By.name("login_passwd");
	public static By CONFIRMPASSWORD_INPUT = By.name("confirm_passwd");
	public static By ADMINRADIO_INPUT = By.name("admin");
	public static By SAVE_BUTTON = By.name("save_changes");
	public static By FLASHERROR_TEXT = By.xpath("//div[@id='flash_error']/table/tbody/tr/td[2]/p");
	public static By AVAILBEGROUP_SELECTOR = By.id("avail_groups");
	public static By ADDGROUP_BUTTON = By.xpath("//input[@type='button' and @value='Add >']");

}
