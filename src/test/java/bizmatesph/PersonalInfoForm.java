package bizmatesph;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Hooks;

@Listeners(resources.Listeners.class)

public class PersonalInfoForm extends Hooks{

    public PersonalInfoForm() throws IOException {
        super();
    }

    @Test
    public void FillPersonalInfo() throws IOException
    {
        
    }
    
}
