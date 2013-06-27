package com.omniture.uiautomation.dashboard.ui;

import org.openqa.selenium.By;

import com.omniture.uiautomation.adminconsole.ui.AdminConsoleUI;
/**
 * 
 * @author sbli
 *
 */
//Advanced Delivery Options Popup Page 
public class ADODashboardUI extends AdminConsoleUI{
	
		
		
		//Scheduling Options link on Advanced Delivery Options popup page
		public static By SCHEDULEOPTIONS = By.xpath("//ul/li/a[.='Scheduling Options']");
		
		//Include the HTML version of the report on Advanced Delivery Options popup page
		public static By INCLUDEHTML = By.xpath("//*[@id='full_html']");
		
		
		//Send report as a compressed file (.zip) on Advanced Delivery Options popup page
		public static By COMPRESSED = By.xpath("//*[@id='compress_file']");
		
		
		//Archive sent reports on Advanced Delivery Options popup page
		public static By ARCHIVE = By.xpath("//*[@id='archive_checkbox']");
		
		//Send button on Advanced Delivery Options popup page
		public static By SEND = By.xpath("//*[@id='bottom_send_button']");
		                                           
		
		
		//Schedule for later on Scheduling Options
		public static By SCHEDULEFORLATER = By.xpath("//*[@id='schedule_radio']");
		
		//Send button on Advanced Delivery Options popup page
		public static By SCHEDULE = By.xpath("//*[@id='bottom_send_button']");
		
		
}

