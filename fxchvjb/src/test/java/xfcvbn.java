import org.openqa.selenium.chrome.ChromeDriver;

public class xfcvbn {
	
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
         
	
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElementById("user-name").sendKeys("standard_user");
		driver.findElementById("password").sendKeys("secret_sauce");
		driver.findElementByXPath("//*[@id=\"login-button\"]").click();
		
		
		
		

	}

}
