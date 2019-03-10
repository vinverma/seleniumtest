
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;
public class App
{
 @Test

 public static void main(String[] args) {


 System.setProperty("webdriver.chrome.driver","/Users/Shared/Jenkins/Home/workspace/SeleniumTestPipeline/chromedriver");
 ChromeOptions chromeOptions = new ChromeOptions();
 WebDriver driver = new ChromeDriver(chromeOptions);

 System.out.println("Hi, Welcome to Edureka's YouTube Live session on Selenium WebDriver");


 driver.get("http://localhost:9090/Devops");

 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
 driver.findElement(By.className("v-button")).click();
  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
 driver.findElement(By.id("gwt-uid-5")).sendKeys("Edureka");
  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
 driver.findElement(By.id("gwt-uid-7")).sendKeys("DevOps");
  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
 driver.findElement(By.id("gwt-uid-9")).sendKeys("9834562709");
  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
 driver.findElement(By.id("gwt-uid-11")).sendKeys("Devops@edureka.co");
  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
 driver.findElement(By.id("gwt-uid-13")).sendKeys("01/01/2015");
  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
 driver.findElement(By.className("v-button-primary")).click();
 //Thread.sleep(5000);
 driver.quit();
 }

}
