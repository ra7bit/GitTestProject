/*******************************************************************************
 * Adobe CONFIDENTIAL INFORMATION
 *
 * Copyright (c) 2012 Adobe LLC. All Rights Reserved. Unauthorized reproduction,
 * transmission, or distribution of this software is a violation of applicable
 * laws.
 *
 * ***************************************************************************
 * Functions
 *
 * $Id: Functions.java, v 1.0 Aug 17, 2012 1:12:57 PM$
 *
 * Created on Aug 17, 2012
 *
 * @author ligyu
 ******************************************************************************/
package com.omniture.uiautomation.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Functions {
    
    public static String getTimeMillisString() {
        java.util.Date now = new java.util.Date();
        java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(
                "yyMMdd_HHmm");
        return formatter.format(now);
    }
    
    public static void snapshotBrowser(WebDriver driver, String caseName) {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("c:\\Users\\ligyu\\.jenkins\\jobs\\SC Automation Debug\\workspace\\screenshot\\"+caseName+getTimeMillisString()+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }    
}

