package com.omniture.uiautomation.calendar.tests.bvt;

import junit.framework.TestSuite;
import com.omniture.uiautomation.calendar.pages.CalendarManagePage;
import com.omniture.uiautomation.tests.OmnitureTest;


public class CalendarManageTest extends OmnitureTest {

    private CalendarManagePage calendarManagePage;
    
    public CalendarManageTest (String name)
    {
        super(name);
        calendarManagePage = new CalendarManagePage();
        calendarManagePage.setWebDriver(this.webDriver);
    } 
	      
    //select bugzilla
    public void testCalendarRSSetUp() {
    	calendarManagePage.calendarSetReportS();
    }
    
    //@Test      // TC_1262298 
    public void testCalendarTypeDate() {
        calendarManagePage.calendarTypeDate();
    } 
    
    public static TestSuite suite(){
        TestSuite suite = new TestSuite("Calendar Test...");
        suite.addTest(new CalendarManageTest("testCalendarRSSetUp"));
        suite.addTest(new CalendarManageTest("testCalendarTypeDate"));
        return suite;
    }
}
