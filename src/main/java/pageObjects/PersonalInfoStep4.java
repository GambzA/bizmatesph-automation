package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;

import base.Hooks;

@Listeners(resources.Listeners.class)

public class PersonalInfoStep4 extends Hooks{

    public WebDriver driver;

    By birthMonth = By.cssSelector("select[name='birthday_month']");
    By birthDate = By.cssSelector("select[name='birthday_day']");
    By birthYear = By.cssSelector("select[name='birthday_year']");
    By gender = By.cssSelector("select[name='gender']");
    By mobileCountryCode = By.cssSelector("input[name='phone_country_code']");
    By mobileNumber = By.cssSelector("input[name='phone_number']");

    public PersonalInfoStep4() throws IOException {
        super();
    }

    public WebElement getBirthMonth() throws IOException 
    {
        this.driver = getDriver();
		return driver.findElement(birthMonth);
    }

    public WebElement getBirthDate() throws IOException 
    {
        this.driver = getDriver();
		return driver.findElement(birthDate);
    }

    public WebElement getBirthYear() throws IOException 
    {
        this.driver = getDriver();
		return driver.findElement(birthYear);
    }

    public WebElement getGender() throws IOException 
    {
        this.driver = getDriver();
		return driver.findElement(gender);
    }

    public WebElement getMobileCountryCode() throws IOException 
    {
        this.driver = getDriver();
		return driver.findElement(mobileCountryCode);
    }

    public WebElement getMobileNumber() throws IOException 
    {
        this.driver = getDriver();
		return driver.findElement(mobileNumber);
    }
}
