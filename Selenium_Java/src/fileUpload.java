import java.io.File;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fileUpload {

	public static void main(String[] args) throws Exception {
		String downloadPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		chromePrefs.put("profile.default_content_settings.popups", 0);

		chromePrefs.put("download.default_directory", downloadPath);

		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("prefs", chromePrefs);

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.ilovepdf.com/pdf_to_jpg");

		driver.findElement(By.id("pickfiles")).click();

		Thread.sleep(3000);

		Runtime.getRuntime().exec("C:\\Users\\malime.naidu\\Downloads\\Check\\fileUpload.exe");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='processTask']")));

		// driver.findElement(By.xpath("//button[@type='button']")).click();

		driver.findElement(By.xpath("//button[@id='processTask']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pickfiles")));

		driver.findElement(By.id("pickfiles")).click();

		Thread.sleep(5000);

		File f = new File(downloadPath + "/converted.zip");

		if (f.exists())

		{

			// Assert.assertTrue(f.exists());

			System.out.println("file exits");

			if (f.delete()) {

				System.out.println("file deleted");

			}

		}
		driver.quit();

	}
}
