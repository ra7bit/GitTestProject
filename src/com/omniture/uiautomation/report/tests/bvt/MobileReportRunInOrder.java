package com.omniture.uiautomation.report.tests.bvt;

import junit.framework.Test;
import junit.framework.TestSuite;

import com.omniture.uiautomation.report.pages.MobilePage;
import com.omniture.uiautomation.report.testcases.ARSSwitchTest;
import com.omniture.uiautomation.tests.OmnitureTest;

public class MobileReportRunInOrder extends OmnitureTest {
	private MobilePage mobilePage;
	private ARSSwitchTest rsSwitch;
	public MobileReportRunInOrder(String name) {
		super(name);
		this.mobilePage = new MobilePage();
		this.mobilePage.setWebDriver(this.webDriver);
		this.rsSwitch = new ARSSwitchTest();
	}
	public void testDevicesReportLoad() {
		this.rsSwitch.testRSSwitch();
        this.mobilePage.assertDevicesReportLoad();
    }
    public void testDeviceTypeReportLoad() {
        this.mobilePage.assertDeviceTypeReportLoad();
    }
    public void testManufacturerReportLoad() {
        this.mobilePage.assertManufacturerReportLoad();
    }
    public void testScreenSizeReportLoad() {
        this.mobilePage.assertScreenSizeReportLoad();
    }
    public void testScreenHeightReportLoad() {
        this.mobilePage.assertScreenHeightReportLoad();
    }
    public void testScreenWidthReportLoad() {
        this.mobilePage.assertScreenWidthReportLoad();
    }
    public void testCookieSupportReportLoad() {
        this.mobilePage.assertCookieSupportReportLoad();
    }
    public void testImageSupportReportLoad() {
        this.mobilePage.assertImageSupportReportLoad();
    }
    public void testColorDepthReportLoad() {
        this.mobilePage.assertColorDepthReportLoad();
    }
    public void testAudioSupportReportLoad() {
        this.mobilePage.assertAudioSupportReportLoad();
    }
    public void testVideoSupportReportLoad() {
        this.mobilePage.assertVideoSupportReportLoad();
    }
    public void testDRMReportLoad() {
        this.mobilePage.assertDRMReportLoad();
    }
    public void testNetProtocolsReportLoad() {
        this.mobilePage.assertNetProtocolsReportLoad();
    }
    public void testOperatingSystemReportLoad() {
        this.mobilePage.assertOperatingSystemReportLoad();
    }
    public void testJavaVersionReportLoad() {
        this.mobilePage.assertJavaVersionReportLoad();
    }
    public void testBookmarkURLLengthReportLoad() {
        this.mobilePage.assertBookmarkURLLengthReportLoad();
    }
    public void testMailURLLengthReportLoad() {
        this.mobilePage.assertMailURLLengthReportLoad();
    }
    public void testBrowserURLLengthReportLoad() {
        this.mobilePage.assertBrowserURLLengthReportLoad();
    }
    public void testDeviceNumberTransmitReportLoad() {
        this.mobilePage.assertDeviceNumberTransmitReportLoad();
    }
    public void testPTTReportLoad() {
        this.mobilePage.assertPTTReportLoad();
    }
    public void testDecorationMailSupportReportLoad() {
        this.mobilePage.assertDecorationMailSupportReportLoad();
    }
    public void testInformationServicesReportLoad() {
        this.mobilePage.assertInformationServicesReportLoad();
    }
    public static Test suite() {
        TestSuite suite = new TestSuite("mobile test...");
        suite.addTest(new MobileReportRunInOrder("testDevicesReportLoad"));
        suite.addTest(new MobileReportRunInOrder("testDeviceTypeReportLoad"));
        suite.addTest(new MobileReportRunInOrder("testManufacturerReportLoad"));
        suite.addTest(new MobileReportRunInOrder("testScreenSizeReportLoad"));
        suite.addTest(new MobileReportRunInOrder("testScreenHeightReportLoad"));
        suite.addTest(new MobileReportRunInOrder("testScreenWidthReportLoad"));
        suite.addTest(new MobileReportRunInOrder("testCookieSupportReportLoad"));
        suite.addTest(new MobileReportRunInOrder("testImageSupportReportLoad"));
        suite.addTest(new MobileReportRunInOrder("testColorDepthReportLoad"));
        suite.addTest(new MobileReportRunInOrder("testAudioSupportReportLoad"));
        suite.addTest(new MobileReportRunInOrder("testVideoSupportReportLoad"));
        suite.addTest(new MobileReportRunInOrder("testDRMReportLoad"));
        suite.addTest(new MobileReportRunInOrder("testNetProtocolsReportLoad"));
        suite.addTest(new MobileReportRunInOrder("testOperatingSystemReportLoad"));
        suite.addTest(new MobileReportRunInOrder("testJavaVersionReportLoad"));
        suite.addTest(new MobileReportRunInOrder("testBookmarkURLLengthReportLoad"));
        suite.addTest(new MobileReportRunInOrder("testMailURLLengthReportLoad"));
        suite.addTest(new MobileReportRunInOrder("testBrowserURLLengthReportLoad"));
        suite.addTest(new MobileReportRunInOrder("testDeviceNumberTransmitReportLoad"));
        suite.addTest(new MobileReportRunInOrder("testPTTReportLoad"));
        suite.addTest(new MobileReportRunInOrder("testDecorationMailSupportReportLoad"));
        suite.addTest(new MobileReportRunInOrder("testInformationServicesReportLoad"));
        return suite;
    }
}
