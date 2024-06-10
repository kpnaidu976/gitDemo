import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalendarTesting {

	@Test
	public void TestCal() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		java.util.List<WebElement> year = driver.findElements(By.cssSelector(".react-calendar__decade-view__years__year"));
		System.out.println(year.get(4));
		year.get(4).click();
		java.util.List<WebElement> month = driver.findElements(By.xpath("//button[contains(@class, 'react-calendar__year-view__months__month')]"));
		month.get(7).click();
		java.util.List<WebElement> day = driver.findElements(By.xpath("//button[contains(@class, 'react-calendar__month-view__days__day')]"));
		day.get(7).click();
	}
}
		
