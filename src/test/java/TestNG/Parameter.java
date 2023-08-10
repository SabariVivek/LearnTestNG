package TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {

    @Parameters({"username", "password", "browser"})
    @Test
    public void loginMethod(String username, String password, @Optional("Chrome") String browser) {
        System.out.println("Username : " + username);
        System.out.println("Password : " + password);
        System.out.println("Browser : " + browser);
    }
}
