import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Window {

	@Test
	public void window() {
		//WebDriverManage.edgedriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().refresh();
		driver.findElement(By.id("openwindow")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		driver.findElement(By.xpath("(//a[@class='main-btn'])[1]")).click();
		System.out.println(driver.findElement(By.xpath("//h1[@class='ud-heading-serif-xxxl']")).getText());
		driver.switchTo().window(parentId);
		
		

	}
}
