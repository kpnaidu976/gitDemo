import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Calendar {
	
	
	@Test
	public static void cal() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[1]")).click();
		
		driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']")).click();
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n'])[63]")).click();
		
		//driver.findElement(By.xpath("(//div[@data-testid='undefined-calendar-day-21'])[1]")).click();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[@class='css-1dbjc4n'])[63]")));
		String monthYearVal = driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79']")).getText();
		System.out.println(monthYearVal);
		String month = monthYearVal.split(" ")[0].trim();
		String year =  monthYearVal.split(" ")[1].trim();
		System.out.println(month);
		System.out.println(year);
		
		while(!(month.equals("June") && year.equals("2025"))) {
			w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("circle")));
			//driver.findElement(By.cssSelector("g circle:nth-child(4)")).click();
			driver.findElement(By.xpath("(//*[local-name()='svg'])[16]")).click();
			monthYearVal = driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79']")).getText();
			
			System.out.println(monthYearVal);
			month = monthYearVal.split(" ")[0].trim();
			year = monthYearVal.split(" ")[1].trim();
			
		}
		
		driver.findElement(By.xpath("(//div[@data-testid='undefined-calendar-day-21'])[1]")).click();
		
		//String dateMonthYearVal = driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[1]")).getText();
		//String day = dateMonthYearVal.split(" ")[1].trim();
		//String month = dateMonthYearVal.split(" ")[2].trim();
		//String year = dateMonthYearVal.split(" ")[3].trim();
		
		//System.out.println(day);
		//System.out.println(month);
		//System.out.println(year);
		driver.close();
		
	}

}
