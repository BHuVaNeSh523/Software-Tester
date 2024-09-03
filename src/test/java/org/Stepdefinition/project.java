package org.Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class project {

    private WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor js;

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhuvanesh\\eclipse-workspace\\CucumberProject\\driv\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        js = (JavascriptExecutor) driver;
        driver.get("https://scentarts.ae/");
        driver.manage().window().maximize();
    }

    @When("the user navigates to the About Us page")
    public void the_user_navigates_to_the_About_Us_page() {
        WebElement aboutUsLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='About Us'])[1]")));
        aboutUsLink.click();
    }

    @When("the user scrolls down and selects the Hotel, Office, and Healthcare tabs")
    public void the_user_scrolls_down_and_selects_tabs() {
        js.executeScript("window.scrollBy(0,5500);");
        
        WebElement hotelTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class=\"elementor-tab-title\"])[1]")));
        hotelTab.click();
        
        WebElement officeTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class=\"elementor-tab-title\"])[2]")));
        officeTab.click();
        
        WebElement healthcareTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class=\"elementor-tab-title\"])[3]")));
        healthcareTab.click();
    }

    @When("the user navigates to the Our Services page")
    public void the_user_navigates_to_the_Our_Services_page() {
        WebElement ourServicesLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='Our Services'])[1]")));
        ourServicesLink.click();
    }

    @When("the user navigates to the Contact Us page")
    public void the_user_navigates_to_the_Contact_Us_page() {
        WebElement contactUsLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='Contact Us'])[1]")));
        contactUsLink.click();
    }

    @When("the user fills out the contact form")
    public void the_user_fills_out_the_contact_form() {
        WebElement fullName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='form_fields[name]']")));
        fullName.sendKeys("Bhuvanesh");
        
        WebElement companyName = driver.findElement(By.xpath("//input[@name='form_fields[email]']"));
        companyName.sendKeys("wdacscscsd");
        
        WebElement phoneNo = driver.findElement(By.xpath("//input[@name='form_fields[message]']"));
        phoneNo.sendKeys("6380712077");
        
        WebElement email = driver.findElement(By.xpath("//input[@name='form_fields[field_ea2bfcd]']"));
        email.sendKeys("bhuanesh021102@gmail.com");
        
        WebElement message = driver.findElement(By.xpath("//textarea[@name='form_fields[field_7094c9e]']"));
        message.sendKeys("948747sdzxvsvzxvsczv");
    }

    @When("the user submits the contact form")
    public void the_user_submits_the_contact_form() {
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();
    }

    @Then("the user should see a confirmation message")
    public void the_user_should_see_a_confirmation_message() {
       
        //driver.quit();
    }
}
