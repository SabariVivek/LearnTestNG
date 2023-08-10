package TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class EnableDisable {

    @Test
    public void methodOne() {
        System.out.println("I am the method 1...");
    }

    @Test(enabled = false)
    public void methodTwo() {
        System.out.println("I am the method 2...");
    }

    @Ignore
    @Test
    public void methodThree() {
        System.out.println("I am the method 3...");
    }
}
