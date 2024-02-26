package bankingTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bankingpages.LoginPage;

public class BankingTestCases {

	public WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		String URL = "https://demo.applitools.com/";
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}

	@Test
	public void test() throws Exception {

		LoginPage page = new LoginPage(driver);
		page.logindetails();
		page.validatecreditcard();
		page.validatedebitcard();
		page.validateloan();
		page.validateMortgagees();
		page.validateaddaccount();
		page.validatemakepayment();
		page.validatetransactions();

	}

	@AfterTest

	public void tearDown() {
		driver.quit();
	}
}
