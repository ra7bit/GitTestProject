package com.omniture.uiautomation.report.tests.bvt;

import junit.framework.Test;
import junit.framework.TestSuite;

import com.omniture.uiautomation.report.pages.VisitorProfilePage;
import com.omniture.uiautomation.report.testcases.ARSSwitchTest;
import com.omniture.uiautomation.tests.OmnitureTest;

public class VisitorProfileRunInOrder extends OmnitureTest {
	private VisitorProfilePage visitorProfilePage;
	private ARSSwitchTest rsSwitch;
	public VisitorProfileRunInOrder(String name) {
		super(name);
		this.visitorProfilePage = new VisitorProfilePage();
		this.visitorProfilePage.setWebDriver(this.webDriver);
		this.rsSwitch = new ARSSwitchTest();
	}
    public void testCountriesReportLoad() {
    	this.rsSwitch.testRSSwitch();
        this.visitorProfilePage.assertCountriesReportLoad();
    }
    public void testRegionsReportLoad() {
        this.visitorProfilePage.assertRegionsReportLoad();
    }
    public void testCitiesReportLoad() {
        this.visitorProfilePage.assertCitiesReportLoad();
    }
    public void testUSStatesReportLoad() {
        this.visitorProfilePage.assertUSStatesReportLoad();
    }
    public void testUSDMAReportLoad() {
        this.visitorProfilePage.assertUSDMAReportLoad();
    }
    public void testLanguagesReportLoad() {
        this.visitorProfilePage.assertLanguagesReportLoad();
    }
    public void testDomainsReportLoad() {
        this.visitorProfilePage.assertDomainsReportLoad();
    }
    public void testTopLevelDomainsReportLoad() {
        this.visitorProfilePage.assertTopLevelDomainsReportLoad();
    }
    public void testBrowserTypesReportLoad() {
        this.visitorProfilePage.assertBrowserTypesReportLoad();
    }
    public void testBrowsersReportLoad() {
        this.visitorProfilePage.assertBrowsersReportLoad();
    }
    public void testBrowserWidthReportLoad() {
        this.visitorProfilePage.assertBrowserWidthReportLoad();
    }
    public void testBrowserHeightReportLoad() {
        this.visitorProfilePage.assertBrowserHeightReportLoad();
    }
    public void testOperationSystemsReportLoad() {
        this.visitorProfilePage.assertOperationSystemsReportLoad();
    }
    public void testMonitorColorDepthsReportLoad() {
        this.visitorProfilePage.assertMonitorColorDepthsReportLoad();
    }
    public void testJavaReportLoad() {
        this.visitorProfilePage.assertJavaReportLoad();
    }
    public void testJavascriptReportLoad() {
        this.visitorProfilePage.assertJavascriptReportLoad();
    }
    public void testCookiesReportLoad() {
        this.visitorProfilePage.assertCookiesReportLoad();
    }
    public void testConnectionTypesReportLoad() {
        this.visitorProfilePage.assertConnectionTypesReportLoad();
    }
    public void testMobileCarrierReportLoad() {
        this.visitorProfilePage.assertMobileCarrierReportLoad();
    }
    public void testJavascriptVersionReportLoad() {
        this.visitorProfilePage.assertJavascriptVersionReportLoad();
    }
    public void testMonitorResolutionsReportLoad() {
        this.visitorProfilePage.assertMonitorResolutionsReportLoad();
    }
    public void testVisitorStatesReportLoad() {
        this.visitorProfilePage.assertVisitorStatesReportLoad();
    }
    public void testVisitorZipReportLoad() {
        this.visitorProfilePage.assertVisitorZipReportLoad();
    }
    public static Test suite() {
        TestSuite suite = new TestSuite("visitor profiles test...");
        suite.addTest(new VisitorProfileRunInOrder("testCountriesReportLoad"));
        suite.addTest(new VisitorProfileRunInOrder("testRegionsReportLoad"));
        suite.addTest(new VisitorProfileRunInOrder("testCitiesReportLoad"));
        suite.addTest(new VisitorProfileRunInOrder("testUSStatesReportLoad"));
        suite.addTest(new VisitorProfileRunInOrder("testUSDMAReportLoad"));
        suite.addTest(new VisitorProfileRunInOrder("testLanguagesReportLoad"));
        suite.addTest(new VisitorProfileRunInOrder("testDomainsReportLoad"));
        suite.addTest(new VisitorProfileRunInOrder("testTopLevelDomainsReportLoad"));
        suite.addTest(new VisitorProfileRunInOrder("testBrowserTypesReportLoad"));
        suite.addTest(new VisitorProfileRunInOrder("testBrowsersReportLoad"));
        suite.addTest(new VisitorProfileRunInOrder("testBrowserWidthReportLoad"));
        suite.addTest(new VisitorProfileRunInOrder("testBrowserHeightReportLoad"));
        suite.addTest(new VisitorProfileRunInOrder("testOperationSystemsReportLoad"));
        suite.addTest(new VisitorProfileRunInOrder("testMonitorColorDepthsReportLoad"));
        suite.addTest(new VisitorProfileRunInOrder("testJavaReportLoad"));
        suite.addTest(new VisitorProfileRunInOrder("testJavascriptReportLoad"));
        suite.addTest(new VisitorProfileRunInOrder("testCookiesReportLoad"));
        suite.addTest(new VisitorProfileRunInOrder("testConnectionTypesReportLoad"));
        suite.addTest(new VisitorProfileRunInOrder("testMobileCarrierReportLoad"));
        suite.addTest(new VisitorProfileRunInOrder("testJavascriptVersionReportLoad"));
        suite.addTest(new VisitorProfileRunInOrder("testVisitorStatesReportLoad"));
        suite.addTest(new VisitorProfileRunInOrder("testVisitorZipReportLoad"));
        return suite;
    }
}
