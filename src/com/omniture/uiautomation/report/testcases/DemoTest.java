/*******************************************************************************
 * ADOBE CONFIDENTIAL INFORMATION
 * 
 * Copyright (c) 2013 ADOBE LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 * 
 * ***************************************************************************
 * DemoTest
 * Created on 2013-4-8
 * 
 * @author hsun
 ******************************************************************************/
package com.omniture.uiautomation.report.testcases;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.omniture.uiautomation.framework.ExtendsRemoteWebDriver;
import com.omniture.uiautomation.framework.SeleniumPage;
import com.omniture.uiautomation.framework.SeleniumTest;
import com.omniture.uiautomation.framework.TestEnvironment;

public class DemoTest extends SeleniumTest{

	public static By USERNAME_INPUT = By.id("email");
	public static By PASSWORD_INPUT = By.id("pass");
	public static By LOGIN_BUTTON = By.id("loginbutton");
	
	public static By USERNAME_INPUT_M = By.name("email");
	public static By PASSWORD_INPUT_M = By.name("pass");
	public static By LOGIN_BUTTON_M = By.name("login");
	
	public static By HEAD_NAV = By.id("headNav");
	public static By HEAD_NAV_M = By.id("mJewelNav");
	
	@Test
	public void testDemo(){
		try {
			Thread.sleep(18000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SeleniumPage p = new SeleniumPage();
		p.setWebDriver(this.webDriver);
		this.webDriver.get("http://apps2.sms.contextoptional.com/apps/45264?destination_page_id=240270592768150");
		System.out.println("1");
		System.out.println(p.isElementExists(By.xpath("//*[@id=\"fb_mobile_tos\"]/button")));
		p.click(By.xpath("//*[@id=\"fb_mobile_tos\"]/button"));
		System.out.println("2");
		if (p.isElementExists(USERNAME_INPUT_M)) {
			p.clear(USERNAME_INPUT_M);
			p.type(USERNAME_INPUT_M, "youwang@adobe.com");

			p.clear(PASSWORD_INPUT_M);
			p.type(PASSWORD_INPUT_M, "youwang");

			p.click(LOGIN_BUTTON_M);

		}
		System.out.println("3");
		p.click(By.xpath("//*[@id=\"screen_widget\"]/div/div[3]/button"));
		p.selectByIndex(By.xpath("//*[@id=\"screen_widget\"]/div/div[3]/div/div[2]/div[1]/select"), 1);
		p.selectByIndex(By.xpath("//*[@id=\"screen_widget\"]/div/div[3]/div/div[2]/div[2]/select"), 1);
		p.selectByIndex(By.xpath("//*[@id=\"screen_widget\"]/div/div[3]/div/div[2]/div[3]/select"), 1);
		p.selectByIndex(By.xpath("//*[@id=\"screen_widget\"]/div/div[2]/div/select"), 1);
		p.type(By.xpath("//*[@id=\"screen_widget\"]/div/div[4]/div/input"), "Hongquan");
		p.type(By.xpath("//*[@id=\"screen_widget\"]/div/div[5]/div/input"), "Sun");
		p.type(By.xpath("//*[@id=\"screen_widget\"]/div/div[6]/div/input"), "hsun@adobe.com");
		p.type(By.xpath("//*[@id=\"screen_widget\"]/div/div[7]/div/input"), "04/09/1985");
		p.type(By.xpath("//*[@id=\"screen_widget\"]/div/div[8]/div/input"), "test");
		p.click(By.xpath("//*[@id=\"screen_widget\"]/div/div[9]/button"));
		
		this.webDriver.switchTo().frame(p.findElement(By.xpath("//*[@id=\"fb-root\"]/div[3]/div/iframe")));
		p.click(By.id("cancel"));
		
	}
}

