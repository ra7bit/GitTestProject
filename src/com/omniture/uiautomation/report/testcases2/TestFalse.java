/*******************************************************************************
 * ADOBE CONFIDENTIAL INFORMATION
 * 
 * Copyright (c) 2013 ADOBE LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 * 
 * ***************************************************************************
 * TestFalse
 * 
 * $Id: TestFalse.java, v 1.0 2013-4-3 ÏÂÎç1:21:06$
 * 
 * Created on 2013-4-3
 * 
 * @author hsun
 ******************************************************************************/
package com.omniture.uiautomation.report.testcases2;

import org.junit.Test;

import com.omniture.uiautomation.framework.SeleniumTest;

public class TestFalse extends SeleniumTest {

	@Test
	public void testFalse(){
		assertTrue(false);
	}
}

