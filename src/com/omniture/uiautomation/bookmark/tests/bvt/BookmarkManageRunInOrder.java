package com.omniture.uiautomation.bookmark.tests.bvt;

import com.omniture.uiautomation.bookmark.testcases.BookmarkManageTest;
import com.omniture.uiautomation.tests.OmnitureTest;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author dandanj
 */
public class BookmarkManageRunInOrder extends OmnitureTest{
    private BookmarkManageTest bookmarkManage;
    
    public BookmarkManageRunInOrder (String name)
    {
        super(name);
        bookmarkManage = new BookmarkManageTest();
    }
    
    //@Test
    public void testAddBookmark(){
        bookmarkManage.testAddBookmark();
    }
    
    //@Test
    public void testAccessBkFolder(){
        bookmarkManage.testAccessBkFromFolder();
    }
    
    //@Test
    public void testMakePublicBk(){
        bookmarkManage.testMakePublicBk();
    }
    
    //@Test
    public void testMakePrivateBk(){
        bookmarkManage.testMakePrivateBk();
    }
    
    //@Test
    public void testDirectAccess(){
    	bookmarkManage.testDirectAccess();
    }
    
    //@Test
    public void testCopyMe(){
    	bookmarkManage.testCopyMe();
    }
    //@Test
    public void testOnMenu(){
    	bookmarkManage.testOnMenu();
    }
    
    //@Test
    public void testScheduleBkEmailPDF(){
        bookmarkManage.testScheduleBkEmailPDF();
    }
    
    //@Test
    public void testScheduleBkEmailCSV(){
        bookmarkManage.testScheduleBkEmailCSV();
    }
    
    //@Test
    public void testScheduleBkEmailXLS(){
        bookmarkManage.testScheduleBkEmailXLS();
    }
    
    //@Test
    public void testScheduleBkEmailHTML(){
        bookmarkManage.testScheduleBkEmailHTML();
    }
    
    //@Test
    public void testScheduleBkEmailMobile(){
        bookmarkManage.testScheduleBkEmailMobile();
    }
    
    //@Test
    public void testScheduleBkEmailRTF(){
        bookmarkManage.testScheduleBkEmailRTF();
    }
    
    //@Test
    public void testScheduleBkFtpPDF(){
        bookmarkManage.testScheduleBkFtpPDF();
    }
    
    //@Test
    public void testScheduleBkFtpCSV(){
        bookmarkManage.testScheduleBkFtpCSV();
    }
    
    //@Test
    public void testScheduleBkFtpXLS(){
        bookmarkManage.testScheduleBkFtpXLS();
    }
    
    //@Test
    public void testScheduleBkFtpHTML(){
        bookmarkManage.testScheduleBkFtpHTML();
    }
    
    //@Test
    public void testScheduleBkFtpMobile(){
        bookmarkManage.testScheduleBkFtpMobile();
    }
    
    //@Test
    public void testScheduleBkFtpRTF(){
        bookmarkManage.testScheduleBkFtpRTF();
    }
    
  //@Test
    public void testCreateBkFolder(){
        bookmarkManage.testCreateBkFolder();
    }
    
    //@Test
    public void testMoveBktoFolder(){
        bookmarkManage.testMoveBktoFolder();
    }
    
    //@Test
    public void testEditBk(){
        bookmarkManage.testEditBk();
    }
    
    //@Test
    public void testEditBkFolder(){
        bookmarkManage.testEditBkFolder();
    }
    //@Test
    public void testDeleteBk(){
        bookmarkManage.testDeleteBk();
    }
    
    //@Test
    public void testDeleteBkFolder(){
        bookmarkManage.testDeleteBkFolder();
    }
    
    public static Test suite(){
        TestSuite suite = new TestSuite("Bookmark function test...");
        suite.addTest(new BookmarkManageRunInOrder("testAddBookmark"));
        suite.addTest(new BookmarkManageRunInOrder("testAccessBkFolder"));
        suite.addTest(new BookmarkManageRunInOrder("testMakePublicBk"));
        suite.addTest(new BookmarkManageRunInOrder("testMakePrivateBk"));
        suite.addTest(new BookmarkManageRunInOrder("testDirectAccess"));
        suite.addTest(new BookmarkManageRunInOrder("testCopyMe"));
        suite.addTest(new BookmarkManageRunInOrder("testOnMenu"));
        suite.addTest(new BookmarkManageRunInOrder("testScheduleBkEmailPDF"));
        suite.addTest(new BookmarkManageRunInOrder("testScheduleBkEmailCSV"));
        suite.addTest(new BookmarkManageRunInOrder("testScheduleBkEmailXLS"));
        suite.addTest(new BookmarkManageRunInOrder("testScheduleBkEmailHTML"));
        suite.addTest(new BookmarkManageRunInOrder("testScheduleBkEmailMobile"));
        suite.addTest(new BookmarkManageRunInOrder("testScheduleBkEmailRTF"));
        suite.addTest(new BookmarkManageRunInOrder("testScheduleBkFtpPDF"));
        suite.addTest(new BookmarkManageRunInOrder("testScheduleBkFtpCSV"));
        suite.addTest(new BookmarkManageRunInOrder("testScheduleBkFtpXLS"));
        suite.addTest(new BookmarkManageRunInOrder("testScheduleBkFtpHTML"));
        suite.addTest(new BookmarkManageRunInOrder("testScheduleBkFtpMobile"));
        suite.addTest(new BookmarkManageRunInOrder("testScheduleBkFtpRTF"));
        suite.addTest(new BookmarkManageRunInOrder("testCreateBkFolder"));
        suite.addTest(new BookmarkManageRunInOrder("testMoveBktoFolder"));
        suite.addTest(new BookmarkManageRunInOrder("testEditBk"));
        suite.addTest(new BookmarkManageRunInOrder("testEditBkFolder"));
        suite.addTest(new BookmarkManageRunInOrder("testDeleteBk"));
        suite.addTest(new BookmarkManageRunInOrder("testDeleteBkFolder"));
        return suite;
    }
}
