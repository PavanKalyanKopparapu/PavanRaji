import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Raji2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan.Kopparapu\\Downloads\\chromedriver.exe");

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().setSize(new Dimension(1400, 1200));
        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
        driver.close();
    }
}
