package spiceJet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TicketBooking {
	
	@FindBy(xpath = "//div[text()='Login']")
	static
	WebElement login;
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.get("https://www.spicejet.com/");
		
		/*
		WebElement signup = driver.findElement(By.xpath("//div[text()='Signup']"));
		signup.click();
		
		Set<String> whandles = driver.getWindowHandles();
		List<String> wlist = new ArrayList<String>(whandles);
		driver.switchTo().window(wlist.get(1));
		
		WebElement ddown1 = driver.findElement(By.xpath("(//label[@class='font-14 bold']/following-sibling::select)[1]"));
		ddown1.click();
		
		Select title = new Select(ddown1);
		title.selectByVisibleText("Mr");
		
		WebElement fname = driver.findElement(By.xpath("(//label[text()='First Name and Middle Name']/following::input)[1]"));
		fname.sendKeys("Ajay");
		
		WebElement lname = driver.findElement(By.xpath("(//label[text()='Last Name']/following::input)[1]"));
		lname.sendKeys("Anandan");
		
		WebElement country = driver.findElement(By.xpath("//select[@class='form-control form-select']"));
		country.click();
		
		Select ind = new Select(country);
		ind.selectByVisibleText("India");
		
		WebElement dob = driver.findElement(By.xpath("//img[@class='d-inline-block datepicker']"));
		dob.click();
		
		WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		year.click();
		
		Select yearOB = new Select(year);
		yearOB.selectByVisibleText("2000");
		
		WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
		month.click();
		
		Select monthOB = new Select(month);
		monthOB.selectByVisibleText("February");
		
		WebElement date = driver.findElement(By.xpath("//div[@aria-label='Choose Thursday, February 3rd, 2000']"));
		date.click();
		
		WebElement mobileNum = driver.findElement(By.cssSelector("input[placeholder='+91 01234 56789']"));
		mobileNum.sendKeys("1234567890");
		
		WebElement email = driver.findElement(By.cssSelector("#email_id"));
		email.sendKeys("fijat70005@armablog.com");
		
		Thread.sleep(2000);		
		email.sendKeys("fijat70005@armablog.com");
			
		WebElement password = driver.findElement(By.xpath("//input[@id='new-password']"));
		
		Thread.sleep(3000);	
		password.sendKeys("Ajay@123");
		
		WebElement cpassword = driver.findElement(By.xpath("//input[@id='c-password']"));
		cpassword.sendKeys("Ajay@123");
		
		driver.findElement(By.xpath("//input[@id='defaultCheck1']")).click();
		System.out.println("DONE");
		
		*/
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		System.out.println("97");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Email']"))).click();
		System.out.println("100");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("");
		System.out.println("103");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("");
		System.out.println("106");
		
		driver.findElement(By.cssSelector("div[data-testid='login-cta']")).click();
		System.out.println("109");
		
		Thread.sleep(10000);
		WebElement from = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='text'])[1]")));
		from.sendKeys("MAA");
		System.out.println("113");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='text'])[2]"))).sendKeys("BOM");
		System.out.println("117");
		
		Actions act =  new Actions(driver);
		act.moveToElement(wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)")))).click().perform();
		System.out.println("121");
		
		driver.findElement(By.cssSelector("#main-container > div > div.css-1dbjc4n.r-14lw9ot > div.css-1dbjc4n.r-14lw9ot.r-z2wwpe.r-vgw6uq.r-156q2ks.r-11ict49.r-8uuktl.r-136ojw6 > div.css-1dbjc4n.r-1pcd2l5.r-1uwte3a.r-m611by.r-bnwqim > div.css-1dbjc4n.r-18u37iz.r-1wtj0ep.r-1lgpqti > div:nth-child(2) > div")).click();
		System.out.println("124");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#main-container > div > div:nth-child(1) > div.css-1dbjc4n.r-1awozwy.r-14lw9ot.r-1p0dtai.r-16nwaqb.r-1xcajam.r-1joz4e6.r-1lmsi4j.r-1wn9b5e.r-13qz1uu.r-10ahfku > div > div > div.css-1dbjc4n.r-18u37iz > div.css-1dbjc4n.r-1awozwy.r-1xfd6ze.r-1loqt21.r-18u37iz.r-1777fci.r-1w50u8q.r-ah5dr5.r-1otgn73"))).click();
		System.out.println("127");
		
		WebElement fname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#primary-contact-details > div.css-1dbjc4n.r-18u37iz.r-1x0uki6.r-10ahfku > div:nth-child(2) > div > div > div.css-1dbjc4n.r-1awozwy.r-11u4nky.r-z2wwpe.r-1phboty.r-rs99b7.r-18u37iz.r-1ugchlj > input")));
		fname.clear();
		fname.sendKeys("Ajay");
		System.out.println("130");
		
		WebElement lname = driver.findElement(By.cssSelector("#primary-contact-details > div.css-1dbjc4n.r-18u37iz.r-1x0uki6.r-10ahfku > div:nth-child(3) > div > div > div.css-1dbjc4n.r-1awozwy.r-11u4nky.r-z2wwpe.r-1phboty.r-rs99b7.r-18u37iz.r-1ugchlj.r-l0gwng > input"));
		lname.clear();
		lname.sendKeys("Anandan");
		System.out.println("135");
		
		WebElement mobile = driver.findElement(By.cssSelector("#primary-contact-details > div.css-1dbjc4n.r-18u37iz.r-1x0uki6.r-10ahfku > div.css-1dbjc4n.r-dbuhaz > div > div.css-1dbjc4n.r-1awozwy.r-11u4nky.r-z2wwpe.r-1phboty.r-rs99b7.r-18u37iz.r-1ugchlj > input"));
		mobile.clear();
		mobile.sendKeys("9495080317");
		System.out.println("140");
		
		WebElement email = driver.findElement(By.cssSelector("#primary-contact-details > div.css-1dbjc4n.r-18u37iz.r-1g94qm0.r-mhe3cw > div:nth-child(1) > div > div > div.css-1dbjc4n.r-1awozwy.r-11u4nky.r-z2wwpe.r-1phboty.r-rs99b7.r-18u37iz.r-1ugchlj.r-l0gwng > input"));
		email.clear();
		email.sendKeys("baficem602@elixirsd.com");
		System.out.println("145");
		
		WebElement town = driver.findElement(By.cssSelector("#primary-contact-details > div.css-1dbjc4n.r-18u37iz.r-1g94qm0.r-mhe3cw > div:nth-child(3) > div > div > div.css-1dbjc4n.r-1awozwy.r-11u4nky.r-z2wwpe.r-1phboty.r-rs99b7.r-18u37iz.r-1ugchlj > input"));
		town.clear();
		town.sendKeys("Mannargudi");
		System.out.println("150");
		
		driver.findElement(By.cssSelector("#pax-item-MCFBRFQ- > div.css-1dbjc4n.r-edyy15.r-13qz1uu > div > div > div.css-1dbjc4n.r-18u37iz.r-15d164r > div > div > div > div.css-76zvg2.r-qsz3a2.r-poiln3.r-1b43r93.r-16dba41")).click();
		System.out.println("155");
		
		driver.findElement(By.cssSelector("#travellers-view > div.css-1dbjc4n.r-2ka9w3.r-zr9zts > div > div > div.css-1dbjc4n.r-1awozwy.r-19m6qjp.r-z2wwpe.r-1loqt21.r-18u37iz.r-1777fci.r-6ity3w.r-d9fdf6.r-9qu9m4.r-ah5dr5.r-1otgn73")).click();
		System.out.println("158");
		
		Thread.sleep(20000);
		boolean con = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#at_addon_close_icon > img"))).isDisplayed();
		System.out.println("162");
		if (con) {
			driver.findElement(By.cssSelector("#at_addon_close_icon > img")).click();
			
			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]"))).click();
			System.out.println("165");
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]"))).click();wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]"))).click();
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("#payment_form > div:nth-child(10) > div.card_number_div > iframe")));
			System.out.println("168");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#card_number"))).sendKeys("4242424242424242");
			System.out.println("171");
			
			driver.findElement(By.cssSelector("#at_prepayment_close_icon > img:nth-child(1)")).click();
			driver.switchTo().frame(".name_on_card_iframe");
			System.out.println("177");
			
			driver.findElement(By.cssSelector("#name_on_card")).sendKeys("Ajay");
			System.out.println("180");
			
			driver.switchTo().defaultContent();
			System.out.println("183");
			
			driver.switchTo().frame(".card_exp_month_iframe");
			System.out.println("186");
			
			driver.findElement(By.cssSelector("#card_exp_month")).sendKeys("12");
			System.out.println("189");
			
			driver.switchTo().defaultContent();
			System.out.println("192");
			
			driver.switchTo().frame(".card_exp_year_iframe");
			System.out.println("195");
			
			driver.findElement(By.cssSelector("#card_exp_year")).sendKeys("25");
			System.out.println("198");
			
			driver.switchTo().defaultContent();
			System.out.println("201");
			
			driver.switchTo().frame(".security_code_iframe");
			System.out.println("204");
			
			driver.findElement(By.cssSelector("#card_exp_year")).sendKeys("936");
			System.out.println("207");
			
			driver.switchTo().defaultContent();
			System.out.println("210");
			
			driver.findElement(By.cssSelector("#prepayment-container > div.css-1dbjc4n.r-2ka9w3.r-zr9zts > div > div.css-1dbjc4n.r-1biggbk > div")).click();
			System.out.println("213");
			
			boolean msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#prepayment-container > div:nth-child(1) > div:nth-child(2) > div > div.css-1dbjc4n.r-13awgt0 > div"))).isDisplayed();
			System.out.println("216");
			
			if(msg) {
				System.out.println("Payment Failure");
			}
			else {
				System.out.println("Payment Successfull");
			}
		}
		else {
			
			driver.quit();
			
		}
		
		driver.quit();
	}

}












