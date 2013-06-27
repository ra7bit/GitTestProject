package com.omniture.uiautomation.report.pages;

import com.omniture.uiautomation.report.ui.ReportUI;
import com.omniture.uiautomation.report.ui.TrafficSourcesUI;

/*
 * @author yluo
 */

public class TrafficSourcesPage extends ReportPage {
    private ReportPage tmpReport = new ReportPage();
    public void assertSearchKeywordsAllReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(ReportUI.TRAFFIC_SOURCES_FOLDER,
                TrafficSourcesUI.SEARCH_KEYWORDS_ALL_REPORT, "Search Keywords - All Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertSearchKeywordsPaidReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(ReportUI.TRAFFIC_SOURCES_FOLDER,
                TrafficSourcesUI.SEARCH_KEYWORDS_PAID_REPORT, "Search Keywords - Paid Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertSearchKeywordsNaturalReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(ReportUI.TRAFFIC_SOURCES_FOLDER,
                TrafficSourcesUI.SEARCH_KEYWORDS_NATURAL_REPORT, "Search Keywords - Natural Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertSearchEnginesAllReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(ReportUI.TRAFFIC_SOURCES_FOLDER,
                TrafficSourcesUI.SEARCH_ENGINES_ALL_REPORT, "Search Engines - All Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertSearchEnginesPaidReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(ReportUI.TRAFFIC_SOURCES_FOLDER,
                TrafficSourcesUI.SEARCH_ENGINES_PAID_REPORT, "Search Engines - Paid Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertSearchEnginesNaturalReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(ReportUI.TRAFFIC_SOURCES_FOLDER,
                TrafficSourcesUI.SEARCH_ENGINES_NATURAL_REPORT, "Search Engines - Natural Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertAllSearchPageRankingReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(ReportUI.TRAFFIC_SOURCES_FOLDER,
                TrafficSourcesUI.ALL_SEARCH_PAGE_RANKING_REPORT, "All Search Page Ranking Report");
    }
    public void assertReferringDomainsReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(ReportUI.TRAFFIC_SOURCES_FOLDER,
                TrafficSourcesUI.REFERRING_MOMAINS_REPORT, "Referring Domains Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertOriginalReferringDomainsReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(ReportUI.TRAFFIC_SOURCES_FOLDER,
                TrafficSourcesUI.ORIGINAL_REFERRING_MOMAINS_REPORT, "Original Referring Domains Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertReferrersReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(ReportUI.TRAFFIC_SOURCES_FOLDER,
                TrafficSourcesUI.REFERRERS_REPORT, "Referrers Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertReferrerTypesReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(ReportUI.TRAFFIC_SOURCES_FOLDER,
                TrafficSourcesUI.REFERRERS_TYPES_REPORT, "Referrer Types Report");
        this.tmpReport.folderReportTitle();
    }
}
