import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.util.internal.PathUtil as PathUtil

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent


public class Script2 {
	String textInput
	String textValue

	/*
	 The step definitions below match with Katalon sample Gherkin steps
	 */

	@Given("I open default website")
	def I_open_default_website() {
		WebUI.openBrowser('https://www.wikipedia.org/')
		WebUI.maximizeWindow()
	}




	@When("User in Wikipedia Homepage")
	def user_in_homepage() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Wikipedia/Homepage/Header_Wikipedia'), 2)
	}

	@And("Verify Bahasa English")
	def verify_english() {
		String result;
		result = WebUI.getText(findTestObject('Object Repository/Wikipedia/Homepage/English'))
		println(result)
	}
	@And("Verify Arabic Lang")
	def verify_arabic() {
		String result;
		result = WebUI.getText(findTestObject('Object Repository/Wikipedia/Homepage/TextView_Arabic'))
		println(result)
	}
	@And("Verify Bahasa Indonesia")
	def verify_id() {
		String result;
		result = WebUI.getText(findTestObject('Object Repository/Wikipedia/Homepage/TextView_BahasaIndonesia'))
		println(result)
	}
	@And("Verify Chech Lang")
	def verify_chech() {
		String result;
		result = WebUI.getText(findTestObject('Object Repository/Wikipedia/Homepage/TextView_Chech'))
		println(result)
	}
	@And("Verify China Lang")
	def verify_china() {
		String result;
		result = WebUI.getText(findTestObject('Object Repository/Wikipedia/Homepage/TextView_China'))
		println(result)
	}
	@And("Verify Deutsch Lang")
	def verify_deutsch() {
		String result;
		result = WebUI.getText(findTestObject('Object Repository/Wikipedia/Homepage/TextView_Deutsch'))
		println(result)
	}

	@And("Verify Espanol Lang")
	def verify_espanol() {
		String result;
		result = WebUI.getText(findTestObject('Object Repository/Wikipedia/Homepage/TextView_Espanol'))
		println(result)
	}
	@And("Verify France Lang")
	def verify_france() {
		String result;
		result = WebUI.getText(findTestObject('Object Repository/Wikipedia/Homepage/TextView_France'))
		println(result)
	}
	@And("Verify Italy Lang")
	def verify_italy() {
		String result;
		result = WebUI.getText(findTestObject('Object Repository/Wikipedia/Homepage/TextView_Italy'))
		println(result)
	}
	@And("Verify Japan Lang")
	def verify_Japan() {
		String result;
		result = WebUI.getText(findTestObject('Object Repository/Wikipedia/Homepage/TextView_Japan'))
		println(result)
	}

	@Then("Print and Assert the text")
	def assert_english() {
		WebUI.verifyElementText(findTestObject('Object Repository/Wikipedia/Homepage/English'),'English')
		WebUI.verifyElementText(findTestObject('Object Repository/Wikipedia/Homepage/TextView_Arabic'),'مقاله')
		WebUI.verifyElementText(findTestObject('Object Repository/Wikipedia/Homepage/TextView_BahasaIndonesia'),'Bahasa Indonesia')
		WebUI.verifyElementText(findTestObject('Object Repository/Wikipedia/Homepage/TextView_Chech'),'Русский')
		WebUI.verifyElementText(findTestObject('Object Repository/Wikipedia/Homepage/TextView_China'),'日本語')
		WebUI.verifyElementText(findTestObject('Object Repository/Wikipedia/Homepage/TextView_Deutsch'),'Deutsch')
		WebUI.verifyElementText(findTestObject('Object Repository/Wikipedia/Homepage/TextView_Espanol'),'Español')
		WebUI.verifyElementText(findTestObject('Object Repository/Wikipedia/Homepage/TextView_France'),'Français')
		WebUI.verifyElementText(findTestObject('Object Repository/Wikipedia/Homepage/TextView_Italy'),'Italiano')
		WebUI.verifyElementText(findTestObject('Object Repository/Wikipedia/Homepage/TextView_Japan'),'中文')
	}



	@When("I am on clear account chat room")
	def I_am_on_account_chat_room() {
		this.I_click('Home/Button_Chat')
		this.I_click('Search/Button_SearchContact')
		this.I_type_on('automation test', 'Search/TextBox_SearchContact')
		this.I_click('Search/List_Contact-1st')
		//this.I_should_see('ChatRoom/Button_VoiceCall')
		this.I_click('Home/Button_MoreOptions')
		this.I_click('ChatRoom/List_ClearConversation')
		Mobile.delay(2)
	}

	@When("I am on clear group chat room")
	def I_am_on_group_chat_room() {
		this.I_click('Home/Button_Search')
		this.I_type_on('automation test', 'Search/TextBox_Search')
		this.I_hide_keyboard()
		this.I_click('Search/List_ListOfGroup-1st')
		//this.I_should_see('ChatRoom/Text_TotalMembers')
		this.I_click('Home/Button_MoreOptions')
		this.I_click('ChatRoom/List_ClearConversation')
		Mobile.delay(2)
	}

	@When("I click '(.*)'")
	def I_click(String elme) {
		Mobile.tap(findTestObject('Object Repository/'+elme), 10)
	}

	@When("I click and hold '(.*)'")
	def I_click_and_hold(String elme) {
		Mobile.tapAndHold(findTestObject('Object Repository/'+elme), 3 , 2)
	}

	@When("I type '(.*)' on '(.*)'")
	def I_type_on(String txt, String elme) {
		Mobile.setText(findTestObject('Object Repository/'+elme), txt, 10)
	}

	@When("I should see '(.*)'")
	def I_should_see(String elme) {
		Mobile.verifyElementVisible(findTestObject('Object Repository/'+elme), 10)
	}

	@When("I should not see '(.*)'")
	def I_should_not_see(String elme) {
		Mobile.verifyElementNotVisible(findTestObject('Object Repository/'+elme), 5)
	}

	@When("I should not see object '(.*)'")
	def I_should_not_see_object(String elme) {
		Mobile.verifyElementNotExist(findTestObject('Object Repository/'+elme), 5)
	}

	@When("I verify text '(.*)'")
	def I_assert_text(String elme) {
		Mobile.verifyElementText(findTestObject('Object Repository/'+elme), 5)
	}

	@When("I get text '(.*)'")
	def I_get_text(String elme) {
		Mobile.getText(findTestObject('Object Repository/'+elme), 5)
	}

	@When("I compare text '(.*)'")
	def I_compare_text(String elme) {
		Mobile.verifyEqual(I_get_text('Object Repository/'+elme), 5)
	}


	@When("I swipe to bottom")
	def I_swipe_to_bottom() {
		Mobile.swipe(500, 1600, 500, 0)
		Mobile.delay(3)
	}

	@When("I swipe to bottom transaction")
	def I_swipe_to_bottom_transaction() {
		Mobile.swipe(63, 1152, 63, 1154)
		Mobile.delay(3)
	}
	@When("I swipe to bottom trx")
	def I_swipe_to_bottom_trx() {
		Mobile.swipe(63, 1154, 63, 675)
		Mobile.delay(3)
	}
	@When("I swipe slider '(.*)'")
	def I_swipe_slider(String elme) {
		Mobile.setSliderValue(findTestObject('Object Repository/'+elme), 1, 2)
	}

	@When("I scroll to up")
	def I_scroll_to_up() {
		Mobile.swipe(691, 180, 1017, 800)
		Mobile.delay(3)
	}

	@When("I scroll to up trx")
	def I_scroll_to_up_trx() {
		Mobile.swipe(1066, 1080, 1306, 1989)
		Mobile.delay(3)
	}

	@When("I press back")
	def I_press_back() {
		Mobile.pressBack()
	}

	@When("I wait for (.*) seconds")
	def I_wait_for(String secondsStr) {
		int seconds = secondsStr.toInteger()
		Mobile.delay(seconds)
	}

	@When("I kill app")
	def I_kill_app() {
		Mobile.pressBack()
		Mobile.pressBack()
		Mobile.pressBack()
		AppiumDriver<?> driver = MobileDriverFactory.getDriver()
		driver.terminateApp('id.chatalia.app')
	}

	@When("I hide keyboard")
	def I_hide_keyboard() {
		Mobile.hideKeyboard()
	}

	@When("I tap app")
	def I_tap_app() {
		Mobile.tapAtPosition(200, 300)
	}

	@When("I tap tutorial at transaction")
	def I_tap_app_transaction() {
		Mobile.tapAtPosition(200, 300)
		Mobile.delay(1)
		Mobile.tapAtPosition(200, 300)
		Mobile.delay(1)
		Mobile.tapAtPosition(200, 300)
		Mobile.delay(1)
		Mobile.tapAtPosition(200, 300)
		Mobile.delay(1)
		Mobile.tapAtPosition(200, 300)
		Mobile.delay(1)
		Mobile.tapAtPosition(200, 300)
		Mobile.delay(1)
		Mobile.tapAtPosition(200, 300)
		Mobile.delay(1)
		Mobile.tapAtPosition(200, 300)
	}

	@When("I close app")
	def I_close_app() {
		Mobile.closeApplication('id.chatalia.app', FailureHandling.STOP_ON_FAILURE)
	}
}
