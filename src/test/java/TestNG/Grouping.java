package TestNG;

import org.testng.annotations.Test;

public class Grouping {

    @Test(groups = {"Smoke", "Regression"})
    public void methodOne() {
        System.out.println("I am the method 1...");
    }

    @Test(groups = "Regression")
    public void methodTwo() {
        System.out.println("I am the method 2...");
    }

    @Test(groups = {"Unit", "Smoke"})
    public void methodThree() {
        System.out.println("I am the method 3...");
    }
}
