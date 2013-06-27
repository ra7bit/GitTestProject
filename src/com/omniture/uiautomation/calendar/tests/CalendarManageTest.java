package com.omniture.uiautomation.calendar.tests;

import junit.framework.TestSuite;
import com.omniture.uiautomation.calendar.pages.CalendarManagePage;
import com.omniture.uiautomation.pages.OmniturePage;
import com.omniture.uiautomation.tests.OmnitureTest;


/**
 * @author nal
 */
public class CalendarManageTest extends OmnitureTest {
	
    private CalendarManagePage calendarManagePage;
    private OmniturePage omniturePage;
    
    public CalendarManageTest (String name)
    {
        super(name);
        calendarManagePage = new CalendarManagePage();
        omniturePage = new OmniturePage();
        this.calendarManagePage.setWebDriver(this.webDriver);
        this.omniturePage.setWebDriver(this.webDriver);
    } 
    
    public void testCalendarLogin() {
       // if (!omniturePage.isLogined()){
            omniturePage.login();
        //}
    }
	    
    //select bugzilla
    public void testCalendarRSSetUp() {
    	calendarManagePage.calendarSetReportS();
    }
    
    //@Test      // TC_1262298 
    public void testCalendarTypeDate() {
        calendarManagePage.calendarTypeDate();
     } 
    
    //@Test    // TC_1262282
    public void testCalendarPreviousYear(){
    	calendarManagePage.calendarTypeDate();
    	calendarManagePage.calendarPreviousYear();
    }
     
    //@Test    // TC_1262277 
    public void testCalendarViewYear() {
    	calendarManagePage.calendarTypeDate();
        calendarManagePage.calendarViewYear();
    } 
    
    //@Test    // TC_1262288
    public void testCalendarYearbyMonth() {
       calendarManagePage.calendarTypeDate();
       calendarManagePage.calendarYearbyMonth();
    }
     
	//@Test 	// TC_122292
	public void testCalendarYearbyQuarter() {	
	   calendarManagePage.calendarTypeDate();
       calendarManagePage.calendarYearbyQuarter();
    }
	
	//@Test 	// TC_122292
	public void testCalendarMonthbyWeek() {
	   calendarManagePage.calendarTypeDate();
       calendarManagePage.calendarMonthbyWeek();
    }
	
    //@Test    // TC_1262283
    public void testCalendarWeekbyHour() {
    	calendarManagePage.calendarTypeDate();
    	calendarManagePage.calendarWeekbyHour();
    }
	
    //@Test    // TC_1262289
    public void testCalendarCurrentMonth() {
    	//testCalendarLogin();
    	calendarManagePage.calendarTypeDate();
    	calendarManagePage.calendarCurrentMonth();
    }
    
//    //select asc-test1
//    public void testCalendarRSBack() {
//       calendarManagePage.calendarBackReportS();
//     }
    
    //@Test    // TC_1262301
    public void testCalendarLastYear() {
    	calendarManagePage.calendarLastYear();
    }
    
    //@Test    // TC_1262300
    public void testCalendarThisMonth() {
    	calendarManagePage.calendarThisMonth();
    }
    
    //@Test    // TC_1262279
    public void testCalendarLastMonths() {
    	calendarManagePage.calendarLastMonths();
    }
    
    //@Test    // TC_1262275
    public void testCalendarThisYear() {
    	calendarManagePage.calendarThisYear();
    }
    
    //@Test    // TC_1262265
    public void testCalendarYesterday() {
    	calendarManagePage.calendarYesterday();
    }
    
    public static TestSuite suite(){
        TestSuite suite = new TestSuite("Calendar Test...");
        suite.addTest(new CalendarManageTest("testCalendarLogin"));
        suite.addTest(new CalendarManageTest("testCalendarRSSetUp"));
        suite.addTest(new CalendarManageTest("testCalendarTypeDate"));
        suite.addTest(new CalendarManageTest("testCalendarPreviousYear"));
        suite.addTest(new CalendarManageTest("testCalendarViewYear"));
        suite.addTest(new CalendarManageTest("testCalendarYearbyMonth"));
        suite.addTest(new CalendarManageTest("testCalendarYearbyQuarter"));
        suite.addTest(new CalendarManageTest("testCalendarMonthbyWeek"));
        suite.addTest(new CalendarManageTest("testCalendarWeekbyHour"));
        suite.addTest(new CalendarManageTest("testCalendarCurrentMonth"));
        suite.addTest(new CalendarManageTest("testCalendarLastYear"));
        suite.addTest(new CalendarManageTest("testCalendarThisMonth"));
        suite.addTest(new CalendarManageTest("testCalendarLastMonths"));
        suite.addTest(new CalendarManageTest("testCalendarThisYear"));
        suite.addTest(new CalendarManageTest("testCalendarYesterday"));      
        //suite.addTest(new CalendarManageTest("testCalendarRSBack")); 
        return suite;
    }
    
 
    
}
