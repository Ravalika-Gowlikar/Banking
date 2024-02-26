package bankingpages;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class LoginPage {
	 
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By uName = By.id("username");
	By pswd = By.id("password");
	By sign_btn = By.id("log-in");
	By credit_link = By.xpath("/html/body/div/div[3]/div[1]/ul/li[2]/a/span");
	By debit_link = By.xpath("/html/body/div/div[3]/div[1]/ul/li[3]/a/span");
	By loan_link = By.xpath("/html/body/div/div[3]/div[1]/ul/li[5]/a/span");
	By mortgagees_link = By.xpath("/html/body/div/div[3]/div[1]/ul/li[6]/a/span");
	By addaccount_link = By.xpath("/html/body/div/div[3]/div[2]/div/div/div[1]/div[1]/a[1]/span");
	By payment_link = By.xpath("/html/body/div/div[3]/div[2]/div/div/div[1]/div[1]/a[2]/span");
	By transaction  = By.xpath("/html/body/div/div[3]/div[2]/div/div/div[2]/div");
	
	public void logindetails() throws InterruptedException, IOException {
		
//		Thread.sleep(2000);
//		File src = new File(System.getProperty("user.dir")+"//POMScreenshot//HomePage.png");
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File f2 = ts.getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(f2, src);
		
		driver.findElement(uName).sendKeys("ravali");
		driver.findElement(pswd).sendKeys("ravali@123");
		driver.findElement(sign_btn).click();
		System.out.println("Login Successfully");
		
	}
	
	public void validatecreditcard() {
		Boolean c1 = driver.findElement(credit_link).isDisplayed();
		System.out.println(c1 + "Credit Card link is available");
		
	}
	
	public void validatedebitcard() {
		Boolean c2 = driver.findElement(debit_link).isDisplayed();
		System.out.println(c2 + "Debit Card link is available");
		
	}
	
	public void validateloan() {
		Boolean c3 = driver.findElement(loan_link).isDisplayed();
		System.out.println(c3 + "Loan link is available");
		
	}
	
	public void validateMortgagees() {
		Boolean c4 = driver.findElement(mortgagees_link).isDisplayed();
		System.out.println(c4 + "Mortgagees link is available");
		
	}
	
	public void validateaddaccount() {
		Boolean c5 = driver.findElement(addaccount_link).isDisplayed();
		System.out.println(c5 + "Add Account link is available");
		
	}
	
	public void validatemakepayment() {
		Boolean c6 = driver.findElement(payment_link).isDisplayed();
		System.out.println(c6 + "Make Payment link is available");
		
	}
	
	public void validatetransactions() throws Exception {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(5000);
		File src1 = new File(System.getProperty("user.dir")+"//POMScreenshots//RecentTransactionsPage.png");
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File f21 = ts1.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f21, src1);
		
	}
}