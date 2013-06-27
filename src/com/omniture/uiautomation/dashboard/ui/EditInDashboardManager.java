/**
 * 
 * @author HU Yan.
 * This is the page pop up when click 'edit dashboard' in 'Dashboard Manager'.
 */

package com.omniture.uiautomation.dashboard.ui;

import org.openqa.selenium.By;
//the page pop up after click 'edit' in Dashboard Manager.
public class EditInDashboardManager
{
	//Text: Name
	//public static By NAME=By.xpath("//tr[td='Name']/td[2]/input");
	public static By NAME=By.name("bookmark_name");
	
	//Checkbox: Display dashboard as SiteCatalyst landing page  
	//public static By OPTION1=By.xpath("//tr[td='Options']/td[2]/div[1]/input");
	public static By MY_DEFAULT=By.name("default_bookmark");
	
	//Checkbox: Set as landing page for all users   
	//public static By OPTION2=By.xpath("//tr[td='Options']/td[2]/div[2]/input");
	public static By ALL_DEFAULT=By.name("admin_set_default");
	
	//Buttons
	public static By OK=By.name("ok");	
	public static By CANCEL=By.name("cancel");

}
