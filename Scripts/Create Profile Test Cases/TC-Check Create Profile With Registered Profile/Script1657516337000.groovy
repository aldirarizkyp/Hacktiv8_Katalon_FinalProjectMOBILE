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

Mobile.startExistingApplication(GlobalVariable.AppID, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login Page Objects/btn_CREATE A PROFILE'), 0)

Mobile.tap(findTestObject('Create Profile Objects/input_First Name'), 0)

Mobile.setText(findTestObject('Create Profile Objects/input_First Name'), firstname, 0)

Mobile.tap(findTestObject('Create Profile Objects/input_Last Name'), 0)

Mobile.setText(findTestObject('Create Profile Objects/input_Last Name'), lastname, 0)

Mobile.tap(findTestObject('Create Profile Objects/input_Country'), 0)

Mobile.setText(findTestObject('Create Profile Objects/input_Country'), country, 0)

Mobile.tap(findTestObject('Create Profile Objects/input_Username'), 0)

Mobile.setText(findTestObject('Create Profile Objects/input_Username'), username, 0)

Mobile.tap(findTestObject('Create Profile Objects/input_Password'), 0)

Mobile.setEncryptedText(findTestObject('Create Profile Objects/input_Password'), password, 0)

Mobile.tap(findTestObject('Create Profile Objects/input_Confirm Password'), 0)

Mobile.setEncryptedText(findTestObject('Create Profile Objects/input_Confirm Password'), confirmationpassword, 0)

Mobile.tap(findTestObject('Create Profile Objects/btn_Create Profile'), 0)

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

def toast = driver.findElementByXPath('//android.widget.Toast[@text=\'A User has already taken that username\']')

println('Toast : ' + toast)

if (toast == null) {
    KeywordUtil.markFailed('ERROR: Toast object not found!')
}

