package com.omniture.uiautomation.report.pages;

import com.omniture.uiautomation.report.ui.CampaignsUI;
import com.omniture.uiautomation.report.ui.ReportUI;

/*
 * @author yluo
 */

public class CampaignsPage extends ReportPage {
	private ReportPage tmpReport = new ReportPage();
	
    public void assertCampaingsFunnelLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderReportTitle(
                ReportUI.CAMPAIGNS_FOLDER, CampaignsUI.CAMPAIGNS_CONVERION_FUNNEL_REPORT, "Campaign Conversion Funnel");
        this.tmpReport.folderReportTitle();
    }
    public void assertCreativeElementsReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.CAMPAIGNS_FOLDER, CampaignsUI.TRACKING_CODE_FOLDER,
                CampaignsUI.CREATIVE_ELEMENTS_REPORT, "Creative Elements Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertCampaignsReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.CAMPAIGNS_FOLDER, CampaignsUI.TRACKING_CODE_FOLDER,
                CampaignsUI.CAMPAINGS_REPORT, "Campaigns Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
    public void assertTrackingCodeReportLoad() {
    	tmpReport.setWebDriver(this.webDriver);
        this.tmpReport.setFolderSubFolderReportTitle(
                ReportUI.CAMPAIGNS_FOLDER, CampaignsUI.TRACKING_CODE_FOLDER,
                CampaignsUI.TRACKING_CODE_REPORT, "Tracking Code Report");
        this.tmpReport.folderSubFolderReportTitle();
    }
}
