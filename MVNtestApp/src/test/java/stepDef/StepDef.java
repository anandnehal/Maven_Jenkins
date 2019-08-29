package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDef {
	public static WebDriver driver;
	@Before
	public void webdriver() {
		   System.setProperty("webdriver.chrome.driver", "E:\\cucumber-selenium jar file\\chromedriver.exe");
		    driver = new ChromeDriver();
	}
	@After
	public void close() {
		driver.quit();
	}
	@Given("^launch facebook$")
	public void launch_facebook()  {
	
	    driver.get("https://www.facebook.com/");
	}

	@Then("^Verify title of webpage$")
	public void verify_title_of_webpage() throws Throwable {
	   String actualTitle = driver.getTitle();
	   String expectedTitle ="";
	   System.out.println(actualTitle);
	}

	@Then("^I enter credentials$")
	public void i_enter_credentials() throws Throwable {
	 WebElement userid = driver.findElement(By.id("email"));
	 WebElement password = driver.findElement(By.id("pass"));
	 userid.clear();
	 userid.sendKeys("anand");
	 userid.sendKeys("jha");
	}
	
}
