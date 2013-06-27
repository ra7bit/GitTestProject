package com.omniture.uiautomation.report.pages;

import com.omniture.uiautomation.report.ui.ReportUI;
import com.omniture.uiautomation.report.ui.VisitorProfileUI;

/*
 * @author yluo
 */

public class VisitorProfilePage  extends ReportPage {
    private ReportPage tmpReport = new ReportPage();
    public void assertCountriesReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.VISITOR_PROFILE_FOLDER, VisitorProfileUI.GEOSEGMENTATION_FOLDER,
                VisitorProfileUI.COUNTRIES_REPORT, "Countries Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertRegionsReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.VISITOR_PROFILE_FOLDER, VisitorProfileUI.GEOSEGMENTATION_FOLDER,
                VisitorProfileUI.REGIONS_REPORT, "Regions Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertCitiesReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.VISITOR_PROFILE_FOLDER, VisitorProfileUI.GEOSEGMENTATION_FOLDER,
                VisitorProfileUI.CITIES_REPORT, "Cities Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertUSStatesReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.VISITOR_PROFILE_FOLDER, VisitorProfileUI.GEOSEGMENTATION_FOLDER,
                VisitorProfileUI.US_STATES_REPORT, "U.S. States Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertUSDMAReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.VISITOR_PROFILE_FOLDER, VisitorProfileUI.GEOSEGMENTATION_FOLDER,
                VisitorProfileUI.US_DMA_REPORT, "U.S. DMA Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertLanguagesReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(ReportUI.VISITOR_PROFILE_FOLDER,
                VisitorProfileUI.LANGUAGES_REPORT, "Languages Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertDomainsReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(ReportUI.VISITOR_PROFILE_FOLDER,
                VisitorProfileUI.DOMAINS_REPORT, "Domains Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertTopLevelDomainsReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(ReportUI.VISITOR_PROFILE_FOLDER,
                VisitorProfileUI.TOP_LEVEL_DOMAINS_REPORT, "Top Level Domains Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertBrowserTypesReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.VISITOR_PROFILE_FOLDER, VisitorProfileUI.TECHNOLOGY_FOLDER,
                VisitorProfileUI.BROWSERS_TYPES_REPORT, "Browser Types Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertBrowsersReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.VISITOR_PROFILE_FOLDER, VisitorProfileUI.TECHNOLOGY_FOLDER,
                VisitorProfileUI.BROWSERS_REPORT, "Browsers Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertBrowserWidthReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.VISITOR_PROFILE_FOLDER, VisitorProfileUI.TECHNOLOGY_FOLDER,
                VisitorProfileUI.BROWSERS_WIDTH_REPORT, "Browser Width Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertBrowserHeightReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.VISITOR_PROFILE_FOLDER, VisitorProfileUI.TECHNOLOGY_FOLDER,
                VisitorProfileUI.BROWSERS_HEIGHT_REPORT, "Browser Height Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertOperationSystemsReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.VISITOR_PROFILE_FOLDER, VisitorProfileUI.TECHNOLOGY_FOLDER,
                VisitorProfileUI.OPERATING_SYSTEM_REPORT, "Operating Systems Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertMonitorColorDepthsReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.VISITOR_PROFILE_FOLDER, VisitorProfileUI.TECHNOLOGY_FOLDER,
                VisitorProfileUI.MONITOR_COLOR_DEPTHS_REPORT, "Monitor Color Depths Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertJavaReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.VISITOR_PROFILE_FOLDER, VisitorProfileUI.TECHNOLOGY_FOLDER,
                VisitorProfileUI.JAVA_REPORT, "Java Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertJavascriptReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.VISITOR_PROFILE_FOLDER, VisitorProfileUI.TECHNOLOGY_FOLDER,
                VisitorProfileUI.JAVASCRIPT_REPORT, "JavaScript Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertCookiesReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.VISITOR_PROFILE_FOLDER, VisitorProfileUI.TECHNOLOGY_FOLDER,
                VisitorProfileUI.COOKIES_REPORT, "Cookies Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertConnectionTypesReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.VISITOR_PROFILE_FOLDER, VisitorProfileUI.TECHNOLOGY_FOLDER,
                VisitorProfileUI.CONNECTION_TYPES_REPORT, "Connection Types Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertMobileCarrierReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.VISITOR_PROFILE_FOLDER, VisitorProfileUI.TECHNOLOGY_FOLDER,
                VisitorProfileUI.MOBILE_CARRIER_REPORT, "Mobile Carrier Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertJavascriptVersionReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.VISITOR_PROFILE_FOLDER, VisitorProfileUI.TECHNOLOGY_FOLDER,
                VisitorProfileUI.JAVASCRIPT_VERSION_REPORT, "JavaScript Version Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertMonitorResolutionsReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.VISITOR_PROFILE_FOLDER, VisitorProfileUI.TECHNOLOGY_FOLDER,
                VisitorProfileUI.MONITOR_RESOLUTIONS_REPORT, "Monitor Resolutions Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertVisitorStatesReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(ReportUI.VISITOR_PROFILE_FOLDER,
                VisitorProfileUI.VISITOR_STATE_REPORT, "Visitor State Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertVisitorZipReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(ReportUI.VISITOR_PROFILE_FOLDER,
                VisitorProfileUI.VISITOR_ZIP_REPORT, "Visitor ZIP/Postal Code Report");
        this.tmpReport.folderReportTitle();
    }
}
