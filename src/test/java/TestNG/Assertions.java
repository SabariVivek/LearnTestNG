package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {

    @Test
    public void assertionMethod() {

        boolean bool = false;
        int a = 10, b = 20, c = 10;
        String name = null, value = "Sabari";

        //Assert.assertTrue(bool);
        Assert.assertNotEquals(a, b, "This is equal");
        Assert.assertEquals(a, c, "This is not equal...");
        Assert.assertNotNull(value, "This value contains something...");
        Assert.assertNull(name, "This value doesn't contains anything...");
    }
}
