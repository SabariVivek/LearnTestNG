package TestNG.Listener;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter {

    public void onTestStart(ITestResult result) {
        System.out.println("Test Started Successfully");
    }

    public void onTestSuccess(ITestResult tr) {
        System.out.println("Test Successfully Passed...");
    }

    public void onTestFailure(ITestResult tr) {
        System.out.println("Screenshot Captured...");
    }

    public void onFinish(ITestContext testContext) {
        System.out.println("Test Finished Successfully");
    }
}