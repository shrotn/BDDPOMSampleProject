package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	 
	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase()	
	{
		prop = new Properties();
		
		String path = System.getProperty("user.dir") + "//src//test//resources//configFiles//config.properties";
				//user.dir - to get the directory path 
		FileInputStream fin;
		try{
			
			fin = new FileInputStream(path);
			prop.load(fin); //if we store it in a key object as a property we can read it
			
		}catch (FileNotFoundException e){
			
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		}			 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void initialize() {
		
		String strBrw = prop.getProperty("browser");
		if (strBrw.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		if (strBrw.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}
}
