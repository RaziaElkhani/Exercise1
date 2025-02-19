package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise2 extends Hooks {
	public static void main(String[] args) throws InterruptedException {
		setUp("edge");
		driver.get("https://demo.guru99.com/test/newtours/");

		WebElement registerLink = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[10]/td/table/tbody/tr/td[2]/font/a"));

		registerLink.click();
		Thread.sleep(3000);

		WebElement titleElement = driver
				.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img"));
		String title = titleElement.getText();
		Thread.sleep(3000);

		if ("Mercy Tours".equals(title)) {
			System.out.println("Test Passed title is correct");
		} else {
			System.out.println("Test failed");
		}

		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("Razia");
		Thread.sleep(2000);

		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("Elkhani");
		Thread.sleep(2000);

		WebElement phoneNumber = driver.findElement(By.name("phone"));
		phoneNumber.sendKeys("5109883381");
		Thread.sleep(2000);

		WebElement email = driver.findElement(By.id("userName"));
		email.sendKeys("elkhanirazia@gamil.com");
		Thread.sleep(2000);

		WebElement mailingInfo = driver.findElement(By.name("address1"));
		mailingInfo.sendKeys("4107Heriloom Ln");
		Thread.sleep(2000);

		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Tracy");
		Thread.sleep(2000);

		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("CA");
		Thread.sleep(2000);

		WebElement zipCode = driver.findElement(By.name("postalCode"));
		zipCode.sendKeys("95304");
		Thread.sleep(2000);

		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("Razia Elkhani");
		Thread.sleep(2000);

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("998899");
		Thread.sleep(2000);
		password.clear();

		password.sendKeys("889988");

		WebElement conPassword = driver.findElement(By.name("confirmPassword"));
		conPassword.sendKeys("889988");
		Thread.sleep(2000);

		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();

		WebElement confirmationText = driver.findElement(By.cssSelector("body > div:nth-child(6) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > p:nth-child(2) > font"));
				
		String massage = confirmationText.getText();
		System.out.println(massage);

		String ExpectedText = "Thank you for registering.";
		if (massage.contains(ExpectedText)) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}

		tearDown();

	}
}
