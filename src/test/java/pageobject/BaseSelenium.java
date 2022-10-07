package pageobject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import settings.BasePage;

import java.util.concurrent.TimeUnit;

public class BaseSelenium {
    protected static WebDriver driver;
    protected static final String LINK_FOR_SERVES_SAMOKATE = "https://qa-scooter.praktikum-services.ru/";

    @BeforeClass
    public static void setUp() {
        //WebDriverManager.firefoxdriver().setup();
        //driver = new FirefoxDriver();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        BasePage.setDriver(driver);
        driver.get(LINK_FOR_SERVES_SAMOKATE);

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}


