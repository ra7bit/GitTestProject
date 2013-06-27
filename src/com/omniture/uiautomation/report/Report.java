package com.omniture.uiautomation.report;

import com.omniture.uiautomation.tests.OmnitureTest;
import com.omniture.uiautomation.report.pages.MarketingChannelsMetricsPage;
import com.omniture.uiautomation.report.pages.MarketingChannelsPage;
import com.omniture.uiautomation.report.pages.SiteMetricsPage;
import com.omniture.uiautomation.report.pages.ReportMetricsPage;
import com.omniture.uiautomation.report.pages.CampaignsPage;
import com.omniture.uiautomation.report.pages.MobilePage;
import com.omniture.uiautomation.report.pages.PathsPage;
import com.omniture.uiautomation.report.pages.ProductPage;
import com.omniture.uiautomation.report.pages.SiteContentPage;
import com.omniture.uiautomation.report.pages.TrafficSourcesPage;
import com.omniture.uiautomation.report.pages.VisitorProfilePage;
import com.omniture.uiautomation.report.pages.VisitorRetentionPage;
import com.omniture.uiautomation.report.pages.ReportToolbarPage;

/*
 * @author yluo
 */

public class Report extends OmnitureTest {

    protected SiteMetricsPage siteMetricsPage;
	protected ReportMetricsPage reportMetricsPage;
	protected CampaignsPage campaignsPage;
	protected MobilePage mobilePage;
	protected PathsPage pathsPage;
	protected ProductPage productPage;
	protected SiteContentPage siteContentPage;
	protected TrafficSourcesPage trafficSourcesPage;
	protected VisitorProfilePage visitorProfilePage;
	protected VisitorRetentionPage visitorRetentionPage;
	protected MarketingChannelsPage marketingChannelsPage;
	protected ReportToolbarPage reportToolbarPage;
	protected MarketingChannelsMetricsPage marketingChannelsMetricsPage;
	public Report() {
		this.reportMetricsPage = new ReportMetricsPage();
		this.campaignsPage = new CampaignsPage();
		this.mobilePage = new MobilePage();
		this.siteMetricsPage = new SiteMetricsPage();
		this.pathsPage = new PathsPage();
		this.productPage = new ProductPage();
		this.siteContentPage = new SiteContentPage();
		this.trafficSourcesPage = new TrafficSourcesPage();
		this.visitorProfilePage = new VisitorProfilePage();
		this.visitorRetentionPage = new VisitorRetentionPage();
		this.marketingChannelsPage = new MarketingChannelsPage();
		this.reportToolbarPage = new ReportToolbarPage();
		this.marketingChannelsMetricsPage = new MarketingChannelsMetricsPage();
		
		this.reportMetricsPage.setWebDriver(this.webDriver);
		this.campaignsPage.setWebDriver(this.webDriver);
		this.mobilePage.setWebDriver(this.webDriver);
		this.siteMetricsPage.setWebDriver(this.webDriver);
		this.pathsPage.setWebDriver(this.webDriver);
		this.productPage.setWebDriver(this.webDriver);
		this.siteContentPage.setWebDriver(this.webDriver);
		this.trafficSourcesPage.setWebDriver(this.webDriver);
		this.visitorProfilePage.setWebDriver(this.webDriver);
		this.visitorRetentionPage.setWebDriver(this.webDriver);
		this.marketingChannelsPage.setWebDriver(this.webDriver);
		this.reportToolbarPage.setWebDriver(this.webDriver);
		this.marketingChannelsMetricsPage.setWebDriver(this.webDriver);
		
	}
}
