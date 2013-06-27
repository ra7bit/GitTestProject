package com.omniture.uiautomation.report.pages;

import com.omniture.uiautomation.report.ui.ReportUI;
import com.omniture.uiautomation.report.ui.SiteMetricsUI;

/*
 * @author yluo
 */

public class SiteMetricsPage extends ReportPage {
    private ReportPage tmpReport = new ReportPage();
/*    public void assertKeyMetricsLoad() {
        this.tmpReport.setFolderReportTitle(
                ReportUI.SITE_METRICS_FOLDER, SiteMetricsUI.KEY_METRICS_REPORT, "Key Metrics Report");
        this.tmpReport.folderReportTitle();
    }*/
    public void assertPageViewsReportLoad() {
        tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(
                ReportUI.SITE_METRICS_FOLDER, SiteMetricsUI.PAGE_VIEWS_REPORT, "Page Views Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertVisitReportLoad() {
        tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(
                ReportUI.SITE_METRICS_FOLDER, SiteMetricsUI.VISITS_REPORT, "Visits Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertUniqueVisitorsReportLoad() {
        tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.SITE_METRICS_FOLDER, SiteMetricsUI.UNIQUE_VISITOR_FOLDER,
                SiteMetricsUI.UNIQUE_VISITOR_REPORT, "Unique Visitors Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertHourlyUniqueVisitorsReportLoad() {
        tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.SITE_METRICS_FOLDER, SiteMetricsUI.UNIQUE_VISITOR_FOLDER,
                SiteMetricsUI.HOURLY_UNIQUE_VISITOR_REPORT, "Hourly Unique Visitors Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertDailyUniqueVisitorsReportLoad() {
        tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.SITE_METRICS_FOLDER, SiteMetricsUI.UNIQUE_VISITOR_FOLDER,
                SiteMetricsUI.DAILY_UNIQUE_VISITOR_REPORT, "Daily Unique Visitors Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertMonthlyUniqueVisitorsReportLoad() {
        tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.SITE_METRICS_FOLDER, SiteMetricsUI.UNIQUE_VISITOR_FOLDER,
                SiteMetricsUI.MONTHLY_UNIQUE_VISITOR_REPORT, "Monthly Unique Visitors Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertQuaterlyUniqueVisitorsReportLoad() {
        tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.SITE_METRICS_FOLDER, SiteMetricsUI.UNIQUE_VISITOR_FOLDER,
                SiteMetricsUI.QUARTERLY_UNIQUE_VISITOR_REPORT, "Quarterly Unique Visitors Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertYearlyUniqueVisitorsReportLoad() {
        tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.SITE_METRICS_FOLDER, SiteMetricsUI.UNIQUE_VISITOR_FOLDER,
                SiteMetricsUI.YEARLY_UNIQUE_VISITOR_REPORT, "Yearly Unique Visitors Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertTimeSpentPerVisitReportLoad() {
        tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(
                ReportUI.SITE_METRICS_FOLDER,
                SiteMetricsUI.TIME_SPENT_PER_VISIT_REPORT, "Time Spent per Visit Report");
        this.tmpReport.folderReportTitle();
    }
}
