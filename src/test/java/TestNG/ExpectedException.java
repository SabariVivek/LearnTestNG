package TestNG;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class ExpectedException {

    @Test(timeOut = 3000, expectedExceptions = ThreadTimeoutException.class)
    public void timeoutExample() throws Exception {
        Thread.sleep(5000);
    }
}
