package Script;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import script.methods;

public class TestNG {
public  WebDriver driver;

System.setProperty("webdriver.chrome.driver", "C:\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://www2.hm.com/en_ca/index.html");
	driver.manage().window().maximize();
        WebElement handm= driver.findElement(By.xpath("//div[contains(@class, 'menu__trigger js-menu-trigger'));
        handm.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        methods.Men(driver).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        methods.ShopbyProduct(driver).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        methods.Shirts(driver).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        methods.Sort(driver).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        methods.Shirtselection(driver).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        methods.Sizeselection(driver).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        methods.Medium(driver).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        methods.cart(driver).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
       methods.Amount(driver).get();
	   System.println.out(Amount);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
      

}