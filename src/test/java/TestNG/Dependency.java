package TestNG;

import org.testng.annotations.Test;

public class Dependency {

    @Test()
    public void browserLaunching() {
        System.out.println("Browser Launching");
    }

    @Test(dependsOnMethods = "browserLaunching")
    public void testExecution() {
        System.out.println("Test Execution");
    }

    @Test(dependsOnMethods = "testExecution")
    public void browserClosing() {
        System.out.println("Browser Closing");
    }
}
