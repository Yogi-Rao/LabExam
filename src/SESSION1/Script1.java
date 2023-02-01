package SESSION1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {

	ChromeDriver driver;
	
	public void open()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Workspace\\Library\\chromedriver.exe");
		driver = new ChromeDriver();  // will get the chrome browser
		driver.get("https://www.google.co.in/");	// will open chrome window
		driver.manage().window().maximize();  	// will maximzie chrome tab
		driver.close();  //will close chrome tab/window
	}


	public static void main(String[] args) {
		
		Script1 o = new Script1();
		o.open();
		
	}

}

