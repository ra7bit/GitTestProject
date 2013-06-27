package com.omniture.uiautomation.dashboard.pages;

import org.openqa.selenium.By;

import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.OmniturePage;
import com.omniture.uiautomation.report.ui.ReportToolbarUI;
import com.omniture.uiautomation.report.ui.ReportUI;
import com.omniture.uiautomation.report.ui.SiteMetricsUI;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;

/**
 * 
 * @author sbli Add Reportlet page after clicking Dashboard button at toolbar of
 *         a report.
 */
public class ReportToDashboardPage extends OmniturePage {

	// select list for location of reportlet to add
	private By place = By.xpath("//*[@id='dashboard']");

	// dashboard name item
	private By name = By
			.xpath("/html/body/div[4]/div/form/div/div/table/tbody/tr[4]/td[2]/input");

	// CreateNew button on this page.
	private By btnCreate = By.xpath("/html/body/div[4]/div/form/div[2]/input");

	// reportlet name item
	private By reportletname = By.xpath("//*[@id='bookmark_name']");

	public void navigateToHomepage() {
		this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
				+ "/p/suite/1.3/index.html?a=Dashboard.Manager&ssSession="
				+ ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
		this.waitUntilPageLoad();
		this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
				+ "/sc15/reports/index.html?a=Overview.Site&ssSession="
				+ ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
		this.waitUntilPageLoad();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void createDashboardFromReport() {
		navigateToHomepage();
		if(!this.isLogined())
		{
			this.login();
		}
		this.openReport(ReportUI.SITE_METRICS_FOLDER, SiteMetricsUI.PAGE_VIEWS_REPORT);
		
		this.waitUntilElementClickable(ReportToolbarUI.DASHBORAD_ICON);
		this.click(ReportToolbarUI.DASHBORAD_ICON);
		this.sleep(3000);
		this.switchTab();

		this.waitUntilElement(place);
		this.selectByIndex(place, 0);
		this.sleep(2000);
		this.waitUntilElement(name);
		this.type(name, "ReportToDashboard");
		this.sleep(1000);
		this.click(btnCreate);

		this.switchTab();
	}

	public void reportToDashboard() {
		navigateToHomepage();
		if(!this.isLogined())
		{
			this.login();
		}
		this.openReport(ReportUI.SITE_METRICS_FOLDER, SiteMetricsUI.PAGE_VIEWS_REPORT);
		addToDashboard("Page views Report");
	}

//	private void openReport(By folder, By subFolder, By report) {
//		this.waitUntilElementClickable(folder);
//		this.click(folder);
//		this.waitUntilElementClickable(subFolder);
//		this.click(subFolder);
//		this.waitUntilElementClickable(report);
//		this.click(report);
//		this.waitUntilPageLoad();
//	}

	private void openReport(By folder, By report) {
		this.waitUntilElementClickable(folder);
		this.click(folder);
		this.waitUntilElementClickable(report);
		this.click(report);
		this.waitUntilPageLoad();
	}

	private void addToDashboard(String reportletname) {
		this.waitUntilElementClickable(ReportToolbarUI.DASHBORAD_ICON);
		this.click(ReportToolbarUI.DASHBORAD_ICON);
		this.sleep(3000);
		this.switchTab();

		this.createFromReport(reportletname);

		this.switchTab();

	}

	private void createFromReport(String name) {

		this.waitUntilElement(reportletname);
		this.clear(reportletname);
		this.type(reportletname, name);
		this.waitUntilElement(place);

		this.selectByVisibleText(place, "ReportToDashboard");

		this.sleep(1000);
		this.click(btnCreate);
	}
}
