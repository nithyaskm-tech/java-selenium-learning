package gmail;

import org.openqa.selenium.chrome.ChromeDriver;

public class class2 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Nithya\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();	
	driver.get("www.gmail.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("id=identifierId")).sendKeys("nithya@alignminds.com");
	Thread.sleep(2000);
	driver.findElement(By.className("VfPpkd-RLmnJb")).click();
	Thread.sleep(2000);
	driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("ayhtin@testing!@#");
	Thread.sleep(2000);
	driver.findElement(By.className("VfPpkd-vQzf8d")).click();
	System.out.printIn("");
		

	}

}
