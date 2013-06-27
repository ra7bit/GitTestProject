package com.omniture.uiautomation.report.tests;

import org.junit.Test;
import com.omniture.uiautomation.report.Report;

/*
 * @author shan
 */

public class MarketingChannelsReportTest extends Report {
	@Test
	public void testChannelOverviewReportLoad()
	{
		this.marketingChannelsPage.assertChannelOverviewReportLoad();
	}
	@Test
	public void testFirstTouchChannelReportLoad()
	{
		this.marketingChannelsPage.assertFirstTouchChannelReportLoad();
	}
	@Test
	public void testFirstTouchChannelDetailReportLoad()
	{
		this.marketingChannelsPage.assertFirstTouchChannelDetailReportLoad();
	}
	@Test
	public void testLastTouchChannelReportLoad()
	{
		this.marketingChannelsPage.assertLastTouchChannelReportLoad();
	}
	@Test
	public void testLastTouchChannelDetailReportLoad()
	{
		this.marketingChannelsPage.assertLastTouchChannelDetailReportLoad();
	}

}
