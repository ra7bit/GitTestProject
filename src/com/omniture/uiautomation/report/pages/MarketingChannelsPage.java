package com.omniture.uiautomation.report.pages;

import com.omniture.uiautomation.report.ui.MarketingChannelsUI;
import com.omniture.uiautomation.report.ui.ReportUI;
//import com.omniture.uiautomation.report.ui.SiteContentUI;

/*
 * @author shan
 */

public class MarketingChannelsPage extends ReportPage {
	private ReportPage tmpReport = new ReportPage();
    public void assertChannelOverviewReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(
                ReportUI.MARKETING_CHANNELS_FOLDER, MarketingChannelsUI.CHANNEL_OVERVIEW_REPORT,"Marketing Channel Overview Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertFirstTouchChannelReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(
        		ReportUI.MARKETING_CHANNELS_FOLDER,MarketingChannelsUI.FIRST_TOUCH_CHANNEL,"First Touch Channel Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertFirstTouchChannelDetailReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(
        		ReportUI.MARKETING_CHANNELS_FOLDER,MarketingChannelsUI.FIRST_TOUCH_CHANNEL_DETAIL,"First Touch Channel Detail Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertLastTouchChannelReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(
        		ReportUI.MARKETING_CHANNELS_FOLDER,MarketingChannelsUI.LAST_TOUCH_CHANNEL,"Last Touch Channel Report");
        this.tmpReport.folderReportTitle();
    }
    public void assertLastTouchChannelDetailReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(
        		ReportUI.MARKETING_CHANNELS_FOLDER,MarketingChannelsUI.LAST_TOUCH_CHANNEL_DETAIL,"Last Touch Channel Detail Report");
        this.tmpReport.folderReportTitle();
    }    
//	public void assertChannelOverviewReportLoad()
//	{
//		this.folderReportTitle(ReportUI.MARKETING_CHANNELS_FOLDER,MarketingChannelsUI.CHANNEL_OVERVIEW_REPORT,"Channel Overview Report");
//	}
//	public void assertFirstTouchChannelReportLoad()
//	{
//		this.folderReportTitle(ReportUI.MARKETING_CHANNELS_FOLDER,MarketingChannelsUI.FIRST_TOUCH_CHANNEL,"First Touch Channel Report");
//	}
//	public void assertFirstTouchChannelDetailReportLoad()
//	{
//		this.folderReportTitle(ReportUI.MARKETING_CHANNELS_FOLDER,MarketingChannelsUI.FIRST_TOUCH_CHANNEL_DETAIL,"First Touch Channel Detail Report");
//	}
//	public void assertLastTouchChannelReportLoad()
//	{
//		this.folderReportTitle(ReportUI.MARKETING_CHANNELS_FOLDER,MarketingChannelsUI.LAST_TOUCH_CHANNEL,"Last Touch Channel Report");
//	}
//	public void assertLastTouchChannelDetailReportLoad()
//	{
//		this.folderReportTitle(ReportUI.MARKETING_CHANNELS_FOLDER,MarketingChannelsUI.LAST_TOUCH_CHANNEL_DETAIL,"Last Touch Channel Detail Report");
//	}


}
