package stepdef;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;
public class Stepdefinition {
WebDriver driver;
	
	@Given("user navigates to the website chilternoakfurniture.co.uk")
    public void userNavigatesToChilterNOakPage() {
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.chilternoakfurniture.co.uk/search?type=product&options%5Bprefix%5D=last&q");
	}
	
	@Given("search the product")
	public void searchTheProduct() {
		WebElement searchElement = driver.findElement(By.xpath("//*[@id=\"toolbar\"]/div[1]/div[2]/div/div/form/input[3]"));

		searchElement.sendKeys("sofa");
	
		driver.findElement(By.xpath("//*[@id=\"toolbar\"]/div[1]/div[2]/div/div/form/button")).click();
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
	}
	
	@Given("drag the price element")
	public void dragPriceElement() {
		WebElement dragElement = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/div/div/div[2]/div/form/div[1]/details/div/div/div/div[2]/div[3]"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(dragElement, 40, 0).build().perform();
	}
	
	@Given("choose the color")
	public void chooseColor() {
		driver.findElement(By.xpath("//*[@id=\"shopify-section-template--15838516248781__main\"]/div/div[2]/div/form/div[2]/details/div/div/ul/li[2]")).click();
	}
	
	@Then("added filter successfully")
	public void addedFilterSuccessfully() {
		driver.close();
	}

}





