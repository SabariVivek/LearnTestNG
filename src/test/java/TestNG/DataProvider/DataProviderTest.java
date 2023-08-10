package TestNG.DataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;


public class DataProviderTest {

    @Test(dataProvider = "LoginValues", dataProviderClass = DataProviderClass.class)
    public void loginMethod(String username, String password, String location) throws Exception {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(2000);
        driver.close();

        System.out.println(username + " : " + password + " : " + location);
    }
}