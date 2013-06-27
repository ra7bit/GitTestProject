package com.omniture.uiautomation.dashboard.ui;

/**
 * 
 * @author Yan HU  (yahu#adobe.com)
 *
 */

import org.openqa.selenium.By;

//all the "null" and "" in this class mean I have not finish them yet 
//and these uncompleted elements have not been used in test cases yet, 
//but I think they should be tested and will go on my work when I have time.
public class AdvancedDeliveryOptions
{
	public static By REPORT=By.xpath("//li[@id='tab_control_tab0']/a");
	public static By SCHEDULING=By.xpath("//li[@id='tab_control_tab1']/a");
	//----------------------------------------Report Options----------------------------------------
	
/*    
      !-------------------------------!
	  !----------Report Name----------!
	  !-------------------------------!
	  SELECT: Report file name
	  	OPTION 1: <default>
	  	OPTION 2: Custom
	  		TEXT (input a custom report file name)
	  		CHECKBOX: Append report date range to file name
*/
	//SELECT
	public static By NAME=By.id("use_13_5_default");//SELECT
//	public static By NAME_DEFAULT=By.xpath("//option[@value='default']");//OPTION 1
//	public static By NAME_CUSTOM=By.xpath("//option[@value='new']");//OPTION 2
	//TEXT
	public static By NAME_TEXT=By.id("report_filename");//TEXT
	//CHECKBOX
	public static By NAME_APPEND=By.id("append_date_checkbox");//CHECKBOX
	
/*    
      !---------------------------------!
	  !----------Report Format----------!
	  !---------------------------------!
       RADIO 1:PDF        RADIO 2:HTML
	   CHECKBOX(PDF) 1: Include the HTML version of the report
	   CHECKBOX(PDF) 2: Send report as a compressed file (.zip)
	   CHECKBOX(PDF) 3: Archive sent reports
*/
	//2 RADIOS:
	public static By FORMAT_PDF=By.id("c_file_type_pdf"); //RADIO 1
	public static By FORMAT_HTML=By.id("c_file_type_html"); //RADIO 2
	//3 CHECKBOXS
	public static By FORMAT_INCLUDE=By.id("full_html_div"); //CHECKBOX 1
	public static By FORMAT_COMPRESSED=By.id("compress_file_div"); //CHECKBOX 2
	public static By FORMAT_ARCHIVE=By.id("archive_checkbox"); //CHECKBOX 3
	//GET ITEM FUNCTION:
	public static By getFormatRadioByNum(int num)
	{
		return By.xpath("");//have not been finished,it's not used in the test cases.
	}
	public static By getFormatCheckboxByNum(int num)
	{
		return By.xpath("//div[@class='file_type_container']/div["+(num+1)+"]/input");
	}

/*    
      !-----------------------------------!
	  !----------Report Contents----------!
	  !-----------------------------------!
	  CHECKBOX: Language for header and footer
		OPTION 1: English
		OPTION 2: Franch
		OPTION 3: Simple Chinese
		OPTION 4: Traditional Chinese
		OPTION 5: German
		OPTION 6: Japanese
		OPTION 7: Korean
		OPTION 8: Spanish
		OPTION 9: Polish
*/
	//1 SELECT
	public static By LANGUAGE=By.name("dl_locale");//SELECT
	public static By LANGUAGE_ENGLISH=By.xpath("//option[@value='en_US']");
	public static By LANGUAGE_FRANCH=By.xpath("//option[@value='fr_FR']");
	public static By LANGUAGE_SIMPLE_CHINESE=By.xpath("//option[@value='zh_CN']");
	public static By LANGUAGE_TRADITIONAL_CHINESE=By.xpath("//option[@value='zh_TW']");
	public static By LANGUAGE_GERMAN=By.xpath("//option[@value='de_DE']");
	public static By LANGUAGE_JAPANESE=By.xpath("//option[@value='jp_JP']");
	public static By LANGUAGE_KOREAN=By.xpath("//option[@value='ko_KR']");
	public static By LANGUAGE_SPANISH=By.xpath("//option[@value='es_ES']");
	public static By LANGUAGE_POLISH=By.xpath("//option[@value='pt_BR']");
	public static By getLanguageByNum(int num)
	{
		return By.xpath("//select[@name='dl_locale']/option["+num+"]");
	}
	
/*    
      !----------------------------------------!
	  !----------Additional Documents----------!
	  !----------------------------------------!
	   CHECKBOX: Send Digital Signature file
*/
	//1 CHECKBOX
	public static By SIGNATURE=By.name("sign_file");

/*    
      !--------------------------------------!
	  !----------Report Destination----------!
	  !--------------------------------------!
	   RADIO 1:Email        RADIO 2:FTP
	   TEXT(Email) 1: To
	   LINK(Email)  : Publishing List
	   TEXT(Email) 2: From
	   TEXT(Email) 3: Subject
	   TEXT(Email) 4: Notes
	   TEXT(FTP) 1: Host        TEXT(FTP) 2: Port
	   TEXT(FTP) 3: Directory
	   TEXT(FTP) 4: Username
	   TEXT(FTP) 5: Password
*/
	//2 RADIOS
	public static By DESTINATION_EMAIL=By.id("send_type_email_radio");//RADIO 1
	public static By DESTINATION_FTP=By.id("send_type_ftp_radio");//RADIO 2
	//4 TEXTS
	public static By DESTINATION_EMAIL_To=By.name("email_to");//TEXT(Email) 1
	public static By DESTINATION_EMAIL_FROM=By.name("email_from");//TEXT(Email) 2
	public static By DESTINATION_EMAIL_SUBJECT=By.name("email_subject");//TEXT(Email) 3
	public static By DESTINATION_EMAIL_NOTES=By.name("email_notes");//TEXT(Email) 4
	//LINK
	public static By DESTINATION_EMAIL_LIST=By.id("publishing_list_control_delivery_list_link");//LINK(Email)
	//CHECKBOXES
	public static By DESTINATION_EMAIL_LIST_ALL=By.id("publishing_list_control_delivery_list_check_all");//
	public static By getPublishingListsByName(String name)
	{
		return By.xpath("//div[@id='publishing_list_control_delivery_lists']/div[label='"+name+"']/input");		
	}
	public static By getPublishingListsByNum(int num)
	{
		return By.xpath("//div[@id='publishing_list_control_delivery_lists']/div["+num+"]/input");
	}
	//2 BUTTONS
	public static By DESTINATION_EMAIL_LIST_SAVE=By.id("publishing_list_control_delivery_list_save_button");
	public static By DESTINATION_EMAIL_LIST_CANCEL=By.id("publishing_list_control_delivery_list_cancel_button");
	//5 TEXTS
	public static By DESTINATION_FTP_HOST=By.name("ftp_host");//TEXT(FTP) 1
	public static By DESTINATION_FTP_PORT=By.name("ftp_port");//TEXT(FTP) 2
	public static By DESTINATION_FTP_DIRECTORY=By.name("ftp_dir");//TEXT(FTP) 3
	public static By DESTINATION_FTP_USERNAME=By.name("ftp_usrname");//TEXT(FTP) 4
	public static By DESTINATION_FTP_PASSWORD=By.name("ftp_usrpswd");//TEXT(FTP) 5

	

	
	
	//----------------------------------------Scheduling Options----------------------------------------
	// RADIO 1:Send report now         RADIO 2:Schedule for later
	public static By LATER=By.id("schedule_radio");//RADIO 2
	public static By NOW=By.id("send_now_radio");//RADIO 1
	
//	public static By getHowOftenByNum(int num)
//	{
//		return By.xpath("//select[@id='f_select']/option["+num+"]");
//	}
	
	public static By FREQUENCY=By.xpath("//select[@id='f_select']");
	
//	public static By HOURLY=By.xpath("//option[.='Hourly']");
	public static By HOURLY_RECUR=By.name("recur");
	
//	public static By DAILY=By.xpath("//option[.='Daily']");
	public static By DAILY_RADIO_1=By.xpath("(//div[@id='daily_options']/div/input[@name='frequency'])[1]");
	public static By DAILY_RADIO_2=By.xpath("(//div[@id='daily_options']/div/input[@name='frequency'])[2]");	
	public static By DAILY_RECUR=By.xpath("//div[@id='daily_options']/div/span/input[@name='recur']");
	
//	public static By WEEKLY=By.xpath("//option[.='Weekly']");
	public static By WEEKLY_RECUR=By.xpath("//div[@id='weekly_options']/div/input[@name='recur']");
	public static By getWeeklyDayOfWeekByNum(int num)
	{
		return By.xpath("//div[@id='weekly_options']/div/select[@name='dow']/option["+num+"]");
	}
	public static By getYearlyDayOfWeekByNum(int num)
	{
		return By.xpath("//div[@id='yearly_options']/div/span/select[@name='dow']/option["+num+"]");
	}
	public static By getMonthlyDayOfWeekByNum(int num)
	{
		return By.xpath("//div[@id='monthly_options']/div/span/select[@name='dow']/option["+num+"]");
	}
	public static By getMonthlyDayOfMonthByNum(int num)
	{
		return By.xpath("//div[@id='monthly_options']/div/span/select[@name='dom']/option["+num+"]");
	}

//	public static By MONTHLY=By.xpath("//option[.='Monthly']");
	public static By MONTHLY_RADIO_1=By.xpath("(//div[@id='monthly_options']/div/input[@name='frequency'])[1]");
	public static By MONTHLY_RADIO_2=By.xpath("(//div[@id='monthly_options']/div/input[@name='frequency'])[2]");	
	public static By getMonthlySequenceByNum(int num)
	{
		return By.xpath("//div[@id='monthly_options']/div/span/select[@name='seq']/option["+num+"]");
	}
	public static By getYearlySequenceByNum(int num)
	{
		return By.xpath("//div[@id='yearly_options']/div/span/select[@name='seq']/option["+num+"]");
	}
	public static By MONTHLY_RECUR_BY_DAY=By.id("text_recur_month_by_dom");
	public static By MONTHLY_RECUR_BY_WEEK=By.id("text_recur_month_by_week");
	public static By YEARLY=By.xpath("//option[.='Yearly']");
	public static By YEARLY_RADIO_1=By.xpath("(//div[@id='yearly_options']/div/input[@name='frequency'])[1]");
	public static By YEARLY_RADIO_2=By.xpath("(//div[@id='yearly_options']/div/input[@name='frequency'])[2]");
	
	public static By getYearlyDayOfMonthByNum(int num)
	{
		return By.xpath("//div[@id='yearly_options']/div/select[@name='dom']/option["+num+"]");
	}

	public static By getYearlyDayMonthByNum(int num)
	{
		return By.xpath("(//select[@name='month'])[1]/option["+num+"]");
	}
	public static By getYearlyWeekMonthByNum(int num)
	{
		return By.xpath("(//select[@name='month'])[2]/option["+num+"]");
	}
	
	public static By STARTING_ON=By.id("run_when");
	public static By getTimeOfDayByNum(int num)
	{
		return By.xpath("//select[@name='run_hour']/option["+num+"]");
	}
	
	public static By END_NEVER=By.id("end_delivery_never");
	public static By END_AFTER=By.id("end_delivery_after");
	public static By END_ON=By.id("end_delivery_when");
	
	public static By END_AFTER_OCCURRENCE=By.name("cancel_recur");
	public static By END_ON_DATE=By.id("cancel_date");
/*    
      !---------------------------!
	  !----------Buttons----------!
	  !---------------------------!
	   BUTTON 1:Send        BUTTON 2:Cancel
*/
	public static By SEND=By.id("bottom_send_button");
	public static By SCHEDULED=By.id("bottom_send_button");
	public static By CANCEL=By.name("cancel");
}
