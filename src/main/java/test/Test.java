package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {

    public static void main(String[] args){
        WebDriverManager.chromedriver.setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/v4/");
        driver.close();
    }
}
