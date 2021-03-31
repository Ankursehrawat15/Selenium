package nykaaTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Interaction {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\Test Automation Lab\\chromedriver.exe");                    
        
		WebDriver driver=new ChromeDriver(); 
		driver.navigate().to("https://www.w3schools.com/");
		
		WebElement signIn = driver.findElement(By.id("w3loginbtn"));
        signIn.click();
        
        
        WebElement email = driver.findElement(By.id("modalusername"));
        email.sendKeys("***********");
		
        WebElement password = driver.findElement(By.id("current-password"));
        password.sendKeys("********");
        
        WebElement logInBttn = driver.findElement(By.className("_Ogofa"));
        logInBttn.click();
        
		
		}
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	

