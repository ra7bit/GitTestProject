package com.omniture.uiautomation.report.tests.bvt;

import junit.framework.TestSuite;
import junit.framework.Test;
import com.omniture.uiautomation.report.pages.SiteContentPage;
import com.omniture.uiautomation.report.testcases.ARSSwitchTest;
import com.omniture.uiautomation.tests.OmnitureTest;

public class SiteContentReportRunInOrder extends OmnitureTest {
	private SiteContentPage siteContentPage;
	private ARSSwitchTest rsSwitch;
	public SiteContentReportRunInOrder(String name) {
		super(name);
		this.siteContentPage = new SiteContentPage();
		this.siteContentPage.setWebDriver(this.webDriver);
		this.rsSwitch = new ARSSwitchTest();
	}
    public void testPagesReportLoad() {
    	this.rsSwitch.testRSSwitch();
        this.siteContentPage.assertPagesReportLoad();
    }
    public void testSiteSectionsReportLoad() {
        this.siteContentPage.assertSiteSectionsReportLoad();
    }
    public void testServersReportLoad() {
        this.siteContentPage.assertServersReportLoad();
    }
    public void testExitLinksReportLoad() {
        this.siteContentPage.assertExitLinksReportLoad();
    }
    public void testFileDownloadsReportLoad() {
        this.siteContentPage.assertFileDownloadsReportLoad();
    }
    public void testClickMapReportLoad() {
        this.siteContentPage.assertClickMapReportLoad();
    }
    public void testCustomLinksReportLoad() {
        this.siteContentPage.assertCustomLinksReportLoad();
    }
    public void testPagesNotFoundReportLoad() {
        this.siteContentPage.assertPagesNotFoundReportLoad();
    }
    public static Test suite() {
        TestSuite suite = new TestSuite("site content test...");
        suite.addTest(new SiteContentReportRunInOrder("testPagesReportLoad"));
        suite.addTest(new SiteContentReportRunInOrder("testSiteSectionsReportLoad"));
        suite.addTest(new SiteContentReportRunInOrder("testServersReportLoad"));
        suite.addTest(new SiteContentReportRunInOrder("testExitLinksReportLoad"));
        suite.addTest(new SiteContentReportRunInOrder("testFileDownloadsReportLoad"));
        suite.addTest(new SiteContentReportRunInOrder("testClickMapReportLoad"));
        suite.addTest(new SiteContentReportRunInOrder("testCustomLinksReportLoad"));
        suite.addTest(new SiteContentReportRunInOrder("testPagesNotFoundReportLoad"));
        return suite;
    }
}
