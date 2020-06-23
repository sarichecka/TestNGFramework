package com.clearcode.testsuite;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.clearcode.po.HomePage;
import com.clearcode.po.MenuBar;
import com.clearcode.po.PatientPage;
import com.clearcode.po.RealEstatePage;

import dataProvider.Data;
import dataProvider.LoginData;

public class TestSuite1 extends TestSetup{

	//@Test(enabled=false,priority=1,dataProvider="CreatePatient",dataProviderClass=LoginData.class)
//	public void createPatient(String[] data) throws InterruptedException {
	//@Test(dataProvider="addData",dataProviderClass=Data.class)
	@Test(dataProvider="addData",dataProviderClass=Data.class)
	public void realEstate(String desc,String sales,String payment,String term,String interest) throws InterruptedException {
//		wdu.type(HomePage.username_ip, data[0]);
//		wdu.type(HomePage.pwd_ip, data[1]);
//		wdu.click(HomePage.login_btn);
//		wdu.mouseOver(MenuBar.patient_menu);
//		wdu.click(MenuBar.newPatient_menu);
//		wdu.selectByVisibleText(PatientPage.title_select, data[2]);
//		wdu.type(PatientPage.fname_ip, data[3]);
//		wdu.type(PatientPage.lname_ip, data[4]);
		wdu.scrollToMiddle();
		wdu.mouseOver(HomePage.mouseOver_homeLoan);
		wdu.click(HomePage.homeLoan_btn);
		wdu.switchWindowByTitle("Home Loan - Real Estate");
		//wdu.scrollToMiddle();
		wdu.click(RealEstatePage.mortagage_btn);
		wdu.type(RealEstatePage.sale_price, sales);
		wdu.type(RealEstatePage.down_payment, payment);
		wdu.type(RealEstatePage.loan_term, term);
		wdu.type(RealEstatePage.interest_rate, interest);
		wdu.click(RealEstatePage.calculate_btn);
		wdu.paymentDisplay();
	}
	
	//@Test(dataProvider="SearchPatient",dataProviderClass=LoginData.class)
//	public void searchPatient(String user, String pwd, String title, String fname, String lname) throws InterruptedException {
	//@Test
	//public void searchPatient() throws InterruptedException {
	@Test(dataProvider="negativeScenario",dataProviderClass=Data.class)
		public void secondTest(String desc,String sales,String payment,String term,String interest) throws InterruptedException {
//		wdu.type(HomePage.username_ip, user);
//		wdu.type(HomePage.pwd_ip, pwd);
//		wdu.click(HomePage.login_btn);
//		wdu.mouseOver(MenuBar.patient_menu);
//		wdu.click(MenuBar.newPatient_menu);
//		wdu.selectByVisibleText(PatientPage.title_select, title);
//		wdu.type(PatientPage.fname_ip, fname);
//		wdu.type(PatientPage.lname_ip, lname);
			wdu.scrollToMiddle();
			wdu.mouseOver(HomePage.mouseOver_homeLoan);
			wdu.click(HomePage.homeLoan_btn);
			wdu.switchWindowByTitle("Home Loan - Real Estate");
			//wdu.scrollToMiddle();
			wdu.click(RealEstatePage.mortagage_btn);
			wdu.type(RealEstatePage.sale_price, sales);
			wdu.type(RealEstatePage.down_payment, payment);
			wdu.type(RealEstatePage.loan_term, term);
			wdu.type(RealEstatePage.interest_rate, interest);
			wdu.click(RealEstatePage.calculate_btn);
			wdu.paymentNotDisplay();
	}
	
}
