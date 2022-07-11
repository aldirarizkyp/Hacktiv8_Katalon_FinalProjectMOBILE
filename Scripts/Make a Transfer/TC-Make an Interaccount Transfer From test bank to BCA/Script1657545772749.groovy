import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.callTestCase(findTestCase('Login Test Cases/MP-6 Aldiransyah Rizky Putra-TC Login Mobile'), [('username') : 'aldiraputra'
        , ('password') : 'MzwowwNMG4szpCX2z5ddwg=='], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Hamburger Menu Objects/Menu List Objects/btn_HamburgerMenu'), 0)

Mobile.tap(findTestObject('Hamburger Menu Objects/Menu List Objects/menu_Make a Transfer'), 0)

Mobile.tap(findTestObject('Hamburger Menu Objects/Transfer Page Objects/btn_SpinnerSenderAcc'), 0)

Mobile.verifyElementVisible(findTestObject('Hamburger Menu Objects/Transfer Page Objects/listView_Sender'), 0)

Mobile.tap(findTestObject('Hamburger Menu Objects/Transfer Page Objects/txtView_test bank (8500000.00)'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Hamburger Menu Objects/Transfer Page Objects/btn_SpinnerReceiverAcc'), 0)

Mobile.verifyElementVisible(findTestObject('Hamburger Menu Objects/Transfer Page Objects/listView_Receiver'), 0)

Mobile.tap(findTestObject('Hamburger Menu Objects/Transfer Page Objects/txtView_BCA (10000000.00)'), 0, FailureHandling.STOP_ON_FAILURE)

amount = Mobile.setText(findTestObject('Hamburger Menu Objects/Transfer Page Objects/input_Transfer Amount'), '15000', 0)

Mobile.tap(findTestObject('Hamburger Menu Objects/Transfer Page Objects/btn_Confirm Transfer'), 0)

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

def toast = driver.findElementByXPath('//android.widget.Toast[@text=\'Transfer of' + amount + 'successfully made\']')

println('Toast : ' + toast)

if (toast == null) {
    KeywordUtil.markFailed('ERROR: Toast object not found!')
}

