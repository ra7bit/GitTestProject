/*******************************************************************************
 * ADOBE CONFIDENTIAL INFORMATION
 * 
 * Copyright (c) 2012 ADOBE LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 * 
 * ***************************************************************************
 * ProductSwitchUI
 * 
 * $Id: ProductSwitchUI.java, v 1.0 Aug 6, 2012 3:09:06 PM$
 * 
 * Created on Aug 6, 2012
 * 
 * @author qyzhu
 ******************************************************************************/

package com.omniture.uiautomation.general.ui;

import java.util.HashMap;
import org.openqa.selenium.By;

public class ProductSwitchUI {


	public static By SUITE_PRODUCTS_MENU = By.xpath("//li[@id='suite_products_menu']/a");
	public static By PRODUCT_SITECATALYST = By.xpath("//li[@id='prod_sc_link']/a");

	public static By POSITION_LOGO_IMG = By.xpath("//li[@id='product_logo']/a/img");
	public static By POSITION_FOOTER = By.id("footer_top_container");
	public static By POSITION_COPYRIGHT = By.id("copyright_container");
	
	public static HashMap<String, By> ProductUI = new HashMap<String, By>(20);
	
	public static void putProductUI() {
		ProductUI.put("PRODUCT_SITECATALYST", By.xpath("//li[@id='prod_sc_link']/a"));
		ProductUI.put("PRODUCT_SEARCHCENTER", By.xpath("//li[@id='prod_scm_link']/a"));
		ProductUI.put("PRODUCT_DISCOVER", By.xpath("//li[@id='prod_dsc_link']/a"));
		ProductUI.put("PRODUCT_TESTTARGET", By.xpath("//li[@id='prod_tnt_link']/a"));
		ProductUI.put("PRODUCT_GENESIS", By.xpath("//li[@id='prod_gen_link']/a"));
		ProductUI.put("PRODUCT_INSIGHT", By.xpath("//li[@id='prod_ins_link']/a"));
		ProductUI.put("PRODUCT_MERCHANDISING", By.xpath("//li[@id='prod_mer_link']/a"));
		ProductUI.put("PRODUCT_SEARCHPROMOTE", By.xpath("//li[@id='prod_tc_link']/a"));
		ProductUI.put("PRODUCT_SURVEY", By.xpath("//li[@id='prod_sur_link']/a"));
		ProductUI.put("PRODUCT_RECOMMENDATIONS", By.xpath("//li[@id='prod_rec_link']/a"));
		ProductUI.put("PRODUCT_DIGITALPULSE", By.xpath("//li[@id='prod_dp_link']/a"));
		ProductUI.put("PRODUCT_SCENE7", By.xpath("//li[@id='prod_s7_link']/a"));
		ProductUI.put("PRODUCT_SOCIALANALYTICS", By.xpath("//li[@id='prod_ar_link']/a"));
		ProductUI.put("PRODUCT_AUDIENCERESEARCH", By.xpath("//li[@id='prod_ar_link']/a"));
		
		ProductUI.put("PRODUCT_SITECATALYSTREPORTING", By.xpath("//li[@id='prod_sc_link']/ul/li[*]/a[contains(., 'SiteCatalyst Reporting')]"));
		ProductUI.put("PRODUCT_DATAWAREHOUSE", By.xpath("//li[@id='prod_sc_link']/ul/li[*]/a[contains(., 'Data Warehouse')]"));
		ProductUI.put("PRODUCT_CLICKMAP", By.xpath("//li[@id='prod_sc_link']/ul/li[*]/a[contains(., 'SiteCatalyst ClickMap')]"));
		ProductUI.put("PRODUCT_DASHBOARDPLAYER", By.xpath("//li[@id='prod_sc_link']/ul/li[*]/a[contains(., 'SiteCatalyst Dashboard Player')]"));
		ProductUI.put("PRODUCT_DIRECTACCESS", By.xpath("//li[@id='prod_sc_link']/ul/li[*]/a[contains(., 'SiteCatalyst DirectAccess')]"));
		ProductUI.put("PRODUCT_WIDGET", By.xpath("//li[@id='prod_sc_link']/ul/li[*]/a[contains(., 'SiteCatalyst Widget')]"));
		ProductUI.put("PRODUCT_REPORTBUILDER", By.xpath("//li[@id='prod_sc_link']/ul/li[*]/a[contains(., 'ReportBuilder')]"));
	}
	
	public static By getProductUI(String product) {
		ProductSwitchUI.putProductUI();
		String ui = "PRODUCT_" + product.toUpperCase();
		return ProductUI.get(ui);
	}
	
	public static By getAddressListByIP(String addresss) {
		return By.xpath("//td[@class='no_col_border' and contains(.,'"+addresss+"')]");
	}	
}