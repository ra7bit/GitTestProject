package com.omniture.uiautomation.report.pages;

import com.omniture.uiautomation.pages.SiteCatalystPage;
import com.omniture.uiautomation.report.ui.ReportUI;
import com.omniture.uiautomation.framework.TestEnvironment;
import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
/*
 * @author yluo
 */

public class ReportPage extends SiteCatalystPage {
    private By folder;
    private By subFolder;
    private By report;
    private String title;
    public void setFolderReportTitle(By folderT, By reportT, String titleT) {
        this.folder = folderT;
        this.report = reportT;
        this.title = titleT;
    }
    public void setFolderSubFolderReportTitle(By folderT, By subFolderT, By reportT, String titleT) {
        this.subFolder = subFolderT;
        this.folder = folderT;
        this.report = reportT;
        this.title = titleT;
    }
    public void folderReportTitle() {
    	this.waitUntilElementClickable(this.folder);
        this.click(this.folder);
        this.click(this.report);
        this.waitUntilPageLoad();
        this.waitUntilElement(ReportUI.REPORT_TITLE);
        this.assertElementsTextContain(ReportUI.REPORT_TITLE, this.title);
    }
    public void folderReportTitleNoAssert() {
        this.click(this.folder);
        this.click(this.report);
        this.sleep(6000);
    }
    public void folderSubFolderReportTitle() {
    	this.waitUntilElementClickable(this.folder);
        this.click(this.folder);
        this.click(this.subFolder);
        this.click(this.report);
        this.waitUntilPageLoad();
        this.waitUntilElement(ReportUI.REPORT_TITLE);
        this.assertElementsTextContain(ReportUI.REPORT_TITLE, title);
    }
    public void folderSubFolderReportTitleNoAssert() {
        this.click(this.folder);
        this.click(this.subFolder);
        this.click(this.report);
        this.sleep(6000);
    }
    public void navigateToHomepage() {
        if (!this.isElementExists(ReportUI.CAMPAIGNS_FOLDER)) {
        	this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                    + "/sc15/reports/index.html?a=Overview.Site&ssSession="
                    + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
            this.waitUntilElementClickable(ReportUI.CAMPAIGNS_FOLDER);
            this.waitUntilPageLoad();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
    }
    protected void switchToWindow(String winTitle) {
        Set<String> s = this.getDriver().getWindowHandles();
        Iterator<String> ite = s.iterator();
        while (ite.hasNext()) {
            String popupHandle = ite.next().toString();
            if (this.getDriver().switchTo().window(popupHandle).getTitle().equals(winTitle)) {
                this.getDriver().switchTo().window(popupHandle);
            }
        }
    }
    public String getReportTotalValue(By path) {
    	return this.findElement(path).getText();
    }
    /*public void rsSwitch(String rsTitle, By rsPos) {
        this.sleep(5000);
        WebElement select = this.findElement(ReportUI.RS_SELECT);
        String rsName = select.getAttribute("value");
        if (!rsTitle.equals(rsName)) {
            this.click(ReportUI.RS_ARRAY);
            this.sleep(1000);
            this.click(rsPos);
            this.waitUntilElement(ReportUI.REPORT_TITLE);
        }
        this.sleep(10000);
    }*/
}
