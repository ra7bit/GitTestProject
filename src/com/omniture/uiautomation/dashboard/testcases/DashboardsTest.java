package com.omniture.uiautomation.dashboard.testcases;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;


import com.omniture.uiautomation.dashboard.DashboardManagerTest;
import com.omniture.uiautomation.dashboard.EditDashboard;
import com.omniture.uiautomation.dashboard.Scheduled;
import com.omniture.uiautomation.framework.TestEnvironment;



/**
 * 
 * @author sbli, yahu
 * 
 * You should confirm that the dashboard sbliTestJuly and sbliTest_Legacy are deleted.
 * Or the existing dashboards make you fail in the next run. 
 */
public class DashboardsTest extends DashboardManagerTest {
	public static String MY_DASHBOARD="sbliTestJuly";	
	public static String LEGACY_DASHBOARD="sbliTest_Legacy";
	public static String SHARED_DASHBOARED="HUYanShare";	//Dashboard "HUYanShare" is used to test "copy me", please do make sure that "HUYanShare" has been created before you run this test.
	public static String TEST_DASHBOARD="flute";//Dashboard "flute" is used to test "schedule", please do make sure that "flute" has been created before you run this test.
	public static String RENAME_DASHBOARD="renamed";
	public static String EMAIL="yahu@adobe.com";
	public static String[] DESTINATION_EMAIL={"yahu@adobe.com","SiteCatalyst","Report from automation test","Please cancel scheduled report manually"};
	public static String[]  DESTINATION_FTP={"10.162.181.9","21","","",""};
	public static String[] PUBLISHING_LISTS={"HuYanList"};
	public static String ENV=TestEnvironment.current.getName();

	
	@Test  //TC_1270924	
	public void testAddDashboard() {
//		dashboardManagement.deleteMyDashboard(MY_DASHBOARD);
		dashboardManagement.addDashboard(MY_DASHBOARD);
	}
	
	@Test  //TC_1269790
	public void testAddLegacyDashboard() {
		dashboardManagement.addLegacyDashboard(LEGACY_DASHBOARD);
	}
	
	
	@Test  //TC_1269781, TC_1269779, TC_1269772
	public void testEditDashboard() {
		dashboardManagement.editDashboard(MY_DASHBOARD);
	}
	
	
	@Test  //TC_1269788
	public void testSendDashboard() {
		dashboardManagement.sendDashboard(MY_DASHBOARD);
	}
	
	
	@Test   //TC_1269802
	public void testSendDashboardasHTML() {
		dashboardManagement.sendDashboardasHTML(MY_DASHBOARD);
	}
	
	
	@Test  //TC_1269805, TC_1269730, TC_1269709
	public void testScheduleDashboard() {
		dashboardManagement.scheduleDashboard(MY_DASHBOARD);
	}

	
//	@Test  //TC_1269752
//	public void testDownloadDashboard() {
//		dashboardManagement.downladDashboard(MY_DASHBOARD);
//	}	


	
	
	
	@Test  //    delete dashboard
	public void testDeleteDashboard()
	{
		dashboardManagement.deleteMyDashboard(MY_DASHBOARD);
		dashboardManagement.deleteMyDashboard(LEGACY_DASHBOARD);
	}
	
	
	
	@Test  //send( Send report now) a dashboard,not change any default settings, just change the email.
	public void testScheduleDashboardInDashboardManager01()
	{
		Scheduled s=new Scheduled();
		String[] des={EMAIL,null,null,null};
		s.setDestination(des);
		dashboardManagement.scheduleMyDashboard(TEST_DASHBOARD,s);
	}
	
	@Test  //send( Send report now) a dashboard,not change any default settings, just change the Format to HTML.
	public void testScheduleDashboardInDashboardManager02()
	{
		Scheduled s=new Scheduled();
		s.setScheduled(true);
		s.setFormat(2);//change the Format to HTML
		String[] des={EMAIL,null,null,null};
		s.setDestination(des);
		dashboardManagement.scheduleMyDashboard(TEST_DASHBOARD,s);
	}
	
	
	
	@Test  //schedule(Schedule for later) a dashboard hourly
	public void testScheduleDashboardInDashboardManager03()
	{
		Scheduled s=new Scheduled();
		s.setName(2);
		s.setCustormName("huyan schedule");
		s.setAppendDate(true);
		s.setFormat(1);
		boolean[] formatCheckboxes={true,true,true};
		s.setFormatCheckbox(formatCheckboxes);
		s.setLanguage(1);
		s.setDigitalSignature(true);
		s.setType(2);
		s.setDestination( DESTINATION_FTP);
		s.setPublishingListName(PUBLISHING_LISTS);
		s.setScheduled(true);
		s.setWhen(2);
		s.setHowOften(1);
		s.setEveryX("2");
		s.setEnd(2);
		s.setEndAfter("4");
		dashboardManagement.scheduleMyDashboard(ENV+"ScheduledHourly",s);
	}

	@Test  //schedule(Schedule for later) a dashboard daily (1)
	public void testScheduleDashboardInDashboardManager04()
	{
		Scheduled s=new Scheduled();
		s.setName(1);
		s.setFormat(2);
		s.setDigitalSignature(true);
		s.setType(1);
		s.setDestination(DESTINATION_EMAIL);
		s.setScheduled(true);
		s.setWhen(2);
		s.setHowOften(2);
		s.setEveryRadio(1);
		s.setEveryX("5");
		s.setStartOn(this.getDateFromNow(-10));//start before 10 days
		s.setTime(2);
		s.setEnd(1);
		dashboardManagement.scheduleMyDashboard(ENV+"ScheduledDaily1",s);
	}
	@Test  //schedule(Schedule for later) a dashboard daily (2)
	public void testScheduleDashboardInDashboardManager05()
	{
		Scheduled s=new Scheduled();
		s.setName(2);
		s.setCustormName("huyan schedule");
		s.setFormat(1);
		s.setDigitalSignature(true);
		s.setType(1);
		s.setDestination( DESTINATION_EMAIL);
		s.setScheduled(true);
		s.setWhen(2);
		s.setHowOften(2);
		s.setEveryRadio(2);
		s.setEveryX("5");// deleted
		s.setStartOn(this.getDateFromNow(-3650));//start before about 10 years
		s.setTime(6);
		s.setEnd(2);
		s.setEndAfter("10");
		dashboardManagement.scheduleMyDashboard(ENV+"ScheduledDaily2",s);
	}

	@Test  //schedule(Schedule for later) a dashboard weekly
	public void testScheduleDashboardInDashboardManager06()
	{
		Scheduled s=new Scheduled();
		s.setName(1);
		s.setFormat(2);
		s.setType(1);
		s.setDestination( DESTINATION_EMAIL);
		s.setScheduled(true);
		s.setWhen(2);
		s.setHowOften(3);
		s.setEveryRadio(1);
		s.setEveryX("2");
		s.setDayOfWeek(3);
		s.setStartOn(this.todayString());//start now
		s.setTime(4);
		s.setEnd(3);
		s.setEndOn(this.getDateFromNow(400));//end after 400 days
		dashboardManagement.scheduleMyDashboard(ENV+"ScheduledWeekly",s);
	}
	
	@Test  //schedule(Schedule for later) a dashboard Monthly(1)
	public void testScheduleDashboardInDashboardManager07()
	{
		Scheduled s=new Scheduled();
		s.setName(1);
		s.setFormat(1);
		boolean[] formatCheckboxes={true,true,false};
		s.setFormatCheckbox(formatCheckboxes);
		s.setType(1);
		s.setDestination( DESTINATION_EMAIL);
		s.setScheduled(true);
		s.setWhen(2);
		s.setHowOften(4);
		s.setEveryRadio(1);
		s.setEveryX("3");
		s.setTh(24);
		s.setStartOn(this.todayString());
		s.setTime(5);
		s.setEnd(3);
		s.setEndOn(this.getDateFromNow(40000));//end after many many years.
		dashboardManagement.scheduleMyDashboard(ENV+"ScheduledMonthly1",s);
	}

	@Test  //schedule(Schedule for later) a dashboard Monthly(2)
	public void testScheduleDashboardInDashboardManager08()
	{
		Scheduled s=new Scheduled();
		s.setName(1);
		s.setFormat(1);
		boolean[] formatCheckboxes={false,true,true};
		s.setFormatCheckbox(formatCheckboxes);
		s.setType(1);
		s.setDestination( DESTINATION_EMAIL);
		s.setScheduled(true);
		s.setWhen(2);
		s.setHowOften(4);
		s.setEveryRadio(2);
		s.setTh(4);
		s.setEveryX("4");
		s.setDayOfWeek(3);
		s.setStartOn(this.getDateFromNow(-1));
		s.setTime(5);
		s.setEnd(2);
		s.setEndAfter("8");
		dashboardManagement.scheduleMyDashboard(ENV+"ScheduledMonthly2",s);
	}

	@Test  //schedule(Schedule for later) a dashboard Yearly(1)
	public void testScheduleDashboardInDashboardManager09()
	{
		Scheduled s=new Scheduled();
		s.setName(1);
		s.setFormat(2);
		s.setType(1);
		s.setDestination( DESTINATION_EMAIL);
		
		s.setScheduled(true);
		s.setWhen(2);
		
		s.setHowOften(5);		
		s.setEveryRadio(1);
		s.setMonth(10);
		s.setTh(28);
		
		s.setStartOn(this.getDateFromNow(-20));
		s.setTime(19);
		
		s.setEnd(1);
		dashboardManagement.scheduleMyDashboard(ENV+"ScheduledYearly1",s);
	}

	@Test  //schedule(Schedule for later) a dashboard Yearly(2)
	public void testScheduleDashboardInDashboardManager10()
	{
		Scheduled s=new Scheduled();
		s.setName(1);
		s.setFormat(2);
		s.setType(1);
		s.setDestination( DESTINATION_EMAIL);
		
		s.setScheduled(true);
		s.setWhen(2);
		
		s.setHowOften(5);
		s.setEveryRadio(2);
		s.setTh(3);
		s.setDayOfWeek(4);
		s.setMonth(12);

		//s.setStartOn("02/02/2012");
		
		s.setStartOn(this.todayString());
		s.setTime(21);
		
		s.setEnd(1);

		dashboardManagement.scheduleMyDashboard(ENV+"ScheduledYearly2",s);
	}
	
	@Test  //    copy dashboard in "My Dashboard"
	public void testCopyDashboard()
	{
		dashboardManagement.copyMyDashboard(TEST_DASHBOARD);
		dashboardManagement.deleteMyDashboard(TEST_DASHBOARD);
	}
	@Test  //	unshare dashboard, directAccess
	public void testDirectAccessDashboard()
	{
		dashboardManagement.directAccessMyDashboard(TEST_DASHBOARD);
		dashboardManagement.directAccessMyDashboard(TEST_DASHBOARD);
	}
	
	@Test  //    copy dashboard in "Shared dashboard" to me
	public void testCopyMeDashboard()
	{
		dashboardManagement.copyMeSharedDashboard(SHARED_DASHBOARED);
		dashboardManagement.deleteMyDashboard(SHARED_DASHBOARED);
	}	
	
	@Test  //   set dashboard on menu
	public void testOnMenuDashboard()
	{
		dashboardManagement.onMenuSharedDashboard(SHARED_DASHBOARED);
		dashboardManagement.disOnMenuSharedDashboard(SHARED_DASHBOARED);
	}

	@Test  // edit dashboard
	public void testEditDashboardInDashboardManager()
	{	
		EditDashboard ed=new EditDashboard();
		ed.setName(RENAME_DASHBOARD);
		ed.setMyDefault(true);
		ed.setAllDefault(true);
		dashboardManagement.editMyDashboard(TEST_DASHBOARD, ed);
		ed.setMyDefault(false);
		ed.setName(null);
		dashboardManagement.editMyDashboard(RENAME_DASHBOARD,ed);
		dashboardManagement.unshareSharedDashboard(RENAME_DASHBOARD);
		ed.setAllDefault(false);
		ed.setName(TEST_DASHBOARD);
		dashboardManagement.editMyDashboard(RENAME_DASHBOARD,ed);
	}
	
	@Test  //	share/unshare dashboard Push Dashboard To Users
	public void testShareDashboard01()
	{
		dashboardManagement.shareMyDashboard(TEST_DASHBOARD);
		String[] login={"yahu"};
		dashboardManagement.pushToUsersMyDashboard(TEST_DASHBOARD, login, 1);
		//TODO:login as 'yahu' and check that the dashboard was pushed to 'yahu'
		dashboardManagement.unshareSharedDashboard(TEST_DASHBOARD);
	}
	
	@Test  //	share/unshare dashboard Push Dashboard To Users
	public void testShareDashboard02()
	{
		dashboardManagement.shareMyDashboard(TEST_DASHBOARD);
		String[] login={"yahu"};
		dashboardManagement.pushToUsersMyDashboard(TEST_DASHBOARD, login, 1);
		//TODO:login as 'yahu' and check that the dashboard was pushed to 'yahu'
		dashboardManagement.unshareMyDashboard(TEST_DASHBOARD);
	}
	
	
	private String todayString()
	{
		Calendar cal=Calendar.getInstance(); 
		cal.setTime(new Date());
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		String sday="";
		String smonth = "";
		String syear = "";
		if(day<10)
		{
			sday= "0" + day;
		}
		else if(day>=10)
		{
			sday="" + day;
		}
		
		if (month<9)
		{
			smonth = "0" + (month +1);
		}
		else if(month>=9)
		{
			smonth = ""+ (month+1);
		}
		
		syear = ""+year;
		
		return smonth + "/" + sday + "/" + syear;
	}

	//Used to calculate the end date in schedule test.
	//If days>0, return a date that is 'days' days after today.
	//If days<0, return a date that is 'days' days before today.
	private String getDateFromNow(int days)
	{
		long milliseconds=(long)days*86400000L;
		Date date=new Date();
		date.setTime(date.getTime()+milliseconds);
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("MM/dd/yyyy");
		return simpleDateFormat.format(date);
	}


	
	
	
	
	
	

	
}
