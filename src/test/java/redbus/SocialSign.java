package redbus;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SocialSign {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notifications");	
		
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		WebElement Button = driver.findElement(By.xpath("//span[text()='Account']"));
		Button.click();
		WebElement Button2 = driver.findElement(By.xpath("//span[text()='Login/ Sign Up']"));
		Button2.click();
		
		Thread.sleep(5000);
		
		WebElement frame1 = driver.findElement(By.xpath("(//iframe[@class=\"modalIframe\"])[1]"));
		driver.switchTo().frame(frame1);
		
		
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@title=\"Sign in with Google Button\"]"));
		driver.switchTo().frame(frame);
		
		WebElement Button3 = driver.findElement(By.xpath("//div[@id=\"container\"]//child::div[@class=\"nsm7Bb-HzV7m-LgbsSe-bN97Pc-sM5MNb \"]"));
		Button3.click();
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();//switch to parent first windows
		
		Set<String> windowID = driver.getWindowHandles();
		for(String w:windowID)
		{
			driver.switchTo().window(w);
			
//			if(driver.getCurrentUrl().equals("https://www.redbus.in/")) 
//			{
//				
//			}else 
//			{
//				break;
//			}
		}
		
		
		
		
		WebElement Button4 = driver.findElement(By.xpath("//input[@type=\"email\"]"));
		Button4.sendKeys("roshangiri171@gmail.com");
		
		
		
		
		
		

}}
