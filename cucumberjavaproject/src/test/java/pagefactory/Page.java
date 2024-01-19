package pagefactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.chilternoakfurniture.co.uk/search?type=product&options%5Bprefix%5D=last&q");
		
		driver.findElement(By.xpath("//*[@id=\"toolbar\"]/div[1]/div[2]/div/div/form/input[3]")).sendKeys("sofa");

		driver.findElement(By.xpath("//*[@id=\"toolbar\"]/div[1]/div[2]/div/div/form/button")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//*[@id=\"shopify-section-template--15838516248781__main\"]/div/div[2]/div/form/div[1]/details/div/div/div/div[2]/div[3]")).click();		
				
		driver.findElement(By.xpath("//*[@id=\"shopify-section-template--15838516248781__main\"]/div/div[2]/div/form/div[2]/details/div/div/ul/li[2]")).click();
		
		
		 

	}

}
