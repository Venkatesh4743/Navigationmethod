package NavigationMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class NavigationMethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.google.com/?sa=X&ved=0ahUKEwiO24yupOyFAxWz1zgGHZZzBQsQOwgC");
		driver.findElement(By.name("q")).sendKeys("amazon signup");
		driver.findElement(By.name("q")).submit();
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 15 plus");
		driver.findElement(By.name("q")).submit();
		
		driver.navigate().back();	
		driver.navigate().refresh();
		driver.navigate().forward();

	}

}