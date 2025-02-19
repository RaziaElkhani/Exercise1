package day1;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise1 extends Hooks {
	public static void main(String[] args) throws InterruptedException {
// and also I was not able to use Chrome 
		setUp("edge");
		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		Thread.sleep(3000);

		// I added the userName as admin and password as admin123 give me invalid
		// Cerdentials so I pass this one
		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.sendKeys("ntk-admin");

		Thread.sleep(3000);

		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("Password123@12");
		WebElement loginButton = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));

		loginButton.click();

		Thread.sleep(3000);

		WebElement headerElement = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
		String headerText = headerElement.getText();
		System.out.println("headerText :" + headerText);
		Thread.sleep(3000);
		tearDown();

	}

}
