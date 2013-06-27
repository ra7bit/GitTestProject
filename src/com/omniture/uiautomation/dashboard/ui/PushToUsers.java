/**
 * 
 * @author HU Yan.
 * This is the page pop up when click 'push to users'
 */

package com.omniture.uiautomation.dashboard.ui;

import org.openqa.selenium.By;

public class PushToUsers
{
	public static By getCheckBoxByLogin(String login)
	{
		return By.xpath("//tbody/tr[td='"+login+"']/td/input");
	}
	public static By getCheckBoxByNumber(int num)
	{
		return By.xpath("//tbody/tr["+num+"]/td/input");
	}
	public static By SAVE=By.name("ok");
	public static By CANCEL=By.name("cancel");
}
