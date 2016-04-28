package SetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by User on 21.04.2016.
 */
public class SetUp {
    WebDriver driver;

    public WebDriver gerDriver(){
        if(driver == null){
            driver = new FirefoxDriver();
        }
        return driver;
    }

}
