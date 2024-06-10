
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sikuliTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=6mCXSg00oEs");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		
		

	}

}
