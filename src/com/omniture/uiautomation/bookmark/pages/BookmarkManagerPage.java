package com.omniture.uiautomation.bookmark.pages;

import org.openqa.selenium.By;

import com.omniture.uiautomation.bookmark.ui.BookmarkManageUI;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.OmniturePage;
import com.omniture.uiautomation.report.pages.SiteMetricsPage;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;

/**
 * @author dandanj
 */
public class BookmarkManagerPage extends OmniturePage {

	public void navigateToBookmarkManagePage() {
		this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
				+ "/p/suite/1.3/index.html?a=Bookmark.Manager&ssSession="
				+ ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
		// if(!this.checkLanguage("en_US"))
		// this.switchLanguage("en_US");
		this.waitUntilPageLoad();
	}

	public void navigateToPageView() {
		this.getWebDriver()
				.get(TestEnvironment.current.getBaseUrl()
						+ "/sc15/reports/index.html?a=Report.Standard&r=Report.PageViews&rp=page_type"
						+ "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());

		if (!this.checkLanguage("en_US"))
			this.switchLanguage("en_US");
		this.waitUntilPageLoad();
	}

	public void addBookmark(String bkFolderName, String bkName) {
		// call to load PageViews Report
		navigateToPageView();
		this.sleep(6000);
		SiteMetricsPage siteMetricsPage = new SiteMetricsPage();
		siteMetricsPage.setWebDriver(this.webDriver);
		siteMetricsPage.assertPageViewsReportLoad();

		this.click(BookmarkManageUI.BOOKMARK_LINK);
		this.waitUntilElement(BookmarkManageUI.BOOKMARKNAME_INPUT);
		this.type(BookmarkManageUI.BOOKMARKNAME_INPUT, bkName);
		this.selectByValue(BookmarkManageUI.BOOKMARK_ADDTOFOLDER, "-1");
		this.waitUntilElement(BookmarkManageUI.BOOKMARKFOLDERNAME_INPUT);
		this.type(BookmarkManageUI.BOOKMARKFOLDERNAME_INPUT, bkFolderName);
		this.click(BookmarkManageUI.BOOKMARK_SAVE);

		this.sleep(10000);
		// this.assertElementsTextContain(BookmarkManageUI.CONFIRM_MESSAGE,
		// "Bookmark successfully created");
	}

	public void createBkFolder(String bkFolderName) {
		navigateToBookmarkManagePage();
		this.waitUntilElement(BookmarkManageUI.BOOKMARKFOLDER_ADDICON);
		this.click(BookmarkManageUI.BOOKMARKFOLDER_ADDICON);
		this.switchTab();
		this.clear(BookmarkManageUI.BOOKMARKFOLDER_INPUT);
		this.type(BookmarkManageUI.BOOKMARKFOLDER_INPUT, bkFolderName);
		this.click(BookmarkManageUI.BOOKMARKFOLDER_SAVE);

		this.switchTab();
		this.sleep(10000);
		// this.assertElementExists(BookmarkManageUI.getByAssertFolder(bkFolderName));
	}

	public void accessBkFromFolder(String folderName, String bkName) {
		accessFolder(BookmarkManageUI.getByForFolderName(folderName));
		// this.sleep(5000);
		this.waitUntilElement(BookmarkManageUI.getByBkLable(bkName));
		this.click(BookmarkManageUI.getByBkLable(bkName));

		this.sleep(10000);
		this.assertElementExists(BookmarkManageUI.BOOKMARK_REPORT_TITLE);
	}

	public void moveBktoFolder(String bkName, String from, String to) {
		accessFolder(BookmarkManageUI.getByForFolderName(from));
		this.waitUntilElement(BookmarkManageUI.getByBkCheckbox(bkName));
		this.click(BookmarkManageUI.getByBkCheckbox(bkName));
		this.selectByVisibleText(BookmarkManageUI.BOOKMARK_MOVETOFOLDER, to);

		this.sleep(5000);
		// this.assertElementNotExists(BookmarkManageUI.BOOKMARKFOLDER_EXPANDICON);
	}

	/*
	 * Edit bookmark: change name and location
	 */
	public void editBk(String oldBkName, String oldBkFolderName,
			String newBkName, String newBkFolderName) {
		accessFolder(BookmarkManageUI.getByForFolderName(oldBkFolderName));
		this.waitUntilElement(BookmarkManageUI.getByBkEdit(oldBkName));
		this.click(BookmarkManageUI.getByBkEdit(oldBkName));
		this.switchTab();
		this.clear(BookmarkManageUI.BOOKMARK_EDIT_INPUT);
		this.type(BookmarkManageUI.BOOKMARK_EDIT_INPUT, newBkName);
		this.selectByVisibleText(BookmarkManageUI.BOOKMARK_EDIT_LOCATION,
				newBkFolderName);
		this.waitUntilElement(BookmarkManageUI.BOOKMARK_EDIT_OK);
		this.click(BookmarkManageUI.BOOKMARK_EDIT_OK);

		this.switchTab();
		this.assertElementExists(BookmarkManageUI
				.getByForFolderName(newBkFolderName));
	}

	public void editBkFolder(String sourceFolderName, String targetFolderName) {
		navigateToBookmarkManagePage();
		this.waitUntilElement(BookmarkManageUI
				.getByBkFolderEdit(sourceFolderName));
		this.click(BookmarkManageUI.getByBkFolderEdit(sourceFolderName));
		this.switchTab();
		this.clear(BookmarkManageUI.BOOKMARKFOLDER_INPUT);
		this.type(BookmarkManageUI.BOOKMARKFOLDER_INPUT, targetFolderName);
		this.click(BookmarkManageUI.BOOKMARKFOLDER_SAVE);

		this.switchTab();
		this.sleep(10000);
		this.assertElementExists(BookmarkManageUI
				.getByAssertFolder(targetFolderName));
	}

	public void directAccessBk(String bkFolder, String bkName) {
		accessFolder(BookmarkManageUI.getByForFolderName(bkFolder));
		this.waitUntilElement(BookmarkManageUI.getByDirectAccess(bkName));
		this.click(BookmarkManageUI.getByDirectAccess(bkName));
		this.sleep(5000);
	}

	public void makePublicBk(String bkFolder, String bkName, String publicFolder) {
		accessFolder(BookmarkManageUI.getByForFolderName(bkFolder));
		this.waitUntilElement(BookmarkManageUI.getByBkMakePublic(bkName));
		this.click(BookmarkManageUI.getByBkMakePublic(bkName));
		this.switchTab();
		//this.clear(BookmarkManageUI.BOOKMARKSHARD_NEWFOLDER_INPUT);
		this.type(BookmarkManageUI.BOOKMARKSHARD_NEWFOLDER_INPUT, publicFolder);
		this.click(BookmarkManageUI.BOOKMARKSHARD_SAVE);
		this.switchTab();
		this.sleep(6000);
	}

	public void makePrivateBkFolder(String publicFolder) {
		navigateToBookmarkManagePage();
		this.click(BookmarkManageUI.getByBkMakePrivate(publicFolder));
		this.getLocator().alert().accept();
		this.sleep(3000);
		this.assertElementNotExists(BookmarkManageUI
				.getByAssertFolder(publicFolder));
	}

	public void copyMe(String sharedBkFolder, String sharedBk) {
		accessFolder(BookmarkManageUI.getBySharedFolder(sharedBkFolder));
		this.sleep(3000);
		this.click(BookmarkManageUI.getByCopyMe(sharedBk));
		this.sleep(5000);
		this.assertElementExists(BookmarkManageUI
				.getByAssertFolder("Default Folder"));
	}

	public void onMenu(String sharedBkFolder, String sharedBk) {
		accessFolder(BookmarkManageUI.getBySharedFolder(sharedBkFolder));
		this.waitUntilElement(BookmarkManageUI.getByOnMenu(sharedBk));
		this.click(BookmarkManageUI.getByOnMenu(sharedBk));
		this.sleep(5000);
	}

	public void scheduleBkEmail(String bkFolder, String bkName, String format) {
		accessFolder(BookmarkManageUI.getByForFolderName(bkFolder));
		this.click(BookmarkManageUI.getByBkSchedule(bkName));
		this.switchTab();
		this.sleep(10000);
		this.click(BookmarkManageUI.getByBkScheduleFormat(format));
		this.click(BookmarkManageUI.SCHEDULE_EMAIL);
		this.clear(BookmarkManageUI.SCHEDULE_EMAIL_TO);
		this.type(BookmarkManageUI.SCHEDULE_EMAIL_TO, "dandanj@adobe.com");
		this.click(BookmarkManageUI.SCHEDULE_SEND);
		this.switchTab();
		this.sleep(10000);

	}

	public void scheduleBkFTP(String bkFolder, String bkName, String format) {
		accessFolder(BookmarkManageUI.getByForFolderName(bkFolder));
		this.click(BookmarkManageUI.getByBkSchedule(bkName));
		this.switchTab();
		this.sleep(10000);
		this.click(BookmarkManageUI.getByBkScheduleFormat(format));
		this.click(BookmarkManageUI.SCHEDULE_FTP);
		this.clear(BookmarkManageUI.SCHEDULE_FTP_HOST);
		this.type(BookmarkManageUI.SCHEDULE_FTP_HOST, "10.162.181.111");
		this.clear(BookmarkManageUI.SCHEDULE_FTP_DIRECTORY);
		this.type(BookmarkManageUI.SCHEDULE_FTP_DIRECTORY, "/");
		this.clear(BookmarkManageUI.SCHEDULE_FTP_USERNAME);
		this.type(BookmarkManageUI.SCHEDULE_FTP_USERNAME, "dandan");
		this.clear(BookmarkManageUI.SCHEDULE_FTP_PASSWORD);
		this.type(BookmarkManageUI.SCHEDULE_FTP_PASSWORD, "sctest");

		this.click(BookmarkManageUI.SCHEDULE_SEND);
		this.switchTab();
		this.sleep(10000);
	}

	public void deleteBkFolder(String folderName) {
		this.click(BookmarkManageUI.getByBkFolderDelete(folderName));
		this.sleep(2000);
		this.getLocator().alert().accept();
		this.sleep(5000);
		this.assertElementNotExists(BookmarkManageUI
				.getByAssertFolder(folderName));
	}

	public void deleteBk(String folderName, String bkName) {
		accessFolder(BookmarkManageUI.getByForFolderName(folderName));
		this.waitUntilElement(BookmarkManageUI.getByBkDelete(bkName));
		this.click(BookmarkManageUI.getByBkDelete(bkName));
		this.sleep(2000);
		this.getLocator().alert().accept();
		this.sleep(5000);
		this.assertElementNotExists(BookmarkManageUI
				.getByForFolderName(folderName));
	}

	protected void accessFolder(By folderName) {
		navigateToBookmarkManagePage();
		this.sleep(5000);
		this.click(folderName);
	}

	/*
	 * Verify whether bookmark folder exists
	 */
	public boolean isBkFolderExists(String folderName) {
		navigateToBookmarkManagePage();
		return this.isElementExists(BookmarkManageUI
				.getByAssertFolder(folderName));
	}

	/*
	 * Verify whether bookmark exists
	 */
	public boolean isBkExists(String bkName) {
		return this.isElementExists(BookmarkManageUI.getByBkLable(bkName));
	}

	/*
	 * Verify whether bookmark folder is empty
	 */
	public boolean isBkFolderEmpty(String folderName) {
		return !this.isElementExists(BookmarkManageUI
				.getByForFolderName(folderName));
	}

	/*
	 * Verify whether bookmark folder contains a certain bookmark
	 */
	public boolean isBkFolderContainsBk(String folderName, String bkName) {
		navigateToBookmarkManagePage();
		if (!isBkFolderEmpty(folderName)) {
			this.click(BookmarkManageUI.getByForFolderName(folderName));
			return isBkExists(bkName);
		}

		return false;
	}

	public void isBkFolderContainsBkForDataExtract(String folderName,
			String bkName) {
		navigateToBookmarkManagePage();
		if (!isBkFolderEmpty(folderName)) {
			this.click(BookmarkManageUI.getByForFolderName(folderName));
			this.assertElementExists(BookmarkManageUI.getByBkLable(bkName));
		}
	}

}
