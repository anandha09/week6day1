package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editlead  extends Base {
@Test
	public  void EL() {

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
		Driver.findElement(By.linkText("Edit")).click();
		Driver.findElement(By.id("updateLeadForm_description")).clear();
		Driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("I am anandh aworking professional  learning selenium in Test leaf insitute");
		Driver.findElement(By.name("submitButton")).click();
		String title = Driver.getTitle();
		System.out.println(title);
	}
	

}
