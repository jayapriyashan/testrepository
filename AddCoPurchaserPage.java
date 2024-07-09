package com.fsi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCoPurchaserPage {
	private static WebElement element = null;

	public static WebElement AddCoPurchaserButton(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[normalize-space()='Add Co-Purchaser']"));
		return element;
	}

	public static WebElement AddCoPurchaserTitle(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//strong[normalize-space()='Co-Purchaser(s)']"));
		return element;
	}

	public static WebElement AddPurchaserNo(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("	//div[@id='p_addcop_purchasernumber']//input[@role='combobox']"));
		return element;
	}

	public static WebElement FnameError(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[contains(text(),'First is required')]"));
		return element;
	}

	public static WebElement LnameError(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[contains(text(),'Last is required')]"));
		return element;
	}

	public static WebElement DOBError(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[contains(text(),'Invalid date of birth')]"));
		return element;
	}

	public static WebElement StreetError(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[contains(text(),'Street is required')]"));
		return element;
	}

	public static WebElement ZipError(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[contains(text(),'Zip is required')]"));
		return element;
	}

	public static WebElement CityError(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("	//div[contains(text(),'Enter a valid city name')]"));
		return element;
	}

	public static WebElement GenderError(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[contains(text(),'Gender is required')]"));
		return element;
	}

	public static WebElement StateError(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[contains(text(),'State is required')]"));
		return element;
	}

	public static WebElement SaveButton(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='p_addcop_btnsave']//div[@class='dx-button-content']"));
		return element;
	}

	public static WebElement ClearButton(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(
				By.xpath("//div[@id='p_addcop_btnclear']//span[@class='dx-button-text'][normalize-space()='Clear']"));
		return element;
	}

	public static WebElement CloseButton(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(
				By.xpath("//div[@id='p_addcop_btnclose']//span[@class='dx-button-text'][normalize-space()='Close']"));
		return element;
	}

	public static WebElement CopyAddressinfo(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='p_addcop_copyaddress']//span[@class='dx-checkbox-icon']"));
		return element;
	}

	public static WebElement RemoveCoPurchaser(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("	//span[normalize-space()='Remove Co-Purchaser']"));
		return element;
	}

	public static WebElement Comboboxcc(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.cssSelector("div[id='p_addcop_purchasernumber'] input[role='combobox']"));
		return element;
	}

	public static WebElement FirstName(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='p_addcop_first']//input[@role='textbox']"));
		return element;
		// div[@id='p_addcop_title']//input[@role='textbox']
	}

	public static WebElement LastName(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='p_addcop_last']//input[@role='textbox']"));
		return element;
	}

	public static WebElement DOB(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='p_addcop_dob']//input[@role='combobox']"));
		return element;
	}

	public static WebElement Street(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='p_addcop_street']//input[@role='textbox']"));
		return element;
	}

	public static WebElement Zip(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='p_addcop_zip']//input[@role='textbox']"));
		return element;
	}

	public static WebElement City(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='p_addcop_city']//input[@role='textbox']"));
		return element;
	}

	public static WebElement State(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='p_addcop_state']//input[@role='combobox']"));
		return element;
	}

	public static WebElement Gender(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='p_addcop_sex']//input[@role='combobox']"));
		return element;
	}

	public static WebElement Male(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[contains(text(),'Male')]"));
		return element;
	}

	public static WebElement SAVE_ok(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//span[normalize-space()='OK']"));
		return element;
	}

	public static WebElement secondco(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver
				.findElement(By.xpath("//div[@class='dx-item-content dx-list-item-content'][normalize-space()='2']"));
		return element;
	}

	public static WebElement Thirdco(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver
				.findElement(By.xpath("//div[@class='dx-item-content dx-list-item-content'][normalize-space()='3']"));
		return element;
	}

	public static WebElement Firstco(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver
				.findElement(By.xpath("//div[@class='dx-item-content dx-list-item-content'][normalize-space()='1']"));
		return element;
	}

	public static WebElement Removeco(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//span[normalize-space()='Remove Co-Purchaser']"));
		return element;
	}

	public static WebElement NoRemoveco(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@aria-label='No']//div[@class='dx-button-content']"));
		return element;
	}

	public static WebElement YESRemoveco(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@aria-label='Yes']//div[@class='dx-button-content']"));
		return element;
	}

	public static WebElement ConfirmRemove(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);

		element = driver.findElement(By.xpath("//div[@aria-label='OK']//div[@class='dx-button-content']"));
		return element;
	}

	public static WebElement CloseNO(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//span[normalize-space()='No']"));
		return element;
	}

	public static WebElement CloseYES(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@aria-label='Yes']//div[@class='dx-button-content']"));
		return element;
	}

	public static WebElement Title(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='p_addcop_title']//input[@role='textbox']"));
		return element;
	}

	public static WebElement Middle(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='p_addcop_middle']//input[@role='textbox']"));
		return element;
	}

	public static WebElement Suffix(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='p_addcop_suffix']//input[@role='textbox']"));
		return element;
	}

	public static WebElement Phone(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='p_addcop_phone']//input[@role='textbox']"));
		return element;
	}

}
