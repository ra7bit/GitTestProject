package com.omniture.uiautomation.report.pages;

import com.omniture.uiautomation.report.ui.ProductUI;
import com.omniture.uiautomation.report.ui.ReportUI;

/*
 * @author yluo
 */

public class ProductPage extends ReportPage {
    private ReportPage tmpReport = new ReportPage();
    public void assertProductsConversionFunnelLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(
                ReportUI.PRODUCTS_FOLDER, ProductUI.PRODUCTs_CONVERSION_FUNNEL_REPORT,
            "Products Conversion Funnel");
        this.tmpReport.folderReportTitle();
    }
    public void assertProductsReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(
                ReportUI.PRODUCTS_FOLDER, ProductUI.PRODUCTS_REPORT, "Products Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertCrossSellLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(
                ReportUI.PRODUCTS_FOLDER, ProductUI.CROSS_SELL_REPORT, "Cross Sell Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertCategoriesLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(
                ReportUI.PRODUCTS_FOLDER, ProductUI.CATEGORIES_REPORT, "Categories Report");
        this.tmpReport.folderReportTitle();
    }
}
