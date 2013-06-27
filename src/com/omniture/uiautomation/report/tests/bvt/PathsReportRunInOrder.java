package com.omniture.uiautomation.report.tests.bvt;

import junit.framework.TestSuite;
import junit.framework.Test;
import com.omniture.uiautomation.report.pages.PathsPage;
import com.omniture.uiautomation.report.testcases.ARSSwitchTest;
import com.omniture.uiautomation.tests.OmnitureTest;

public class PathsReportRunInOrder extends OmnitureTest {
	private PathsPage pathsPage;
	private ARSSwitchTest rsSwitch;
	public PathsReportRunInOrder(String name) {
		super(name);
		this.pathsPage = new PathsPage();
		this.pathsPage.setWebDriver(this.webDriver);
		this.rsSwitch = new ARSSwitchTest();
	}
    public void testNextPageFlowReport() {
    	this.rsSwitch.testRSSwitch();
        this.pathsPage.assertNextPageFlowReport();
    }
    public void testNextPageReport() {
        this.pathsPage.assertNextPageReport();
    }
    public void testPreviousPageFlowReport() {
        this.pathsPage.assertPreviousPageFlowReport();
    }
    public void testPreviousPagesReport() {
        this.pathsPage.assertPreviousPagesReport();
    }
    public void testFalloutReport() {
        this.pathsPage.assertFalloutReport();
    }
    public void testFullPathsReport() {
        this.pathsPage.assertFullPathsReport();
    }
    public void testPathFinderReport() {
        this.pathsPage.assertPathFinderReport();
    }
    public void testPathLengthReport() {
        this.pathsPage.assertPathLengthReport();
    }
    public void testEntryPagesReport() {
        this.pathsPage.assertEntryPagesReport();
    }
    public void testReloadsReport() {
        this.pathsPage.assertReloadsReport();
    }
    public void testTimeSpentOnPageReport() {
        this.pathsPage.assertTimeSpentOnPageReport();
    }
    public void testClicksToPageReport() {
        this.pathsPage.assertClicksToPageReport();
    }
    public void testEntryPagesInEntriesReport() {
        this.pathsPage.assertEntryPagesInEntriesReport();
    }
    public void testOriginalEntryPagesInEntriesReport() {
        this.pathsPage.assertOriginalEntryPagesInEntriesReport();
    }
    public void testSinglePageVisitsInEntriesReport() {
        this.pathsPage.assertSinglePageVisitsInEntriesReport();
    }
    public void testExitPagesInEntriesReport() {
        this.pathsPage.assertExitPagesInEntriesReport();
    }
    public static Test suite() {
        TestSuite suite = new TestSuite("paths test...");
        suite.addTest(new PathsReportRunInOrder("testNextPageFlowReport"));
        suite.addTest(new PathsReportRunInOrder("testNextPageReport"));
        suite.addTest(new PathsReportRunInOrder("testPreviousPageFlowReport"));
        suite.addTest(new PathsReportRunInOrder("testPreviousPagesReport"));
        suite.addTest(new PathsReportRunInOrder("testFalloutReport"));
        suite.addTest(new PathsReportRunInOrder("testFullPathsReport"));
        suite.addTest(new PathsReportRunInOrder("testPathFinderReport"));
        suite.addTest(new PathsReportRunInOrder("testPathLengthReport"));
        suite.addTest(new PathsReportRunInOrder("testEntryPagesReport"));
        suite.addTest(new PathsReportRunInOrder("testReloadsReport"));
        suite.addTest(new PathsReportRunInOrder("testTimeSpentOnPageReport"));
        suite.addTest(new PathsReportRunInOrder("testClicksToPageReport"));
        suite.addTest(new PathsReportRunInOrder("testEntryPagesInEntriesReport"));
        suite.addTest(new PathsReportRunInOrder("testOriginalEntryPagesInEntriesReport"));
        suite.addTest(new PathsReportRunInOrder("testSinglePageVisitsInEntriesReport"));
        suite.addTest(new PathsReportRunInOrder("testExitPagesInEntriesReport"));
        return suite;
    }
}
