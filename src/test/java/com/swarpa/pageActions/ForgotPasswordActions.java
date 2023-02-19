package com.swarpa.pageActions;

import com.swarpa.pageObjects.ForgotPasswordLocators;
import io.cucumber.java.Before;
import org.openqa.selenium.support.PageFactory;
import com.swarpa.utils.DriverFactory;

import java.io.IOException;

public class ForgotPasswordActions {
   private ForgotPasswordLocators forgotPasswordLocators;

    public ForgotPasswordActions(ForgotPasswordLocators forgotPasswordLocators){
        this.forgotPasswordLocators=forgotPasswordLocators;

    }
    @Before
    private void setup() throws IOException, IOException {
      PageFactory.initElements(DriverFactory.getDriver(),this);
    }
    public String getForgotPasswordPageText() {
        return forgotPasswordLocators.ForgotPasswordHeading.getText();
    }
}