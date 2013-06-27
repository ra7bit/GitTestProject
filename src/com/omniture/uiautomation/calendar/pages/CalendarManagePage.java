package com.omniture.uiautomation.calendar.pages;

import org.openqa.selenium.By;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import com.omniture.uiautomation.calendar.ui.CalendarManageUI;
import com.omniture.uiautomation.pages.OmniturePage;
import org.openqa.selenium.WebElement;
import com.omniture.uiautomation.report.ui.ReportToolbarUI;
import java.util.List;

public class CalendarManagePage extends OmniturePage {
	
//	public void folderReportTitle(By folder, By report, String title) {
//		
//		this.click(folder);
//		this.click(report);
//		this.sleep(3000);
//		this.waitUntilPageLoad();
//		this.assertElementsTextContain(ReportUI.REPORT_TITLE, title);
//	}
	
	public String getStartDateOfMonth()	{
		Calendar   ca = Calendar.getInstance(); 
		ca.add(Calendar.HOUR_OF_DAY, -14); 
		ca.set(Calendar.DAY_OF_MONTH, 1); 
		Date   date = ca.getTime(); 
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd MMM yyyy",Locale.ENGLISH);
		return simpleDateFormat.format(date);
	}
	
	public String getEndDateOfMonth()	{
		Calendar   ca = Calendar.getInstance(); 
		ca.add(Calendar.HOUR_OF_DAY, -14); 
		ca.set(Calendar.DAY_OF_MONTH, 1); 
		ca.add(Calendar.MONTH, 1); 
		ca.add(Calendar.DAY_OF_MONTH, -1); 
		Date   lastDate = ca.getTime(); 
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd MMM yyyy",Locale.ENGLISH);
		return simpleDateFormat.format(lastDate);
	}		
	String revDateStart = this.getStartDateOfMonth();
	String revDateEnd = this.getEndDateOfMonth();
	String dataRange = revDateStart + " - " + revDateEnd;
	
	public String getFirstDayofYear()
	{
		Calendar   ca   =   Calendar.getInstance(); 
		ca.add(Calendar.HOUR_OF_DAY, -14); 
		ca.set(Calendar.DAY_OF_YEAR,   1);  
		Date   startyDate   =   ca.getTime(); 
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd MMM yyyy",Locale.ENGLISH);
		return simpleDateFormat.format(startyDate);
	}
	
	public String getLastDayofYear()
	{
		Calendar   ca   =   Calendar.getInstance(); 
		ca.add(Calendar.HOUR_OF_DAY, -14); 
		ca.add(Calendar.YEAR,1);
		ca.set(Calendar.DAY_OF_YEAR,   1); 
		ca.add(Calendar.DAY_OF_YEAR,   -1); 
		Date   lastyDate   =   ca.getTime(); 
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd MMM yyyy",Locale.ENGLISH);
		return simpleDateFormat.format(lastyDate);
	}
	String revDateStarty = this.getFirstDayofYear();
	String revDateEndy = this.getLastDayofYear();
	String dataRangey = revDateStarty + " - " + revDateEndy;
	
	public String getFirstDayofLastYear()
	{
		Calendar   ca   =   Calendar.getInstance(); 
		ca.add(Calendar.HOUR_OF_DAY, -14); 
		ca.add(Calendar.YEAR,   -1);
		ca.set(Calendar.DAY_OF_YEAR,   1);  
		Date   startDately   =   ca.getTime(); 
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd MMM yyyy",Locale.ENGLISH);
		return simpleDateFormat.format(startDately);
	}
	
	public String getLastDayofLastYear()
	{
		Calendar   ca   =   Calendar.getInstance(); 
		ca.add(Calendar.HOUR_OF_DAY, -14); 
		ca.set(Calendar.DAY_OF_YEAR,   1);  
		ca.add(Calendar.DAY_OF_YEAR,   -1);
		Date   lastDately   =   ca.getTime(); 
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd MMM yyyy",Locale.ENGLISH);
		return simpleDateFormat.format(lastDately);
	}	
	String revDateStartly = this.getFirstDayofLastYear();
	String revDateEndly = this.getLastDayofLastYear();
	String dataRangely = revDateStartly + " - " + revDateEndly;
		
	public String getYesterday()
	{
		Calendar   ca   =   Calendar.getInstance(); 
		ca.add(Calendar.HOUR_OF_DAY, -14); //Time zone of Bugzilla is US Mountain Time(-7) and local time is +8
		ca.add(Calendar.DAY_OF_MONTH,   -1); 
		Date   yesterday   =   ca.getTime(); 
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd MMM yyyy",Locale.ENGLISH);
		return simpleDateFormat.format(yesterday);
	}	
//    public void navigateToPageViews() {
//        TestEnvironment.driver.get(TestEnvironment.current.getBaseUrl()
//                + "/sc15/reports/index.html?a=Report.Standard&r=Report.PageViews&rp=page_type|0"
//                + "&ssSession=" + sessionId);
//        if(!this.checkLanguage("en_US")) {
//            this.switchLanguage("en_US");
//        }
//        this.waitUntilPageLoad();
//    }
//    
//    private By rsSelectPath = SiteCatalystUI.RS_SELECT;
//    private By rsSelectArrow = SiteCatalystUI.RS_ARROW;
//	
//	public void rsSwitch(String rsTitle, By rsPos) {
//        this.sleep(5000);
//        WebElement select = this.findElement(this.rsSelectPath);
//        String rsName = select.getAttribute("value");
//        if (!rsTitle.equals(rsName)) {
//            TestEnvironment.driver.get(TestEnvironment.current.getBaseUrl()
//                    + "/sc15/reports/index.html?a=Report.Standard&r=Report.PageViews&rp=page_type%7C0&ssSession="
//                    + sessionId);
//            ///sc15/reports/index.html?a=Report.Standard&r=Report.PageViews&rp=page_type|0&ssSession
//            this.waitUntilElement(SiteCatalystUI.REPORT_TITLE);
//            this.sleep(5000);
//            this.click(this.rsSelectArrow);
//            this.sleep(1000);
//            this.click(rsPos);
//            this.waitUntilElement(SiteCatalystUI.REPORT_TITLE);
//        }
//        this.sleep(5000);
//    }
//	
	public void calendarSetReportS() {		
//		this.rsSwitch("BugZilla",CalendarManageUI.SETRS);
		this.click(CalendarManageUI.REPORTSUITE);
		this.click(CalendarManageUI.SelectReportSuiteByName("BugZilla"));
		this.sleep(5000);
		this.waitUntilPageLoad();
		this.click(CalendarManageUI.SITEMETRICS);
		this.click(CalendarManageUI.PAGEVIEWS);
		this.sleep(5000);
	}	

 	public void calendarTypeDate() { 		
 		//navigateToPageViews();
 		this.sleep(3000);
 		this.waitUntilElement(CalendarManageUI.CALENDAR);
		this.click(CalendarManageUI.CALENDAR);
		this.clear(CalendarManageUI.STARTDATE);
		this.type(CalendarManageUI.STARTDATE, "09/01/2011");
		this.clear(CalendarManageUI.ENDDATE);
		this.type(CalendarManageUI.ENDDATE, "09/11/2011");
		this.click(CalendarManageUI.RUNREPORT);
		this.waitUntilPageLoad();
		this.waitUntilElement(CalendarManageUI.PERIOD_MESSAGE);
    	//System.out.println(CalendarManageUI.PERIOD_MESSAGE);
		this.assertElementsTextContain(CalendarManageUI.PERIOD_MESSAGE,"01 Sep 2011 - 11 Sep 2011");
	}
 	
	public void calendarViewYear() {		
 		//this.waitUntilElement(CalendarManageUI.CALENDAR);
 		this.sleep(3000);
		this.click(CalendarManageUI.CALENDAR);
		this.click(CalendarManageUI.NEXTBUTTON);
		this.click(CalendarManageUI.YEAR);
		this.click(CalendarManageUI.RUNREPORT);
		this.waitUntilPageLoad();
		this.waitUntilElement(CalendarManageUI.PERIOD_MESSAGE);
        this.assertElementsTextContain(CalendarManageUI.PERIOD_MESSAGE,"01 Jan 2012 - 31 Dec 2012");
	}
	
	public void calendarCurrentMonth(){		
		this.sleep(3000);
 		this.waitUntilElement(CalendarManageUI.CALENDAR);
 		this.click(CalendarManageUI.CALENDAR);
		this.click(CalendarManageUI.YEARTAB);
		this.click(CalendarManageUI.CURRENTMONTH);
		this.click(CalendarManageUI.RUNREPORT);
		this.waitUntilPageLoad();
		this.waitUntilElement(CalendarManageUI.PERIOD_MESSAGE);
        //this.assertElementsTextContain(CalendarManageUI.PERIOD_MESSAGE,"01 Aug 2012 - 31 Aug 2012");
		this.assertElementsTextContain(CalendarManageUI.PERIOD_MESSAGE,dataRange);
	}
	
	public void calendarYearbyMonth(){
		this.sleep(3000);
 		this.waitUntilElement(CalendarManageUI.CALENDAR);
		this.click(CalendarManageUI.CALENDAR);
		this.click(CalendarManageUI.YEARTAB);
		//this.sleep(3000);
		this.click(CalendarManageUI.CURRENTYEAR);
		this.click(CalendarManageUI.MONTH);
		this.click(CalendarManageUI.RUNREPORT);
		this.waitUntilPageLoad();
		this.waitUntilElement(CalendarManageUI.PERIOD_MESSAGE);
        this.assertElementsTextContain(CalendarManageUI.PERIOD_MESSAGE,dataRangey);        
	}
	
	public void calendarPreviousYear(){		
		this.sleep(3000);
 		this.waitUntilElement(CalendarManageUI.CALENDAR);		
		this.click(CalendarManageUI.CALENDAR);
		this.click(CalendarManageUI.YEARTAB);
		this.click(CalendarManageUI.PREVIOUSYEAR);
		this.click(CalendarManageUI.RUNREPORT);
		this.waitUntilPageLoad();
		this.waitUntilElement(CalendarManageUI.PERIOD_MESSAGE);
        this.assertElementsTextContain(CalendarManageUI.PERIOD_MESSAGE,"01 Jan 2011 - 31 Dec 2011");
	}
 	
    public void calendarWeekbyHour() {    	
    	this.sleep(3000);
 		this.waitUntilElement(CalendarManageUI.CALENDAR);
 		this.click(CalendarManageUI.CALENDAR);
		this.click(CalendarManageUI.TRIANGLE);
		this.click(CalendarManageUI.HOUR);
		this.click(CalendarManageUI.RUNREPORT);
		this.waitUntilPageLoad();
		this.waitUntilElement(CalendarManageUI.PERIOD_MESSAGE);
		this.waitUntilElement(CalendarManageUI.VIEWBY);
		this.sleep(3000);
        this.assertElementsTextContain(CalendarManageUI.PERIOD_MESSAGE,"07 Aug 2011 - 13 Aug 2011");
        this.assertElementsTextContain(CalendarManageUI.VIEWBY,"Hour");
	}	
	
    public void calendarYearbyQuarter() {    	
    	this.sleep(3000);
 		this.waitUntilElement(CalendarManageUI.CALENDAR);
 		this.click(CalendarManageUI.CALENDAR);
		this.click(CalendarManageUI.PREVBUTTON);
		this.click(CalendarManageUI.PREVYEAR);
		this.click(CalendarManageUI.QUARTER);
		this.click(CalendarManageUI.RUNREPORT);
		this.waitUntilPageLoad();
		this.waitUntilElement(CalendarManageUI.PERIOD_MESSAGE);
        this.assertElementsTextContain(CalendarManageUI.PERIOD_MESSAGE,"01 Jan 2010 - 31 Dec 2010");
        this.assertElementsTextContain(CalendarManageUI.VIEWBY,"Quarter");
    }
    
    public void  calendarMonthbyWeek() {    	
 		this.sleep(3000);
 		this.waitUntilElement(CalendarManageUI.CALENDAR);
    	this.click(CalendarManageUI.CALENDAR);
    	this.click(CalendarManageUI.SELECTMONTH);
		this.click(CalendarManageUI.WEEK);
		this.click(CalendarManageUI.RUNREPORT);
		this.waitUntilPageLoad();
		this.waitUntilElement(CalendarManageUI.PERIOD_MESSAGE);
		this.waitUntilElement(CalendarManageUI.VIEWBY);
		this.sleep(3000);
        this.assertElementsTextContain(CalendarManageUI.PERIOD_MESSAGE,"01 Oct 2011 - 31 Oct 2011");
        this.assertElementsTextContain(CalendarManageUI.VIEWBY,"Week");
    	
    }
    
//    public void calendarBackReportS() {
// 		this.sleep(3000);
//    	this.click(CalendarManageUI.REPORTSUITE);
//		this.click(CalendarManageUI.SelectReportSuiteByName("asc-test1"));
//	}
    	
	public void extractDateChooseDateRange(String value) {
		WebElement select = this.findElement(ReportToolbarUI.EXTRACT_DATA_CHOOSE_DATE_RANGE);
		List<WebElement> optgroups = select.findElements(By.tagName("optgroup"));
		for (WebElement optgroup : optgroups) {
			List<WebElement> options = optgroup.findElements(By.tagName("option"));
			for (WebElement option : options) {
			    if (option.getText().equals(value)) {
			        option.click();
			        break;
			    }
			}
			break;
		}
		this.sleep(3000);
	}
	
	public void calendarLastYear() {
    	this.sleep(3000);
    	//this.folderReportTitle(CalendarManageUI.SITEMETRICS, CalendarManageUI.PAGEVIEWS, "Page Views Report"); 		
    	//navigateToPageViews();
 		this.waitUntilElement(CalendarManageUI.CALENDAR);
    	this.click(CalendarManageUI.CALENDAR);
    	this.extractDateChooseDateRange("Last year");
    	this.click(CalendarManageUI.RUNREPORT);
    	this.sleep(5000);
 		this.waitUntilElement(CalendarManageUI.PERIOD_MESSAGE);
        this.assertElementsTextContain(CalendarManageUI.PERIOD_MESSAGE,dataRangely);
    }
    
    public void calendarThisMonth() {    	
    	this.sleep(3000);
		this.waitUntilElement(CalendarManageUI.CALENDAR);
    	this.click(CalendarManageUI.CALENDAR);
    	this.extractDateChooseDateRange("This month");
    	this.click(CalendarManageUI.RUNREPORT);
    	this.sleep(5000);
 		this.waitUntilElement(CalendarManageUI.PERIOD_MESSAGE);
    	//System.out.println(CalendarManageUI.PERIOD_MESSAGE.toString());
        this.assertElementsTextContain(CalendarManageUI.PERIOD_MESSAGE,dataRange);
    }
    
	public String getStartDateofLastMonth()	{
		Calendar   ca   =   Calendar.getInstance(); 
		ca.set(Calendar.DAY_OF_MONTH,   1); 
		ca.add(Calendar.MONTH,   -1); 
		Date   startDate   =   ca.getTime(); 
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd MMM yyyy",Locale.ENGLISH);
		return simpleDateFormat.format(startDate);
	}
    
	public String getEndDateofLastMonth() {
		Calendar   ca   =   Calendar.getInstance(); 
		ca.set(Calendar.DAY_OF_MONTH,   1); 
		ca.add(Calendar.DAY_OF_MONTH,   -1); 
		Date   lastDate   =   ca.getTime(); 
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd MMM yyyy",Locale.ENGLISH);
		return simpleDateFormat.format(lastDate);		
	}

    public void calendarLastMonths() {
    	this.sleep(3000);
		this.waitUntilElement(CalendarManageUI.CALENDAR);
    	this.click(CalendarManageUI.CALENDAR);
    	this.extractDateChooseDateRange("Last month");
    	this.click(CalendarManageUI.RUNREPORT);
    	this.sleep(5000);
    	String revDateStartl = this.getStartDateofLastMonth();
		String revDateEndl = this.getEndDateofLastMonth();
		String dataRangel = revDateStartl + " - " + revDateEndl;
 		this.waitUntilElement(CalendarManageUI.PERIOD_MESSAGE);
        this.assertElementsTextContain(CalendarManageUI.PERIOD_MESSAGE,dataRangel);
    }

    public void calendarThisYear() {
    	this.sleep(3000);
		this.waitUntilElement(CalendarManageUI.CALENDAR);
    	this.click(CalendarManageUI.CALENDAR);
    	this.extractDateChooseDateRange("This year");
    	this.click(CalendarManageUI.RUNREPORT);
    	this.sleep(5000);
 		this.waitUntilElement(CalendarManageUI.PERIOD_MESSAGE);
        this.assertElementsTextContain(CalendarManageUI.PERIOD_MESSAGE,dataRangey);
    }
    
	public void calendarYesterday() {
    	this.sleep(3000);
		this.waitUntilElement(CalendarManageUI.CALENDAR);
    	this.click(CalendarManageUI.CALENDAR);
    	this.extractDateChooseDateRange("Yesterday");
    	this.click(CalendarManageUI.RUNREPORT);
    	this.sleep(5000);
    	String revYesterday = this.getYesterday();
 		this.waitUntilElement(CalendarManageUI.PERIOD_MESSAGE);
        this.assertElementsTextContain(CalendarManageUI.PERIOD_MESSAGE,revYesterday);
	}
	
}
