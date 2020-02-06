package br.com.rsinet.hub_tdd.Testes;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import br.com.rsinet.hub_tdd.numeric.NumericPhone;
import br.com.rsinet.hub_tdd.pageObject.Home_Page;
import br.com.rsinet.hub_tdd.pageObject.Register_Page;
import br.com.rsinet.hub_tdd.utility.ConfigApp;
import br.com.rsinet.hub_tdd.utility.ExtentReportDemo;
import br.com.rsinet.hub_tdd.utility.GetScreenshot;
import br.com.rsinet.hub_tdd.utility.Screenshot;
import br.com.rsinet.hub_tdd.utility.Scroll;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Registro extends ConfigApp{

	private static AndroidDriver<MobileElement> driver;
	private TouchAction action;
	

	@Before
	public void Inicializa() throws MalformedURLException {

		driver = ConfigApp.iniciaApp();

	}
	ExtentTest test = ExtentReportDemo.getTest();
	ExtentReports extent = ExtentReportDemo.getExtent();

	@Test
	public void Executa() throws IOException {
		test = extent.startTest("Registro valido");

		action = new TouchAction(driver);

		WebDriverWait wait = new WebDriverWait(driver, 20);
		action.waitAction(new WaitOptions().withDuration(Duration.ofMillis(4000))).perform();
		Home_Page.lnk_Menu(driver).click();
		action.waitAction(new WaitOptions().withDuration(Duration.ofMillis(4000))).perform();
		Home_Page.lnk_Login(driver).click();
		action.waitAction(new WaitOptions().withDuration(Duration.ofMillis(4000))).perform();
		Home_Page.clk_CreateAccount(driver).click();

		Register_Page.txtbx_userName(driver).click();
		Register_Page.txtbx_userName(driver).sendKeys("le647");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Register_Page.txtbx_Email(driver).click();
		Register_Page.txtbx_Email(driver).sendKeys("leoanrdoe@gmail.com");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Register_Page.txtbx_Password(driver).click();
		Register_Page.txtbx_Password(driver).sendKeys("Test@123");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Register_Page.txtbx_ConfirmPassword(driver).click();
		Register_Page.txtbx_ConfirmPassword(driver).sendKeys("Test@123");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Register_Page.txtbx_FirstName(driver).click();
		Register_Page.txtbx_FirstName(driver).sendKeys("Antonio");
		action.tap(PointOption.point(698, 1009)).perform();
		Register_Page.txtbx_LastName(driver).click();
		Register_Page.txtbx_LastName(driver).sendKeys("Ferreira");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));

		Register_Page.txtbx_PhoneNumber(driver).click();
		NumericPhone.Numeric(driver);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Register_Page.txtbx_State(driver).click();
		Register_Page.txtbx_State(driver).sendKeys("Sao sao");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Register_Page.txtbx_Address(driver).click();
		Register_Page.txtbx_Address(driver).sendKeys("Rua gglga");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Register_Page.txtbx_City(driver).click();
		Register_Page.txtbx_City(driver).sendKeys("Osasco");
		action.tap(PointOption.point(706, 1000)).perform();

		Register_Page.txtbx_Zip(driver).sendKeys("04923-392");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        Register_Page.txtbx_Country(driver).click();
        Scroll.scrollAndClick(driver, "Brazil");
        Scroll.scroll(driver, "REGISTER");
        Scroll.swipe(511, 1326, 511, 736, driver);
        Register_Page.btn_Registrar(driver).click();
		test.log(LogStatus.PASS, "Teste Passou");
		String screenShotPath = GetScreenshot.capture(driver, "Registro valido ");
		test.log(LogStatus.PASS, "Funcionou: " + test.addScreenCapture(screenShotPath));

	}

	@Test
	public void ExecutaInvalido() throws IOException {
		
	test = extent.startTest("Registro valido");

	action = new TouchAction(driver);

	WebDriverWait wait = new WebDriverWait(driver, 20);
	action.waitAction(new WaitOptions().withDuration(Duration.ofMillis(4000))).perform();
	Home_Page.lnk_Menu(driver).click();
	action.waitAction(new WaitOptions().withDuration(Duration.ofMillis(4000))).perform();
	Home_Page.lnk_Login(driver).click();
	action.waitAction(new WaitOptions().withDuration(Duration.ofMillis(4000))).perform();
	Home_Page.clk_CreateAccount(driver).click();

	Register_Page.txtbx_userName(driver).click();
	Register_Page.txtbx_userName(driver).sendKeys("le646");
	driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	Register_Page.txtbx_Email(driver).click();
	Register_Page.txtbx_Email(driver).sendKeys("leoanrdoe@gmail.com");
	driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	Register_Page.txtbx_Password(driver).click();
	Register_Page.txtbx_Password(driver).sendKeys("Test@123");
	driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	Register_Page.txtbx_ConfirmPassword(driver).click();
	Register_Page.txtbx_ConfirmPassword(driver).sendKeys("Test@123");
	driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	Register_Page.txtbx_FirstName(driver).click();
	Register_Page.txtbx_FirstName(driver).sendKeys("Antonio");
	driver.pressKey(new KeyEvent(AndroidKey.ENTER));

	Register_Page.txtbx_LastName(driver).click();
	Register_Page.txtbx_LastName(driver).sendKeys("Ferreira");
	driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	Register_Page.txtbx_PhoneNumber(driver).click();
	NumericPhone.Numeric(driver);
	driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	Register_Page.txtbx_State(driver).click();
	Register_Page.txtbx_State(driver).sendKeys("Sao sao");
	driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	Register_Page.txtbx_Address(driver).click();
	Register_Page.txtbx_Address(driver).sendKeys("Rua gglga");
	driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	Register_Page.txtbx_City(driver).click();
	Register_Page.txtbx_City(driver).sendKeys("Osasco");
	driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	
	Register_Page.txtbx_Zip(driver).sendKeys("04923-392");
	driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    Register_Page.txtbx_Country(driver).click();
    Scroll.scrollAndClick(driver, "Brazil");
    Scroll.scroll(driver, "REGISTER");
    Scroll.swipe(511, 1326, 511, 736, driver);
    Register_Page.btn_Registrar(driver).click();
	test.log(LogStatus.PASS, "Teste Passou");
	String screenShotPath = GetScreenshot.capture(driver, "Registro valido ");
	test.log(LogStatus.PASS, "Funcionou: " + test.addScreenCapture(screenShotPath));
}
	@After
	public void fechaDriver() {
		ConfigApp.closeDriver(driver);
	}

}