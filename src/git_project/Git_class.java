package git_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Git_class {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().getSize().getHeight();
		Thread.sleep(3000);
		driver.manage().window().getSize().getWidth();
		Thread.sleep(3000);
		driver.manage().window().getPosition().getX();
		Thread.sleep(3000);
		driver.manage().window().getPosition().getY();
			
	
		
	}
	

	
	

}
