package loginPage;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myTestCases {
	
	WebDriver driver = new ChromeDriver();
	String theURL = "https://automationteststore.com/";
	String signupPage = "https://automationteststore.com/index.php?rt=account/create";
	
	Random rand = new Random();
	
	@BeforeTest
	public void mySetup() {
		
		driver.get(theURL);
		driver.manage().window().maximize();
	}
	
	
	@Test(priority = 1)
	public void signup()  {
		
		driver.navigate().to(signupPage);
		
		//elements
		WebElement firstnameInput = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		WebElement lastNameInput = driver.findElement(By.id("AccountFrm_lastname"));
		WebElement emailInput = driver.findElement(By.id("AccountFrm_email"));
		WebElement teleInput = driver.findElement(By.id("AccountFrm_telephone"));
		WebElement faxInput = driver.findElement(By.id("AccountFrm_fax"));
		WebElement companyInput = driver.findElement(By.id("AccountFrm_company"));
		WebElement address1Input = driver.findElement(By.id("AccountFrm_address_1"));
		WebElement address2Input = driver.findElement(By.id("AccountFrm_address_2"));
		WebElement cityInput = driver.findElement(By.id("AccountFrm_city"));
		
		WebElement PostalCodeInput = driver.findElement(By.id("AccountFrm_postcode"));
		WebElement loginNameInput = driver.findElement(By.id("AccountFrm_loginname"));
		WebElement passwordInput = driver.findElement(By.id("AccountFrm_password"));
		WebElement passwordConfirmInput = driver.findElement(By.id("AccountFrm_confirm"));
		WebElement agreebox = driver.findElement(By.id("AccountFrm_agree"));
		WebElement ContinueButton = driver.findElement(By.cssSelector("button[title='Continue']"));
		WebElement CountrySelect = driver.findElement(By.id("AccountFrm_country_id"));
		WebElement StateSelect = driver.findElement(By.id("AccountFrm_zone_id"));
		
		//data
		String [] firstNames = {"ahmad" , "anas" , "omar" ,"ali","amira","mais"};
		int randomIndexForFirstNames = rand.nextInt(firstNames.length);
		String randomFirstName = firstNames[randomIndexForFirstNames];
		
		String [] lastNames = {"alaa" , "saif","abdullah","hamzeh","marwan" };
		int randomIndexForlastNames = rand.nextInt(lastNames.length);
		String randomLastName = lastNames[randomIndexForlastNames];
		
		int randomNumberForTheEmail = rand.nextInt(7000);
		String email = randomFirstName+randomLastName+randomNumberForTheEmail+"gmail.com";
		String telephone = "9624545455";
		String fax = "9624545455";
		String company = "abc";
		String address1 = "Amman tlaaelali";
		String address2 = "Amman shafaBaadran";
		String city = "Amman";
		String PostalCode = "3817";
		String password = "1234";

		
		//actions
		firstnameInput.sendKeys(randomFirstName);
		lastNameInput.sendKeys(randomLastName);
		emailInput.sendKeys(email);
		teleInput.sendKeys(telephone);
		faxInput.sendKeys(fax);
		companyInput.sendKeys(company);
		address1Input.sendKeys(address1);
		address2Input.sendKeys(address2);
		cityInput.sendKeys(city);
		PostalCodeInput.sendKeys(PostalCode);
		loginNameInput.sendKeys(randomFirstName+randomLastName+randomNumberForTheEmail);
		passwordInput.sendKeys(password);
		passwordConfirmInput.sendKeys(password);
		
		
	}

}
