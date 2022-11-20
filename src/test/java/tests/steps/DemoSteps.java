package tests.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tests.utils.Driver;

public class DemoSteps {

    @When("^I go to homepage$")
    public void I_go_to_homepage() {
        Driver.getInstance().get(System.getenv("host"));
    }
    @Then("^homepage should open$")
    public void homepage_should_open() {
        String text = Driver.getInstance().findElement(By.xpath("//p")).getText();
        // just printing title
        System.out.println("our title is=>" + text);
        // verify title
        Assert.assertEquals("title is not correct actual title => " + text,
                "Edit src/App.js and save to reload.", text);
    }
}
