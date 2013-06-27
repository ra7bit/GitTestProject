/*******************************************************************************
 * ADOBE CONFIDENTIAL INFORMATION
 * 
 * Copyright (c) 2013 ADOBE LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 * 
 * ***************************************************************************
 * DemoTest
 * 
 * $Id: DemoTest.java, v 1.0 2013-4-8 下午3:53:28$
 * 
 * Created on 2013-4-8
 * 
 * @author hsun
 ******************************************************************************/
package com.omniture.uiautomation.report.testcases;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;

import com.omniture.uiautomation.framework.SeleniumPage;
import com.omniture.uiautomation.framework.SeleniumTest;
import com.omniture.uiautomation.framework.TestEnvironment;

public class ChangeSubscribe extends SeleniumTest{

	@Test
	public void testDemo(){
		SeleniumPage p = new SeleniumPage();
		p.setWebDriver(this.webDriver);
		this.webDriver.get(TestEnvironment.current.getBaseUrl());
		p.clear(By.id("company"));
		p.type(By.id("company"), TestEnvironment.current.getCompany());
		p.clear(By.id("username"));
		p.type(By.id("username"), TestEnvironment.current.getUsername());
		p.clear(By.id("password"));
		p.type(By.id("password"), TestEnvironment.current.getPassword());
		p.click(By.name("commit"));
		p.waitUntilElement(By.xpath("//*[@id=\"campaigns\"]/h4/a"));
		try {
			Thread.sleep(10000);
			p.screenshot("1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.click(By.xpath("//*[@id=\"facebook-pages\"]/h4/a"));
		p.waitUntilElement(By.id("sort_dropdown"));
		try {
			Thread.sleep(10000);
			p.screenshot("2");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.selectByValue(By.id("sort"), "subscribers_desc");
		try {
			Thread.sleep(10000);
			p.screenshot("3");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.selectByValue(By.id("sort"), "name_desc");
		try {
			Thread.sleep(10000);
			p.screenshot("4");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.selectByValue(By.id("sort"), "name_asc");
		try {
			Thread.sleep(10000);
			p.screenshot("5");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(true);
	}
}

