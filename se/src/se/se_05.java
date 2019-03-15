package se;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class se_05 {

	
		// TODO Auto-generated method stub
		public static WebDriver driver;
	    public static void main(String[] args) {
	    	System.out.println("1");
	    	System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
			System.out.println("2");
	    	try {
				Thread.sleep(5000);
				System.out.println("22");
				 driver = new ChromeDriver();; //新建一个WebDriver 的对象，但是new 的是FirefoxDriver的驱动
		    	Thread.sleep(5000);
		    	System.out.println("3");
		    	Thread.sleep(5000);
		        driver.get("http://www.baidu.com");//打开指定的网站
		        Thread.sleep(5000);
		    	System.out.println("4");
		        driver.findElement(By.id("kw")).sendKeys(new  String[] {"asdfgh"});//找到kw元素的id，然后输入hello
		       // driver.findElement(By.id("kw")).sendKeys(new  String[] {"阿斯蒂芬"});
		        Thread.sleep(5000);
		        System.out.println("5");
		        driver.findElement(By.id("su")).click(); //点击按扭
		        System.out.println("6");
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				System.out.println("7");
				e1.printStackTrace();
				System.out.println("8");
			}
	    	
	        try {
	            /**
	             * WebDriver自带了一个智能等待的方法。
	            dr.manage().timeouts().implicitlyWait(arg0, arg1）；
	            Arg0：等待的时间长度，int 类型 ；
	            Arg1：等待时间的单位 TimeUnit.SECONDS 一般用秒作为单位。
	             */

	        	System.out.println("9");
	        	driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);     
	        	System.out.println("9");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        /**
	         * dr.quit()和dr.close()都可以退出浏览器,简单的说一下两者的区别：第一个close，
	         * 如果打开了多个页面是关不干净的，它只关闭当前的一个页面。第二个quit，
	         * 是退出了所有Webdriver所有的窗口，退的非常干净，所以推荐使用quit最为一个case退出的方法。
	         */
	        driver.quit();//退出浏览器

	}

}
