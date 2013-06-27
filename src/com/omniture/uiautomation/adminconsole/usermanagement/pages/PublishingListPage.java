/*******************************************************************************
 * Adobe CONFIDENTIAL INFORMATION
 * 
 * Copyright (c) 2012 Adobe LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 * 
 * ***************************************************************************
 * PublishingListPage
 * 
 * $Id: PublishingListPage.java, v 1.0 Aug 13, 2012 5:30:03 PM$
 * 
 * Created on Aug 13, 2012
 * 
 * @author ligyu
 ******************************************************************************/
package com.omniture.uiautomation.adminconsole.usermanagement.pages;

import com.omniture.uiautomation.adminconsole.usermanagement.ui.PublishingListUI;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.OmniturePage;

public class PublishingListPage extends OmniturePage {

    String publishingListName = "sc auto:publishing list";

    public void navigateToPublishingListPage() {
    	this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/p/am/1.3/index.html?a=DeliveryList.Manager"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
        this.waitUntilPageLoad();
    }

    public void addPublishingList() {
        navigateToPublishingListPage();
        this.click(PublishingListUI.ADD_LINK);
        this.type(PublishingListUI.NAME_INPUT, publishingListName);
        this.click(PublishingListUI.EDITEMAIL_LINK);
        this.type(PublishingListUI.EMAIL_TEXTAREA, "@test.com");
        this.click(PublishingListUI.NAME_INPUT);
        this.assertElementTextContain(PublishingListUI.ERROR_TEXT, "e-mail addresses are invalid!");
        this.clear(PublishingListUI.EMAIL_TEXTAREA);
        this.type(PublishingListUI.EMAIL_TEXTAREA, "test@test.com");
        this.click(PublishingListUI.NAME_INPUT);
        this.click(PublishingListUI.SAVE_BUTTON);
        this.assertElementTextContain(PublishingListUI.MESSAGE_TEXT, "The publishing list \"" + publishingListName + "\" was created.");
    }

    public void searchPublishingList() {
        this.type(PublishingListUI.SEARCH_INPUT, publishingListName);
        this.click(PublishingListUI.SEARCHGO_BUTTON);
        this.assertElementExists(PublishingListUI.GetDeleteLinkByName(publishingListName));
    }

    public void editPublishingList() {
        this.click(PublishingListUI.GetEditLinkByName(publishingListName));
        this.click(PublishingListUI.EDITEMAIL1_LINK);
        this.type(PublishingListUI.EMAIL1_TEXTAREA, "test2@test.com");
        this.click(PublishingListUI.NAME_INPUT);
        this.click(PublishingListUI.SAVE_BUTTON);
        this.assertElementTextContain(PublishingListUI.MESSAGE_TEXT, "The publishing list \"" + publishingListName + "\" was updated.");
    }

    public void duplicatePublishingList() {
        this.click(PublishingListUI.GetDuplicateLinkByName(publishingListName));
        this.assertElementTextContain(PublishingListUI.MESSAGE_TEXT, "The publishing list \"" + publishingListName + "\" was duplicated.");
    }

    public void deletePublishingList() {
        this.click(PublishingListUI.GetDeleteLinkByName(publishingListName));
        this.assertElementTextContain(PublishingListUI.MESSAGE_TEXT, "The publishing list \"" + publishingListName + "\" was deleted.");
    }
}

