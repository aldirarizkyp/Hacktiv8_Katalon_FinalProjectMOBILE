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

Mobile.tap(findTestObject('Hamburger Menu Objects/btn_HamburgerMenu'), 0)

Mobile.tap(findTestObject('Hamburger Menu Objects/menu_Accounts'), 0)

Mobile.verifyElementVisible(findTestObject('Hamburger Menu Objects/Accounts Page Objects/txtView_Accounts'), 0)

Mobile.tap(findTestObject('Hamburger Menu Objects/Accounts Page Objects/btn_Add Account Plus Symbol'), 0)

Mobile.verifyElementVisible(findTestObject('Hamburger Menu Objects/Accounts Page Objects/txtView_Add an Account'), 0)

Mobile.setText(findTestObject('Hamburger Menu Objects/Accounts Page Objects/input_ Account Name'), 'BCA', 0)

Mobile.setText(findTestObject('Hamburger Menu Objects/Accounts Page Objects/input_Initial Balance'), '10000000', 0)

Mobile.tap(findTestObject('Hamburger Menu Objects/Accounts Page Objects/btn_ADD'), 0)

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

def toast = driver.findElementByXPath('//android.widget.Toast[@text=\'Account successfully added\']')

println('Toast : ' + toast)

if (toast == null) {
    KeywordUtil.markFailed('ERROR: Toast object not found!')
}

