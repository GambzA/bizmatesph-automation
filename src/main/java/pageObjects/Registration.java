package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;

import base.Hooks;

@Listeners(resources.Listeners.class)

public class Registration extends Hooks{

    public WebDriver driver;
	
	By firstNameField = By.cssSelector("#firstName");
	By lastNameField = By.cssSelector("#lastName");
	By emailField = By.cssSelector("#inputEmail");
    By privacyPolicyCheckBox = By.cssSelector(".label_1.label_2");
    By registerBtn = By.cssSelector(".register_btn");

    public Registration() throws IOException {
        super();
    }

    public WebElement getFirstNameField() throws IOException
    {
        this.driver = getDriver();
		return driver.findElement(firstNameField);
    }

    public WebElement getLastNameField() throws IOException
    {
        this.driver = getDriver();
		return driver.findElement(lastNameField);
    }

    public WebElement getEmailField() throws IOException
    {
        this.driver = getDriver();
		return driver.findElement(emailField);
    }

    public WebElement getPrivacyPolicyCheckBox() throws IOException
    {
        this.driver = getDriver();
		return driver.findElement(privacyPolicyCheckBox);
    }
    
    public WebElement getRegisterBtn() throws IOException
    {
        this.driver = getDriver();
		return driver.findElement(registerBtn);
    }
}
