package selenium_glu;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static ChromeDriver driver;
    private static int numberodecaso = 0;

    @Before

    public void setUp() {
        numberodecaso ++;
        System.out.println("Se esta ejecutando el test Numero:" + numberodecaso );
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
        driver.manage().window().maximize();
    }

    @After

    public void tearDown() {


        System.out.println(" El Test Numero :" + numberodecaso + " Se ejecuto correctamente");
        driver.quit();
    }

    public static ChromeDriver getDriver() {
        return driver;
    }


}
