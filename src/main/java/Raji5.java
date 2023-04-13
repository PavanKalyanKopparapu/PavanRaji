import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;



public class Raji5 {
    public static void main(String args[]) {
        String[] userName = {"Admin", "admin", "", "Admin", "Ad"};
        String[] passWord = {"admin123", "Admin12", "", "", "admin123"};
        String a, c, d, e;
        for (int i = 0; i < userName.length; i++) {
            for (int j = 0; j < passWord.length; j++) {
                WebDriver driver = new ChromeDriver();
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavan.Kopparapu\\Downloads\\chromedriver.exe");
                driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
                driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
                System.out.println("u " + i + userName[i]);
                System.out.println("p " + j + passWord[j]);
                driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(userName[i]);
                driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(passWord[j]);
                driver.findElement(By.xpath("//button[@type='submit']")).click();
                if (userName[i] == "Admin" && passWord[j] == "admin123") {
                    System.out.println("Right");
                } else if (userName[i] != "" && passWord[j] != "") {
                    c = (driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText());
                    System.out.println(c);
                    d = "Invalid credentials";
                    if (c != null && c.equals(d)) {
                        System.out.println("Its SuccessFul A");
                    } else {
                        System.out.println("Its not");
                    }
                    driver.quit();
                } else if (userName[i] == "" || passWord[j] == "" || userName[i] != "" || passWord[j] != "") {

                    a = (driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText());
                    System.out.println(a);
                    e = "Required";
                    if (a != null && a.equals(e) /*|| b != null && b.equals(ex)*/) {
                        System.out.println("Its SuccessFul B");
                    } else {
                        System.out.println("Its not");
                    }
                    driver.quit();
                } else {
                    System.out.println("Wrong");
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException f) {
                }
                i++;
            }
        }
    }
}
