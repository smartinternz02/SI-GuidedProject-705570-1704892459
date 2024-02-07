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

WebUI.click(findTestObject('OrangeHRM_OR/Page_OHRM_Admin/li_Job_top_navigation'))

WebUI.click(findTestObject('OrangeHRM_OR/Page_OHRM_Admin/li_Job Titles_top_navigation'))

String countText = WebUI.getText(findTestObject('OrangeHRM_OR/Page_OHRM_Admin/span_record_count'))

String text = countText.split()[0]

int num = Integer.parseInt((text[1]) + (text[2]))

//System.out.println((((countText + '====') + text) + '=====') + num)
TestObject temp = findTestObject('OrangeHRM_OR/Page_OHRM_Admin/div_Job Titles_table_body')

CustomKeywords.'com.admin.ListVerifier.verifyRowCount'(temp, 'div', num)

