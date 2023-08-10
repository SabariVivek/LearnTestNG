package TestNG;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class Timeout {

    @Test(timeOut = 6000)
    public void timeoutExample() throws Exception {
        Thread.sleep(5000);
    }
}
