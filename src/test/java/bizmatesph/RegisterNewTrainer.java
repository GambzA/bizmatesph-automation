package bizmatesph;

import java.io.IOException;
import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.ExtentManager;
import base.Hooks;
import pageObjects.Homepage;
import pageObjects.Registration;
import pageObjects.RegistrationComplete;

@Listeners(resources.Listeners.class)

public class RegisterNewTrainer extends Hooks{

    public RegisterNewTrainer() throws IOException {
        super();
    }
    
    @Test
    public void RegisterTest() throws IOException
    {
        Random random = new Random();

        ExtentManager.log("Starting New Trainer Registration...");

        Homepage home = new Homepage();
        home.getApplyNowBtn().click();

        Registration registration = new Registration();
        ExtentManager.log("Now in Registration Page");
        int randomNumber = random.nextInt(4);
        registration.getFirstNameField().sendKeys("Roi Mark");
        registration.getLastNameField().sendKeys("Gamba");
        registration.getEmailField().sendKeys("roi.gamba+"+randomNumber+"@bizmates.ph");
        // registration.getEmailField().sendKeys("roi.gamba+301@bizmates.ph");
        registration.getPrivacyPolicyCheckBox().click();
        registration.getRegisterBtn().click();

        RegistrationComplete regComplete = new RegistrationComplete();
        try {
            Assert.assertEquals("REGISTRATION COMPLETE", regComplete.getCompleteText().getText());
        } catch (Exception e) {
            ExtentManager.fail("Registration Failed!");
        }
    }
}
