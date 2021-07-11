package stepdef;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BaseFixture {
    protected WebDriver driver;
    protected Map<String, Object> vars;
    protected JavascriptExecutor js;

    public BaseFixture() {

          System.setProperty("webdriver.chrome.driver", "C:\\swdtools\\driver\\chromedriver.exe");

//        if(System.getProperty("os.name").contains("Win")) {
//            System.setProperty("webdriver.chrome.driver", "/Users/anil/Documents/swdtools/driver/chromedriver.exe");
//        } else {
//            System.setProperty("webdriver.chrome.driver", "/Users/anil/Documents/swdtools/driver/chromedriver");
//        }

        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popup",0);
        ChromeOptions options = new ChromeOptions();

        //options.addArguments("--headless");


        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        js = (JavascriptExecutor) driver;
        vars = new HashMap<>();

            }
}
