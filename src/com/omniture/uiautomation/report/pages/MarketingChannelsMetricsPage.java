package com.omniture.uiautomation.report.pages;


import com.omniture.uiautomation.report.ui.MarketingChannelsMetricsUI;
import com.omniture.uiautomation.report.ui.MarketingChannelsUI;
import com.omniture.uiautomation.report.ui.ReportUI;

/*
 * @author shan
 */

public class MarketingChannelsMetricsPage extends ReportMetricsPage {
    private ReportPage tmpReport = new ReportPage();
    public void metricsChannelOverview(){
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(
            ReportUI.MARKETING_CHANNELS_FOLDER,MarketingChannelsUI.CHANNEL_OVERVIEW_REPORT, "Marketing Channel Overview Report");
        this.tmpReport.folderReportTitle();
        this.click(MarketingChannelsMetricsUI.METRIC_NAME);
        this.click(MarketingChannelsMetricsUI.ADD_METRIC_GROUP);
        this.sleep(5000);
        this.dragAndDrop(MarketingChannelsMetricsUI.METRIC_ITEM1_SELECTED, MarketingChannelsMetricsUI.SELECTED_METRIC1);
        this.sleep(5000);
        this.dragAndDrop(MarketingChannelsMetricsUI.METRIC_ITEM2_SELECTED, MarketingChannelsMetricsUI.SELECTED_METRIC2);
        this.sleep(5000);
        this.click(MarketingChannelsMetricsUI.SAVE_BUTTON);
        this.sleep(10000);
        this.click(MarketingChannelsMetricsUI.METRIC_NAME);
        this.click(MarketingChannelsMetricsUI.EDIT_METRIC_GROUP);
        this.sleep(5000);
        this.click(MarketingChannelsMetricsUI.DELETE_METRIC_SELECTED);
        this.sleep(5000);
        this.click(MarketingChannelsMetricsUI.SAVE_BUTTON);
        this.sleep(10000);
        this.click(MarketingChannelsMetricsUI.METRIC_NAME);
        this.sleep(5000);
        this.click(MarketingChannelsMetricsUI.DELETE_METRIC_GROUP);
    }
}
