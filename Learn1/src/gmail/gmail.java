package gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nithya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("www.gmail.com");
		driver.manage().window().maximize();
		try {
			driver.findElement(By.id("identifierId")).sendKeys("nithya@alignminds.com");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("ayhtin@testing!@#");
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
				
	}

}
