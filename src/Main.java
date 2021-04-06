/*
  @created 06/04/2021 - 14:15
  @author  Adham eldda
  @package PACKAGE_NAME
  @project GreeBash
 */
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class Main {

  public static void main(String [] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.google.com/");
    Thread.sleep(5000);  // Let the user actually see something!
    WebElement searchBox = driver.findElement(By.name("q"));
    searchBox.sendKeys("ChromeDriver");
    searchBox.submit();
    Thread.sleep(5000);  // Let the user actually see something!
    driver.quit();
  }
  }

