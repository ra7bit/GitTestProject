package com.omniture.uiautomation.report.pages;

import com.omniture.uiautomation.report.ui.ReportUI;
import com.omniture.uiautomation.report.ui.VisitorRetentionUI;

/*
 * @author yluo
 */

public class VisitorRetentionPage extends ReportPage {
    private ReportPage tmpReport = new ReportPage();
    public void assertReturnFrequencyReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(ReportUI.VISITOR_RETENTION_FOLDER,
                VisitorRetentionUI.RETURN_FREQUENCY_REPORT, "Return Frequency Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertReturnVisitsReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(ReportUI.VISITOR_RETENTION_FOLDER,
                VisitorRetentionUI.RETURN_VISITS_REPORT, "Return Visits Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertDailyReturnVisitsReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(ReportUI.VISITOR_RETENTION_FOLDER,
                VisitorRetentionUI.DAILY_RETURN_VISITS_REPORT, "Daily Return Visits Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertVisitNumberReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(ReportUI.VISITOR_RETENTION_FOLDER,
                VisitorRetentionUI.VISIT_NUMBER_REPORT, "Visit Number Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertCustomerLoyaltyReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.VISITOR_RETENTION_FOLDER, VisitorRetentionUI.SALES_CYCLE_FOLDER,
                VisitorRetentionUI.CUSTOMER_LOYALTY_REPORT, "Customer Loyalty Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertDailyBeforeFirstPurchaseReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.VISITOR_RETENTION_FOLDER, VisitorRetentionUI.SALES_CYCLE_FOLDER,
                VisitorRetentionUI.DAYS_BEFORE_FIRST_PURCHASE_REPORT, "Days Before First Purchase Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertDailyUniqueCustomersReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.VISITOR_RETENTION_FOLDER, VisitorRetentionUI.SALES_CYCLE_FOLDER,
                VisitorRetentionUI.DAILY_UNIQUE_CUSTOMERS_REPORT, "Daily Unique Customers");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertWeeklyUniqueCustomersReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.VISITOR_RETENTION_FOLDER, VisitorRetentionUI.SALES_CYCLE_FOLDER,
                VisitorRetentionUI.WEEKLY_UNIQUE_CUSTOMERS_REPORT, "Weekly Unique Customers");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertMonthlyUniqueCustomersReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.VISITOR_RETENTION_FOLDER, VisitorRetentionUI.SALES_CYCLE_FOLDER,
                VisitorRetentionUI.MONTHLY_UNIQUE_CUSTOMERS_REPORT, "Monthly Unique Customers");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertQuarterlyUniqueCustomersReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.VISITOR_RETENTION_FOLDER, VisitorRetentionUI.SALES_CYCLE_FOLDER,
                VisitorRetentionUI.QUARTERLY_UNIQUE_CUSTOMERS_REPORT, "Quarterly Unique Customers");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertYearlyUniqueCustomersReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.VISITOR_RETENTION_FOLDER, VisitorRetentionUI.SALES_CYCLE_FOLDER,
                VisitorRetentionUI.YEARLY_UNIQUE_CUSTOMERS_REPORT, "Yearly Unique Customers");
        this.tmpReport.folderSubFolderReportTitle();
    }
}
