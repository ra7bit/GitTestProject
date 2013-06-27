package com.omniture.uiautomation.dashboard.tests.bvt;

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
//	private OmniturePage omniturePage;

	public DashboardsTestInOrder(String casename) {
		super(casename);
		dt = new DashboardsTest();
//		omniturePage = new OmniturePage();
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

	// TC_1269805, TC_1269730, TC_1269709
	public void testScheduleDashboard() {
		dt.testScheduleDashboard();
	}
	
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


	// schedule(Schedule for later) a dashboard daily (1)
	public void testScheduleDashboardInDashboardManager04() {
		dt.testScheduleDashboardInDashboardManager04();
	}

	// schedule(Schedule for later) a dashboard weekly
	public void testScheduleDashboardInDashboardManager06() {
		dt.testScheduleDashboardInDashboardManager06();
	}

	// schedule(Schedule for later) a dashboard Monthly(1)
	public void testScheduleDashboardInDashboardManager07() {
		dt.testScheduleDashboardInDashboardManager07();
	}

	// schedule(Schedule for later) a dashboard Yearly(1)
	public void testScheduleDashboardInDashboardManager09() {
		dt.testScheduleDashboardInDashboardManager09();
	}

	// copy dashboard in "My Dashboard"
	public void testCopyDashboard() {
		dt.testCopyDashboard();
	}

	// copy dashboard in "Shared dashboard" to me
	public void testCopyMeDashboard() {
		dt.testCopyMeDashboard();
	}

	// set dashboard on menu
	public void testOnMenuDashboard() {
		dt.testOnMenuDashboard();
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
		
		suite.addTest(new DashboardsTestInOrder("testScheduleDashboard"));
		suite.addTest(new DashboardsTestInOrder("testDeleteDashboard"));


		suite.addTest(new DashboardsTestInOrder("testCopyDashboard"));
		suite.addTest(new DashboardsTestInOrder("testCopyMeDashboard"));
		suite.addTest(new DashboardsTestInOrder("testOnMenuDashboard"));
		suite.addTest(new DashboardsTestInOrder("testShareDashboard01"));
		suite.addTest(new DashboardsTestInOrder("testShareDashboard02"));
		
		
		suite.addTest(new DashboardsTestInOrder(
				"testScheduleDashboardInDashboardManager01"));
		suite.addTest(new DashboardsTestInOrder(
				"testScheduleDashboardInDashboardManager02"));
				suite.addTest(new DashboardsTestInOrder(
				"testScheduleDashboardInDashboardManager06"));
		suite.addTest(new DashboardsTestInOrder(
				"testScheduleDashboardInDashboardManager07"));
		suite.addTest(new DashboardsTestInOrder(
				"testScheduleDashboardInDashboardManager09"));
		suite.addTest(new DashboardsTestInOrder(
				"testScheduleDashboardInDashboardManager04"));
		return suite;
	}

}
