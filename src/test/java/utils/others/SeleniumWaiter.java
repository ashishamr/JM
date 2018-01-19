package utils.others;
import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaiter {

      private WebDriver driver;

      public SeleniumWaiter(WebDriver driver) {
           this.driver = driver;
      }

      public WebElement waitForMe(By locatorname, int timeout){
           WebDriverWait wait = new WebDriverWait(driver, timeout);
           return wait.until(SeleniumWaiter.presenceOfElementLocated(locatorname));
      }

      public static Function<WebDriver, WebElement> presenceOfElementLocated(final By locator) {
            // TODO Auto-generated method stub
            return new Function<WebDriver, WebElement>() {
                 @Override
                 public WebElement apply(WebDriver driver) {
                      return driver.findElement(locator);
                 }
            };
      }
 }