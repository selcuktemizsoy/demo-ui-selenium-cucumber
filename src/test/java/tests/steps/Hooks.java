package tests.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import tests.utils.Driver;

public class Hooks {
    @Before
    public void setup() {
        System.out.println("this is setup section for your tests.\n" +
                "you should setup the things here");

    }

    @After
    public void tearDown() {
        System.out.println("this is tear down method. You can add what ever you want to run after each execution");
        Driver.closeDriver();
    }
}
