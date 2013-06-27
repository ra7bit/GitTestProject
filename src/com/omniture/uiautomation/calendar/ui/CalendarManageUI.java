package com.omniture.uiautomation.calendar.ui;

import org.openqa.selenium.By;

public class CalendarManageUI {
	
	    //set RS
        public static By REPORTSUITE = By.xpath("//a[@class='CustomSelect-arrow']");
        public static By SelectReportSuiteByName(String reportSuite){
        	return By.xpath("//a[@title='"+reportSuite+"']");
        }
	    //public static By SETRS = By.xpath("//ul[@id='rsid_select_list']//a[@title='BugZilla']");
        public static By SITEMETRICS = By.xpath("//ul[@id='sc_left_nav_root']//a[.='Site Metrics']");
        public static By PAGEVIEWS = By.xpath("//li[@id='id_201']/a[.='Page Views']");
        
        //type date
//        public static By SITEMETRICS = By.xpath("//a[.='Site Metrics']");
//        public static By PAGEVIEWS = By.xpath("//a[.='Page Views']");	
        public static By CALENDAR =By.xpath("//div[@id='title_container']/div[@class='CalendarWidgetActivator']"); 
        public static By STARTDATE = By.name("start");
	    public static By ENDDATE = By.name("end");
	    public static By PERIOD_MESSAGE = By.xpath("//div[@id='title_container']//span[@class='select']"); 
	
		//calendar views in year
		public static By NEXTBUTTON = By.xpath("//button[@class='next']");
		public static By YEAR = By.xpath("//span[@abbr='2012']");
		public static By RUNREPORT = By.xpath("//input[@value='Run Report']");
	
		//year view current month
		public static By YEARTAB = By.xpath("//span[@class='years']");
		public static By CURRENTMONTH = By.xpath("//td[@class='today']");
		
        //year by month
		public static By CURRENTYEAR = By.xpath("//caption[@abbr='1325376000000|1356912000000']");
		public static By MONTH = By.xpath("//option[@value='month']");
		
		//previous year
		public static By PREVIOUSYEAR = By.xpath("//caption[@abbr='1293840000000|1325289600000']");
			
		//manual week by hour
		public static By TRIANGLE = By.xpath("//th[@abbr='1312675200000|1313193600000']");
		public static By HOUR = By.xpath("//option[@value='hour']");
		public static By VIEWBY = By.xpath("//a[@id='gran_select']");
		
		//year by quarter
		public static By PREVBUTTON = By.xpath("//div[@class='yearSelector']/button[@class='prev']");
		public static By PREVYEAR = By.xpath("//span[@abbr='2010']");
		public static By QUARTER = By.xpath("//option[@value='quarter']");
		
		//month by week
		public static By SELECTMONTH = By.xpath("//caption[@abbr='1317427200000|1320019200000']");
		//<caption abbr="1317427200000|1320019200000">October</caption>
		public static By WEEK = By.xpath("//option[@value='week']");
	

		
		
		
		
		
}
