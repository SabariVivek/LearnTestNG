package TestNG;

import org.testng.annotations.Test;

/**
 * Always priority for the test is 0...
 * If not priority is mentioned for the tests, it will go with the ASCII Value...
 * Negative values are also allowed...
 */

public class Priority {

    @Test(priority = -2)
    public void browserLaunching() {
        System.out.println("Browser Launching");
    }

    @Test
    public void browserClosing() {
        System.out.println("Browser Closing");
    }

    @Test(priority = -1)
    public void testExecution() {
        System.out.println("Test Execution");
    }
}