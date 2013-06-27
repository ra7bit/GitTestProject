package com.omniture.uiautomation.report.tests.bvt;

import junit.framework.TestSuite;
import junit.framework.Test;
import com.omniture.uiautomation.report.testcases.ReportMetricsTest;
import com.omniture.uiautomation.tests.OmnitureTest;

public class MetricsRunInOrder extends OmnitureTest {
    private ReportMetricsTest reportMetrics;
    public MetricsRunInOrder(String name) {
        super(name);
        reportMetrics = new ReportMetricsTest();
    }
//    public void testDevicesReportMaxAmountMetrics() {
//        reportMetrics.testDevicesReportMaxAmountMetrics();
//    }
//    public void testPagesReportAddRemoveMetrics() {
//        reportMetrics.testPagesReportAddRemoveMetrics();
//    }
//    public void testProductsReportAddRemoveMetrics() {
//        reportMetrics.testProductsReportAddRemoveMetrics();
//    }
//    public void testReturnFrequencyReportAddRemvoeMetrics() {
//        reportMetrics.testReturnFrequencyReportAddRemvoeMetrics();
//    }
//    
    public static Test suite() {
        TestSuite suite = new TestSuite("just a test...");
        suite.addTest(new MetricsRunInOrder("testDevicesReportMaxAmountMetrics"));
        suite.addTest(new MetricsRunInOrder("testPagesReportAddRemoveMetrics"));
        suite.addTest(new MetricsRunInOrder("testProductsReportAddRemoveMetrics"));
        suite.addTest(new MetricsRunInOrder("testReturnFrequencyReportAddRemvoeMetrics"));
        return suite;
    }
}
