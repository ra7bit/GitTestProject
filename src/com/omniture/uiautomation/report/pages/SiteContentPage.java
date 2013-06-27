package com.omniture.uiautomation.report.pages;

import com.omniture.uiautomation.report.ui.ReportUI;
import com.omniture.uiautomation.report.ui.SiteContentUI;

/*
 * @author yluo
 */

public class SiteContentPage extends ReportPage {
    private ReportPage tmpReport = new ReportPage();
    public void assertPagesReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(
                ReportUI.SITE_CONTENT_FOLDER, SiteContentUI.PAGES_REPORT, "Pages Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertSiteSectionsReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(
                ReportUI.SITE_CONTENT_FOLDER, SiteContentUI.SITE_SECTIONS_REPORT, "Site Sections Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertServersReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(
                ReportUI.SITE_CONTENT_FOLDER, SiteContentUI.SERVERS_REPORT, "Servers Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertExitLinksReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.SITE_CONTENT_FOLDER, SiteContentUI.LINKS_FOLDER,
                SiteContentUI.EXIT_LINKS_REPORT, "Exit Links Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertFileDownloadsReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.SITE_CONTENT_FOLDER, SiteContentUI.LINKS_FOLDER,
                SiteContentUI.FILE_DOWNLOADS_REPORT, "File Downloads Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertClickMapReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.SITE_CONTENT_FOLDER, SiteContentUI.LINKS_FOLDER,
                SiteContentUI.CLICKMAP_REPORT, "ClickMap Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertCustomLinksReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.SITE_CONTENT_FOLDER, SiteContentUI.LINKS_FOLDER,
                SiteContentUI.CUSTOM_LINKS_REPORT, "Custom Links Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertPagesNotFoundReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(
                ReportUI.SITE_CONTENT_FOLDER, SiteContentUI.PAGE_NOT_FOUND_REPORT, "Pages Not Found Report");
        this.tmpReport.folderReportTitle();
    }
}
