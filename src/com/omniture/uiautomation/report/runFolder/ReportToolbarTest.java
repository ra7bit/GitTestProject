package com.omniture.uiautomation.report.runFolder;

import org.junit.Test;
import com.omniture.uiautomation.report.Report;

/*
 * @author yluo
 */

public class ReportToolbarTest extends Report {
	/*@Test // TC_1263188
	public void pageReportDownload() {
		this.reportToolbarPage.folderReportTitle(ReportUI.SITE_CONTENT_FOLDER, SiteContentUI.PAGES_REPORT, "Pages Report");
		this.reportToolbarPage.downloadPDF();
		this.reportToolbarPage.downloadExcel();
		this.reportToolbarPage.downloadCSV();
		this.reportToolbarPage.downloadWord();
	}
	@Test // TC_1263193
	public void geoReportDownload() {
		this.reportToolbarPage.folderSubFolderReportTitle(ReportUI.VISITOR_PROFILE_FOLDER, VisitorProfileUI.GEOSEGMENTATION_FOLDER, VisitorProfileUI.COUNTRIES_REPORT, "Countries Report");
		this.reportToolbarPage.downloadPDF();
		this.reportToolbarPage.downloadExcel();
		this.reportToolbarPage.downloadCSV();
		this.reportToolbarPage.downloadWord();
	}
	@Test // TC_1271672
	public void searchKeywordAllReportDownload() {
		this.reportToolbarPage.folderReportTitle(ReportUI.TRAFFIC_SOURCES_FOLDER, TrafficSourcesUI.SEARCH_KEYWORDS_ALL_REPORT, "Search Keywords - All Report");
		this.reportToolbarPage.downloadPDF();
		this.reportToolbarPage.downloadExcel();
		this.reportToolbarPage.downloadCSV();
		this.reportToolbarPage.downloadWord();
	}
	@Test //TC_1271895
	public void pageviewsReportDownload() {
		this.reportToolbarPage.folderReportTitle(ReportUI.SITE_METRICS_FOLDER, SiteMetricsUI.PAGE_VIEWS_REPORT, "Page Views Report");
		this.reportToolbarPage.downloadPDF();
		this.reportToolbarPage.downloadExcel();
		this.reportToolbarPage.downloadCSV();
		this.reportToolbarPage.downloadWord();
	}
	@Test //TC_1263192
	public void campaignsFunnelReportDownload() {
		this.reportToolbarPage.folderReportTitle(ReportUI.CAMPAIGNS_FOLDER, CampaignsUI.CAMPAIGNS_CONVERION_FUNNEL_REPORT, "Campaign Conversion Funnel");
		this.reportToolbarPage.downloadPDF();
		this.reportToolbarPage.downloadExcel();
		this.reportToolbarPage.downloadCSV();
		this.reportToolbarPage.downloadWord();
	}
	@Test //TC_1263191
	public void productsReportDownload() {
		this.reportToolbarPage.folderReportTitle(ReportUI.PRODUCTS_FOLDER, ProductUI.PRODUCTS_REPORT, "Products Report");
		this.reportToolbarPage.downloadPDF();
		this.reportToolbarPage.downloadExcel();
		this.reportToolbarPage.downloadCSV();
		this.reportToolbarPage.downloadWord();
	}
	@Test //TC_1271670
	public void nextPageFlowReportDownload() {
		this.reportToolbarPage.folderReportTitle(ReportUI.PATHS_FOLDER, PathsUI.NEXT_PAGE_FLOW_REPORT, "Next Page Flow Report");
		this.reportToolbarPage.downloadPDF();
		this.reportToolbarPage.downloadExcel();
		this.reportToolbarPage.downloadWord();
	}
	//@Test //TC_1263195
	//public void videoOverviewReportDownload() {
	//}
	@Test // TC_1271894
	public void pageviewsReportAdvancedDownload() {
		this.reportToolbarPage.folderReportTitle(ReportUI.SITE_METRICS_FOLDER, SiteMetricsUI.PAGE_VIEWS_REPORT, "Page Views Report");
		this.reportToolbarPage.advancedDownloadPDF("testpdf", "testpdf.pdf", false);
		this.reportToolbarPage.advancedDownloadExcel("testxls", "testxls.zip", true);
		this.reportToolbarPage.advancedDownloadCSV("testcsv", "testcsv.csv", false);
		this.reportToolbarPage.advancedDownloadWord("testrtf", "testrtf.zip", true);
	}
	@Test
	public void campaignsFunnelsReportAdvancedDownload() {
		this.reportToolbarPage.folderReportTitle(ReportUI.CAMPAIGNS_FOLDER, CampaignsUI.CAMPAIGNS_CONVERION_FUNNEL_REPORT, "Campaign Conversion Funnel");
		this.reportToolbarPage.advancedDownloadPDF("testpdf", "testpdf.zip", true);
		this.reportToolbarPage.advancedDownloadExcel("testxls", "testxls.xls", false);
		this.reportToolbarPage.advancedDownloadCSV("testcsv", "testcsv.zip", true);
		this.reportToolbarPage.advancedDownloadWord("testrtf", "testrtf.rtf", false);
	}
	@Test
	public void previousPageReportAdvancedDownload() {
		this.reportToolbarPage.folderReportTitle(ReportUI.PATHS_FOLDER, PathsUI.PREVIOUS_PAGE_FLOW_REPORT, "Previous Page Flow Report");
		this.reportToolbarPage.advancedDownloadPDF("testpdf", "testpdf.pdf", false);
		this.reportToolbarPage.advancedDownloadExcel("testxls", "testxls.zip", true);
		this.reportToolbarPage.advancedDownloadCSV("testcsv", "testcsv.csv", false);
		this.reportToolbarPage.advancedDownloadWord("testrtf", "testrtf.zip", true);
	}
	@Test
	public void regionReportAdvacedDownload() {
		this.reportToolbarPage.folderSubFolderReportTitle(ReportUI.VISITOR_PROFILE_FOLDER, VisitorProfileUI.GEOSEGMENTATION_FOLDER, VisitorProfileUI.REGIONS_REPORT, "Regions Report");
		this.reportToolbarPage.advancedDownloadPDF("testpdf", "testpdf.zip", true);
		this.reportToolbarPage.advancedDownloadExcel("testxls", "testxls.xls", false);
		this.reportToolbarPage.advancedDownloadCSV("testcsv", "testcsv.zip", true);
		this.reportToolbarPage.advancedDownloadWord("testrtf", "testrtf.rtf", false);
	}
	@Test
	public void dailyReturnVisitsAdvancedDownload() {
		this.reportToolbarPage.folderReportTitle(ReportUI.VISITOR_RETENTION_FOLDER, VisitorRetentionUI.DAILY_RETURN_VISITS_REPORT, "Daily Return Visits Report");
		this.reportToolbarPage.advancedDownloadPDF("testpdf", "testpdf.pdf", false);
		this.reportToolbarPage.advancedDownloadExcel("testxls", "testxls.zip", true);
		this.reportToolbarPage.advancedDownloadCSV("testcsv", "testcsv.csv", false);
		this.reportToolbarPage.advancedDownloadWord("testrtf", "testrtf.zip", true);
	}*/
	@Test //TC_1271892
    public void pagesReportExtractData() {
		this.siteContentPage.assertPagesReportLoad();
		this.reportToolbarPage.extractDataPopUpWindow();
		this.reportToolbarPage.extractDataNextButtonClick();
		this.reportToolbarPage.extractDataSendClick();
	}
	@Test //TC_1271892
	public void searchKeywordAllReportExtractData() {
		this.trafficSourcesPage.assertSearchKeywordsAllReportLoad();
		this.reportToolbarPage.extractDataPopUpWindow();
		this.reportToolbarPage.extractDataUpdate_Z("date");
		this.reportToolbarPage.extractDateChooseDateShowBy("Day");
		this.reportToolbarPage.extractDateChooseDateRange("This year");
		this.reportToolbarPage.extractDateChooseDateOK();
		this.reportToolbarPage.extractDataNextButtonClick();
		this.reportToolbarPage.extractDataSendClick();
	}
	@Test //TC_1271890
	public void productsReportExtractData() {
		this.productPage.assertProductsReportLoad();
		this.reportToolbarPage.extractDataPopUpWindow();
		this.reportToolbarPage.extractDataNextButtonClick();
		this.reportToolbarPage.extractDataBookmark();
		this.reportToolbarPage.extractDataSendClick();
		this.reportToolbarPage.checkBookmarkExist("yluo-auto-dataExtract", "yluo-auto-dataExtract");
	}
	@Test //TC_1271891
	public void visitsNumberExtractDataFilterDate() {
		this.visitorRetentionPage.assertVisitNumberReportLoad();
		this.reportToolbarPage.extractDataPopUpWindow();
		this.reportToolbarPage.extractDataUpdate_Z("date");
		this.reportToolbarPage.extractDateChooseDateShowBy("Month");
		this.reportToolbarPage.extractDateChooseDateRange("This month");
		this.reportToolbarPage.extractDateChooseDateOK();
		this.reportToolbarPage.extractDataNextButtonClick();
		this.reportToolbarPage.extractDataSendClick();
	}
	@Test //TC_1271891
	public void visitsNumberExtractDataFilterMetrics() {
	    this.visitorRetentionPage.assertVisitNumberReportLoad();
	    this.reportToolbarPage.extractDataPopUpWindow();
	    this.reportToolbarPage.extractDataType_Z("metric");
	    this.reportToolbarPage.extractDataUpdate_Z("metrics");
	    this.reportToolbarPage.extractDataMetricsAdd("Visits");
	    this.reportToolbarPage.extractDataMetricsAdd("Revenue");
	    this.reportToolbarPage.extractDataMetricsAdd("Orders");
	    this.reportToolbarPage.extracDataMetricsRemove("Carts");
	    this.reportToolbarPage.extractDataMetricsClickOK();
	    this.reportToolbarPage.extractDataNextButtonClick();
	    this.reportToolbarPage.extractDataSendClick();
	    }
    @Test //TC_1271891
    public void visitsNumberExtractDataFilterVisitNumber() {
        this.visitorRetentionPage.assertVisitNumberReportLoad();
	    this.reportToolbarPage.extractDataPopUpWindow();
		this.reportToolbarPage.extractDataType_Z("item");
		this.reportToolbarPage.extractDataUpdate_Z("item");
		this.reportToolbarPage.extractDataItemInputTop("100", "2");
		this.reportToolbarPage.extractDataItemClickOk();
		this.reportToolbarPage.extractDataNextButtonClick();
	    this.reportToolbarPage.extractDataSendClick();
	}
    @Test //TC_1271889
    public void ExtractDataAdvancedDeliver() {
        
    }
}
