package dataProvider;

import org.testng.annotations.DataProvider;

import com.clearcode.utils.ExcelUtils;

public class Data {
	int a=2;
	@DataProvider
	public Object[][] addData(){
		return ExcelUtils.getData("TestData1.xlsx", "Sheet1");
	}
	
	@DataProvider
	public Object[][] negativeScenario(){
		return ExcelUtils.getData("TestData2.xlsx", "Sheet1");
	}
}
