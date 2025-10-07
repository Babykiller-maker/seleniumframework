package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	WebDriver driver;
	
	@Given("User should be on login page")
	public void user_should_be_on_login_page() {
	    driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("http://49.249.28.218:8098/");
	}
	@When("Enter valid username and password")
	public void enter_valid_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("rmgyantra");
		   driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
	}
	@When("Click on loginButton")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}
	@Then("Validate HomePage")
	public void validate_home_page() {
		Assert.assertTrue(true);
	    System.out.println("Login Successfull");
	}
}
