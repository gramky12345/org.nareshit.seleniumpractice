package MARCH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String str1=driver.getTitle();
		System.out.println("Title Is :"+str1);
		
		String str2 = driver.getPageSource();
		System.out.println("The Page Source is :"+str2);
		
		String str3 = driver.getCurrentUrl();
		System.out.println("The Current page Url :"+str3);
		if(str3.startsWith("https"))
		{
			System.out.println("Site is Secured");
		}
		else
		{
			System.out.println("Site is not Secured");
		}

	}

}
