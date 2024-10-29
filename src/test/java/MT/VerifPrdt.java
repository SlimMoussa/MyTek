package MT;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifPrdt {
	
	@Test
	public void VerificationProduitPC () throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver ();
			System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
			String url = "https://www.mytek.tn/informatique/ordinateurs-portables/pc-portable.html";
			driver.get(url);
			
			Thread.sleep(3000);
		
			WebElement PCname = driver.findElement(By.xpath("//a[contains(text(),'PC Portable HP 15-fd0298nk Intel N100 4Go 256Go SS')]"));
			String TextPC = PCname.getText();
			
			Thread.sleep(3000);
			
			WebElement boutonAP = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[4]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/button[1]/span[1]"));
			boutonAP.click();
			
			Thread.sleep(4000);
			
			WebElement boutonP = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[2]/div[1]/a[1]"));
			boutonP.click();
			
			WebElement PCnameP = driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[1]/div[1]/strong[1]/a[1]"));
			String TextPCPanier = PCnameP.getText();
			
			Assert.assertEquals(TextPC, TextPCPanier);
			
			
			driver.quit();
			
	}
}
