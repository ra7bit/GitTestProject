package com.omniture.uiautomation.report.pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import com.omniture.uiautomation.report.ui.ReportHeaderUI;
import com.omniture.uiautomation.report.ui.ReportMetricsUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
 * @author yluo
 */

public class ReportMetricsPage extends ReportHeaderPage {
	public void reportAddMetrics(ReportPage p, By []reportMetricsArray,
	        By reportSettingArea, String reportMetrics) {
		p.folderReportTitle();
		this.click(ReportHeaderUI.ADD_METRICS_BUTTON);
		this.switchTab();
		for (int i = 0; i < reportMetricsArray.length; ++i) {
			this.dragAndDrop(reportMetricsArray[i], ReportMetricsUI.NEXT_METRIC_CONTAINER);
		}
		this.click(ReportMetricsUI.METRICS_OK_BUTTON);
		this.switchTab();
		this.waitUntilPageLoad();
		this.sleep(1000);
		this.assertElementsTextContain(reportSettingArea, reportMetrics);
	}
	public void reportRemoveMetrics(By []reportMetricsArray, By reportSettingArea, String reportMetrics) {
		this.click(ReportHeaderUI.ADD_METRICS_BUTTON);
		this.switchTab();
		for (int i = 0; i < reportMetricsArray.length; ++i) {
			this.dragAndDrop(reportMetricsArray[i], ReportMetricsUI.REMOVE_METRICS_ITEM);
		}
		this.click(ReportMetricsUI.METRICS_OK_BUTTON);
		this.switchTab();
		this.waitUntilPageLoad();
		this.sleep(1000);
		this.assertElementsTextContain(reportSettingArea, reportMetrics);
	}
	public void reportAddCalculatedMetrics(ReportPage p, By reportSettingArea, String reportMetrics) {
		p.folderReportTitle();
		this.click(ReportHeaderUI.ADD_METRICS_BUTTON);
		this.switchTab();
		this.click(ReportMetricsUI.ADD_CACULATED_METRICS_BUTTON);
		this.switchTab();
		//Define numeric metrics
		this.click(ReportMetricsUI.DEFINE_NEW_METRICS_BUTTON);
		this.type(ReportMetricsUI.DEFINE_NEW_METRICS_NAME_TEXTBOX, "auto01");
		this.selectByValue(ReportMetricsUI.AVAILABLE_STANDARD_METRICS_SELECT, "hits");
		this.click(ReportMetricsUI.ADD_TO_FORMULA_BUTTON);
		this.click(ReportMetricsUI.DIVID_BUTTON);
		this.selectByValue(ReportMetricsUI.AVAILABLE_STANDARD_METRICS_SELECT, "visits");
		this.click(ReportMetricsUI.DEFINE_NEW_METRICS_SAVE_BUTTON);
		//Define percent metrics
		this.click(ReportMetricsUI.DEFINE_NEW_METRICS_BUTTON);
		this.click(ReportMetricsUI.DEFINE_NEW_METRICS_PERCENT_RAIDO);
		this.type(ReportMetricsUI.DEFINE_NEW_METRICS_NAME_TEXTBOX, "auto02");
		this.selectByValue(ReportMetricsUI.AVAILABLE_STANDARD_METRICS_SELECT, "hits");
		this.click(ReportMetricsUI.ADD_TO_FORMULA_BUTTON);
		this.click(ReportMetricsUI.PLUS_BUTTON);
		this.selectByValue(ReportMetricsUI.AVAILABLE_STANDARD_METRICS_SELECT, "visits");
		this.click(ReportMetricsUI.DEFINE_NEW_METRICS_SAVE_BUTTON);
		//Define currency metrics
		this.click(ReportMetricsUI.DEFINE_NEW_METRICS_BUTTON);
		this.click(ReportMetricsUI.DEFINE_NEW_METRICS_CURRENCY_RAIDO);
		this.type(ReportMetricsUI.DEFINE_NEW_METRICS_NAME_TEXTBOX, "auto03");
		this.selectByValue(ReportMetricsUI.AVAILABLE_STANDARD_METRICS_SELECT, "hits");
		this.click(ReportMetricsUI.ADD_TO_FORMULA_BUTTON);
		this.click(ReportMetricsUI.MINUS_BUTTON);
		this.selectByValue(ReportMetricsUI.AVAILABLE_STANDARD_METRICS_SELECT, "visits");
		this.click(ReportMetricsUI.DEFINE_NEW_METRICS_SAVE_BUTTON);
		this.click(ReportMetricsUI.CLOSE_AND_REFRESH_LIST_BUTTON);
		this.switchTab();
		//Drag to selected list to verify add successfully or not.
		this.dragAndDrop(ReportMetricsUI.CALCULATED_METRIC0, ReportMetricsUI.NEXT_METRIC_CONTAINER);
		this.dragAndDrop(ReportMetricsUI.CALCULATED_METRIC1, ReportMetricsUI.NEXT_METRIC_CONTAINER);
		this.dragAndDrop(ReportMetricsUI.CALCULATED_METRIC2, ReportMetricsUI.NEXT_METRIC_CONTAINER);
		this.click(ReportMetricsUI.METRICS_OK_BUTTON);
		this.switchTab();
		this.assertElementsTextContain(reportSettingArea, reportMetrics);
	}
	public void deleteCalculatedMetrics(String value) {
		String tmp[] = value.split(",");
		this.click(ReportHeaderUI.ADD_METRICS_BUTTON);
		this.switchTab();
		this.click(ReportMetricsUI.ADD_CACULATED_METRICS_BUTTON);
		this.switchTab();
		for (int i = 0; i < tmp.length; ++i) {
			this.selectByValue(ReportMetricsUI.AVAILABLE_CAL_METRICS_SELECT, tmp[i]);
			this.click(ReportMetricsUI.DELETE_CAL_METRICS_BUTTON);
		}
		this.click(ReportMetricsUI.CLOSE_AND_REFRESH_LIST_BUTTON);
		this.switchTab();
		this.click(ReportMetricsUI.METRICS_OK_BUTTON);
		this.switchTab();
	}
	/*public void calculatedMetricsMakeGlobal(By reportFolder, By report, String reportTitle, By reportSettingArea)
	{
		this.folderReportTitle(reportFolder, report, reportTitle);
		this.click(reportSettingArea);
		this.switchTab();
		this.click(ReportMetricsUI.ADD_CACULATED_METRICS_BUTTON);
		this.switchTab();
		//Define numeric metrics
		this.click(ReportMetricsUI.DEFINE_NEW_METRICS_BUTTON);
		this.type(ReportMetricsUI.DEFINE_NEW_METRICS_NAME_TEXTBOX, "autoGlobalCal01");
		this.selectByValue(ReportMetricsUI.AVAILABLE_STANDARD_METRICS_SELECT, "hits");
		this.click(ReportMetricsUI.ADD_TO_FORMULA_BUTTON);
		this.click(ReportMetricsUI.DIVID_BUTTON);
		this.selectByValue(ReportMetricsUI.AVAILABLE_STANDARD_METRICS_SELECT, "visits");
		this.click(ReportMetricsUI.DEFINE_NEW_METRICS_SAVE_BUTTON);
		this.click(ReportMetricsUI.MAKE_GLOBAL_METRICS_BUTTON);
		this.click(ReportMetricsUI.CLOSE_AND_REFRESH_LIST_BUTTON);
		this.switchTab();
		this.click(ReportMetricsUI.METRICS_OK_BUTTON);
		this.switchTab();
	}*/
	public void addMetricsByName(String []metrics, boolean deleteSelected) {
		this.click(ReportHeaderUI.ADD_METRICS_BUTTON);
		this.switchTab();
		if (deleteSelected) {
			this.deleteAllMetricsFromSelectedList();
		}
		HashMap<String, String> metricsHash = this.getAllMetricsFromAvailableList();
		for (int i=0; i<metrics.length; ++i) {
			for (Entry<String, String> entry : metricsHash.entrySet()) {
				if (entry.getValue().equals(metrics[i])) {
					By tmpSource = By.xpath("//div[@id='" + entry.getKey() +"']");
					this.dragAndDrop(tmpSource, ReportMetricsUI.NEXT_METRIC_CONTAINER);
				}
			}
		}
		this.click(ReportMetricsUI.METRICS_OK_BUTTON);
		this.switchTab();
	}
	public HashMap<String, String> getAllMetricsFromAvailableList() {
		HashMap<String, String> metricsHash = new HashMap<String, String>();
		WebElement availabelList = this.findElement(ReportMetricsUI.STANDARD_METRICS_CONTAINER);
		List<WebElement> metricsList = availabelList.findElements(By.tagName("div"));
		for (WebElement metric : metricsList) {
			List<WebElement> spanList = metric.findElements(By.tagName("span"));
			String metricName = spanList.get(0).getText();
			metricsHash.put(metric.getAttribute("id"), metricName);
		}
		return metricsHash;
	}
	public void deleteAllMetricsFromSelectedList() {
		WebElement selectedList = this.findElement(ReportMetricsUI.SELECTED_METRICS_CONTAINER);
		List<WebElement> metricsList = selectedList.findElements(By.tagName("li"));
		for (WebElement metric : metricsList) {
			if (metric.getAttribute("id") != "next_metric_container") {
				By tmpSource = By.xpath(ReportMetricsUI.SELECTED_METRICS_CONTAINER.toString()+"/li[@id='" + metric.getAttribute("id") + "']");
				this.dragAndDrop(tmpSource, ReportMetricsUI.TRASH_CONTAINER);
			}
		}
	}
}
