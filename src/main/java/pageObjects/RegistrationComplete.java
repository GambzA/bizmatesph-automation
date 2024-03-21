package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;

import base.Hooks;

@Listeners(resources.Listeners.class)

public class RegistrationComplete extends Hooks{

    public WebDriver driver;
	
	By completeText = By.xpath("/html//div[@id='wrapper']//h1[.='REGISTRATION COMPLETE']");

    public RegistrationComplete() throws IOException {
        super();
    }

    public WebElement getCompleteText() throws IOException
    {
        this.driver = getDriver();
		return driver.findElement(completeText);
    }
}
