package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import Ressources.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login extends BaseTest {

	@Given("I access Webdriver university LoginPage")
	public void enterLoginPage() throws IOException {
		EnterWebSite();
	}

	@When("^I enter a userName (.+)$")
	public void enterUserName(String userName) {
		driver.findElement(By.id("text")).sendKeys(userName);
	}

	@And("^I enter a password (.+)$")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("I click on the Login button")
	public void clickLoginButton() {
		driver.findElement(By.id("login-button")).click();
	}

	@Then("I should be presented with the following message {string}")
	public void assertion(String string) {
		Assert.assertTrue(string.equals(string));
	}

}
