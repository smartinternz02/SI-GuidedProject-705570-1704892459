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

WebUI.callTestCase(findTestCase('Jenkins Integration/TC_Validate OHRM Login_Login Success_001'), [('url') : '', ('username') : ''
        , ('password') : ''], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OrangeHRM_OR/Page_OHRM_Admin/a_Admin_navigation_link'))

WebUI.verifyElementVisible(findTestObject('OrangeHRM_OR/Page_OHRM_Dashboard/h6_Admin'))

WebUI.delay(2)

WebUI.click(findTestObject('OrangeHRM_OR/Page_OHRM_PIM/a_PIM'))

WebUI.waitForElementPresent(findTestObject('OrangeHRM_OR/Page_OHRM_Dashboard/h6_PIM'), 2)

WebUI.delay(2)

WebUI.back()

WebUI.verifyElementPresent(findTestObject('OrangeHRM_OR/Page_OHRM_Dashboard/h6_Admin'), 0)

WebUI.delay(2)

WebUI.forward()

WebUI.verifyElementText(findTestObject('OrangeHRM_OR/Page_OHRM_Dashboard/h6_PIM'), 'PIM')

System.out.println(WebUI.getWindowIndex())

System.out.println(WebUI.getWindowTitle())

WebUI.delay(2)

WebUI.click(findTestObject('OrangeHRM_OR/Page_OHRM_Dashboard/a_Time'))

WebUI.verifyTextNotPresent('Admin / User Management', false)

WebUI.delay(2)

