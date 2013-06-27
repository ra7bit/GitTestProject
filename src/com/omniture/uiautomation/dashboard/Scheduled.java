package com.omniture.uiautomation.dashboard;

/**
 * 
 * @author Yan HU  (yahu#adobe.com)
 *
 *This class is used to describe the data and the operations in the page "Advanced Delivery Options"
 */

public class Scheduled
{
	// 0/null/false = do nothing, just use the default value. 
	//-------------------Report Options-------------------
	//report file name
	int name=0;//1=default, 2=Custom
	String custormName=null;
	boolean appendDate=false;//false means doing nothing, true means clicking it .
	
	//Report Format
	int format=0;//1=PDF, 2=HTML
	boolean[] formatCheckbox=null;
	
	//Report Contents
	int language=0; //1=English,2=Franch,...
	
	//Additional Documents
	boolean digitalSignature=false;
	
	//Report Destination
	int type=0;//1=Email, 2=FTP
	
	String[] destination=null;
	//email[0]: To,  [1]: From,  [2]: Subject,  [1]: Notes
	//ftp[0]: Host,  [1]: Port, [2]: Directory,  [3]: Username,  [4]: Password
	
	String[] publishingListName=null;
	//--------------------------------------------------------
	boolean scheduled=false;// true=click the link/tab " Scheduling Options"
	//-------------------Scheduling Options-------------------

	int when=0;//1=Send report now, 2=Schedule for later
	
	//----Delivery Frequency
	int howOften=0;//1=hourly, 2=daily, 3=weekly...
	String startOn=null;//Starting on: 
	int time=0;	//Time of day
	
	//-[hourly]-:
	String everyX=null;//Every ? hour(s). null means using default value and do noting to this value in tests, the default value is 1 now. If everyXHours=0, actually 1 is used as default in tests.
	//-[daily]-:
	int everyRadio=0;//1=Every ? day(s), 2= Every weekday (Mon. - Fri.)
	//String everyX=null;//the value of 'Every day(s)'
	//-[weekly]-:
	//String everyX=null;//Recur every ? week(s)
	int dayOfWeek=0;//1=Sunday;2=Monday;...7=Saturday;
	//-[monthly]-:
	//int everyRadio=0;//1=Day ? of every ? month(s); 2=The ? ? of every ? month(s);
	int th=0;//1=1st,2=2nd;3=3rd...
	//String everyX=null;
	//int dayOfWeek=0;//1=Sunday;2=Monday;...7=Saturday;
	//-[yearly]-:
	//int everyRadio=0;//1= Every ? ?; 2=On the ? ? of ?
	int month=0;//1=Jan. ;2=Feb.;...12=Dec.
	//int th=0;//1=1st,2=2nd;3=3rd...
	//int dayOfWeek=0;//1=Sunday;2=Monday;...7=Saturday;
	
	//----End Delivery Options
	int end=0;//1=never end, 2=end afer X occurrence(s)...
	String endAfter=null;
	String endOn=null;
	
	
	//-------------------------Buttons-----------------------------
	//1:Send/Schedule/Save 0:cancel
	int scheduleButton=1;
	
	//-------------------------Setters and Getters-----------------------------
	public int getScheduleButton() {
		return scheduleButton;
	}
	public void setScheduleButton(int scheduleButton) {
		this.scheduleButton = scheduleButton;
	}
	public int getListButton() {
		return listButton;
	}
	public void setListButton(int listButton) {
		this.listButton = listButton;
	}
	int listButton=1;
	
	//---------------------------------------------------------------
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public String getCustormName() {
		return custormName;
	}
	public void setCustormName(String custormName) {
		this.custormName = custormName;
	}
	public boolean isAppendDate() {
		return appendDate;
	}
	public void setAppendDate(boolean appendDate) {
		this.appendDate = appendDate;
	}
	public int getFormat() {
		return format;
	}
	public void setFormat(int format) {
		this.format = format;
	}

	public boolean[] getFormatCheckbox() {
		return formatCheckbox;
	}
	public void setFormatCheckbox(boolean[] formatCheckbox) {
		this.formatCheckbox = formatCheckbox;
	}
	public int getLanguage() {
		return language;
	}
	public void setLanguage(int language) {
		this.language = language;
	}
	public boolean isDigitalSignature() {
		return digitalSignature;
	}
	public void setDigitalSignature(boolean digitalSignature) {
		this.digitalSignature = digitalSignature;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String[] getDestination() {
		return destination;
	}
	public void setDestination(String[] destination) {
		this.destination = destination;
	}
	public int getWhen() {
		return when;
	}
	public void setWhen(int when) {
		this.when = when;
	}
	public int getHowOften() {
		return howOften;
	}
	public void setHowOften(int howOften) {
		this.howOften = howOften;
	}
	public String getStartOn() {
		return startOn;
	}
	public void setStartOn(String startOn) {
		this.startOn = startOn;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public String getEndAfter() {
		return endAfter;
	}
	public void setEndAfter(String endAfter) {
		this.endAfter = endAfter;
	}
	public String getEndOn() {
		return endOn;
	}
	public void setEndOn(String endOn) {
		this.endOn = endOn;
	}
	public String[] getPublishingListName() {
		return publishingListName;
	}
	public void setPublishingListName(String[] publishingListName) {
		this.publishingListName = publishingListName;
	}

	public String getEveryX() {
		return everyX;
	}
	public void setEveryX(String everyX) {
		this.everyX = everyX;
	}
	public int getEveryRadio() {
		return everyRadio;
	}
	public void setEveryRadio(int everyRadio) {
		this.everyRadio = everyRadio;
	}
	public int getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(int dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public int getTh() {
		return th;
	}
	public void setTh(int th) {
		this.th = th;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	public boolean isScheduled() {
		return scheduled;
	}
	public void setScheduled(boolean scheduled) {
		this.scheduled = scheduled;
	}
	
}
