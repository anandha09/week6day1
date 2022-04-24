package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead extends Base{
@Test(invocationCount=2)
	public  void DP()  {

		Driver.findElement(By.linkText("Create Lead")).click();
		Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anandh");
		Driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		Driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anandha");
		Driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ECE");
		Driver.findElement(By.id("createLeadForm_description")).sendKeys("I am anandh from ECE dept learning selenium in Test leaf insitute");
		Driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anandh@gmail.com");
		WebElement findElement = Driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd=new Select(findElement);
		dd.selectByVisibleText("New York");
		Driver.findElement(By.name("submitButton")).click();
		String title = Driver.getTitle();
		System.out.println(title);
		Driver.findElement(By.linkText("Duplicate Lead")).click();
		Driver.findElement(By.id("createLeadForm_companyName")).clear();
		Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf Insitute");
		Driver.findElement(By.id("createLeadForm_firstName")).clear();
		Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anandh Akshay");
		Driver.findElement(By.linkText("Create Lead")).click();
		String title2 = Driver.getTitle();
		System.out.println(title2);
		
		
	}

}
