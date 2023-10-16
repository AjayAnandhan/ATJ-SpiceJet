package bestBuy;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BestBuy {
	
	@FindBy(xpath = "//div[text()='Login']")
	static
	WebElement login;
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		
		// 1. Write code to open a web browser and navigate to the Best Buy e-commerce website (https://www.bestbuy.com/).
		
		String URL = "https://www.bestbuy.com/";
		driver.get(URL);
		
		String currentURL = driver.getCurrentUrl();
		
		// 2. Write a code to validate if the given URL Link is broken.
		
		if(currentURL.contains(URL)) {
			System.out.println("Given URL is working properly");
		}
		else {
			System.out.println("Given URL is broken");
		}
		
		driver.findElement(By.cssSelector("div[lang='en'] img[alt='United States']")).click();
		
		
		// 3. Write a code to do Sign-Up and Login functionality.
		
		// Sign Up
		
		/*
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@id='account-menu-account-button'])[1]"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[normalize-space()='Create Account'])[1]"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#firstName"))).sendKeys("Ajay");
		
		driver.findElement(By.cssSelector("#lastName")).sendKeys("Anandan");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("fogej13224@htoal.com");
		
		driver.findElement(By.cssSelector("#fld-p1")).sendKeys("A73635@dan");
		
		driver.findElement(By.cssSelector("#reenterPassword")).sendKeys("A73635@dan");
		
		driver.findElement(By.cssSelector("#phone")).sendKeys("9495080317");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		*/
		
		// Log In
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@id='account-menu-account-button'])[1]"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[normalize-space()='Sign In'])[1]"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#fld-e"))).sendKeys("ajaya73635@gmail.com");
		
		driver.findElement(By.cssSelector("#fld-p1")).sendKeys("A73635@dan");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
		 
		 
		//4. Write a code for navigation of all Menu and validation of title in each page.
		
		//Top Deals
		
		WebElement topdeals = driver.findElement(By.cssSelector(".bottom-left-links[aria-hidden='false'][data-lid='hdr_td_topdeals']"));
		
		String strTopDeals1 = topdeals.getText();
		
		topdeals.click();
		
		if(driver.getTitle().contains(strTopDeals1)) {
			System.out.println("Successfully landed on Top Deals page");
		}
		
		else {
			System.out.println("Top deals page loading unsuccessful");
		}
		
		
		//Deal of the day
		
		WebElement dealoftheday = driver.findElement(By.cssSelector(".bottom-left-links[aria-hidden='false'][data-lid='hdr_dotd']"));
		
		String strdealoftheday = dealoftheday.getText();
		
		dealoftheday.click();
		
		if(driver.getTitle().contains(strdealoftheday)) {
			System.out.println("Successfully landed on Deal of the day page");
		}
		
		else {
			System.out.println("Deal of the day page loading unsuccessful");
		}
		
		
		//My Best Buy membership
		
		WebElement membership = driver.findElement(By.cssSelector(".bottom-left-links[aria-hidden='false'][data-lid='hdr_my_best_buy_memberships']"));
		
		String strmembership = membership.getText();
		
		membership.click();
		
		if(driver.getTitle().contains(strmembership)) {
			System.out.println("Successfully landed on My Best Buy membership page");
		}
		
		else {
			System.out.println("My Best Buy membership page loading unsuccessful");
		}
		
		
		//Credit Cards
		
		WebElement creditcards = driver.findElement(By.cssSelector(".bottom-left-links[aria-hidden='false'][data-lid='hdr_crd']"));

		creditcards.click();
		
		if(driver.getTitle().contains("Credit Card")) {
			System.out.println("Successfully landed on Credit Cards page");
		}
		
		else {
			System.out.println("Credit Cards page loading unsuccessful");
		}
		
		
		//Best Buy Outlet
		
		WebElement outlet = driver.findElement(By.cssSelector(".bottom-left-links[aria-hidden='false'][data-lid='hdr_best_buy_outlet']"));
		
		String stroutlet = outlet.getText();
		
		outlet.click();
		
		if(driver.getTitle().contains(stroutlet)) {
			System.out.println("Successfully landed on Best Buy Outlets page");
		}
		
		else {
			System.out.println("Best Buy Outlets page loading unsuccessful");
		}
		
		
		//Gift Cards
		
		WebElement giftcard = driver.findElement(By.cssSelector(".bottom-left-links[aria-hidden='false'][data-lid='hdr_gift_cards']"));
		
		String strgiftcard = giftcard.getText();
		
		giftcard.click();
		
		if(driver.getTitle().contains(strgiftcard)) {
			System.out.println("Successfully landed on Gift Cards page");
		}
		
		else {
			System.out.println("Gift Card page loading unsuccessful");
		}
		
		driver.findElement(By.xpath("//a[@title='BestBuy.com']//*[name()='svg']")).click();

		
		// 5. Write a code to validate the bottom links on the home page.
		
		// Accessibility
		
		WebElement access = driver.findElement(By.cssSelector(".body-copy-sm.mr-200[data-track='ft_legal']"));
		
		String straccess = access.getText();
		
		access.click();
		
		if(driver.getTitle().contains(straccess)) {
			System.out.println("Successfully landed on Accessibility page");
		}
		
		else {
			System.out.println("Accessibility page loading unsuccessful");
		}
		
		driver.navigate().back();
		
		//Terms and Conditions
		
		WebElement terms = driver.findElement(By.cssSelector(".body-copy-sm.mr-200[data-track='ft_legal_terms_conditions']"));

		terms.click();
		
		if(driver.getTitle().contains("Terms and Conditions")) {
			System.out.println("Successfully landed on Terms & Conditions page");
		}
		
		else {
			System.out.println("Terms & Conditions page loading unsuccessful");
		}
		
		driver.navigate().back();
		
		// Privacy
		
		WebElement privacy = driver.findElement(By.cssSelector(".body-copy-sm.mr-200[data-track='ft_legal_privacy']"));
		
		String strprivacy = privacy.getText();
		
		privacy.click();
		
		if(driver.getTitle().contains(strprivacy)) {
			System.out.println("Successfully landed on Privacy page");
		}
		
		else {
			System.out.println("Privacy page loading unsuccessful");
		}
		
		driver.navigate().back();
		
		// Interest-based Ads
		
		WebElement ads = driver.findElement(By.cssSelector(".body-copy-sm.mr-200[data-track='ft_legal_interest_based_ads']"));
		
		String strads = ads.getText();
		
		ads.click();
		
		if(driver.getTitle().contains(strads)) {
			System.out.println("Successfully landed on Interest-Based Ads page");
		}
		
		else {
			System.out.println("Interest-Based Ads page loading unsuccessful");
		}
		
		driver.navigate().back();
		
		// State Privacy rights
		
		WebElement rights = driver.findElement(By.cssSelector(".body-copy-sm.mr-200[data-track='ft_legal_state_privacy_rights']"));
		
		String strrights = rights.getText();
		
		rights.click();
		
		if(driver.getTitle().contains(strrights)) {
			System.out.println("Successfully landed on State Privacy rights page");
		}
		
		else {
			System.out.println("State privacy rights page loading unsuccessful");
		}
		
		driver.navigate().back();
		
		// Health data Privacy
		
		WebElement health = driver.findElement(By.cssSelector(".body-copy-sm.mr-200[data-track='ft_legal_health_data_privacy']"));

		health.click();
		
		if(driver.getTitle().contains("Privacy Policy Hub")) {
			System.out.println("Successfully landed on Health data privacy page");
		}
		
		else {
			System.out.println("Health data privacy page loading unsuccessful");
		}
		
		driver.navigate().back();
		
		//Do Not Share/Sell my personal info
		
		WebElement dontshareinfo = driver.findElement(By.cssSelector(".body-copy-sm.mr-200[data-track='ft_legal_do_not_sell_personal_info']"));

		dontshareinfo.click();
		
		boolean camsg = driver.findElement(By.cssSelector("h1:nth-child(1)")).isDisplayed();
		
		if(camsg) {
			System.out.println("Successfully landed on Don't share personal info page");
		}
		
		else {
			System.out.println("Don't share personal info page loading unsuccessful");
		}
		
		driver.navigate().back();
		
		//Use of personal info
		
		WebElement useinfo = driver.findElement(By.cssSelector(".body-copy-sm.mr-200[data-track='ft_legal_limit_use_sensitive_personal_info']"));

		useinfo.click();
		
		if(driver.getTitle().contains("Best Buy")) {
			System.out.println("Successfully landed on Limited use of personal info page");
		}
		
		else {
			System.out.println("Limited use of personal info page loading unsuccessful");
		}
		
		driver.navigate().back();
		
		// Targeted advertising or opt out
		
		WebElement optout = driver.findElement(By.cssSelector(".body-copy-sm.mr-200[data-track='ft_legal_targeted_advertising_opt_out']"));

		optout.click();
		
		if(driver.getTitle().contains("Start Request")) {
			System.out.println("Successfully landed on Targetted adverticing or opt out page");
		}
		
		else {
			System.out.println("Targetted adverticing or opt out page loading unsuccessful");
		}
		
		driver.navigate().back();
		
		//CA Supply Chain Transparency Act
		
		WebElement chain = driver.findElement(By.xpath("(//a[normalize-space()='CA Supply Chain Transparency Act'])[1]"));
		
		chain.click();
		
		Thread.sleep(5000);		
		if(driver.getTitle().contains("California Supply Chain Transparency Act") ){
			System.out.println("Successfully landed on CA Supply Chain Transparency Act page");
		}
		
		else {
			System.out.println("CA Supply Chain Transparency Act page loading unsuccessful");
		}
		
		driver.navigate().back();
		
		
		
		// 6. Write code to search for and add an item to the shopping cart.
		
		WebElement searchbar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#gh-search-input")));
		
		searchbar.sendKeys("sony playstation 5 console", Keys.ENTER);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".c-button.c-button-primary.c-button-sm.c-button-block.c-button-icon.c-button-icon-leading.add-to-cart-button"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".c-button-link.continue-shopping"))).click();
		
		/*
		// 7. Write a code to select and add an item from (Menu à Shop by Department).
		
		driver.findElement(By.cssSelector("button[aria-label='Menu']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='TV & Home Theater']")).click();
		
		driver.findElement(By.xpath("(//button[normalize-space()='Home Theater Audio & Video'])[1]")).click();
		
		driver.findElement(By.xpath("(//a[normalize-space()='Sound Bars'])[1]")).click();
		
		driver.findElement(By.xpath("(//a[@class='mc-plp-navigation-carousel-item large-view p-150 w-2800 h-1200 flex with-text border border-interactive rounded-50'])[1]")).click();
		
		driver.findElement(By.xpath("(//img[contains(@alt,'Samsung - Q series 5.1.2ch Wireless Dolby Atmos Soundbar w/ Q Symphony - Titan Black - Front_Zoom')])[1]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[normalize-space()='Add to Cart'])[1]"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".c-button-link.continue-shopping"))).click();
		
		
		// 8. Write a code to select and add an item from (Menu à Brands à Select Any Brand).
		
		driver.findElement(By.cssSelector("button[aria-label='Menu']")).click();
		
		driver.findElement(By.xpath("(//button[normalize-space()='Brands'])[1]")).click();
		
		driver.findElement(By.xpath("(//a[@data-lid='ubr_shp_see'])[1]")).click();
		
		driver.findElement(By.xpath("(//a[@class='flex-image-inner-wrapper flex-fluid-image'])[2]")).click();
		
		driver.findElement(By.cssSelector("img[alt='Galaxy S23, cell phones']")).click();
		
		driver.findElement(By.xpath("(//a[normalize-space()='Shop Galaxy S23 Ultra'])[1]")).click();
		
		driver.findElement(By.xpath("(//button[@class='c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button'])[1]")).click();
		
		driver.findElement(By.cssSelector(".c-button-link.continue-shopping")).click();
		
		*/
		
		
		// 9. Write code to navigate to the checkout page and fill out the form with dummy payment information.
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='cart-icon'])[1]"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[normalize-space()='Checkout'])[1]"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-lg.btn-block.btn-secondary"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#number"))).sendKeys("4242 4242 4242 4242");
		
		WebElement month = driver.findElement(By.cssSelector("#expMonth"));
		
		Select sel1 = new Select(month);
		
		sel1.selectByValue("07");
		
		WebElement year = driver.findElement(By.cssSelector("#expYear"));
		
		Select sel2 = new Select(year);
		
		sel2.selectByValue("2025");
		
		driver.findElement(By.cssSelector("#cvv")).sendKeys("013");
		
		driver.findElement(By.cssSelector("#first-name")).sendKeys("Ajay");
		
		driver.findElement(By.cssSelector("#last-name")).sendKeys("Anandan");
		
		driver.findElement(By.cssSelector("#address-input")).sendKeys("7545 Iredell Main Nw");
		
		driver.findElement(By.cssSelector("#city")).sendKeys("Madison");
		
		driver.findElement(By.cssSelector("#postalCode")).sendKeys("92614");
		
		WebElement state = driver.findElement(By.cssSelector("#state"));
		
		Select sel3 = new Select(state);
		
		sel3.selectByValue("AL");
		
		driver.findElement(By.xpath("(//button[@class='btn btn-lg btn-block btn-primary'])[1]")).click();
		
		
		// 10. Write code to verify that the order was placed successfully by checking the resulting web page for the order confirmation message.
		
		boolean msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[normalize-space()='Thanks for your order!'])[1]"))).isDisplayed();
		
		if (msg) {
			System.out.println("Order placed successfully");
		}
		else {
			System.out.println("Order was failed");
		}
		
		
		// 11.  Write code to close the web browser when testing is complete.
		
		driver.quit();	
	}	

}