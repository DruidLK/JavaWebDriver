package testNgSTuff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	WebDriver driver;
	

	@Parameters("browser")
	@BeforeTest
	public void InitializeBrowser(@Optional("chrome") String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			this.driver = new ChromeDriver();
		}
		
		if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			this.driver = new EdgeDriver();
		}
		
		if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			this.driver = new FirefoxDriver();
		}
		
		else {
			System.out.println("invalid");
		}
		this.driver.manage().window().maximize();
		this.driver.get("https://google.com");
	}
	
	@AfterTest
	public void TearDown() {
		this.driver.quit();	
	}
	
	
	@Test
	public void EnterLogindetail() {
		this.driver.findElement(null).sendKeys();
		this.driver.findElement(null).sendKeys();
		this.driver.findElement(null).sendKeys();
	}
	
	@Parameters("url")
	@Test
	public void MavigateToMyInfo(String url) {
		this.driver.findElement(null).click();
	}
	

}
