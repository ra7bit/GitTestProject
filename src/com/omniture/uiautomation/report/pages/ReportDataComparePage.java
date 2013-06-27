package com.omniture.uiautomation.report.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sikuli.script.*;
import com.omniture.uiautomation.calendar.ui.CalendarManageUI;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.report.ui.ReportToolbarUI;
import com.omniture.uiautomation.report.ui.ReportUI;

public class ReportDataComparePage extends ReportPage {
	private String getCurrentReportScreenShot(String report) {
		return "screenshot/" + TestEnvironment.current.getName() 
				+ "/" + report + ".png";
	}
	public Boolean graphExists(String report) {
		try {
			Screen s = new Screen();
			if (s.exists(getCurrentReportScreenShot(report)) != null) {
				return true;
			}
			else {
				return false;
			}
		}
		catch (Exception e) {
			return false;
		}
	}
	public void changeDateToLastMonth() {
		this.click(CalendarManageUI.CALENDAR);
		this.chooseDateRange("Last month");
		this.click(CalendarManageUI.RUNREPORT);
		this.waitUntilPageLoad();
		this.waitUntilElement(ReportUI.REPORT_TITLE);
	}
	public void chooseDateRange(String value) {
		WebElement select = this.findElement(ReportToolbarUI.EXTRACT_DATA_CHOOSE_DATE_RANGE);
		List<WebElement> optgroups = select.findElements(By.tagName("optgroup"));
		for (WebElement optgroup : optgroups) {
			List<WebElement> options = optgroup.findElements(By.tagName("option"));
			for (WebElement option : options) {
			    if (option.getText().equals(value)) {
			        option.click();
			        break;
			    }
			}
			break;
		}
		this.sleep(3000);
	}
}
