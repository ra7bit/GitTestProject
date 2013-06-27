package com.omniture.uiautomation.segmentation;

import com.omniture.uiautomation.tests.OmnitureTest;
import com.omniture.uiautomation.segmentation.pages.*;

/**
 * @author qyzhu
 *
 */

public class Segmentation extends OmnitureTest {

	public SegmentSelectorPage segmentSelectorPage;
	public GlobalSegmentPage globalSegmentPage;
	
	public Segmentation() {
		this.segmentSelectorPage = new SegmentSelectorPage();
		this.globalSegmentPage = new GlobalSegmentPage();
		
		segmentSelectorPage.setWebDriver(this.webDriver);
		globalSegmentPage.setWebDriver(this.webDriver);
	}
}
