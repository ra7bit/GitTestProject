package com.omniture.uiautomation.pages;

import java.io.File;
import java.util.AbstractMap;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.Document;

import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.ui.SiteCatalystUI;

public class SiteCatalystPage extends OmniturePage {
    private String defaultReportSuiteName = "asc-test1";
    //TODO: need to get id dynamically 
    private String defaultReportSuiteID = "ascauto01";
    public static AbstractMap<String, String > reportMap = new HashMap<String, String >();
    private By rsSelectPath = SiteCatalystUI.RS_SELECT;
    private By rsSelectArrow = SiteCatalystUI.RS_ARROW;
    private String user = "yluo";
    public SiteCatalystPage() {
        
        iniReportSuites();
        try {
            Document d = this.getXMLNodelist("config/dataConfig.xml");
            this.user = getXMLValue(d, "user");
            String test = getXMLValue(d, "example");
        } catch (Exception e) {}
    }
    
    private void iniReportSuites() {
        reportMap.put("https://acc.www.qe1.omniture.com", "ascauto01");
        reportMap.put("https://acc.www.qe2.omniture.com", "ascauto01");
        reportMap.put("https://beta.omniture.com", "asctestsj.scauto01");
        reportMap.put("https://beta-b.omniture.com", "asctestsj.scauto01");
        reportMap.put("https://sc.omniture.com", "asctestsj.scauto01");
        reportMap.put("https://acc-sc.vm379.dev.omniture.com", "ascauto01");
    }
    private String getXMLValue(Document d, String tag){
        return d.getElementsByTagName("tag").item(0).getChildNodes().item(0).getNodeValue();
    }
    public void setRS(By path, By arrow) {
        this.rsSelectPath = path;
        this.rsSelectArrow = arrow;
    }
    
    public void navigateToReport() {
    	this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/sc15/reports/index.html?a=Report.Standard&r=Report.PageViews"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());        
        this.waitUntilElement(SiteCatalystUI.REPORT_TITLE);
        this.sleep(5000);
    }
    
    public void rsSwitch(String rsTitle, By rsPos) {
        this.sleep(5000);
        boolean isNavigateToReport = false;
        if (!this.isElementExists(this.rsSelectPath)) {
            navigateToReport();
            isNavigateToReport = true;
        }         
        WebElement select = this.findElement(this.rsSelectPath);
        String rsName = select.getAttribute("value");
        if (!rsTitle.equals(rsName)) {
            if (!isNavigateToReport) {
                navigateToReport();
            }
            this.click(this.rsSelectArrow);
            this.sleep(1000);
            this.click(rsPos);
            this.waitUntilElement(SiteCatalystUI.REPORT_TITLE);
        }
        this.sleep(10000);
    }
 
    public String getLoginUser() {
        return this.user;
    }
    private Document getXMLNodelist(String path) throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(new File(path));
        return doc;
    }
    public String getDefaultReportSuiteName() {
        return defaultReportSuiteName;
    }
    public void setDefaultReportSuiteName(String defaultReportSuiteName) {
        this.defaultReportSuiteName = defaultReportSuiteName;
    }
    public String getDefaultReportSuiteID() {
        return reportMap.get(TestEnvironment.current.getBaseUrl());
    }
    public void setDefaultReportSuiteID(String defaultReportSuiteID) {
        this.defaultReportSuiteID = defaultReportSuiteID;
    }
    public void assertHttpResponse(WebDriver driver) {
        try{
            String response = driver.getPageSource();
            Assert.assertFalse("Response return Fatal error", response.contains("Fatal error"));
            Assert.assertFalse("Response return Warning", response.contains("Warning"));
        }catch(Exception e){}
    }

}
