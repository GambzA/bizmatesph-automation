package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;

import base.Hooks;

@Listeners(resources.Listeners.class)

public class PersonalInfoStep1 extends Hooks{

    public WebDriver driver;

    By startBtn = By.cssSelector("button#register_btn");
    By residentCheckBox = By.cssSelector("[for='phil']");
    By nonResidentCheckBox = By.cssSelector("[for='overseas']");

    public PersonalInfoStep1() throws IOException {
        super();
    }

    public WebElement getStartBtn() throws IOException 
    {
        this.driver = getDriver();
		return driver.findElement(startBtn);
    }
    
    public WebElement getResidentCheckBox() throws IOException 
    {
        this.driver = getDriver();
		return driver.findElement(residentCheckBox);
    }

    public WebElement getNonResidentCheckBox() throws IOException 
    {
        this.driver = getDriver();
		return driver.findElement(nonResidentCheckBox);
    }
}
