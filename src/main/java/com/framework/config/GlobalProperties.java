package com.framework.config;

public final class GlobalProperties {

	// Exceptions constants
	public static final String PROPERTIES_EXCEPTION = "Properties Exception : There was an error processing properties";
	public static final String ScreenShotPath = System.getProperty("user.dir")
			+ PropertiesRepository.getString("screenshot.path");

	// Browser Constants
	public static String BrowserType = null;
	public static String SuiteName = null;
	public static String Environment = null;
	public static final String FIREFOX = "firefox";
	public static final String CHROME = "chrome";
	public static final String IE = "internet explorer";
	public static final String MicrosoftEdge = "edge";
	
	//Environments
	public final static String QAEnv ="qa";
	public final static String UATEnv ="uat";
	

	// Default wait - 10s
	public static final int EXPLICIT_WAIT = PropertiesRepository.getInt("global.driver.wait");

	// Default Properties Files
	public static final String PROPS_LIST = "prop-files.properties";
	public static final String GLOBAL_PROPS = "global.properties";
	public static final String LOG_PROPS = "log4j.properties";
	public static final String LOG_PROPS_HTML = "log4j-h.properties";
	public static final String EXTENT_REPORT_CONFIG = System.getProperty("user.dir")
			+ "/src/main/resources/ExtentReportConfig.xml";

}
