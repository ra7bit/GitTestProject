package com.omniture.uiautomation.adminconsole.company.tests.bvt;

import org.junit.Test;

import com.omniture.uiautomation.adminconsole.company.Company;

/**
 * @author ligyu
 */

public class CompanyIndexTest extends Company {

    @Test
    public void testCompanyIndex() {
		companyIndex.navigateToCompanyIndex();
		companyIndex.assertCompanyIndexComponents();
	}

}
