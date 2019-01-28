import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DotNetTheBest {
    public ChromeDriver driver;
    @Before
    public void setUp() {
        ChromeOptions chromeOptions = new ChromeOptions();
        //  chromeOptions.addArguments("--headless");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Artem_Sevriukov\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver(chromeOptions);
        System.out.println("Test start");
    }
    @After
    public void StalkerQA (){
        System.out.println("success");
        driver.close();
    }
}
