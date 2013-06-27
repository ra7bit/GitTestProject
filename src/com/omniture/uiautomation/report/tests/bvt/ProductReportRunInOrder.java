package com.omniture.uiautomation.report.tests.bvt;

import junit.framework.TestSuite;
import junit.framework.Test;
import com.omniture.uiautomation.report.pages.ProductPage;
import com.omniture.uiautomation.report.testcases.ARSSwitchTest;
import com.omniture.uiautomation.tests.OmnitureTest;

public class ProductReportRunInOrder extends OmnitureTest {
	private ProductPage productPage;
	private ARSSwitchTest rsSwitch;
	public ProductReportRunInOrder(String name) {
		super(name);
		this.productPage = new ProductPage();
		this.productPage.setWebDriver(this.webDriver);
		this.rsSwitch = new ARSSwitchTest();
	}
    public void testProductsConversionFunnelLoad() {
    	this.rsSwitch.testRSSwitch();
        this.productPage.assertProductsConversionFunnelLoad();
    }
    public void testProductsReportLoad() {
        this.productPage.assertProductsReportLoad();
    }
    public void testCrossSellLoad() {
        this.productPage.assertCrossSellLoad();
    }
    public void testCategoriesLoad() {
        this.productPage.assertCategoriesLoad();
    }
    public static Test suite() {
        TestSuite suite = new TestSuite("paths test...");
        suite.addTest(new ProductReportRunInOrder("testProductsConversionFunnelLoad"));
        suite.addTest(new ProductReportRunInOrder("testProductsReportLoad"));
        suite.addTest(new ProductReportRunInOrder("testCrossSellLoad"));
        suite.addTest(new ProductReportRunInOrder("testCategoriesLoad"));
        return suite;
    }
}
