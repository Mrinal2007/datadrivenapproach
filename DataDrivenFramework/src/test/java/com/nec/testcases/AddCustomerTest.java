package com.nec.testcases;

import java.rmi.registry.LocateRegistry;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.nec.base.TestBase;

public class AddCustomerTest extends TestBase{

	
		// TODO Auto-generated method stub
	    @Test(dataProvider="getdata")
	    public void addCustomer(String firstName,String lastName,String postCode, String alertText) throws InterruptedException
	    {
	    	
	    	driver.findElement(By.cssSelector(OR.getProperty("addCustBtn"))).click();
	    	driver.findElement(By.cssSelector(OR.getProperty("firstname"))).sendKeys(firstName);
	    	driver.findElement(By.cssSelector(OR.getProperty("lastname"))).sendKeys(lastName);
	    	driver.findElement(By.cssSelector(OR.getProperty("postcode"))).sendKeys(postCode);;
	    	driver.findElement(By.cssSelector(OR.getProperty("addBtn"))).click();
	    	Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	    	Assert.assertTrue(alert.getText().contains(alertText));
	    	//Assert.assertTrue(driver.switchTo().alert().getText().contains(alertText));
	    	Thread.sleep(3000);
	    	alert.accept();
	    	//driver.switchTo().alert().accept();      
	    	Thread.sleep(3000);
	}

	    
	     @DataProvider
	     public Object [] [] getdata()
	     {
	    	 String sheetName = "AddCustomerTest";
			int rows = excel.getRowCount(sheetName);
	 		int cols = excel.getColumnCount(sheetName);

	 		Object[][] data = new Object[rows - 1][cols];
	 		
	 		
	 		for (int rowNum = 2; rowNum <= rows; rowNum++) { // 2

				//table = new Hashtable<String,String>();
				
				for (int colNum = 0; colNum < cols; colNum++) {
					data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum);
	     }
				}
	 		
	 		return data;
	     }
	     
}
