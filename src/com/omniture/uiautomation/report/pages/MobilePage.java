package com.omniture.uiautomation.report.pages;

import com.omniture.uiautomation.report.ui.MobileUI;
import com.omniture.uiautomation.report.ui.ReportUI;

/*
 * @author yluo
 */

public class MobilePage extends ReportPage {
    private ReportPage tmpReportPage = new ReportPage();
    public void assertDevicesReportLoad() {
    	this.tmpReportPage.setWebDriver(this.webDriver);
        this.tmpReportPage.setFolderReportTitle(
                ReportUI.MOBILE_FOLDER, MobileUI.DEVICES_REPORT, "Devices Report");
        this.tmpReportPage.folderReportTitle();
    }
    public void assertDeviceTypeReportLoad() {
    	this.tmpReportPage.setWebDriver(this.webDriver);
        this.tmpReportPage.setFolderReportTitle(
                ReportUI.MOBILE_FOLDER, MobileUI.DEVICE_TYPE_REPORT, "Device Type Report");
        this.tmpReportPage.folderReportTitle();
    }
    public void assertManufacturerReportLoad() {
    	this.tmpReportPage.setWebDriver(this.webDriver);
        this.tmpReportPage.setFolderReportTitle(
                ReportUI.MOBILE_FOLDER, MobileUI.MANUFACTURER_REPORT, "Manufacturers Report");
        this.tmpReportPage.folderReportTitle();
    }
    public void assertScreenSizeReportLoad() {
    	this.tmpReportPage.setWebDriver(this.webDriver);
        this.tmpReportPage.setFolderReportTitle(
                ReportUI.MOBILE_FOLDER, MobileUI.SCREEN_SIZE_REPORT, "Screen Sizes Report");
        this.tmpReportPage.folderReportTitle();
    }
    public void assertScreenHeightReportLoad() {
    	this.tmpReportPage.setWebDriver(this.webDriver);
        this.tmpReportPage.setFolderReportTitle(
                ReportUI.MOBILE_FOLDER, MobileUI.SCREEN_HEIGHT_REPORT, "Screen Height Report");
        this.tmpReportPage.folderReportTitle();
    }
    public void assertScreenWidthReportLoad() {
    	this.tmpReportPage.setWebDriver(this.webDriver);
    	this.tmpReportPage.setFolderReportTitle(
                ReportUI.MOBILE_FOLDER, MobileUI.SCREEN_WIDTH_REPORT, "Screen Width Report");
        this.tmpReportPage.folderReportTitle();
    }
    public void assertCookieSupportReportLoad() {
    	this.tmpReportPage.setWebDriver(this.webDriver);
        this.tmpReportPage.setFolderReportTitle(
                ReportUI.MOBILE_FOLDER, MobileUI.COOKIE_SUPPORT_REPORT, "Cookie Support Report");
        this.tmpReportPage.folderReportTitle();
    }
    public void assertImageSupportReportLoad() {
    	this.tmpReportPage.setWebDriver(this.webDriver);
        this.tmpReportPage.setFolderReportTitle(
                ReportUI.MOBILE_FOLDER, MobileUI.IMAGE_SUPPORT_REPORT, "Image Support Report");
        this.tmpReportPage.folderReportTitle();
    }
    public void assertColorDepthReportLoad() {
    	this.tmpReportPage.setWebDriver(this.webDriver);
        this.tmpReportPage.setFolderReportTitle(
                ReportUI.MOBILE_FOLDER, MobileUI.COLOR_DEPTH_REPORT, "Color Depth Report");
        this.tmpReportPage.folderReportTitle();
    }
    public void assertAudioSupportReportLoad() {
    	this.tmpReportPage.setWebDriver(this.webDriver);
        this.tmpReportPage.setFolderReportTitle(
                ReportUI.MOBILE_FOLDER, MobileUI.AUDIO_SUPPORT_REPORT, "Audio Support Report");
        this.tmpReportPage.folderReportTitle();
    }
    public void assertVideoSupportReportLoad() {
    	this.tmpReportPage.setWebDriver(this.webDriver);
        this.tmpReportPage.setFolderReportTitle(
                ReportUI.MOBILE_FOLDER, MobileUI.VIDEO_SUPPORT_REPORT, "Video Support Report");
        this.tmpReportPage.folderReportTitle();
    }
    public void assertDRMReportLoad() {
    	this.tmpReportPage.setWebDriver(this.webDriver);
        this.tmpReportPage.setFolderReportTitle(
                ReportUI.MOBILE_FOLDER, MobileUI.DRM_REPORT, "DRM Report");
        this.tmpReportPage.folderReportTitle();
    }
    public void assertNetProtocolsReportLoad() {
    	this.tmpReportPage.setWebDriver(this.webDriver);
        this.tmpReportPage.setFolderReportTitle(
                ReportUI.MOBILE_FOLDER, MobileUI.NET_PROTOCOLS_REPORT, "Net Protocols Report");
        this.tmpReportPage.folderReportTitle();
    }
    public void assertOperatingSystemReportLoad() {
    	this.tmpReportPage.setWebDriver(this.webDriver);
        this.tmpReportPage.setFolderReportTitle(
                ReportUI.MOBILE_FOLDER, MobileUI.OPERATING_SYSTEM_REPORT, "Operating System Report");
        this.tmpReportPage.folderReportTitle();
    }
    public void assertJavaVersionReportLoad() {
    	this.tmpReportPage.setWebDriver(this.webDriver);
        this.tmpReportPage.setFolderReportTitle(
                ReportUI.MOBILE_FOLDER, MobileUI.JAVA_VERSION_REPORT, "Java Version Report");
        this.tmpReportPage.folderReportTitle();
    }
    public void assertBookmarkURLLengthReportLoad() {
    	this.tmpReportPage.setWebDriver(this.webDriver);
        this.tmpReportPage.setFolderReportTitle(
                ReportUI.MOBILE_FOLDER, MobileUI.BOOKMARK_URL_LENGTH_REPORT, "Bookmark URL Length Report");
        this.tmpReportPage.folderReportTitle();
    }
    public void assertMailURLLengthReportLoad() {
    	this.tmpReportPage.setWebDriver(this.webDriver);
        this.tmpReportPage.setFolderReportTitle(
                ReportUI.MOBILE_FOLDER, MobileUI.MAIL_URL_LENGTH_REPORT, "Mail URL Length Report");
        this.tmpReportPage.folderReportTitle();
    }
    public void assertBrowserURLLengthReportLoad() {
    	this.tmpReportPage.setWebDriver(this.webDriver);
        this.tmpReportPage.setFolderReportTitle(
                ReportUI.MOBILE_FOLDER, MobileUI.BROWSER_URL_LENGTH_REPORT, "Browser URL Length Report");
        this.tmpReportPage.folderReportTitle();
    }
    public void assertDeviceNumberTransmitReportLoad() {
    	this.tmpReportPage.setWebDriver(this.webDriver);
        this.tmpReportPage.setFolderReportTitle(
                ReportUI.MOBILE_FOLDER, MobileUI.DEVICE_NUMBER_TRANSMIT_REPORT,
                "Device Number Transmit (ON/OFF) Report");
        this.tmpReportPage.folderReportTitle();
    }
    public void assertPTTReportLoad() {
    	this.tmpReportPage.setWebDriver(this.webDriver);
        this.tmpReportPage.setFolderReportTitle(
                ReportUI.MOBILE_FOLDER, MobileUI.PTT_REPORT, "PTT Report");
        this.tmpReportPage.folderReportTitle();
    }
    public void assertDecorationMailSupportReportLoad() {
    	this.tmpReportPage.setWebDriver(this.webDriver);
        this.tmpReportPage.setFolderReportTitle(
                ReportUI.MOBILE_FOLDER, MobileUI.DECORATION_MAIL_SUPPORT_REPORT,
                "Decoration Mail Support Report");
        this.tmpReportPage.folderReportTitle();
    }
    public void assertInformationServicesReportLoad() {
    	this.tmpReportPage.setWebDriver(this.webDriver);
        this.tmpReportPage.setFolderReportTitle(
                ReportUI.MOBILE_FOLDER, MobileUI.INFORMATION_SERVICES_REPORT, "Information Services Report");
        this.tmpReportPage.folderReportTitle();
    }
}
