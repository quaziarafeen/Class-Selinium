package homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HomePage {

    static String url = "https://www.google.com/";
    static String amazonUrl = "https://www.amazon.com/";

    public static void main(String[] args) {


//        // For Firefox
//        System.setProperty("webdriver.gecko.driver", "BrowserDriver/geckodriver.exe");
//        WebDriver driver1 = new FirefoxDriver();
//        driver1.get(url);
//        // close the Browser
//        driver1.close();
//
//        // For InternetExplorer
//        System.setProperty("webdriver.ie.driver", "BrowserDriver/IEDriverServer.exe");
//        WebDriver driver2 = new InternetExplorerDriver();
//        driver2.get(url);
//        // close the Browser
//        //driver2.close();
//        driver2.quit();

        negivateTo(url);
        negivateTo(amazonUrl);

    }

    public static void negivateTo(String url){
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "BrowserDriver/chromedriver.exe");
        // create a object for chromeDriver
        WebDriver driver = new ChromeDriver();
        // Navigate to Url
        //driver.get(url);
        driver.navigate().to(url);
        //driver.navigate().back();
        // close the Browser
        driver.close();
    }



}
