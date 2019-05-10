package featuresSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilityFunctions.BaseDriver;

public class FeaturesSteps {
	BaseDriver bd = new BaseDriver();
	WebDriver driver = bd.getDriver();

	@Given("^User have Application url to launch$")
	public void i_have_Application_url_to_launch() throws Throwable {
		driver.get("https://www.firstontario.com/find-a-branch-atm");

	}

	@When("^User click on Branches only tab$")
	public void user_click_on_Branches_only_tab() throws Throwable {
		driver.findElement(By.xpath("//div[text()='Branches only']")).click();
	}

	@Then("^All the branches are displayed on the page$")
	public void all_the_branches_are_displayed_on_the_page() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("c1-place-list")));
	}

	@When("^User click on Branches & ATMS tab$")
	public void user_click_on_Branches_ATMS_tab() throws Throwable {
		driver.findElement(By.xpath("//div[text()='Branches & ATMs']")).click();
	}

	@Then("^All the branches and ATM's are displayed on the page$")
	public void all_the_branches_and_ATM_s_are_displayed_on_the_page() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("c1-place-list")));
	}
}
