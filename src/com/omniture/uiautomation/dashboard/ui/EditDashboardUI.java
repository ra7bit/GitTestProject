package com.omniture.uiautomation.dashboard.ui;

import org.openqa.selenium.By;
import com.omniture.uiautomation.adminconsole.ui.AdminConsoleUI;

/**
 * 
 * @author sbli
 * The page you click Layout, you can add and remove reportlets here.
 */
public class EditDashboardUI extends AdminConsoleUI{
		
		
		
		//choose 3*2 layout
		public static By THREEBYTWO = By.xpath("//body/div/div[2]/div/div/div[4]/div/div/div/div[2]/div/div[2]");
		
		//the first blank of 3*2 layout page
		public static By FIRST = By.xpath("//body/div/div[2]/div/div/div[4]/div/div/div/div/div/div");
		
		public static By SECOND = By.xpath("//body/div/div[2]/div/div/div[4]/div/div/div/div/div[2]/div");
		
		
		public static By THIRD = By.xpath("//body/div/div[2]/div/div/div[4]/div/div/div/div/div[3]/div");
		
		
		public static By FOURTH = By.xpath("//body/div/div[2]/div/div/div[4]/div/div/div/div/div[4]/div");
		
		public static By FIFTH = By.xpath("//body/div/div[2]/div/div/div[4]/div/div/div/div/div[5]/div");
		
		//the 6th blank of 3*2 layout page
		public static By SIXTH = By.xpath("//body/div/div[2]/div/div/div[4]/div/div/div/div/div[6]/div");
		
		
		
		
		//Add Content
		public static By ADDCONTENT = By.id("dashboard_external_content_header");
		
		//Add Content
		public static By CUSTOMREPORTLETS = By.xpath("//body/div/div[2]/div/div/div[4]/div[2]/div[2]/h6");
		
		
		public static By DATACONTENT = By.xpath("//body/div/div[2]/div/div/div[4]/div[2]/div[2]/div/h6");
		
		public static By USERCONTENT = By.xpath("//body/div/div[2]/div/div/div[4]/div[2]/div[2]/div/h6[2]");
		
		                                     
		
		
		//Company Summary reportlet
		public static By COMPANYSUMMARY = By.xpath("//div/div/div/label[.='Company Summary']");
		
		public static By COMPANYSUMMARYUPDATE = By.xpath("//body/div/div[2]/div/div/div[4]/div/div/div/div[2]/div[2]/div[3]/div/form/div[3]/input");
		
		
		
		public static By METRICGAUGE = By.xpath("//div/div/div[2]/label[.='Metric Gauge']");
		public static By METRICGAUGEUPDATE = By.xpath("//body/div/div[2]/div/div/div[4]/div/div/div/div[3]/div[2]/div[3]/div/form/div[3]/input");
		
		
		
		public static By REPORTSUITESUMMARY = By.xpath("//div/div/div[3]/label[.='Report Suite Summary']");
		public static By REPORTSUITESUMMARYUPDATE = By.xpath("//body/div/div[2]/div/div/div[4]/div/div/div/div[4]/div[2]/div[3]/div/form/div[3]/input");
		
		
		public static By USAGESUMMARY = By.xpath("//div/div/div[4]/label[.='Usage Summary']");
		public static By USAGESUMMARYUPDATE = By.xpath("//body/div/div[2]/div/div/div[4]/div/div/div/div[5]/div[2]/div[3]/div/form/div[2]/input");
		                                            

		//External Report reportlet under user content                                          
		public static By EXTERNALREPORT = By.xpath("/html/body/div/div[2]/div/div/div[4]/div[2]/div[2]/div/div[2]/div/label");

		//External Report reportlet in edit page
		public static By EXTERNALREPORTURL = By.xpath("/html/body/div/div[2]/div/div/div[4]/div/div/div/div[6]/div[2]/div[3]/div/form/label/input");
		public static By EXTERNALREPORTUPDATE = By.xpath("/html/body/div/div[2]/div/div/div[4]/div/div/div/div[6]/div[2]/div[3]/div/form/div[4]/input");
		
}

