package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftHardAssertions {

    @Test
    public void softAssertion() {
        boolean bool = false;
        int a = 10, b = 20, c = 10;
        String name = null, value = "Sabari";

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(bool, "This is getting failed");
        System.out.println("I have successfully passed the issue...");
        softAssert.assertNotEquals(a, b, "This is equal");
        softAssert.assertEquals(a, c, "This is not equal...");
        softAssert.assertNotNull(value, "This value contains something...");
        softAssert.assertNull(name, "This value doesn't contains anything...");
    }

    @Test
    public void hardAssertion() {
        boolean bool = false;
        int a = 10, b = 20, c = 10;
        String name = null, value = "Sabari";

        //Assert.assertTrue(bool);
        System.out.println("I have successfully passed the issue...");
        Assert.assertNotEquals(a, b, "This is equal");
        Assert.assertEquals(a, c, "This is not equal...");
        Assert.assertNotNull(value, "This value contains something...");
        Assert.assertNull(name, "This value doesn't contains anything...");
    }
}