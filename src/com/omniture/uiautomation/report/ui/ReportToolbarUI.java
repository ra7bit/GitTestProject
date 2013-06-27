package com.omniture.uiautomation.report.ui;

import org.openqa.selenium.By;

/*
 * @author yluo
 */

public class ReportToolbarUI extends ReportUI{

	// UI for toolbar
	public static By DOWNLOAD_ICON = By.xpath("//*[@id='download_tool']/a");
	public static By SEND_ICON = By.xpath("//li[@id='email_tool']/a");
	public static By BOOKMARK_ICON = By.xpath("//li[@id='bookmark_tool']/a");
	public static By DASHBORAD_ICON = By.xpath("//li[@id='dashboard_tool']/a");
	public static By MORE_ACTIONS_ICON = By.xpath("//li[@id='more_tool']/a");

	// UI for download
	public static By DOWNLOAD_PDF_ICON = By.xpath("//*[@id='download_get_options']/form/div/div[3]/ul//span[.='PDF']");
	public static By DOWNLOAD_CSV_ICON = By.xpath("//*[@id='download_get_options']/form/div/div[3]/ul//span[.='CSV']");
	public static By DOWNLOAD_EXCEL_ICON = By.xpath("//*[@id='download_get_options']/form/div/div[3]/ul//span[.='Excel']");
	public static By DOWNLOAD_WORD_ICON = By.xpath("//*[@id='download_get_options']/form/div/div[3]/ul//span[.='Word']");
	
	public static By ADVANCED_DOWNLOAD_LINK = By.xpath("//*[@id='download_report_advanced_link']");
	public static By ADVANCED_DOWNLOAD_PDF = By.xpath("//*[@id='c_file_type_pdf']");
	public static By ADVANCED_DOWNLOAD_CSV = By.xpath("//*[@id='c_file_type_csv']");
	public static By ADVANCED_DOWNLOAD_EXCEL = By.xpath("//*[@id='c_file_type_xls']");
	public static By ADVANCED_DOWNLOAD_WORD = By.xpath("//*[@id='c_file_type_rtf']");
	public static By ADVANCED_DOWNLOAD_OK = By.xpath("//*[@id='form_submit_button']");
	public static By ADVANCED_DOWNLOAD_FILENAME_INPUT = By.xpath("//input[@name='filename']");
	public static By ADVANCED_DOWNLOAD_COMPRESS_FILE = By.xpath("//input[@name='compress_file']");
	
	// UI for send
	public static By SEND_PDF_ICON = By.xpath("//*[@id='schedule_report_container_file_type_pdf']");
	public static By SEND_CSV_ICON = By.xpath("//*[@id='schedule_report_container_file_type_csv']");
	public static By SEND_EXCEL_ICON = By.xpath("//*[@id='schedule_report_container_file_type_xls']");
	public static By SEND_HTML_ICON = By.xpath("//*[@id='schedule_report_container_file_type_html']");
	public static By SEND_WORD_ICON = By.xpath("//*[@id='schedule_report_container_file_type_rtf']");
	public static By SEND_MOBILE_ICON = By.xpath("//*[@id='schedule_report_container_file_type_mobile']");
	public static By SEND_SUBJECT = By.xpath("//input[@name='email_subject']");
	public static By SEND_EMAIL_ADDRESS = By.xpath("//input[@name='email_to']");
	public static By SEND_SCHEDULING_OPTIONS = By.xpath("//*[@id='schedule_report_container_sched_type']");
	public static By SEND_BUTTON = By.xpath("//*[@id='em_send]");
	
	public static By ADVANCED_SEND_LINK = By.xpath("//*[@id='schedule_report_container_advanced_link']");
	public static By ADVANCED_SEND_PDF = By.xpath("//*[@id='c_file_type_pdf']");
	public static By ADVANCED_SEND_CSV = By.xpath("//*[@id='c_file_type_csv']");
	public static By ADVANCED_SEND_XLS = By.xpath("//*[@id='c_file_type_xls']");
	public static By ADVANCED_SEND_HTML = By.xpath("//*[@id='c_file_type_html']");
	public static By ADVANCED_SEND_RTF = By.xpath("//*[@id='c_file_type_rtf']");
	public static By ADVANCED_SEND_MOBILE = By.xpath("//*[@id='c_file_type_mobile']");
	public static By ADVANCED_INCLUDE_HTML_REPORT= By.xpath("//*[@id='full_html']");
	public static By ADVANCED_COMPRESSED_FILE = By.xpath("//*[@id='compress_file']");
	public static By ADVANCED_ROWS_TABLE = By.xpath("//*[@name='max_entries']");
	public static By ADVANCED_COMMENTS = By.xpath("//*[@name='file_comments']");
	public static By ADVANCED_DIGITAL_SIGNATURE = By.xpath("//*[@name='sign_file']");
	public static By ADVANCED_EMAIL_RADIO = By.xpath("//*[@id='send_type_email_radio']");
	public static By ADVANCED_FTP_RADIO = By.xpath("//*[@id='send_type_ftp_radio']");
	public static By ADVANCED_SEND_TO = By.xpath("//*[@name='email_to']");
	public static By ADVANCED_SEND_FROM = By.xpath("//*[@name='email_from']");
	public static By ADVANCED_SEND_SUBJECT = By.xpath("//*[@name='email_subject']");
	public static By ADVANCED_SEND_NOTES = By.xpath("//*[@name='email_notes']");
	public static By ADVANCED_REPORT_NAME_SELECT = By.xpath("//*[@id='use_13_5_default']");
	public static By ADVANCED_REPORT_NAME_TEXTBOX = By.xpath("//*[@id='report_filename']");
	public static By ADVANCED_APPEND_FILE_NAME_CHECKBOX = By.xpath("//*[@id='append_date_checkbox']");
	public static By ADVANCED_FTP_HOST = By.xpath("//*[@name='ftp_host']");
	public static By ADVANCED_FTP_PORT = By.xpath("//*[@name='ftp_port']");	
	public static By ADVANCED_FTP_DIRECTORY = By.xpath("//*[@name='ftp_dir']");
	public static By ADVANCED_FTP_USERNAME = By.xpath("//*[@name='ftp_usrname']");
	public static By ADVANCED_FTP_PASSWORD = By.xpath("//*[@name='ftp_usrpswd']");
	
	public static By ADVANCED_REPORT_OPTIONS = By.xpath("//a[.='Report Options']");
	public static By ADVANCED_SCHEDULING_OPTIONS = By.xpath("//a[.='Scheduling Options']");
	
	public static By ADVANCED_SEND_NOW = By.xpath("//*[@id='send_now_radio']");
	public static By ADVANCED_SEND_LATER = By.xpath("//*[@id='schedule_radio']");
	
	public static By ADVANCED_ROLLING_START_SELECT = By.xpath("//*[@id='sel_rolling_control_start_fixed']");
	public static By ADVANCED_ROLLING_END_SELECT = By.xpath("//*[@id='sel_rolling_control_end_fixed']");
	public static By ADVANCED_DELIVERY_FREQUENCY_SELECT = By.xpath("//*[@id='f_select']");
	
	public static By ADVANCED_SCHEDULED_BUTTON = By.xpath("//*[@name='submit']");
	
	// UI for dashboard
	
	
	// UI for bookmark
	
	// UI for more actions
	public static By EXTRACT_DATA_ICON = By.xpath("//li[@id='extract_tool']/a");
	public static By EXTRACT_DATA_NEXT_BUTTON = By.xpath("//input[@name='next']");
	public static By EXTRACT_DATA_REPORT_SELECT = By.xpath("//*[@id='report_selector']");
	public static By EXTRACT_DATA_SEGMENT_SELECT = By.xpath("//*[@id='ob_segment_id']");
	public static By EXTRACT_DATA_TYPE_Z_SELECT = By.xpath("//select[@name='type_z']");
	public static By EXTRACT_DATA_UPDATE_Z_LINK = By.xpath("//*[@id='update_z']");
	public static By EXTRACT_DATA_TYPE_Y_SELECT = By.xpath("//select[@name='type_y']");
	public static By EXTRACT_DATA_TYPE_X_SELECT = By.xpath("//select[@name='type_x']");
	public static By EXTRACT_DATA_UPDATE_X_LINK = By.xpath("//*[@id='update_x']");
	public static By EXTRACT_DATA_UPDATE_Y_LINK = By.xpath("//*[@id='update_y']");
	public static By EXTRACT_DATA_SEND_BUTTON = By.xpath("//*[@name='send_button']");
	public static By EXTRACT_DATA_EMAIL_TO = By.xpath("//*[@name='email_to']");
	public static By EXTRACT_DATA_SUBJECT = By.xpath("//*[@name='email_subject']");
	public static By EXTRACT_DATA_SCHEDULING = By.xpath("//*[@id='schedule_report_container_sched_type']");
	
	public static By EXTRACT_DATA_CHOOSE_DATE_OK = By.xpath("//*[@id='ok']");
	public static By EXTRACT_DATA_CHOOSE_DATE_SHOWBY = By.id("_granularity_");
	public static By EXTRACT_DATA_CHOOSE_DATE_START = By.xpath("//input[@name='start']");
	public static By EXTRACT_DATA_CHOOSE_DATE_END = By.xpath("//input[@name='end']");
	public static By EXTRACT_DATA_CHOOSE_DATE_RANGE = By.xpath("//*[@name='quickDateRanges']");
	public static By EXTRACT_DATE_CHOOSE_DATE_DAYOFWEEK = By.xpath("//*[@id='dow_type_select']");
	public static By EXTRACT_DATE_CHOOSE_DATE_DAYOFWEEK_CUSTOM_SU = By.xpath("//*[@id='dow_0']");
	public static By EXTRACT_DATE_CHOOSE_DATE_DAYOFWEEK_CUSTOM_MO = By.xpath("//*[@id='dow_1']");
	public static By EXTRACT_DATE_CHOOSE_DATE_DAYOFWEEK_CUSTOM_TU = By.xpath("//*[@id='dow_2']");
	public static By EXTRACT_DATE_CHOOSE_DATE_DAYOFWEEK_CUSTOM_WE = By.xpath("//*[@id='dow_3']");
	public static By EXTRACT_DATE_CHOOSE_DATE_DAYOFWEEK_CUSTOM_TH = By.xpath("//*[@id='dow_4']");
	public static By EXTRACT_DATE_CHOOSE_DATE_DAYOFWEEK_CUSTOM_FR = By.xpath("//*[@id='dow_5']");
	public static By EXTRACT_DATE_CHOOSE_DATE_DAYOFWEEK_CUSTOM_SA = By.xpath("//*[@id='dow_6']");
	
	public static By EXTRACT_DATA_BOOKMARK = By.xpath("//*[@id='bookmark_report_checkbox']");
	public static By EXTRACT_DATA_BOOKMARK_NAME = By.xpath("//*[@name='name']");
	public static By EXTRACT_DATA_BOOKMARK_FOLDER_SL = By.xpath("//*[@id='bm_folder_sel']");
	public static By EXTRACT_DATA_BOOKMARK_FOLDER_TB = By.xpath("//*[@name='new_folder']");
	
	public static By EXTRACT_DATA_METRICS_SELECTED = By.xpath("//*[@name='selected_items']");
	public static By EXTRACT_DATA_METRICS_AVAILABLE = By.xpath("//*[@id='available_items']");
	public static By EXTRACT_DATA_METRICS_ADD = By.xpath("//*[@name='add']");
	public static By EXTRACT_DATA_METRICS_REMOVE = By.xpath("//*[@name='remove']");
	public static By EXTRACT_DATA_METRICS_OK = By.xpath("//*[@name='ok']");
	
	public static By EXTRACT_DATA_ITEM_DETAIL_DEPTH = By.xpath("//*[@name='detail_depth']");
	public static By EXTRACT_DATA_ITEM_ROW = By.xpath("//*[@name='row']");
	public static By EXTRACT_DATA_ITEM_SELECT_SPECIFIC = By.xpath("//*[.='Select Specific']");
	public static By EXTRACT_DATA_ITEM_OK = By.xpath("//*[@name='ok']");
}
