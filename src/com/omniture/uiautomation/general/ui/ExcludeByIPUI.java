package com.omniture.uiautomation.general.ui;
import org.openqa.selenium.By;

/**
 * @author qyzhu
 *
 */

public class ExcludeByIPUI {

	public static By ADMIN_FOLDER_LINK = By.xpath("//li[@id='suite_admin_menu']/a");
	public static By EXCLUDEBYIP_LINK = By.xpath("//ul[@id='admin_menu_root']/li[*]/a[contains(., 'Exclude by IP')]");
//	public static By EXCLUDEBYIP_LINK = By.xpath("//li[@id='admin_menu_11']/a");
	public static By THIRD_PARTY_COOKIE_LINK = By.xpath("//div[@id='center_content']/div[2]/p[3]/a");

	public static By OPT_OUT_LINK = By.xpath("//a[text()='Click Here' and contains(@href, 'optout=1')]");
	public static By OPT_IN_LINK = By.xpath("//a[text()='Click Here' and contains(@href, 'optin=1')]");
	public static By CLOSE_WINDOW_BUTTON = By.name("close");
	public static By EXCLUDE_INPUT_ZERO = By.name("ip[0]");
	public static By EXCLUDE_INPUT_ONE = By.name("ip[1]");
	public static By EXCLUDE_INPUT_TWO = By.name("ip[2]");
	public static By EXCLUDE_INPUT_THREE = By.name("ip[3]");
	public static By EXCLUDE_BUTTON = By.xpath("//input[@type='submit' and @value='Exclude']");
	
	public static By ERROR_MESSAGE = By.xpath("//div[@id='errors']/div/font[contains(., 'You must enter a valid IP address')]");
	
	public static By IPADDRESS_TD = By.xpath("//td[@class='no_padding no_col_border']/../");
	
	public static By getAddressListByIP(String addresss) {
		return By.xpath("//td[@class='no_col_border' and contains(.,'"+addresss+"')]");
	}
	
	public static By getReactivateButtonByIP(String addresss) {
		return By.xpath("//td[@class='no_col_border' and contains(.,'"+addresss+"')]/../td[*]/a[contains(., 'Reactivate')]");
	}
		
}






