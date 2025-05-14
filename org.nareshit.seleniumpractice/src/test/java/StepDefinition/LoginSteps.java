package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class LoginSteps {
	WebDriver driver;
	@Given("user is on OrangeHRM Login page")
	public void user_is_on_orange_hrm_login_page() {
		   driver=new ChromeDriver();
	       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       driver.manage().window().maximize();
	}

	@When("user enter valid username and password\\(username:{string}, password:{string})")
	public void user_enter_valid_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");	   
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {		
	   
	  driver.findElement(By.xpath("//button[contains(@class, 'orangehrm-login-button']")).click();  
	}

	@Then("user should redirect to dashboard page")
	public void user_should_redirect_to_dashboard_page() {
	    
		boolean status = driver.findElement(By.xpath("//h6[text()='Dashboard]'")).isDisplayed();
	    Assert.assertEquals(status, true);
	    
	}

	@Then("close the browser")
	public void close_the_browser() {
	   
	    driver.quit();
	}

}
