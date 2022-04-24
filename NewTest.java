package week6Day1.Suite;

import org.testng.annotations.Test;

public class NewTest {
  @Test(invocationCount=3,priority=2)
  public void IC() {
	  System.out.println("Exceute the IC method");
  }
  @Test(priority=1)
  public void eb() {
	// TODO Auto-generated method stub
	  System.out.println("Exceute the enabled method");

}
  @Test(enabled=false)
  public void pri() {
	// TODO Auto-generated method stub
	  System.out.println("Exceute the Priority method");

}
}
