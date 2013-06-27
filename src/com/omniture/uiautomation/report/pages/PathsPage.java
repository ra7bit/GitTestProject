package com.omniture.uiautomation.report.pages;

import com.omniture.uiautomation.report.ui.PathsUI;
import com.omniture.uiautomation.report.ui.ReportUI;

/*
 * @author yluo
 */

public class PathsPage extends ReportPage {
    private ReportPage tmpReport = new ReportPage();
    public void assertNextPageFlowReport() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(
                ReportUI.PATHS_FOLDER, PathsUI.NEXT_PAGE_FLOW_REPORT, "Next Page Flow Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertNextPageReport() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(
                ReportUI.PATHS_FOLDER, PathsUI.NEXT_PAGE_REPORT, "Next Page Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertPreviousPageFlowReport() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(
                ReportUI.PATHS_FOLDER, PathsUI.PREVIOUS_PAGE_FLOW_REPORT, "Previous Page Flow Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertPreviousPagesReport() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(
                ReportUI.PATHS_FOLDER, PathsUI.PREVIOUS_PAGE_REPORT, "Previous Page Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertFalloutReport() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(
                ReportUI.PATHS_FOLDER, PathsUI.FALLOUT_REPORT, "Fallout Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertFullPathsReport() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(
                ReportUI.PATHS_FOLDER, PathsUI.FULL_PATHS_REPORT, "Full Paths Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertPathFinderReport() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(
                ReportUI.PATHS_FOLDER, PathsUI.PATHFINDER_REPORT, "PathFinder Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertPathLengthReport() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(ReportUI.PATHS_FOLDER, PathsUI.PATH_LENGTH_REPORT, "Path Length Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertEntryPagesReport() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.PATHS_FOLDER, PathsUI.PAGE_ANALYSIS_FOLDER,
                PathsUI.PAGE_SUMMARY_REPORT, "Page Summary Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertReloadsReport() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.PATHS_FOLDER, PathsUI.PAGE_ANALYSIS_FOLDER,
                PathsUI.RELOADS_REPORT, "Reloads Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertTimeSpentOnPageReport() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.PATHS_FOLDER, PathsUI.PAGE_ANALYSIS_FOLDER,
                PathsUI.TIME_SPENT_ON_PAGE_REPORT, "Time Spent on Page Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertClicksToPageReport() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.PATHS_FOLDER, PathsUI.PAGE_ANALYSIS_FOLDER,
                PathsUI.CLICKS_TO_PAGE_REPORT, "Clicks to Page Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertEntryPagesInEntriesReport() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.PATHS_FOLDER, PathsUI.ENTRIES_EXITS_FOLDER,
                PathsUI.ENTRY_PAGES_REPORT, "Entry Pages Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertOriginalEntryPagesInEntriesReport() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.PATHS_FOLDER, PathsUI.ENTRIES_EXITS_FOLDER,
                PathsUI.ORIGINAL_ENTRY_PAGES_REPORT, "Original Entry Pages Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertSinglePageVisitsInEntriesReport() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.PATHS_FOLDER, PathsUI.ENTRIES_EXITS_FOLDER,
                PathsUI.SINGLE_PAGE_VISITS_REPORT, "Single Page Visits Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertExitPagesInEntriesReport() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.PATHS_FOLDER, PathsUI.ENTRIES_EXITS_FOLDER,
                PathsUI.EXIT_PAGES_REPORT, "Exit Pages Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
}
