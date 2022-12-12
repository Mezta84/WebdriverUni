package Ressources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	public static WebDriver driver;

	public static WebDriver InitializeDriver() throws IOException {

		Properties prop = new Properties();
		FileInputStream fil = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\main\\java\\Ressources\\GlobalData.properties");
		prop.load(fil);
		String browserName = System.getProperty("browser")!=null? System.getProperty("browser") :prop.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	}
}
