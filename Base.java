package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public ChromeDriver Driver;//Declaring
	@BeforeMethod
	public void Precondition() {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();

Driver=new ChromeDriver();//intializing

		Driver.get("http://leaftaps.com/opentaps/control/login");
		
		Driver.manage().window().maximize();
		Driver.findElement(By.id("username")).sendKeys("DemoCSR");
		Driver.findElement(By.id("password")).sendKeys("crmsfa");
		Driver.findElement(By.className("decorativeSubmit")).click();
		Driver.findElement(By.linkText("CRM/SFA")).click();
		Driver.findElement(By.linkText("Leads")).click();

	}
	@AfterMethod
	public void postcondition() {
		// TODO Auto-generated method stub
		Driver.close();

	}

}
