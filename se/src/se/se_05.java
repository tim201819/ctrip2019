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
				 driver = new ChromeDriver();; //�½�һ��WebDriver �Ķ��󣬵���new ����FirefoxDriver������
		    	Thread.sleep(5000);
		    	System.out.println("3");
		    	Thread.sleep(5000);
		        driver.get("http://www.baidu.com");//��ָ������վ
		        Thread.sleep(5000);
		    	System.out.println("4");
		        driver.findElement(By.id("kw")).sendKeys(new  String[] {"asdfgh"});//�ҵ�kwԪ�ص�id��Ȼ������hello
		       // driver.findElement(By.id("kw")).sendKeys(new  String[] {"��˹�ٷ�"});
		        Thread.sleep(5000);
		        System.out.println("5");
		        driver.findElement(By.id("su")).click(); //�����Ť
		        System.out.println("6");
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				System.out.println("7");
				e1.printStackTrace();
				System.out.println("8");
			}
	    	
	        try {
	            /**
	             * WebDriver�Դ���һ�����ܵȴ��ķ�����
	            dr.manage().timeouts().implicitlyWait(arg0, arg1����
	            Arg0���ȴ���ʱ�䳤�ȣ�int ���� ��
	            Arg1���ȴ�ʱ��ĵ�λ TimeUnit.SECONDS һ��������Ϊ��λ��
	             */

	        	System.out.println("9");
	        	driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);     
	        	System.out.println("9");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        /**
	         * dr.quit()��dr.close()�������˳������,�򵥵�˵һ�����ߵ����𣺵�һ��close��
	         * ������˶��ҳ���ǹز��ɾ��ģ���ֻ�رյ�ǰ��һ��ҳ�档�ڶ���quit��
	         * ���˳�������Webdriver���еĴ��ڣ��˵ķǳ��ɾ��������Ƽ�ʹ��quit��Ϊһ��case�˳��ķ�����
	         */
	        driver.quit();//�˳������

	}

}
