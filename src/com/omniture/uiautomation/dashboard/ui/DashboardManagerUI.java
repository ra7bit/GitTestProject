package com.omniture.uiautomation.dashboard.ui;

import org.openqa.selenium.By;

import com.omniture.uiautomation.adminconsole.ui.AdminConsoleUI;

/**
 * 
 * @author sbli
 *
 */
public class DashboardManagerUI extends AdminConsoleUI{
	
		public static By FAVORITES = By.xpath("//a[.='Favorites']");
		
		public static By ADDDASHBOARD = By.xpath("//div/div/div/a[.='Add Dashboard']");
		
		//Name text input on Create Dashboard page
		public static By DASHBOARDNAME = By.name("bookmark_name");
		//OK button on Create Dashboard page
		public static By ADDOK = By.name("ok");
		//Cancel button on Create Dashboard page
		public static By ADDCANCEL = By.name("cancel");
		
		//OK button on Create Dashboard page
		public static By LEGACY = By.xpath("//*[@id='db_type_legacy']");
		
		

		//the dashboard created just now
	//	public static By SBLIDASHBOARD = By.xpath("//tbody/tr/td/a[.='sbliTestJuly']");
		

		//----------------------------added by HU Yan----------------------------
		
		public static By MANAGE_DASHBOARDS=By.xpath("//ul[@id='pub_s_m_d_header']/li/a[.='Manage Dashboards']");
		public static By DASHBOARDS=By.xpath("//ul[@id='favorites_menu_header']/li[2]/a");

		public static By getMyDashboardByName(String dashboardName)//get the xpath of dashboard's link in 'My Dashboards' table
		{
			return By.xpath("//table[thead/tr/th/div='My Dashboards']/tbody/tr/td/a[.='"+dashboardName+"']");
		}
		public static By getMyDashboardByName(String dashboardName,int number)//get the xpath of dashboard's link in 'My Dashboards' table
		{
			return By.xpath("(//table[thead/tr/th/div='My Dashboards']/tbody/tr/td/a[.='"+dashboardName+"'])["+number+"]");
		}
		public static By getMyDashboardShared(String dashboardName)//get the xpath of 'shared' icon in 'My Dashboards' table
		{
			return By.xpath("//table[thead/tr/th/div='My Dashboards']/tbody/tr[td/a='"+dashboardName+"']/td[3]/a/img");
		}
		public static By getMyDashboardDelete(String dashboardName)//get the xpath of 'delete' icon in 'My Dashboards' table
		{
			return By.xpath("//table[thead/tr/th/div='My Dashboards']/tbody/tr[td/a='"+dashboardName+"']/td[7]/a[2]/img");
		}
		public static By getMyDashboardCopy(String dashboardName)//get the xpath of 'copy' icon in 'My Dashboards' table
		{
			System.out.println("return copy icon");
			return By.xpath("//table[thead/tr/th/div='My Dashboards']/tbody/tr[td/a='"+dashboardName+"']/td[7]/a[1]/img");
		}	
		public static By getMyDashboardEdit(String dashboardName)//get the xpath of 'edit' icon in 'My Dashboards' table
		{
			return By.xpath("//table[thead/tr/th/div='My Dashboards']/tbody/tr[td/a='"+dashboardName+"']/td[7]/img");
		}		
		public static By getMyDashboardScheduled(String dashboardName)//get the xpath of 'schedule' icon in 'My Dashboards' table
		{
			return By.xpath("//table[thead/tr/th/div='My Dashboards']/tbody/tr[td/a='"+dashboardName+"']/td[4]/img");
		}	
		public static By getMyDashboardDirectAccess(String dashboardName)
		{
			return By.xpath("//table[thead/tr/th/div='My Dashboards']/tbody/tr[td/a='"+dashboardName+"']/td[2]/a/img");
		}
		public static By getMyDashboardPushToUsers(String dashboardName)
		{
			return By.xpath("//table[thead/tr/th/div='My Dashboards']/tbody/tr[td/a='"+dashboardName+"']/td[6]/a/img");
		}		
		public static By getMyDashboardViewArchive(String dashboardName)
		{
			return By.xpath("//table[thead/tr/th/div='My Dashboards']/tbody/tr[td/a='"+dashboardName+"']/td[5]/a/img");
		}
		
		public static By getSharedDashboardUnShare(String dashboardName)//get the xpath of 'unshare' icon in 'Shared Dashboards' table
		{
			return By.xpath("//table[thead/tr/th/div='Shared Dashboards']/tbody/tr[td/a='"+dashboardName+"']/td[4]/a/img");
		}
		public static By getSharedDashboardCopyMe(String dashboardName)//get the xpath of 'Copy Me' icon in 'Shared Dashboards' table
		{
			return By.xpath("//table[thead/tr/th/div='Shared Dashboards']/tbody/tr[td/a='"+dashboardName+"']/td[4]/a/img");
		}
		public static By getSharedDashboardByName(String dashboardName)
		{
			return By.xpath("//table[thead/tr/th/div='Shared Dashboards']/tbody/tr[td/a='"+dashboardName+"']/td[1]/a");
		}
		public static By getSharedDashboardViewArchive(String dashboardName)
		{
			return By.xpath("//table[thead/tr/th/div='My Dashboards']/tbody/tr[td/a='"+dashboardName+"']/td[5]/a/img");
		}
		public static By getSharedDashboardOnMenu(String dashboardName)
		{
			return By.xpath("//table[thead/tr/th/div='Shared Dashboards']/tbody/tr[td/a='"+dashboardName+"']/td[5]/a/img");
		}

		
		
		public static By getSharedDashboardLinkOnTopMenu(String dashboardName)
		{
			return By.xpath("//li[a='Favorites']/ul/li[a='Dashboards']/ul/li[a='Shared Dashboards']/ul/li[a='"+dashboardName+"']/a");
		}
		
		
		//landing page element
		public static By getReportTitleElementByName(String dashboardName)
		{
			return By.xpath("//span[@id='report_title' and .='"+dashboardName+"']");
		}
		
		//-----------------------------------------------------------------------

		
		//Save button on toolbar
		public static By SAVE = By.xpath("//div/div/div/ul/li[@id='save_tool']/a[.='Save']");
		
		public static By SEND = By.xpath("//div/div/div/ul/li[@id='email_tool']/a[.='Send']");
		
		//radio button HTML in send options page
		public static By SENDASHTML = By.xpath("//*[@id='schedule_report_container_file_type_html']");
		
		////////////////////////////
		//Advanced Delivery Options
		public static By DELOPTIONS = By.xpath("//*[@id='schedule_report_container_advanced_link']");
		                                        
		
		
		
		public static By DOWNLOAD = By.xpath("//div/div/div/ul/li[@id='download_tool']/a[.='Download']");
		
		//send button not in the toolbar 
		public static By SENDBTN = By.id("em_send");
		
		
			
		
		//Just for testing.
		public static By TEST = By.xpath("//table[thead/tr/th/div='My Dashboards']/tbody/tr[td/a='flute']/td[7]/img");
		
}

