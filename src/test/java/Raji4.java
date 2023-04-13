import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class  Raji4 {
    String driverPath = "C://Users//Pavan.Kopparapu//Downloads//chromedriver_win32//chromedriver.exe";
    WebDriver driver = new ChromeDriver();
    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", driverPath);

        System.out.print("https://www.javatpoint.com/");

    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("before test");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("after test");
    }
}
