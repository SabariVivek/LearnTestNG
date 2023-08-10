package TestNG.DataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    Object[][] data = {
            {"Sabari", "Sabari@1234", "Chennai"},
            {"Rajesh", "Rajesh@123", "Bangalore"},
            {"Mukesh", "Mukesh@123", "Noida"}
    };

    @DataProvider(name = "LoginValues", parallel = true)
    public Object[][] dataProvider() {
        return data;
    }
}
