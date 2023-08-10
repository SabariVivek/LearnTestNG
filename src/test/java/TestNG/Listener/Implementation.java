package TestNG.Listener;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Implementation {

    @Test
    public void methodOne() {
        System.out.println("I am in method one...");
    }

    @Test
    public void methodTwo() {
        System.out.println("I am in method two...");
    }
}
