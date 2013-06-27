/*******************************************************************************
 * ADOBE CONFIDENTIAL INFORMATION
 * 
 * Copyright (c) 2012 ADOBE LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 * 
 * ***************************************************************************
 * ProductSwitch
 * 
 * $Id: ProductSwitch.java, v 1.0 Aug 6, 2012 3:08:03 PM$
 * 
 * Created on Aug 6, 2012
 * 
 * @author qyzhu
 ******************************************************************************/

package com.omniture.uiautomation.general;

import com.omniture.uiautomation.general.pages.ProductSwitchPage;
import com.omniture.uiautomation.tests.OmnitureTest;

public class ProductSwitch extends OmnitureTest {

	protected ProductSwitchPage page;

	
	public ProductSwitch() {
		this.page = new ProductSwitchPage();
		page.setWebDriver(this.webDriver);

	}

}
