package com.omniture.uiautomation.bookmark;

import com.omniture.uiautomation.bookmark.pages.BookmarkManagerPage;
import com.omniture.uiautomation.tests.OmnitureTest;

/**
 * 
 * @author dandanj
 *
 */
public class BookmarkManage extends OmnitureTest{
	protected  BookmarkManagerPage bookmarkManagerPage;
	
	public BookmarkManage()
    {
        this.bookmarkManagerPage = new BookmarkManagerPage();
        this.bookmarkManagerPage.setWebDriver(this.webDriver);
    }
	
}
