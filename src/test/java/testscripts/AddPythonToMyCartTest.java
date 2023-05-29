package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class AddPythonToMyCartTest extends BaseClass {

	@Test
	public void addPythonToCartTest() {
		SoftAssert soft = new SoftAssert();

		home.clickGearsTab();
		home.clickSkillraryDemoAppLink();
		web.switchToChildBrowser();

		soft.assertTrue(demoApp.getPageHeader().contains("ECommerce"));

		demoApp.selectCategory(web, 1);

		soft.assertEquals(testing.getPageHeader(), "Testing");

		web.scrollTillElement(testing.getPythonImage());
		web.dragAndDropElement(testing.getPythonImage(), testing.getCartArea());

		web.scrollTillElement(testing.getFacebookIcon());
		testing.clickFacebookIcon();

		soft.assertAll();
	}
}
