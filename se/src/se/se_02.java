package se;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
public class se_02 {
	public static void main(String args[]){
		/*System.setProperty("phantomjs.binary.path", "C:\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		WebDriver driver = new PhantomJSDriver();
		driver.get("http://www.baidu.com");
		System.out.println(driver.getCurrentUrl());
		*/
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.baidu.com");
		driver.manage().window().maximize();
	//	driver.findElement(By.id("kw")).sendKeys("test");
	//	driver.findElement(By.name("wd")).sendKeys("test1");
	//	driver.findElement(By.className("s_ipt")).sendKeys("TEST2");
	//	driver.findElement(By.linkText("新闻")).click();
	//	driver.findElement(By.partialLinkText("新")).click();
	//	System.out.println(driver.findElements(By.tagName("input")).size());
	//	driver.findElement(By.xpath("//*[@id='kw']")).sendKeys("TEst.5");
	//	driver.findElement(By.cssSelector("#kw")).sendKeys("Test6");
	//	driver.findElement(By.partialLinkText("新")).click();
	//	System.out.println(driver.findElements(By.tagName("input")).size());
	//	driver.findElement(By.xpath("//*[@id='kw']")).sendKeys("test4");
	//	driver.findElement(By.cssSelector("#kw")).sendKeys("test5");
		
		
		
	
		
	}

}
