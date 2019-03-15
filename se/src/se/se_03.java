package se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class se_03 {
	public static void main(String args[]) throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
	//	System.setProperty("webdriver.gecko.driver", "C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
	//	System.setProperty("webdriver.ie.driver", "C:\\Program Files (x86)\\Internet Explorer\\IEDriverServer.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("http://www.baidu.com");
	//   driver.get("https://mail.qq.com/cgi-bin/loginpage");
	//   driver.switchTo().frame(driver.findElement(By.id("login_frame")));
	//   driver.findElement(By.id("u")).sendKeys("31");
       /*
		driver.get("http://www.baidu.com");
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.linkText("设置"))).perform();
		
		Thread.sleep(3000);
		driver.findElement(By.className("setpref")).click();
		Thread.sleep(3000);
		Select a= new Select(driver.findElement(By.cssSelector("#nr")));
		//a.selectByIndex(1);
		//a.selectByValue("50");
		a.selectByVisibleText("每页显示50条");
		*/
		/*
		System.out.println(a.getOptions().size());
		for(int i=0;i<a.getOptions().size();i++){
			a.getOptions().get(i).click();
		}
		*/
  
		/*
		driver.findElement(By.id("kw")).sendKeys("test");
		driver.findElement(By.id("su")).submit();
		
		System.out.println(driver.findElement(By.name("tj_trnews")).getText());
		Thread.sleep(1000);
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.name("tj_trnews")).isSelected());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		*/
		
		
	
		
	}

}
