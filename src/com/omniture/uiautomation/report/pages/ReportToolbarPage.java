package com.omniture.uiautomation.report.pages;

import java.io.File;
import java.io.IOException;
import java.util.List;
import com.omniture.uiautomation.bookmark.pages.BookmarkManagerPage;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.report.ui.ReportToolbarUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;

/*
 * @author yluo
 */

public class ReportToolbarPage extends ReportPage {
    private boolean downloadStatus;
    private void downloadFile(By fileformat) {
        if (!downloadStatus) {
            this.click(ReportToolbarUI.DOWNLOAD_ICON);
			downloadStatus = true;
			this.sleep(5000);
		}
		this.click(fileformat);
		this.sleep(7000);
		if (fileformat == ReportToolbarUI.DOWNLOAD_PDF_ICON) {
			this.sleep(3000);
			String command = "taskkill /f /im Acrobat.exe";
			try {
				Runtime.getRuntime().exec(command);
				this.sleep(2000);
			}
			catch (IOException e) {
			}
		}
		this.assertFileAndDelete("");
	}
	public void downloadPDF() {
		this.downloadFile(ReportToolbarUI.DOWNLOAD_PDF_ICON);
	}
	public void downloadExcel() {
		this.downloadFile(ReportToolbarUI.DOWNLOAD_EXCEL_ICON);
	}
	public void downloadWord() {
		this.downloadFile(ReportToolbarUI.DOWNLOAD_WORD_ICON);
	}
	public void downloadCSV() {
		this.downloadFile(ReportToolbarUI.DOWNLOAD_CSV_ICON);
	}
	private void assertFileAndDelete(String filename) {
		String path = "C:/Users/yluo/Downloads/";
		File f = new File(path);
		if (filename.length() == 0) {
			Assert.assertTrue(f.list().length != 0);
		}
		else {
			File testFile = new File(path + filename);
			Assert.assertTrue(testFile.exists());
		}
		File tmp = null;
		for (int i = 0; i < f.list().length; ++i) {
			tmp = new File(path + f.list()[i]);
			tmp.delete();
		}
	}
	private void advancedDownloadFile(By fileFormat, String fileinput, String filename, boolean zipFile) {
		if (!downloadStatus) {
			this.click(ReportToolbarUI.DOWNLOAD_ICON);
			downloadStatus = true;
			this.sleep(5000);
		}
		this.click(ReportToolbarUI.ADVANCED_DOWNLOAD_LINK);
		this.switchTab();
		this.click(fileFormat);
		this.type(ReportToolbarUI.ADVANCED_DOWNLOAD_FILENAME_INPUT, fileinput);
		if (zipFile) {
			this.click(ReportToolbarUI.ADVANCED_DOWNLOAD_COMPRESS_FILE);
		}
		this.click(ReportToolbarUI.ADVANCED_DOWNLOAD_OK);
		this.switchTab();
		this.sleep(7000);
		if (fileFormat == ReportToolbarUI.ADVANCED_DOWNLOAD_PDF) {
			String command = "taskkill /f /im Acrobat.exe";
			try {
				this.sleep(2000);
				Runtime.getRuntime().exec(command);
				this.sleep(2000);
			}
			catch (IOException e) {
			}
		}
		this.assertFileAndDelete(filename);
	}
	public void advancedDownloadPDF(String fileinput, String filename, boolean zipFile) {
		this.advancedDownloadFile(ReportToolbarUI.ADVANCED_DOWNLOAD_PDF, fileinput, filename, zipFile);
	}
	public void advancedDownloadCSV(String fileinput, String filename, boolean zipFile) {
		this.advancedDownloadFile(ReportToolbarUI.ADVANCED_DOWNLOAD_CSV, fileinput, filename, zipFile);
	}
	public void advancedDownloadWord(String fileinput, String filename, boolean zipFile) {
		this.advancedDownloadFile(ReportToolbarUI.ADVANCED_DOWNLOAD_WORD, fileinput, filename, zipFile);
	}
	public void advancedDownloadExcel(String fileinput, String filename, boolean zipFile) {
		this.advancedDownloadFile(ReportToolbarUI.ADVANCED_DOWNLOAD_EXCEL, fileinput, filename, zipFile);
	}
	private void sendFile(By fileFormat, String emailTo, String subject, String scheduling)
	{
		this.click(ReportToolbarUI.SEND_ICON);
		this.sleep(5000);
		this.click(fileFormat);
		if (emailTo.length() != 0) {
			this.type(ReportToolbarUI.SEND_EMAIL_ADDRESS, emailTo);
		}
		if (subject.length() != 0) {
			this.type(ReportToolbarUI.SEND_SUBJECT, subject);
		}
		if (scheduling.length() != 0) {
			this.selectByValue(ReportToolbarUI.SEND_SCHEDULING_OPTIONS, scheduling);
		}
		this.click(ReportToolbarUI.SEND_BUTTON);
	}
	public void sendPDF(String emailTo, String subject, String scheduling) {
		this.sendFile(ReportToolbarUI.SEND_PDF_ICON, emailTo, subject, scheduling);
	}
	public void sendExcel(String emailTo, String subject, String scheduling) {
		this.sendFile(ReportToolbarUI.SEND_EXCEL_ICON, emailTo, subject, scheduling);
	}
	public void sendCSV(String emailTo, String subject, String scheduling) {
		this.sendFile(ReportToolbarUI.SEND_CSV_ICON, emailTo, subject, scheduling);
	}
	public void sendWord(String emailTo, String subject, String scheduling) {
		this.sendFile(ReportToolbarUI.SEND_WORD_ICON, emailTo, subject, scheduling);
	}
	public void sendHTML(String emailTo, String subject, String scheduling) {
		this.sendFile(ReportToolbarUI.SEND_HTML_ICON, emailTo, subject, scheduling);
	}
	public void sendMobile(String emailTo, String subject, String scheduling) {
		this.sendFile(ReportToolbarUI.SEND_MOBILE_ICON, emailTo, subject, scheduling);
	}
	/*private void advancedSendFile(By fileFormat, String emailTo, String subject, String scheduling)
	{
		this.click(ReportToolbarUI.SEND_ICON);
		try {
			this.sleep(5000);
		} catch (InterruptedException e) {
		}
		this.click(ReportToolbarUI.ADVANCED_SEND_LINK);
		this.switchTab();
		this.click(fileFormat);
		//this.type(ReportToolbarUI, value);
	}*/
	public void extractDataPopUpWindow() {
		this.click(ReportToolbarUI.MORE_ACTIONS_ICON);
		this.click(ReportToolbarUI.EXTRACT_DATA_ICON);
		this.switchTab();
	}
	public void extractDataSwitchReport(String reportValue) {
		this.selectByValue(ReportToolbarUI.EXTRACT_DATA_REPORT_SELECT, reportValue);
	}
	public void extractDataSwitchSegment(String segmentValue) {
		this.selectByValue(ReportToolbarUI.EXTRACT_DATA_SEGMENT_SELECT, segmentValue);
	}
	public void extractDataUpdate_X() {
		this.click(ReportToolbarUI.EXTRACT_DATA_UPDATE_X_LINK);
		this.switchTab();
	}
	public void extractDataUpdate_Y() {
		this.click(ReportToolbarUI.EXTRACT_DATA_UPDATE_Y_LINK);
		this.switchTab();
	}
	public void extractDataUpdate_Z(String filter) {
		this.click(ReportToolbarUI.EXTRACT_DATA_UPDATE_Z_LINK);
		if ("date".equals(filter)) {
			this.switchToWindow("Real Time Data Extract - Choose Date");
		}
		else if ("metrics".equals(filter)) {
			this.switchToWindow("Real Time Data Extract - Choose Metrics");
		}
		else if ("item".equals(filter)) {
			this.switchToWindow("Real Time Data Extract - Filter Data");
		}
		this.sleep(4000);
	}
	public void extractDataType_X(String value) {
		this.selectByValue(ReportToolbarUI.EXTRACT_DATA_TYPE_X_SELECT, value);
	}
	public void extractDataType_Y(String value) {
		this.selectByValue(ReportToolbarUI.EXTRACT_DATA_TYPE_Y_SELECT, value);
	}
	public void extractDataType_Z(String value) {
		this.selectByValue(ReportToolbarUI.EXTRACT_DATA_TYPE_Z_SELECT, value);
	}
	public void extractDataNextButtonClick() {
		this.click(ReportToolbarUI.EXTRACT_DATA_NEXT_BUTTON);
	}
	public void extractDataSendClick() {
		this.click(ReportToolbarUI.EXTRACT_DATA_SEND_BUTTON);
		this.switchTab();
		this.sleep(6000);
		this.getLocator().alert().accept();
	}
	public void extractDateChooseDateShowBy(String value) {
		//this.selectByValue(ReportToolbarUI.EXTRACT_DATA_CHOOSE_DATE_SHOWBY, value);
		this.selectByVisibleText(ReportToolbarUI.EXTRACT_DATA_CHOOSE_DATE_SHOWBY, value);
//		WebElement select = this.findElement(By.name("granularity"));
//		List<WebElement> options = select.findElements(By.tagName("option"));
//		for(WebElement option : options){
//		    if(option.getText().equals(value)) {
//		        option.click();
//		        break;
//		    }
//		}
		//this.type(ReportToolbarUI.EXTRACT_DATA_CHOOSE_DATE_START, "2010-2-10");
		this.sleep(1000);
	}
	public void extractDateChooseDateRange(String value) {
		WebElement select = this.findElement(ReportToolbarUI.EXTRACT_DATA_CHOOSE_DATE_RANGE);
		List<WebElement> optgroups = select.findElements(By.tagName("optgroup"));
		for (WebElement optgroup : optgroups) {
			List<WebElement> options = optgroup.findElements(By.tagName("option"));
			for (WebElement option : options) {
			    if (option.getText().equals(value)) {
			        option.click();
			        break;
			    }
			}
			break;
		}
		this.sleep(3000);
	}
	public void extractDateChooseDateStart(String value) {
		this.type(ReportToolbarUI.EXTRACT_DATA_CHOOSE_DATE_START, value);
	}
	public void extractDateChooseDateEnd(String value) {
		this.type(ReportToolbarUI.EXTRACT_DATA_CHOOSE_DATE_END, value);
	}
	public void extractDateChooseDateOK() {
		this.returnBackToWindow(ReportToolbarUI.EXTRACT_DATA_CHOOSE_DATE_OK, "Real Time Data Extract");
	}
	public void extractDataBookmark() {
		this.click(ReportToolbarUI.EXTRACT_DATA_BOOKMARK);
		this.type(ReportToolbarUI.EXTRACT_DATA_BOOKMARK_NAME, "yluo-auto-dataExtract");
		this.selectByValue(ReportToolbarUI.EXTRACT_DATA_BOOKMARK_FOLDER_SL, "-1");
		this.type(ReportToolbarUI.EXTRACT_DATA_BOOKMARK_FOLDER_TB, "yluo-auto-dataExtract");
	}
	public void checkBookmarkExist(String folderName, String bkName) {
		BookmarkManagerPage bk = new BookmarkManagerPage();
		this.sleep(5000);
		bk.isBkFolderContainsBkForDataExtract(folderName, bkName);
		this.sleep(5000);
		bk.deleteBkFolder(folderName);
		this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
		        + "/sc15/reports/index.html?a=Overview.Site&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
		this.waitUntilPageLoad();
	}
	public void extractDataMetricsAdd(String option) {
		WebElement select = this.findElement(ReportToolbarUI.EXTRACT_DATA_METRICS_AVAILABLE);
		List<WebElement> opts = select.findElements(By.tagName("option"));
		for (WebElement opt : opts) {
		    if (opt.getText().equals(option)) {
			        opt.click();
			        break;
			  }
		}
		this.click(ReportToolbarUI.EXTRACT_DATA_METRICS_ADD);
	}
	public void extracDataMetricsRemove(String option) {
		WebElement select = this.findElement(ReportToolbarUI.EXTRACT_DATA_METRICS_SELECTED);
		List<WebElement> opts = select.findElements(By.tagName("option"));
		for (WebElement opt : opts) {
		    if (opt.getText().equals(option)) {
			        opt.click();
			        break;
			  }
		}
		this.click(ReportToolbarUI.EXTRACT_DATA_METRICS_REMOVE);
	}
	public void extractDataMetricsClickOK() {
		this.returnBackToWindow(ReportToolbarUI.EXTRACT_DATA_METRICS_OK, "Real Time Data Extract");
	}
	private void returnBackToWindow(By button, String windowTitle) {
		this.click(button);
		this.sleep(1000);
		this.switchToWindow(windowTitle);
	}
	public void extractDataItemInputTop(String top, String row) {
		this.clear(ReportToolbarUI.EXTRACT_DATA_ITEM_DETAIL_DEPTH);
		this.type(ReportToolbarUI.EXTRACT_DATA_ITEM_DETAIL_DEPTH, top);
		this.clear(ReportToolbarUI.EXTRACT_DATA_ITEM_ROW);
		this.type(ReportToolbarUI.EXTRACT_DATA_ITEM_ROW, row);
	}
	public void extractDataItemClickOk() {
		this.returnBackToWindow(ReportToolbarUI.EXTRACT_DATA_ITEM_OK, "Real Time Data Extract");
	}
}
