package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;

import base.Hooks;

@Listeners(resources.Listeners.class)

public class PersonalInfoStep5 extends Hooks{

    public WebDriver driver;

    By education = By.cssSelector("select[name='education']");
    By majorMinorBtn = By.cssSelector(".none_ques_3 .major_box");
    By majorMinorCheckBox = By.cssSelector(".modal_edu .mdl_content_exp");
    By majorMinorSubmit = By.cssSelector(".mdl_submit.only_next_btn");
    By yearsOfExperience = By.cssSelector("select[name='year_of_work_experience']");
    By workExperienceBtn = By.cssSelector(".none_ques_2.none_ques_4 > .date_input > .major_box");
    By workExperienceCheckBox = By.cssSelector(".jquery-modal .mdl_content_exp");
    By workExperienceSubmit = By.cssSelector(".mdl_submit_2.only_next_btn");
    By teachingExperience = By.cssSelector(".ques_list .none_ques:nth-of-type(5)");
    By howDidYouLearn = By.cssSelector("select[name='learn']");
    By nextBtn = By.cssSelector("button#btn-next");

    public PersonalInfoStep5() throws IOException {
        super();
    }

    public WebElement getEducation() throws IOException 
    {
        this.driver = getDriver();
		return driver.findElement(education);
    }

    public WebElement getMajorMinorBtn() throws IOException 
    {
        this.driver = getDriver();
		return driver.findElement(majorMinorBtn);
    }

    public WebElement getMajorMinorCheckBox() throws IOException 
    {
        this.driver = getDriver();
		return driver.findElement(majorMinorCheckBox);
    }

    public WebElement getMajorMinorSubmit() throws IOException 
    {
        this.driver = getDriver();
		return driver.findElement(majorMinorSubmit);
    }

    public WebElement getYearsOfExperience() throws IOException 
    {
        this.driver = getDriver();
		return driver.findElement(yearsOfExperience);
    }

    public WebElement getWorkExperienceBtn() throws IOException 
    {
        this.driver = getDriver();
		return driver.findElement(workExperienceBtn);
    }

    public WebElement getWorkExperienceCheckBox() throws IOException 
    {
        this.driver = getDriver();
		return driver.findElement(workExperienceCheckBox);
    }

    public WebElement getWorkExperienceSubmit() throws IOException 
    {
        this.driver = getDriver();
		return driver.findElement(workExperienceSubmit);
    }

    public WebElement getTeachingExperience() throws IOException 
    {
        this.driver = getDriver();
		return driver.findElement(teachingExperience);
    }

    public WebElement getHowDidYouLearn() throws IOException 
    {
        this.driver = getDriver();
		return driver.findElement(howDidYouLearn);
    }

    public WebElement getNextBtn() throws IOException 
    {
        this.driver = getDriver();
		return driver.findElement(nextBtn);
    }
}
