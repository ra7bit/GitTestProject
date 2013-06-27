package com.omniture.uiautomation.dashboard.tests;

import junit.framework.TestSuite;
import junit.framework.Test;


import com.omniture.uiautomation.dashboard.testcases.DashboardsTest;
import com.omniture.uiautomation.tests.OmnitureTest;

/**
 * 
 * @author sbli, yahu
 * Extend from TestCase to keep test cases run in order.
 * 
 */
public class DashboardsTestInOrder extends OmnitureTest {
	private DashboardsTest dt;
	public DashboardsTestInOrder(String casename) {
		super(casename);
		dt = new DashboardsTest();
	}

	// TC_1270924
	public void testAddDashboard() {
		dt.testAddDashboard();
	}

	// TC_1269790
	public void testAddLegacyDashboard() {
		dt.testAddLegacyDashboard();
	}

	// TC_1269781, TC_1269779, TC_1269772
	public void testEditDashboard() {
		dt.testEditDashboard();
	}

	// TC_1269788
	public void testSendDashboard() {
		dt.testSendDashboard();
	}

	// TC_1269802
	public void testSendDashboardasHTML() {
		dt.testSendDashboardasHTML();
	}

	// TC_1269805, TC_1269730, TC_1269709
	public void testScheduleDashboard() {
		dt.testScheduleDashboard();
	}

	// @Test //TC_1269752
	// public void testDownloadDashboard() {
	// dashboardManagement.downladDashboard(MY_DASHBOARD);
	// }

	public void testDeleteDashboard() {
		dt.testDeleteDashboard();
	}

	// send( Send report now) a dashboard,not change any default settings, just
	// change the email.
	public void testScheduleDashboardInDashboardManager01() {
		dt.testScheduleDashboardInDashboardManager01();
	}

	// send( Send report now) a dashboard,not change any default settings, just
	// change the Format to HTML.
	public void testScheduleDashboardInDashboardManager02() {
		dt.testScheduleDashboardInDashboardManager02();
	}

	// schedule(Schedule for later) a dashboard hourly
	public void testScheduleDashboardInDashboardManager03() {
		dt.testScheduleDashboardInDashboardManager03();
	}

	// schedule(Schedule for later) a dashboard daily (1)
	public void testScheduleDashboardInDashboardManager04() {
		dt.testScheduleDashboardInDashboardManager04();
	}

	// schedule(Schedule for later) a dashboard daily (2)
	public void testScheduleDashboardInDashboardManager05() {
		dt.testScheduleDashboardInDashboardManager05();
	}

	// schedule(Schedule for later) a dashboard weekly
	public void testScheduleDashboardInDashboardManager06() {
		dt.testScheduleDashboardInDashboardManager06();
	}

	// schedule(Schedule for later) a dashboard Monthly(1)
	public void testScheduleDashboardInDashboardManager07() {
		dt.testScheduleDashboardInDashboardManager07();
	}

	// schedule(Schedule for later) a dashboard Monthly(2)
	public void testScheduleDashboardInDashboardManager08() {
		dt.testScheduleDashboardInDashboardManager08();
	}

	// schedule(Schedule for later) a dashboard Yearly(1)
	public void testScheduleDashboardInDashboardManager09() {
		dt.testScheduleDashboardInDashboardManager09();
	}

	// schedule(Schedule for later) a dashboard Yearly(2)
	public void testScheduleDashboardInDashboardManager10() {
		dt.testScheduleDashboardInDashboardManager10();
	}

	// copy dashboard in "My Dashboard"
	public void testCopyDashboard() {
		dt.testCopyDashboard();
	}

	// unshare dashboard, directAccess
	public void testDirectAccessDashboard() {
		dt.testDirectAccessDashboard();
	}

	// copy dashboard in "Shared dashboard" to me
	public void testCopyMeDashboard() {
		dt.testCopyMeDashboard();
	}

	// set dashboard on menu
	public void testOnMenuDashboard() {
		dt.testOnMenuDashboard();
	}

	// edit dashboard
	public void testEditDashboardInDashboardManager(){
		dt.testEditDashboardInDashboardManager();
	}

	// share/unshare dashboard Push Dashboard To Users
	public void testShareDashboard01() {
		dt.testShareDashboard01();
	}

	// share/unshare dashboard Push Dashboard To Users
	public void testShareDashboard02() {
		dt.testShareDashboard02();
	}


	public static Test suite() {
		TestSuite suite = new TestSuite("Dashboard function test...");
		suite.addTest(new DashboardsTestInOrder("testAddDashboard"));
		suite.addTest(new DashboardsTestInOrder("testAddLegacyDashboard"));
		suite.addTest(new DashboardsTestInOrder("testEditDashboard"));
		suite.addTest(new DashboardsTestInOrder("testSendDashboard"));
		suite.addTest(new DashboardsTestInOrder("testSendDashboardasHTML"));
		suite.addTest(new DashboardsTestInOrder("testScheduleDashboard"));
		suite.addTest(new DashboardsTestInOrder("testDeleteDashboard"));
		
		suite.addTest(new DashboardsTestInOrder("testCopyDashboard"));
		suite.addTest(new DashboardsTestInOrder("testDirectAccessDashboard"));
		suite.addTest(new DashboardsTestInOrder("testCopyMeDashboard"));
		suite.addTest(new DashboardsTestInOrder("testOnMenuDashboard"));
		suite.addTest(new DashboardsTestInOrder("testShareDashboard01"));
		suite.addTest(new DashboardsTestInOrder("testShareDashboard02"));	
		
		suite.addTest(new DashboardsTestInOrder(
				"testScheduleDashboardInDashboardManager01"));
		suite.addTest(new DashboardsTestInOrder(
				"testScheduleDashboardInDashboardManager02"));
		suite.addTest(new DashboardsTestInOrder(
				"testScheduleDashboardInDashboardManager03"));	
		suite.addTest(new DashboardsTestInOrder(
				"testScheduleDashboardInDashboardManager04"));
		suite.addTest(new DashboardsTestInOrder(
				"testScheduleDashboardInDashboardManager05"));
		suite.addTest(new DashboardsTestInOrder(
				"testScheduleDashboardInDashboardManager06"));
		suite.addTest(new DashboardsTestInOrder(
				"testScheduleDashboardInDashboardManager07"));
		suite.addTest(new DashboardsTestInOrder(
				"testScheduleDashboardInDashboardManager08"));
		suite.addTest(new DashboardsTestInOrder(
				"testScheduleDashboardInDashboardManager09"));
		suite.addTest(new DashboardsTestInOrder(
				"testScheduleDashboardInDashboardManager10"));	
		return suite;
	}

}
