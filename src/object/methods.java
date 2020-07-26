package object;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class methods{
private static WebElement element = null;
public static WebElement Men (WebDriver driver)
{
	element=driver.findElement(By.xpath("//div[contains(@class, 'menu__super-link'));
	return element;
	
}
public static WebElement ShopbyProduct(WebDriver driver)
{
	element=driver.findElement(By.xpath("//div[contains(@class, 'menu__heading'));
	return element;
	
}


public static WebElement Shirts(WebDriver driver)
{
	element=driver.findElement(By.xpath("//div[contains(@class, 'menu__sub-link'));
	return element;
	
}

public static WebElement Sort(WebDriver driver)
{
	element=driver.findElement(By.xpath("//div[contains(@class, 'dropdown-btn js-dropdownbtn is-open'));
	return element;
}

public static WebElement Label(WebDriver driver)
{
	element=driver.findElement(By.xpath("//div[contains(@class, 'dropdown js-dropdown')/ul/li[2]/label/span);
	return element;
}


public static WebElement Selection(WebDriver driver)
{
	element=driver.findElement(By.xpath("//div[contains(@class, 'image-container')/a);
	return element;
}

public static WebElement Selection(WebDriver driver)
{
	element=driver.findElement(By.id("picker-1");
	return element;
}

public static WebElement Medium(WebDriver driver)
{
	element=driver.findElement(By.xpath("//div[contains(@class, 'option active'));
	return element;
}

public static WebElement cart(WebDriver driver)
{
	element=driver.findElement(By.xpath("//div[contains(@class, 'item button fluid button-big button-buy'));
	return element;
}

public static WebElement Amount(WebDriver driver)
{
	element=driver.findElement(By.xpath("//div[contains(@class, 'Heading-module_general_Te8t8 Heading-module_small_lHJSR'));
	return element;
}

}