package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args){
        String url = "https://demo.guru99.com/v4/";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\IdeaProjects\\Selenium_automation\\driver\\chromedriver.exe");
        WebDriver chrome_driver = new ChromeDriver();
        chrome_driver.get(url);
        chrome_driver.close();
    }
}
