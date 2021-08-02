import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_IRCTC_Login {
    @Test()
    public void setUp() {
            String url = "https://www.irctc.co.in/";
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            System.out.println(driver.getTitle());
        }
    }


