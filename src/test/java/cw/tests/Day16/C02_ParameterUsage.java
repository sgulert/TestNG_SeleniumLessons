package cw.tests.Day16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class C02_ParameterUsage {
    protected WebDriver driver;
    //browser konfigürasyonları

    @BeforeMethod
    @Parameters("browser")
    public void setup(@Optional("chrome") String browser){
        //browser parametre olarak alınır

        //switch ya da if else bloklarına tabi tutulur
        switch (browser){
            case "chrome"://browser chrome ise
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "edge"://edge ise
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    // Browser in kapatilmasi
    @AfterMethod
    public void teardown(){

    }

    @Test
    public void test01(){

        driver.get("https://www.amazon.com/");
    }
}
