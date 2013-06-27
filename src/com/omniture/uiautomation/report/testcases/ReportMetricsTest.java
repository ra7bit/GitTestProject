package com.omniture.uiautomation.report.testcases;

//import org.junit.Test;
import com.omniture.uiautomation.report.Report;
import com.omniture.uiautomation.report.pages.ReportPage;
import com.omniture.uiautomation.report.ui.MobileUI;
import com.omniture.uiautomation.report.ui.ProductUI;
import com.omniture.uiautomation.report.ui.ReportHeaderUI;
import com.omniture.uiautomation.report.ui.ReportMetricsUI;
import com.omniture.uiautomation.report.ui.ReportUI;
import com.omniture.uiautomation.report.ui.SiteContentUI;
import com.omniture.uiautomation.report.ui.VisitorRetentionUI;
import org.openqa.selenium.By;

/*
 * @author yluo
 */

public class ReportMetricsTest extends Report {
	private ReportPage tmpReport = new ReportPage();
    public ReportMetricsTest() {
    	this.tmpReport.setWebDriver(this.webDriver);
    } 
    //TC_1271703 TC_1271660
    public void testDevicesReportMaxAmountMetricsScreenshot() {
//        By []reportMetricsArray = {
//                ReportMetricsUI.SITECATLYST_METRIC0, ReportMetricsUI.SITECATLYST_METRIC1,
//                ReportMetricsUI.SITECATLYST_METRIC2, ReportMetricsUI.SITECATLYST_METRIC3,
//                ReportMetricsUI.SITECATLYST_METRIC4, ReportMetricsUI.SITECATLYST_METRIC5,
//                ReportMetricsUI.SITECATLYST_METRIC6, ReportMetricsUI.SITECATLYST_METRIC7,
//                ReportMetricsUI.SITECATLYST_METRIC8};
//        this.tmpReport.setFolderReportTitle(ReportUI.SITE_CONTENT_FOLDER,
//                MobileUI.PAGE_REPORT, "Pages Report");
//        this.reportMetricsPage.reportAddMetrics(this.tmpReport,
//                reportMetricsArray, ReportHeaderUI.REPORT_SETTING_AREA_2_1_SPAN,
//                ReportMetricsUI.TOP10_PAGES_REPORT_METRICS);
        assertTrue(this.reportMetricsPage.imageCompare("1.png", 0.9));
    }
    
 
    public void testDevicesReportMaxAmountMetricsData() {
        By []reportMetricsArray = {
                ReportMetricsUI.SITECATLYST_METRIC0, ReportMetricsUI.SITECATLYST_METRIC1,
                ReportMetricsUI.SITECATLYST_METRIC2, ReportMetricsUI.SITECATLYST_METRIC3,
                ReportMetricsUI.SITECATLYST_METRIC4, ReportMetricsUI.SITECATLYST_METRIC5,
                ReportMetricsUI.SITECATLYST_METRIC6, ReportMetricsUI.SITECATLYST_METRIC7,
                ReportMetricsUI.SITECATLYST_METRIC8};
        this.tmpReport.setFolderReportTitle(ReportUI.SITE_CONTENT_FOLDER,
                MobileUI.PAGE_REPORT, "Pages Report");
        this.reportMetricsPage.reportAddMetrics(this.tmpReport,
                reportMetricsArray, ReportHeaderUI.REPORT_SETTING_AREA_2_1_SPAN,
                ReportMetricsUI.TOP10_PAGES_REPORT_METRICS);
        
        assertTrue(this.reportMetricsPage.compareText("Demo_Data_Table", this.reportMetricsPage.getTableText(By.xpath("//div[@id=\"data_table\"]/table")), false, "Demo_Data_Table"));
    }
    
    public void testDevicesReportMaxAmountMetricsData2() {
        By []reportMetricsArray = {
                ReportMetricsUI.SITECATLYST_METRIC0, ReportMetricsUI.SITECATLYST_METRIC1,
                ReportMetricsUI.SITECATLYST_METRIC2, ReportMetricsUI.SITECATLYST_METRIC3,
                ReportMetricsUI.SITECATLYST_METRIC4, ReportMetricsUI.SITECATLYST_METRIC5,
                ReportMetricsUI.SITECATLYST_METRIC6, ReportMetricsUI.SITECATLYST_METRIC7,
                ReportMetricsUI.SITECATLYST_METRIC8};
        this.tmpReport.setFolderReportTitle(ReportUI.SITE_CONTENT_FOLDER,
                MobileUI.PAGE_REPORT, "Pages Report");
        this.reportMetricsPage.reportAddMetrics(this.tmpReport,
                reportMetricsArray, ReportHeaderUI.REPORT_SETTING_AREA_2_1_SPAN,
                ReportMetricsUI.TOP10_PAGES_REPORT_METRICS);
        
        assertTrue(this.reportMetricsPage.compareText("Demo_Data_Col", this.reportMetricsPage.getColumnText(By.xpath("//div[@id=\"data_table\"]/table"),4), false, "Demo_Data_Col"));
    }
    
    public void testDevicesReportMaxAmountMetricsData3() {
        By []reportMetricsArray = {
                ReportMetricsUI.SITECATLYST_METRIC0, ReportMetricsUI.SITECATLYST_METRIC1,
                ReportMetricsUI.SITECATLYST_METRIC2, ReportMetricsUI.SITECATLYST_METRIC3,
                ReportMetricsUI.SITECATLYST_METRIC4, ReportMetricsUI.SITECATLYST_METRIC5,
                ReportMetricsUI.SITECATLYST_METRIC6, ReportMetricsUI.SITECATLYST_METRIC7,
                ReportMetricsUI.SITECATLYST_METRIC8};
        this.tmpReport.setFolderReportTitle(ReportUI.SITE_CONTENT_FOLDER,
                MobileUI.PAGE_REPORT, "Pages Report");
        this.reportMetricsPage.reportAddMetrics(this.tmpReport,
                reportMetricsArray, ReportHeaderUI.REPORT_SETTING_AREA_2_1_SPAN,
                ReportMetricsUI.TOP10_PAGES_REPORT_METRICS);
        
        assertTrue(this.reportMetricsPage.compareText("Demo_Data_Row", this.reportMetricsPage.getRowText(By.xpath("//div[@id=\"data_table\"]/table"),-2), false, "Demo_Data_Row"));
    }
}
