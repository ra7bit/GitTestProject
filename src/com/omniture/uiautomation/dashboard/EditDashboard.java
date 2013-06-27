package com.omniture.uiautomation.dashboard;

/**
 * 
 * @author Yan HU  (yahu#adobe.com)
 *
 *This class is used to describe the data and the operations in the page "Edit Dashboard"
 */

public class EditDashboard
{
	String name=null;//Name
	boolean myDefault=false;//Options 1: Display dashboard as SiteCatalyst landing page
	boolean allDefault=false;//Options 2: Set as landing page for all users 
	int button=1;//1=Ok;2=Cancel;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMyDefault() {
		return myDefault;
	}
	public void setMyDefault(boolean myDefault) {
		this.myDefault = myDefault;
	}
	public boolean isAllDefault() {
		return allDefault;
	}
	public void setAllDefault(boolean allDefault) {
		this.allDefault = allDefault;
	}
	public int getButton() {
		return button;
	}
	public void setButton(int button) {
		this.button = button;
	}
}
