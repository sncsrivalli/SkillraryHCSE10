package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class contains elements locators and respective business libraries of contact us page
 * @author jsp
 *
 */
public class ContactUsPage {
	
	//Declaration
	@FindBy(xpath = "//img[contains(@src,'contactus')]")
	private WebElement logo;
	
	@FindBy(name = "name")
	private WebElement fullNameTF;
	
	@FindBy(name = "sender")
	private WebElement emailTF;
	
	@FindBy(name = "subject")
	private WebElement subjectTF;
	
	@FindBy(name = "message")
	private WebElement messageBox;
	
	@FindBy(xpath = "//button[text()='Send us mail']")
	private WebElement sendUsMailButton;
	
	//Initialization
	public ContactUsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	/**
	 * This method returns logo
	 * @return
	 */
	public WebElement getLogo() {
		return logo;
	}
	
	/**
	 * This method is used to send the contact details
	 * @param name
	 * @param email
	 * @param subject
	 * @param message
	 */
	public void sendDetails(String name, String email, String subject, String message) {
		fullNameTF.sendKeys(name);
		emailTF.sendKeys(email);
		subjectTF.sendKeys(subject);
		messageBox.sendKeys(message);
		sendUsMailButton.click();
	}
}
