/*******************************************************************************
 * ADOBE CONFIDENTIAL INFORMATION
 * 
 * Copyright (c) 2012 ADOBE LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 * 
 * ***************************************************************************
 * ProductSwitchPage
 * 
 * $Id: ProductSwitchPage.java, v 1.0 Aug 6, 2012 3:07:53 PM$
 * 
 * Created on Aug 6, 2012
 * 
 * @author qyzhu
 ******************************************************************************/

package com.omniture.uiautomation.general.pages;

import java.util.HashMap;

import org.openqa.selenium.By;

import com.omniture.uiautomation.general.ui.ProductSwitchUI;
import com.omniture.uiautomation.pages.OmniturePage;


public class ProductSwitchPage extends OmniturePage {
	

	
	public static HashMap<String, String> ProductURL = new HashMap<String, String>(20);
	
	public static void putProductURL() {
		ProductURL.put("LOGO_SITECATALYST_URL", "https://www.omniture-static.com/images/products/120208/ProductSiteCatalystLogo.png");
		ProductURL.put("LOGO_SEARCHCENTER_URL", "https://www.omniture-static.com/images/suite_header/hdr_logo_sem.png");
		ProductURL.put("LOGO_DISCOVER_URL", "https://www.omniture-static.com/images/products/120208/ProductDiscoverLogo.png");
		ProductURL.put("LOGO_TESTTARGET_URL", "https://www.omniture-static.com/images/products/testandtarget.png");
		ProductURL.put("LOGO_GENESIS_URL", "https://www.omniture-static.com/images/suite_header/hdr_logo_genesis.png");
		ProductURL.put("LOGO_INSIGHT_URL", "https://www.omniture-static.com/images/products/120208/ProductInsightLogo.png");
		ProductURL.put("LOGO_MERCHANDISING_URL", "https://www.omniture-static.com/images/products/120208/ProductMerchandisingLogo.png");
		ProductURL.put("LOGO_SEARCHPROMOTE_URL", "ttps://www.omniture-static.com/images/products/120208/ProductSearchAndPromoteLogo.png");
		ProductURL.put("LOGO_SUREVY_URL", "https://www.omniture-static.com/js/ext/aui/0.9/images/other/products/ProductSurveyLogo.png");
		ProductURL.put("LOGO_RECOMMENDATIONS_URL", "https://www.omniture-static.com/images/products/120208/ProductRecommendationsLogo.png");
		ProductURL.put("LOGO_DIGITALPULSE_URL", "https://www.omniture-static.com/images/products/digitalpulse.png");
		ProductURL.put("LOGO_SCENE7_URL", "https://www.omniture-static.com/images/suite_header/hdr_logo_scene7.png");
		ProductURL.put("LOGO_SOCIALANYLYTICS_URL", "https://www.omniture-static.com/aui/1.0.1/images/other/products/ProductSocialAnalyticsLogo.png");
		//AudienceResearch in beta now, so the logo contains beta
		ProductURL.put("LOGO_AUDIENCERESEARCH_URL", "https://audience.omniture.com/images/ProductAudienceResearchBetaLogo.png");
		
		ProductURL.put("LOGO_DATAWAREHOUSE_URL", "https://www.omniture-static.com/images/products/120208/ProductDataWarehouseLogo.png");
		//NO specific logo for clickmap, it is suite log actually
		ProductURL.put("LOGO_CLICKMAP_URL", "https://www.omniture-static.com/images/products/120208/ProductDigitalMarketingSuiteLogo.png");
		ProductURL.put("LOGO_DASHBOARDPLAYER_URL", "https://www.omniture-static.com/images/products/120208/ProductSiteCatalystDashboardPlayerLogo.png");
		ProductURL.put("LOGO_DIRECTACCESS_URL", "https://www.omniture-static.com/images/products/120208/ProductSiteCatalystDirectAccessLogo.png");
		//NO specific logo for widget, it is sitecatalyst log actually
		ProductURL.put("LOGO_WIDGET_URL", "https://www.omniture-static.com/images/products/120208/ProductSiteCatalystLogo.png");
		//NO specific logo for report builder, it is suite log actually
		ProductURL.put("LOGO_REPORTBUILDER_URL", "https://www.omniture-static.com/images/products/120208/ProductDigitalMarketingSuiteLogo.png");
	}
	

	
	public String getURL(String product) {
		String url = "LOGO_" + product.toUpperCase() + "_URL";
		return ProductURL.get(url);
	}

	public void switchToProduct(String product) {
		By productBy = ProductSwitchUI.getProductUI(product);
		this.waitUntilElementClickable(ProductSwitchUI.SUITE_PRODUCTS_MENU);
		this.click(ProductSwitchUI.SUITE_PRODUCTS_MENU);
		this.waitUntilElementClickable(productBy);
		this.click(productBy);
		this.waitUntilPageLoad();
		
	}
	
	public void switchToSubProduct(String product) {
		By subproductBy = ProductSwitchUI.getProductUI(product);
		this.waitUntilElementClickable(ProductSwitchUI.SUITE_PRODUCTS_MENU);
		this.click(ProductSwitchUI.SUITE_PRODUCTS_MENU);
		this.mouseTo(ProductSwitchUI.PRODUCT_SITECATALYST);
		this.waitUntilElementClickable(subproductBy);
		this.click(subproductBy);
		this.waitUntilPageLoad();
	}
	
	public void assertProductPage(String product) {		
		assert this.findElement(ProductSwitchUI.POSITION_LOGO_IMG).getAttribute("src") ==  this.getURL(product):
			"product header load failed!";
		this.assertElementExists(ProductSwitchUI.POSITION_FOOTER);
		this.assertElementExists(ProductSwitchUI.POSITION_COPYRIGHT);
	}
	
	public void switchToProductFinal(String product) {
		this.switchToProduct(product);
		this.assertProductPage(product);
	}
	
	public void switchToSubProductFinal(String product) {
		this.switchToSubProduct(product);
		this.assertProductPage(product);
	}
}
