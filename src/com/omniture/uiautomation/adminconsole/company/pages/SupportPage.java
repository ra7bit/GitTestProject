package com.omniture.uiautomation.adminconsole.company.pages;

import com.omniture.uiautomation.adminconsole.company.ui.SupportUI;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.OmniturePage;

/**
 * @author ligyu
 */
public class SupportPage extends OmniturePage {

    private String contactName = "SC auto";
    private String contactPhone = "1234567890";
    private String contactEmail = "ligyu@adobe.com";
    public void navigateToSupportPage() {
    	this.getWebDriver().get(TestEnvironment.current.getBaseUrl()
                + "/p/am/1.3/index.html?a=Company.GetSupportInfo"
                + "&ssSession=" + ((ExtendsRemoteWebDriver)this.getWebDriver()).getSession_id());
        this.waitUntilPageLoad();
    }

    public void enableContactInformation() {
        if (!this.checkLanguage("en_US")) {
            this.switchLanguage("en_US");
            }
        if (!this.findElement(SupportUI.ENABLECONTACTINFORMATION_CHECKBOX).isSelected()) {
            this.click(SupportUI.ENABLECONTACTINFORMATION_CHECKBOX);
            }
        this.clear(SupportUI.CONTACTNAME_INPUT);
        this.type(SupportUI.CONTACTNAME_INPUT, contactName);
        this.clear(SupportUI.CONTACTPHONE_INPUT);
        this.type(SupportUI.CONTACTPHONE_INPUT, contactPhone);
        this.clear(SupportUI.CONTACTEMAIL_INPUT);
        this.type(SupportUI.CONTACTEMAIL_INPUT, contactEmail);
    }

    public void enableMainHelp() {
        if (!this.findElement(SupportUI.ENABLEMAINHELP_CHECKBOX).isSelected()) {
            this.click(SupportUI.ENABLEMAINHELP_CHECKBOX);
        }
        this.clear(SupportUI.HELPTITLE_INPUT);
        this.type(SupportUI.HELPTITLE_INPUT, "Help Title");
        this.clear(SupportUI.HELPTEXT_MEMO);
        this.type(SupportUI.HELPTEXT_MEMO, "Help Text");
   }

    public void save() {
        this.click(SupportUI.SAVE_BUTTON);
    }

    public void assertSuccessMessage() {
        this.assertElementTextContain(SupportUI.FLASHMESSAGE_TEXT,
                "Support Information updated");
    }

    public void assertContactInfoShowInFooter() {
    	SecurityPage securityPage = new SecurityPage();
    	securityPage.setWebDriver(this.webDriver);
    	securityPage.navigateToSecurityManager();
        this.assertElementTextContain(SupportUI.CONTACTNAME_FOOTER_TEXT, contactName);
        this.assertElementTextContain(SupportUI.CONTACTPHONE_FOOTER_TEXT, contactPhone);
        this.assertElementTextContain(SupportUI.CONTACEMAIL_FOOTER_TEXT, contactEmail);
    }
}
