package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PageObjectBase extends LogicBase{
     public static WebDriver _driver;


     public PageObjectBase (){
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        _driver = new ChromeDriver();
    }
}
