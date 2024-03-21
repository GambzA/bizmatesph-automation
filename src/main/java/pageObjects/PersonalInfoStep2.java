package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;

import base.Hooks;

@Listeners(resources.Listeners.class)

public class PersonalInfoStep2 extends Hooks{

    public WebDriver driver;

    By nextBtn = By.cssSelector("button#only_next_btn");
    By haveTin = By.cssSelector(".ques_list.ques_list_phil > li:nth-of-type(1)");
    By haveBPI = By.cssSelector(".ques_list.ques_list_phil > li:nth-of-type(2)");
    By cleanRecord = By.cssSelector(".ques_list.ques_list_phil > li:nth-of-type(3)");
    By registerBIR = By.cssSelector(".ques_list.ques_list_phil > li:nth-of-type(4)");

    public PersonalInfoStep2() throws IOException {
        super();
    }

    public WebElement getNextBtn() throws IOException 
    {
        this.driver = getDriver();
		return driver.findElement(nextBtn);
    }

    public WebElement getHaveTin() throws IOException 
    {
        this.driver = getDriver();
		return driver.findElement(haveTin);
    }

    public WebElement getHaveBPI() throws IOException 
    {
        this.driver = getDriver();
		return driver.findElement(haveBPI);
    }

    public WebElement getCleanRecord() throws IOException 
    {
        this.driver = getDriver();
		return driver.findElement(cleanRecord);
    }

    public WebElement getRegisterBIR() throws IOException 
    {
        this.driver = getDriver();
		return driver.findElement(registerBIR);
    }
}
