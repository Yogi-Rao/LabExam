package SESSION1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script3 {
	
	ChromeDriver driver;

	//to open a browser
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\\\Workspace\\\\Library\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");  //open
		driver.manage().window().maximize(); //maximise
		//driver.close();//close
	}
	
	public void login()
	{
		WebElement usnm=driver.findElement(By.name("uid"));
		usnm.sendKeys("mngr474695");
		
		driver.findElement(By.name("password")).sendKeys("jApYtEp");  //function chaining
		
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.linkText("New Customer")).click();
		
	}
	
	public void addcustomer()
	{
		driver.findElement(By.name("name")).sendKeys("CDAC");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).click();
		driver.findElement(By.name("dob")).sendKeys("09/04/1996");
		driver.findElement(By.name("addr")).sendKeys("Gurgaon");
		driver.findElement(By.name("city")).sendKeys("Gurgaon");
		driver.findElement(By.name("state")).sendKeys("Haryana");
		driver.findElement(By.name("pinno")).sendKeys("122001");
		driver.findElement(By.name("telephoneno")).sendKeys("8076939051");
		driver.findElement(By.name("state")).sendKeys("Haryana");
		driver.findElement(By.name("emailid")).sendKeys("mngr474695");
		driver.findElement(By.name("password")).sendKeys("jApYtEp");
		driver.findElement(By.name("sub")).click();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Script3 o=new Script3();
o.open();
o.login();
o.addcustomer();
	}

}
