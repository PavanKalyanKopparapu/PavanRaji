import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class Raji3 {
    WebDriver driver = new ChromeDriver();

    public void beforetesting() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavan.Kopparapu\\Downloads\\chromedriver.exe");
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
    }


    public void equa(String a, String b) {
        System.out.println("Actual Output:" + a);
        System.out.println("Expected Output:" + b);
        if (a.equals(b)) {
            System.out.println("Its Successful");
        } else {
            System.out.println("Its Not it is.");
        }
    }

    public void doequa(String a, String b, String c, String d) {
        if (a.equals(b) == true && c.equals(d) == true) {
            System.out.println("Its duo Successful");
        } else {
            System.out.println("Its Not duo it is");
        }
    }

    String a, b, c, d;

    @Test
    public void tC1() {
        beforetesting();
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        a = "Success";
        b = "Success";
        equa(a, b);

    }

    @Test
    public void tC2() {
        beforetesting();
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admi");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        a = (driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText());
        b = "Invalid credentials";
        equa(a, b);

    }

    @Test
    public void tC3() {
        beforetesting();
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        a = (driver.findElement(By.xpath("//div[@class='orangehrm-login-slot-wrapper']//div[1]//div[1]//span[1]")).getText());
        b = "Required";
        c = (driver.findElement(By.xpath("//div[@class='orangehrm-login-slot-wrapper']//div[1]//div[1]//span[1]")).getText());
        d = "Required";
        doequa(a, b, c, d);

    }

    @Test
    public void tC4() {
        beforetesting();
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        a = (driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")).getText());
        b = "Required";
        equa(a, b);

    }

    @Test
    public void tC5() {
        beforetesting();
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        a = (driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")).getText());
        b = "Required";
        equa(a, b);

    }

    @Test
    public void tC6() {
        beforetesting();
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("lol");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        a = (driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText());
        b = "Invalid credentials";
        equa(a, b);

    }

    @Test
    public void tC7() {
        beforetesting();
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("lol");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        a = (driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText());
        b = "Invalid credentials";
        equa(a, b);

    }
}
