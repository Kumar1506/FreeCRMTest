package base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		try {
		prop = new Properties();
		
		//File file = new File(System.getProperty("user.dir")+"\\src\\test\\java\\config\\config.properties");
		File file = new File("C:/Users/kumars/workspace/FreeCRMTest/src/main/java/config/config.properties");
		
		FileReader fReader= new FileReader(file);
		
			prop.load(fReader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() throws IOException
	{
		/*prop = new Properties();
		
		//File file = new File(System.getProperty("user.dir")+"\\src\\test\\java\\config\\config.properties");
		File file = new File("C:/Users/kumars/workspace/FreeCRMTest/src/main/java/config/config.properties");
		
		FileReader fReader= new FileReader(file);
		
			prop.load(fReader);*/
		
		String bowserName = prop.getProperty("browser");	
		
		if(bowserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:/Users/kumars/Drivers/"
					+ "chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(bowserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:/Users/kumars/Drivers/"
					+ "geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else
		{
			System.out.println("browser not found");
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String url=prop.getProperty("url");
		System.out.println(url);
		driver.get(url);
	//	System.out.println("after url");
	}
	
	
}
