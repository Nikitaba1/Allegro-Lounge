package com.Book_lounge.listnerUtility;
/**
 * @author Nikitaba Parmar
 */

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Book_lounge.baseclass.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * @author Nikitaba Parmar
 */

public class Listener_Implimentation implements ITestListener,ISuiteListener {
	/**
	 * It is used form generate Extent report
	 */
	public static ExtentTest test;
	public static ExtentReports report;
	public ExtentSparkReporter spark;
	@Override
	public void onStart(ISuite suite) {
		String time=new Date().toString().replace(" ", "_").replace(":","_");
		spark= new ExtentSparkReporter("./AdvanceExtent Report/Report_"+time+".html");
		spark.config().setDocumentTitle("Book_Lounge advance Report");
		spark.config().setReportName("Book_Lounge Result");
		spark.config().setTheme(Theme.DARK);
		
		report= new ExtentReports();
		report.attachReporter(spark);
		
	}
	/**
	 * Save the Report
	 */
	@Override
	public void onFinish(ISuite suite) {
		report.flush();
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
	}
	/**
	 * It's Take ScreenShot of Fail method using @Listner
	 */

	@Override
	public void onTestFailure(ITestResult result) {
		String Methodname=result.getMethod().getMethodName();
		TakesScreenshot ts = (TakesScreenshot)BaseClass.sdriver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		String time=new Date().toString().replace(" ", "_").replace(":", "-");
		File Source= File(".//screenshot/"+Methodname+time+".png");
		try {
			FileHandler.copy(temp, Source);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private File File(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	
}
