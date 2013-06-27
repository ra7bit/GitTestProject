package com.omniture.uiautomation.bookmark.testcases;

import com.omniture.uiautomation.bookmark.BookmarkManage;

/**
 * 
 * @author dandanj
 * 
 */
public class BookmarkManageTest extends BookmarkManage {

	public static String bk_origin = "SCAutoBookmark";
	public static String bkfolder_origin = "AutoBkFolder";
	public static String bk_new = "SCAutoBookmarkNew";
	public static String bkfolder_new = "AutoBkFolderNew";
	public static String bkfolder_temp = "AutoBkFolderTemp";
	public static String bkfolder_public = "AutoShare";
	public static String bkfolder_sharedfromother = "SharedFromOthers";
	public static String bk_sharedfromother = "bkshared";
	public static String bk_copyme = "Default Folder";
	

	// @Test
	// TC_1261952
	public void testAddBookmark() {
		bookmarkManagerPage.addBookmark(bkfolder_origin, bk_origin);
	}

	// @Test
	// TC 1261969
	public void testAccessBkFromFolder() {
		bookmarkManagerPage.accessBkFromFolder(bkfolder_origin, bk_origin);
	}

	// @Test
	// TC 1261967
	public void testMakePublicBk() {
		bookmarkManagerPage.makePublicBk(bkfolder_origin, bk_origin,
				bkfolder_public);
	}

	// @Test
	// TC1261991
	public void testMakePrivateBk() {
		bookmarkManagerPage.makePrivateBkFolder(bkfolder_public);
	}

	// @Test
	// TC 1261973
	public void testScheduleBkEmailPDF() {
		bookmarkManagerPage.scheduleBkEmail(bkfolder_origin, bk_origin, "pdf");
	}

	// @Test
	// TC 1261974
	public void testScheduleBkEmailCSV() {
		bookmarkManagerPage.scheduleBkEmail(bkfolder_origin, bk_origin, "csv");
	}

	// @Test
	// TC1261975
	public void testScheduleBkEmailXLS() {
		bookmarkManagerPage.scheduleBkEmail(bkfolder_origin, bk_origin, "xls");
	}

	// @Test
	// TC 1261976
	public void testScheduleBkEmailHTML() {
		bookmarkManagerPage.scheduleBkEmail(bkfolder_origin, bk_origin, "html");
	}

	// @Test
	// TC 1261977
	public void testScheduleBkEmailMobile() {
		bookmarkManagerPage.scheduleBkEmail(bkfolder_origin, bk_origin,
				"mobile");
	}

	// @Test
	// TC 1261972
	public void testScheduleBkEmailRTF() {
		bookmarkManagerPage.scheduleBkEmail(bkfolder_origin, bk_origin, "rtf");
	}

	// @Test
	// TC 1261979
	public void testScheduleBkFtpPDF() {
		bookmarkManagerPage.scheduleBkFTP(bkfolder_origin, bk_origin, "pdf");
	}

	// @Test
	// TC 1261980
	public void testScheduleBkFtpCSV() {
		bookmarkManagerPage.scheduleBkFTP(bkfolder_origin, bk_origin, "csv");
	}

	// @Test
	// TC 1261981
	public void testScheduleBkFtpXLS() {
		bookmarkManagerPage.scheduleBkFTP(bkfolder_origin, bk_origin, "xls");
	}

	// @Test
	// TC 1261982
	public void testScheduleBkFtpHTML() {
		bookmarkManagerPage.scheduleBkFTP(bkfolder_origin, bk_origin, "html");
	}

	// @Test
	// TC 1261983
	public void testScheduleBkFtpMobile() {
		bookmarkManagerPage.scheduleBkFTP(bkfolder_origin, bk_origin, "mobile");
	}

	// @Test
	// TC 1261978
	public void testScheduleBkFtpRTF() {
		bookmarkManagerPage.scheduleBkFTP(bkfolder_origin, bk_origin, "rtf");
	}

	// @Test
	// TC 1261958
	public void testCreateBkFolder() {
		bookmarkManagerPage.createBkFolder(bkfolder_temp);
	}

	// @Test
	// TC 1261963
	public void testMoveBktoFolder() {
		bookmarkManagerPage.moveBktoFolder(bk_origin, bkfolder_origin,
				bkfolder_temp);
	}

	// @Test
	// TC 1261971
	public void testEditBk() {
		bookmarkManagerPage.editBk(bk_origin, bkfolder_temp, bk_new,
				bkfolder_origin);
	}

	// @Test
	// TC 1261962
	public void testEditBkFolder() {
		bookmarkManagerPage.editBkFolder(bkfolder_origin, bkfolder_new);
	}

	// @Test
	// TC 1261984
	public void testDeleteBk() {
		if (bookmarkManagerPage.isBkFolderContainsBk(bkfolder_new, bk_new))
			bookmarkManagerPage.deleteBk(bkfolder_new, bk_new);
	}

	// @Test
	// TC 1261960
	public void testDeleteBkFolder() {
		if (bookmarkManagerPage.isBkFolderExists(bkfolder_new))
			bookmarkManagerPage.deleteBkFolder(bkfolder_new);
		if (bookmarkManagerPage.isBkFolderExists(bkfolder_temp))
			bookmarkManagerPage.deleteBkFolder(bkfolder_temp);
		if (bookmarkManagerPage.isBkFolderExists(bkfolder_origin))
			bookmarkManagerPage.deleteBkFolder(bkfolder_origin);
		if (bookmarkManagerPage.isBkFolderExists(bk_copyme))
			bookmarkManagerPage.deleteBkFolder(bk_copyme);
	}
	
	//@Test
	//TC 1261966
	public void testDirectAccess(){
		bookmarkManagerPage.directAccessBk(bkfolder_origin, bk_origin);
	}
	
	//@Test
	//TC 1261986
	public void testCopyMe(){
		bookmarkManagerPage.copyMe(bkfolder_sharedfromother, bk_sharedfromother);
	}
	
	//@Test
	//TC 1261987
	public void testOnMenu(){
		bookmarkManagerPage.onMenu(bkfolder_sharedfromother, bk_sharedfromother);
	}
}
