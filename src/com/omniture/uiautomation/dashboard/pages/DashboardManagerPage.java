package com.omniture.uiautomation.dashboard.pages;

import org.openqa.selenium.NoSuchElementException;

import com.omniture.uiautomation.dashboard.EditDashboard;
import com.omniture.uiautomation.dashboard.Scheduled;
import com.omniture.uiautomation.dashboard.ui.AdvancedDeliveryOptions;
import com.omniture.uiautomation.dashboard.ui.DashboardManagerUI;
import com.omniture.uiautomation.dashboard.ui.EditInDashboardManager;
import com.omniture.uiautomation.dashboard.ui.EditDashboardUI;
import com.omniture.uiautomation.dashboard.ui.ADODashboardUI;
import com.omniture.uiautomation.dashboard.ui.PushToUsers;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.OmniturePage;
import com.omniture.uiautomation.util.Common;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;

/**
 * 
 * @author sbli, yahu
 * 
 */
public class DashboardManagerPage extends OmniturePage {

	public static String USERID = "yahu";
	public static String PASSWORD = "a1111111";

	public void navigateToDashboardManagerIndex() {
		this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
				+ "/p/suite/1.3/index.html?a=Dashboard.Manager&ssSession="
				+ ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
		// if(!this.checkLanguage("en_US"))
		// this.switchLanguage("en_US");
		this.waitUntilPageLoad();
	}

	public void goToDashboardManager() {
		// this.sleep(3000);
		this.waitUntilPageLoad();
		this.waitUntilElementClickable(DashboardManagerUI.FAVORITES);
		this.click(DashboardManagerUI.FAVORITES);
		this.waitUntilElementClickable(DashboardManagerUI.DASHBOARDS);
		this.click(DashboardManagerUI.DASHBOARDS);
		this.waitUntilElementClickable(DashboardManagerUI.MANAGE_DASHBOARDS);
		this.click(DashboardManagerUI.MANAGE_DASHBOARDS);
		this.waitUntilPageLoad();
	}

	public void addDashboard(String dashboardName) {
		navigateToDashboardManagerIndex();
		this.waitUntilElementClickable(DashboardManagerUI.ADDDASHBOARD);
		this.click(DashboardManagerUI.ADDDASHBOARD);
		this.switchTab();
		this.waitUntilElement(DashboardManagerUI.DASHBOARDNAME);
		this.type(DashboardManagerUI.DASHBOARDNAME, dashboardName);
		this.waitUntilElementClickable(DashboardManagerUI.ADDOK);
		this.click(DashboardManagerUI.ADDOK);
		this.switchTab();
		this.sleep(30000);
		this.assertElementExists(DashboardManagerUI
				.getMyDashboardByName(dashboardName));
	}

	public void addLegacyDashboard(String legacyName) {
		navigateToDashboardManagerIndex();
		this.waitUntilElementClickable(DashboardManagerUI.ADDDASHBOARD);
		this.click(DashboardManagerUI.ADDDASHBOARD);
		this.switchTab();
		this.waitUntilElement(DashboardManagerUI.DASHBOARDNAME);
		this.type(DashboardManagerUI.DASHBOARDNAME, legacyName);
		this.waitUntilElementClickable(DashboardManagerUI.LEGACY);
		this.click(DashboardManagerUI.LEGACY);
		this.waitUntilElementClickable(DashboardManagerUI.ADDOK);
		this.click(DashboardManagerUI.ADDOK);
		this.switchTab();
		this.sleep(10000);
	}

	public void editDashboard(String dashboardName) {
		navigateToDashboardManagerIndex();
		this.waitUntilElementClickable(DashboardManagerUI.getMyDashboardByName(dashboardName));
		this.click(DashboardManagerUI.getMyDashboardByName(dashboardName));
		this.sleep(3000);
		this.click(EditDashboardUI.THREEBYTWO);
		this.sleep(3000);
		this.click(EditDashboardUI.ADDCONTENT);
		this.sleep(3000);
		this.click(EditDashboardUI.CUSTOMREPORTLETS);
		this.sleep(3000);
		this.click(EditDashboardUI.DATACONTENT);

		addCompanySummary();
		addMetricGauge();
		addReportSuiteSummary();
		addUsageSummary();
		//addExternalReport();

		this.click(DashboardManagerUI.SAVE);
		this.sleep(10000);
	}

	private void addCompanySummary() {
		this.sleep(4000);
		this.dragAndDrop(EditDashboardUI.COMPANYSUMMARY, EditDashboardUI.FIRST);
		this.sleep(4000);
		this.waitUntilElementClickable(EditDashboardUI.COMPANYSUMMARYUPDATE);
		this.click(EditDashboardUI.COMPANYSUMMARYUPDATE);
	}

	private void addMetricGauge() {
		this.sleep(4000);
		this.dragAndDrop(EditDashboardUI.METRICGAUGE, EditDashboardUI.SECOND);
		this.sleep(4000);
		this.waitUntilElementClickable(EditDashboardUI.METRICGAUGEUPDATE);
		this.click(EditDashboardUI.METRICGAUGEUPDATE);
	}

	private void addReportSuiteSummary() {
		this.sleep(4000);
		this.dragAndDrop(EditDashboardUI.REPORTSUITESUMMARY,
				EditDashboardUI.THIRD);
		this.sleep(5000);
		this.click(EditDashboardUI.REPORTSUITESUMMARYUPDATE);
	}

	private void addUsageSummary() {
		this.sleep(4000);
		this.dragAndDrop(EditDashboardUI.USAGESUMMARY, EditDashboardUI.FOURTH);
		this.sleep(5000);
		this.click(EditDashboardUI.USAGESUMMARYUPDATE);
	}

//	private void addExternalReport() {
//		this.click(EditDashboardUI.USERCONTENT);
//		this.sleep(4000);
//		this.dragAndDrop(EditDashboardUI.EXTERNALREPORT, EditDashboardUI.FIFTH);
//		this.sleep(5000);
//		this
//				.type(EditDashboardUI.EXTERNALREPORTURL,
//						"https://www.qe1.omniture.com/p/static/1.0/xml/reportlet-vbar.xml");
//		this.sleep(1000);
//		this.click(EditDashboardUI.EXTERNALREPORTUPDATE);
//		this.sleep(5000);
//	}

	// send pdf as default
	public void sendDashboard(String dashboardName) {
		navigateToDashboardManagerIndex();
		this.click(DashboardManagerUI.getMyDashboardByName(dashboardName));
		this.sleep(3000);
		this.click(DashboardManagerUI.SEND);
		this.sleep(3000);
		this.waitUntilElementClickable(DashboardManagerUI.SENDBTN);
		this.click(DashboardManagerUI.SENDBTN);
	}

	public void sendDashboardasHTML(String dashboardName) {
		navigateToDashboardManagerIndex();
		this.waitUntilElementClickable(DashboardManagerUI
				.getMyDashboardByName(dashboardName));
		this.click(DashboardManagerUI.getMyDashboardByName(dashboardName));
		this.sleep(3000);
		this.click(DashboardManagerUI.SEND);
		this.sleep(3000);
		this.waitUntilElementClickable(DashboardManagerUI.SENDASHTML);
		this.click(DashboardManagerUI.SENDASHTML);
		this.sleep(3000);
		this.waitUntilElementClickable(DashboardManagerUI.SENDBTN);
		this.click(DashboardManagerUI.SENDBTN);

	}

	public void scheduleDashboard(String dashboardName) {
		navigateToDashboardManagerIndex();
		this.waitUntilElementClickable(DashboardManagerUI.getMyDashboardByName(dashboardName));
		this.click(DashboardManagerUI.getMyDashboardByName(dashboardName));
		this.sleep(4000);
		this.waitUntilElementClickable(DashboardManagerUI.SEND);
		this.click(DashboardManagerUI.SEND);
		this.sleep(4000);

		this.waitUntilElementClickable(DashboardManagerUI.DELOPTIONS);

		this.click(DashboardManagerUI.DELOPTIONS);
		this.sleep(2000);

		this.switchTab();
		this.click(ADODashboardUI.INCLUDEHTML);
		this.click(ADODashboardUI.COMPRESSED);
		this.click(ADODashboardUI.ARCHIVE);

		this.click(ADODashboardUI.SCHEDULEOPTIONS);
		this.sleep(2000);
		this.click(ADODashboardUI.SCHEDULEFORLATER);
		this.sleep(2000);
		this.click(ADODashboardUI.SCHEDULE);

		this.switchTab();

	}

	public void downladDashboard(String dashboardName) {
		navigateToDashboardManagerIndex();
		this.click(DashboardManagerUI.getMyDashboardByName(dashboardName));
		this.sleep(3000);
		this.click(DashboardManagerUI.DOWNLOAD);
		this.sleep(3000);

	}

	// delete dashboard in "My Dashboards"
	public void deleteMyDashboard(String dashboardName) {
		navigateToDashboardManagerIndex();
		try {
			this.click(DashboardManagerUI.getMyDashboardDelete(dashboardName));
			this.getLocator().alert().accept();
			this.waitUntilPageLoad();
			this.sleep(3000);
		} catch (NoSuchElementException e) {
			this.assertElementNotExists(DashboardManagerUI
					.getMyDashboardDelete(dashboardName));
		}
	}

	// share dashboard in "My Dashboards"
	public void shareMyDashboard(String dashboardName) {
		navigateToDashboardManagerIndex();
		this.waitUntilElementClickable(DashboardManagerUI
				.getMyDashboardShared(dashboardName));
		this.click(DashboardManagerUI.getMyDashboardShared(dashboardName));
		this.sleep(3000);
		this.assertElementExists(DashboardManagerUI
				.getSharedDashboardByName(dashboardName));
	}

	// unshare dashboard in "My Dashboards"
	public void unshareMyDashboard(String dashboardName) {
		navigateToDashboardManagerIndex();
		this.waitUntilElementClickable(DashboardManagerUI
				.getMyDashboardShared(dashboardName));
		this.click(DashboardManagerUI.getMyDashboardShared(dashboardName));
		this.sleep(3000);
		this.assertElementNotExists(DashboardManagerUI
				.getSharedDashboardByName(dashboardName));
	}

	// unshare dashboard in "Shared Dashboards"
	public void unshareSharedDashboard(String dashboardName) {
		navigateToDashboardManagerIndex();
		this.waitUntilElementClickable(DashboardManagerUI
				.getSharedDashboardUnShare(dashboardName));
		this.click(DashboardManagerUI.getSharedDashboardUnShare(dashboardName));
		this.sleep(3000);
		this.assertElementNotExists(DashboardManagerUI
				.getSharedDashboardByName(dashboardName));
	}

	// Copy dashboard in "Shared Dashboards" to me
	public void copyMeSharedDashboard(String dashboardName) {
		navigateToDashboardManagerIndex();
		this.waitUntilElementClickable(DashboardManagerUI.getSharedDashboardCopyMe(dashboardName));
		this.click(DashboardManagerUI.getSharedDashboardCopyMe(dashboardName));
		this.sleep(3000);
		this.assertElementExists(DashboardManagerUI
				.getMyDashboardByName(dashboardName));
	}

	// Click on 'Direct Access' in "My Dashboards"
	public void directAccessMyDashboard(String dashboardName) {
		navigateToDashboardManagerIndex();
		this.waitUntilElementClickable(DashboardManagerUI.getMyDashboardDirectAccess(dashboardName));
		this.click(DashboardManagerUI.getMyDashboardDirectAccess(dashboardName));
		this.sleep(3000);
	}

	// push dashboard in 'My Dashboards' to users
	public void pushToUsersMyDashboard(String dashboardName, String[] login,
			int button) {
		navigateToDashboardManagerIndex();
		this.waitUntilElementClickable(DashboardManagerUI
				.getMyDashboardPushToUsers(dashboardName));
		this.click(DashboardManagerUI.getMyDashboardPushToUsers(dashboardName));
		this.switchTab();
		for (int i = 0; i < login.length; i++) {
			try {
				this.click(PushToUsers.getCheckBoxByLogin(login[i]));
			} catch (NoSuchElementException e) {
			}
		}
		this.sleep(3000);
		switch (button) {
		case 1:
			this.click(PushToUsers.SAVE);
			break;
		case 2:
			this.click(PushToUsers.CANCEL);
			break;
		}
		this.switchTab();
	}

	// copy dashboard in 'My Dashboards'
	public void copyMyDashboard(String dashboardName) {
		navigateToDashboardManagerIndex();
		this.waitUntilElementClickable(DashboardManagerUI.getMyDashboardCopy(dashboardName));
		this.click(DashboardManagerUI.getMyDashboardCopy(dashboardName));
		this.sleep(3000);
		this.assertElementExists(DashboardManagerUI.getMyDashboardByName(
				dashboardName, 2));
	}

	// edit dashboard in "My Dashboards"
	public void editMyDashboard(String dashboardName, EditDashboard ed) {
		goToDashboardManager();
		this.waitUntilElementClickable(DashboardManagerUI
				.getMyDashboardEdit(dashboardName));
		this.click(DashboardManagerUI.getMyDashboardEdit(dashboardName));
		// this.waitUntilPageLoad();
		this.sleep(3000);
		this.switchTab();
		String rename = null;
		if (ed.getName() != null) {
			this.clear(EditInDashboardManager.NAME);
			this.type(EditInDashboardManager.NAME, ed.getName());
			rename = ed.getName();
		}
		boolean allDefault = this.findElement(
				EditInDashboardManager.ALL_DEFAULT).isSelected();
		boolean myDefault = false;
		boolean allDefaultM = false;
		boolean myDefaultM = false;
		if (allDefault) {
			myDefault = true;
			if (ed.isAllDefault()) {
				this.click(EditInDashboardManager.ALL_DEFAULT);
				allDefaultM = false;
				myDefaultM = false;
			}
		} else {
			myDefault = this.findElement(EditInDashboardManager.MY_DEFAULT)
					.isSelected();
			if (ed.isAllDefault()) {
				this.click(EditInDashboardManager.ALL_DEFAULT);
				allDefaultM = true;
				myDefaultM = true;
			}
			if (ed.isMyDefault()) {
				this.click(EditInDashboardManager.MY_DEFAULT);
				myDefaultM = true;
			}
		}
		this.sleep(3000);
		switch (ed.getButton()) {
		case 1: {
			this.click(EditInDashboardManager.OK);
			allDefault = allDefaultM;
			myDefault = myDefaultM;
			dashboardName = rename;
			break;
		}
		case 2: {
			this.click(EditInDashboardManager.CANCEL);
			break;
		}
		}
		this.switchTab();
		Common c = new Common();
		c.login(USERID, PASSWORD);
		if (allDefault == true)
			this.assertElementExists(DashboardManagerUI
					.getReportTitleElementByName(dashboardName));
		else
			this.assertElementNotExists(DashboardManagerUI
					.getReportTitleElementByName(dashboardName));
		c.login("yluo", "321");
		if (myDefault == true)
			this.assertElementExists(DashboardManagerUI
					.getReportTitleElementByName(dashboardName));
		else
			this.assertElementNotExists(DashboardManagerUI
					.getReportTitleElementByName(dashboardName));
	}

	public void onMenuSharedDashboard(String dashboardName) {
		navigateToDashboardManagerIndex();
		this.waitUntilElementClickable(DashboardManagerUI.getSharedDashboardOnMenu(dashboardName));
		this.click(DashboardManagerUI.getSharedDashboardOnMenu(dashboardName));
		this.sleep(3000);
		this.assertElementExists(DashboardManagerUI
				.getSharedDashboardLinkOnTopMenu(dashboardName));
	}

	public void disOnMenuSharedDashboard(String dashboardName) {
		navigateToDashboardManagerIndex();
		this.waitUntilElementClickable(DashboardManagerUI.getSharedDashboardOnMenu(dashboardName));
		this.click(DashboardManagerUI.getSharedDashboardOnMenu(dashboardName));
		this.sleep(3000);
		this.assertElementNotExists(DashboardManagerUI
				.getSharedDashboardLinkOnTopMenu(dashboardName));
	}

	public void scheduleMyDashboard(String dashboardName, Scheduled schedule) {
		navigateToDashboardManagerIndex();
		this.waitUntilElementClickable(DashboardManagerUI
				.getMyDashboardScheduled(dashboardName));
		this.click(DashboardManagerUI.getMyDashboardScheduled(dashboardName));
		this.sleep(3000);
		this.switchTab();
		this.sleep(3000);
		setScheduleName(schedule);
		setScheduleFormat(schedule);
		int lan = schedule.getLanguage();
		if (lan != 0)
		{
			this.waitUntilElementClickable(AdvancedDeliveryOptions.getLanguageByNum(lan));
			this.click(AdvancedDeliveryOptions.getLanguageByNum(lan));
		}
		if (schedule.isDigitalSignature())
		{
			this.waitUntilElementClickable(AdvancedDeliveryOptions.SIGNATURE);
			this.click(AdvancedDeliveryOptions.SIGNATURE);
		}
		setScheduleType(schedule);		
		if (schedule.isScheduled())
		{
			this.waitUntilElementClickable(AdvancedDeliveryOptions.SCHEDULING);
			this.click(AdvancedDeliveryOptions.SCHEDULING);
			setScheduleWhen(schedule);
		}
		if (schedule.getScheduleButton() == 1)
		{
			this.waitUntilElementClickable(AdvancedDeliveryOptions.SCHEDULED);
			this.click(AdvancedDeliveryOptions.SCHEDULED);
		}
		else
		{
			this.waitUntilElementClickable(AdvancedDeliveryOptions.CANCEL);
			this.click(AdvancedDeliveryOptions.CANCEL);
		}
		this.switchTab();
	}

	private void setScheduleWhen(Scheduled schedule) {
		switch (schedule.getWhen()) {
		case 0: {
			break;
		}
		case 1: {
			this.waitUntilElementClickable(AdvancedDeliveryOptions.NOW);
			this.click(AdvancedDeliveryOptions.NOW);
			break;
		}
		case 2: {
			this.waitUntilElementClickable(AdvancedDeliveryOptions.LATER);
			this.click(AdvancedDeliveryOptions.LATER);

			setScheduleFrequency(schedule);

			if (schedule.getStartOn() != null) {
				this.clear(AdvancedDeliveryOptions.STARTING_ON);
				this.type(AdvancedDeliveryOptions.STARTING_ON, schedule
						.getStartOn());
			}
			if (schedule.getTime() != 0)
			{
				this.waitUntilElementClickable(AdvancedDeliveryOptions.getTimeOfDayByNum(schedule
						.getTime()));
				this.click(AdvancedDeliveryOptions.getTimeOfDayByNum(schedule
						.getTime()));
			}
			setScheduleEnd(schedule);
			break;
		}
		}
	}

	private void setScheduleEnd(Scheduled schedule) {
		switch (schedule.getEnd()) {
		case 1: {
			this.waitUntilElementClickable(AdvancedDeliveryOptions.END_NEVER);
			this.click(AdvancedDeliveryOptions.END_NEVER);
			break;
		}
		case 2: {
			this.waitUntilElementClickable(AdvancedDeliveryOptions.END_AFTER);
			this.click(AdvancedDeliveryOptions.END_AFTER);
			if (schedule.getEndAfter() != null) {
				this.clear(AdvancedDeliveryOptions.END_AFTER_OCCURRENCE);
				this.type(AdvancedDeliveryOptions.END_AFTER_OCCURRENCE,
						schedule.getEndAfter());
			}
			break;
		}
		case 3: {
			this.waitUntilElementClickable(AdvancedDeliveryOptions.END_ON);
			this.click(AdvancedDeliveryOptions.END_ON);
			if (schedule.getEndOn() != null) {
				this.clear(AdvancedDeliveryOptions.END_ON_DATE);
				this.type(AdvancedDeliveryOptions.END_ON_DATE, schedule
						.getEndOn());
			}
			break;
		}
		}
	}

	private void setScheduleFrequency(Scheduled schedule) {
		switch (schedule.getHowOften()) {
		case 0: {
			break;
		}
		case 1: {
			
			this.selectByIndex(AdvancedDeliveryOptions.FREQUENCY, 0);
//			
//			this.waitUntilElementClickable(AdvancedDeliveryOptions.HOURLY);
//			this.click(AdvancedDeliveryOptions.HOURLY);
			if (schedule.getEveryX() != null) {
				this.clear(AdvancedDeliveryOptions.HOURLY_RECUR);
				this.type(AdvancedDeliveryOptions.HOURLY_RECUR, schedule
						.getEveryX());
			}
			break;
		}
		case 2: {
			this.selectByIndex(AdvancedDeliveryOptions.FREQUENCY, 1);
//			this.waitUntilElement(AdvancedDeliveryOptions.DAILY);
//			this.click(AdvancedDeliveryOptions.DAILY);
			switch (schedule.getEveryRadio()) {
			case 1: {
				this.waitUntilElementClickable(AdvancedDeliveryOptions.DAILY_RADIO_1);
				this.click(AdvancedDeliveryOptions.DAILY_RADIO_1);
				if (schedule.getEveryX() != null) {
					this.clear(AdvancedDeliveryOptions.DAILY_RECUR);
					this.type(AdvancedDeliveryOptions.DAILY_RECUR, schedule
							.getEveryX());
				}
				break;
			}
			case 2: {
				this.waitUntilElementClickable(AdvancedDeliveryOptions.DAILY_RADIO_2);
				this.click(AdvancedDeliveryOptions.DAILY_RADIO_2);
				break;
			}
			}
			break;
		}
		case 3: {
			this.selectByIndex(AdvancedDeliveryOptions.FREQUENCY, 2);
//			this.waitUntilElementClickable(AdvancedDeliveryOptions.WEEKLY);
//			this.click(AdvancedDeliveryOptions.WEEKLY);
			if (schedule.getEveryX() != null) {
				this.clear(AdvancedDeliveryOptions.WEEKLY_RECUR);
				this.type(AdvancedDeliveryOptions.WEEKLY_RECUR, schedule
						.getEveryX());
			}
			if (schedule.getDayOfWeek() != 0)
			{
				this.waitUntilElementClickable(AdvancedDeliveryOptions
						.getWeeklyDayOfWeekByNum(schedule.getDayOfWeek()));
				this.click(AdvancedDeliveryOptions
						.getWeeklyDayOfWeekByNum(schedule.getDayOfWeek()));
			}
			break;
		}
		case 4: {
			this.selectByIndex(AdvancedDeliveryOptions.FREQUENCY, 3);
//			this.waitUntilElementClickable(AdvancedDeliveryOptions.MONTHLY);
//			this.click(AdvancedDeliveryOptions.MONTHLY);
			scheduleMonthly(schedule);
			break;
		}
		case 5: {
			this.selectByIndex(AdvancedDeliveryOptions.FREQUENCY, 4);
//			this.waitUntilElementClickable(AdvancedDeliveryOptions.YEARLY);
//			this.click(AdvancedDeliveryOptions.YEARLY);
			scheduleYearly(schedule);
			break;
		}
		}
	}

	private void scheduleYearly(Scheduled schedule) {
		switch (schedule.getEveryRadio()) {
		case 1: {
			this.waitUntilElementClickable(AdvancedDeliveryOptions.YEARLY_RADIO_1);
			this.click(AdvancedDeliveryOptions.YEARLY_RADIO_1);
			if (schedule.getMonth() != 0)
				this.click(AdvancedDeliveryOptions
						.getYearlyDayMonthByNum(schedule.getMonth()));
			if (schedule.getTh() != 0)
				this.click(AdvancedDeliveryOptions
						.getYearlyDayOfMonthByNum(schedule.getTh()));
			break;
		}
		case 2: {
			this.waitUntilElementClickable(AdvancedDeliveryOptions.YEARLY_RADIO_2);
			this.click(AdvancedDeliveryOptions.YEARLY_RADIO_2);
			if (schedule.getTh() != 0)
				this.click(AdvancedDeliveryOptions
						.getYearlySequenceByNum(schedule.getTh()));
			if (schedule.getDayOfWeek() != 0)
				this.click(AdvancedDeliveryOptions
						.getYearlyDayOfWeekByNum(schedule.getDayOfWeek()));
			if (schedule.getMonth() != 0)
				this.click(AdvancedDeliveryOptions
						.getYearlyWeekMonthByNum(schedule.getMonth()));
			break;
		}
		}
	}

	private void scheduleMonthly(Scheduled schedule) {
		switch (schedule.getEveryRadio()) {
		case 1: {
			this.waitUntilElementClickable(AdvancedDeliveryOptions.MONTHLY_RADIO_1);
			this.click(AdvancedDeliveryOptions.MONTHLY_RADIO_1);
			if (schedule.getTh() != 0)
			{
				this.waitUntilElement(AdvancedDeliveryOptions
						.getMonthlyDayOfMonthByNum(schedule.getTh()));
				this.click(AdvancedDeliveryOptions
						.getMonthlyDayOfMonthByNum(schedule.getTh()));
			}
			if (schedule.getEveryX() != null) {
				this.clear(AdvancedDeliveryOptions.MONTHLY_RECUR_BY_DAY);
				this.type(AdvancedDeliveryOptions.MONTHLY_RECUR_BY_DAY,
						schedule.getEveryX());
			}
			break;
		}
		case 2: {
			this.waitUntilElementClickable(AdvancedDeliveryOptions.MONTHLY_RADIO_2);
			this.click(AdvancedDeliveryOptions.MONTHLY_RADIO_2);
			if (schedule.getTh() != 0)
			{
				this.waitUntilElementClickable(AdvancedDeliveryOptions
						.getMonthlySequenceByNum(schedule.getTh()));
				this.click(AdvancedDeliveryOptions
						.getMonthlySequenceByNum(schedule.getTh()));
			}
			if (schedule.getDayOfWeek() != 0)
			{
				this.waitUntilElementClickable(AdvancedDeliveryOptions
						.getMonthlyDayOfWeekByNum(schedule.getDayOfWeek()));
				this.click(AdvancedDeliveryOptions
						.getMonthlyDayOfWeekByNum(schedule.getDayOfWeek()));
			}
			if (schedule.getEveryX() != null) {
				this.clear(AdvancedDeliveryOptions.MONTHLY_RECUR_BY_WEEK);
				this.type(AdvancedDeliveryOptions.MONTHLY_RECUR_BY_WEEK,
						schedule.getEveryX());
			}
			break;
		}
		}
	}

	private void setScheduleType(Scheduled schedule) {
		switch (schedule.getType()) {
		case 0: {
			setScheduleEmailDestination(schedule);
			break;
		}
		case 1: {
			this.waitUntilElementClickable(AdvancedDeliveryOptions.DESTINATION_EMAIL);
			this.click(AdvancedDeliveryOptions.DESTINATION_EMAIL);
			setScheduleEmailDestination(schedule);
			break;
		}
		case 2: {
			setScheduleFTPDestination(schedule);
			break;
		}
		}
	}

	private void setScheduleEmailDestination(Scheduled schedule) {
		String[] email = schedule.getDestination();
		if (email != null) {
			if (email[0] != null) {
				this.clear(AdvancedDeliveryOptions.DESTINATION_EMAIL_To);
				this.type(AdvancedDeliveryOptions.DESTINATION_EMAIL_To,
						email[0]);
			}
			if (email[1] != null) {
				this.clear(AdvancedDeliveryOptions.DESTINATION_EMAIL_FROM);
				this.type(AdvancedDeliveryOptions.DESTINATION_EMAIL_FROM,
						email[1]);
			}
			if (email[2] != null) {
				this.clear(AdvancedDeliveryOptions.DESTINATION_EMAIL_SUBJECT);
				this.type(AdvancedDeliveryOptions.DESTINATION_EMAIL_SUBJECT,
						email[2]);
			}
			if (email[3] != null) {
				this.clear(AdvancedDeliveryOptions.DESTINATION_EMAIL_NOTES);
				this.type(AdvancedDeliveryOptions.DESTINATION_EMAIL_NOTES,
						email[3]);
			}
			setSchedulePublishingList(schedule);
		}
	}

	private void setScheduleFTPDestination(Scheduled schedule) {
		this.waitUntilElementClickable(AdvancedDeliveryOptions.DESTINATION_FTP);
		this.click(AdvancedDeliveryOptions.DESTINATION_FTP);
		String[] ftp = schedule.getDestination();
		if (ftp != null) {
			if (ftp[0] != null) {
				this.clear(AdvancedDeliveryOptions.DESTINATION_FTP_HOST);
				this.type(AdvancedDeliveryOptions.DESTINATION_FTP_HOST, ftp[0]);
			}
			if (ftp[1] != null) {
				this.clear(AdvancedDeliveryOptions.DESTINATION_FTP_PORT);
				this.type(AdvancedDeliveryOptions.DESTINATION_FTP_PORT, ftp[1]);
			}
			if (ftp[2] != null) {
				this.clear(AdvancedDeliveryOptions.DESTINATION_FTP_DIRECTORY);
				this.type(AdvancedDeliveryOptions.DESTINATION_FTP_DIRECTORY,
						ftp[2]);
			}
			if (ftp[3] != null) {
				this.clear(AdvancedDeliveryOptions.DESTINATION_FTP_USERNAME);
				this.type(AdvancedDeliveryOptions.DESTINATION_FTP_USERNAME,
						ftp[3]);
			}
			if (ftp[4] != null) {
				this.clear(AdvancedDeliveryOptions.DESTINATION_FTP_PASSWORD);
				this.type(AdvancedDeliveryOptions.DESTINATION_FTP_PASSWORD,
						ftp[4]);
			}
		}
	}

	private void setSchedulePublishingList(Scheduled schedule) {
		String[] lists = schedule.getPublishingListName();
		if (lists != null) {
			this.click(AdvancedDeliveryOptions.DESTINATION_EMAIL_LIST);
			for (int i = 0; i < lists.length; i++) {
				this.click(AdvancedDeliveryOptions
						.getPublishingListsByName(lists[i]));
			}
			if (schedule.getListButton() == 1)
				this.click(AdvancedDeliveryOptions.DESTINATION_EMAIL_LIST_SAVE);
			else
				this.click(AdvancedDeliveryOptions.DESTINATION_EMAIL_LIST_CANCEL);
		}
	}

	private void setScheduleFormat(Scheduled schedule) {
		switch (schedule.getFormat()) {
		case 0: {
			boolean[] formatCheckbox = schedule.getFormatCheckbox();
			if (formatCheckbox != null)
				for (int i = 0; i < formatCheckbox.length; i++) {
					if (formatCheckbox[i])
						this.click(AdvancedDeliveryOptions
								.getFormatCheckboxByNum(i + 1));
				}
			break;
		}
		case 1: {
			this.click(AdvancedDeliveryOptions.FORMAT_PDF);
			boolean[] formatCheckbox = schedule.getFormatCheckbox();
			if (formatCheckbox != null)
				for (int i = 0; i < formatCheckbox.length; i++) {
					if (formatCheckbox[i])
						this.click(AdvancedDeliveryOptions
								.getFormatCheckboxByNum(i + 1));
				}
			break;
		}
		case 2: {
			this.waitUntilElementClickable(AdvancedDeliveryOptions.FORMAT_HTML);
			this.click(AdvancedDeliveryOptions.FORMAT_HTML);
			break;
		}
		}
	}

	private void setScheduleName(Scheduled schedule) {
		switch (schedule.getName()) {
		case 0:
			break;
		case 1: {
			this.selectByIndex(AdvancedDeliveryOptions.NAME, 0);
//			this
//					.waitUntilElementClickable(AdvancedDeliveryOptions.NAME_DEFAULT);
//			this.click(AdvancedDeliveryOptions.NAME_DEFAULT);
			break;
		}
		case 2: {
			this.selectByIndex(AdvancedDeliveryOptions.NAME, 1);
			//this.click(AdvancedDeliveryOptions.NAME_CUSTOM);
			this.clear(AdvancedDeliveryOptions.NAME_TEXT);
			this.type(AdvancedDeliveryOptions.NAME_TEXT, schedule
					.getCustormName());
			if (schedule.isAppendDate())
				this.click(AdvancedDeliveryOptions.NAME_APPEND);
			break;
		}
		}
	}

	public void viewArchiveSharedDashboard(String dashboardName) {
		navigateToDashboardManagerIndex();
		this.click(DashboardManagerUI
				.getSharedDashboardViewArchive(dashboardName));
		// this.assertElementExists(null);
	}

	public void viewArchiveMyDashboard(String dashboardName) {
		navigateToDashboardManagerIndex();
		this.click(DashboardManagerUI.getMyDashboardViewArchive(dashboardName));
		// this.assertElementExists(null);
	}

}
