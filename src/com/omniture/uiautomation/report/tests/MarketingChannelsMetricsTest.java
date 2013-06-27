package com.omniture.uiautomation.report.tests;

import org.junit.Test;

import com.omniture.uiautomation.report.Report;

/*
 * @author shan
 */

public class MarketingChannelsMetricsTest extends Report {
	@Test
	public void testMetricsChannelOverview() {
		this.marketingChannelsMetricsPage.metricsChannelOverview();
	}
	
	//download
//	@Test
//	public void channelOverviewDownload(){
//		this.reportToolbarPage.folderReportTitle(ReportUI.MARKETING_CHANNELS_FOLDER,MarketingChannelsUI.CHANNEL_OVERVIEW_REPORT,"Channel Overview Report");
//		this.reportToolbarPage.downloadPDF();
//		this.reportToolbarPage.downloadExcel();
//		this.reportToolbarPage.downloadCSV();
//	}

}
