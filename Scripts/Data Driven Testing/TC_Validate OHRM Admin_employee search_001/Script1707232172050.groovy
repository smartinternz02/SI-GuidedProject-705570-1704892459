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

if (!(emp_username.equals(''))) {
    WebUI.setText(findTestObject('OrangeHRM_OR/Page_OHRM_Admin/input_Username'), emp_username)
}

if (emp_role.equals('Admin')) {
    WebUI.click(findTestObject('OrangeHRM_OR/Page_OHRM_Admin/i_dropdown_button_user_role'))

    WebUI.click(findTestObject('OrangeHRM_OR/Page_OHRM_Admin/div_Admin_option_user_role'))
} else if (emp_role.equals('ESS')) {
    WebUI.click(findTestObject('OrangeHRM_OR/Page_OHRM_Admin/i_dropdown_button_user_role'))

    WebUI.click(findTestObject('Object Repository/OrangeHRM_OR/Page_OHRM_Admin/div_ESS_option_user_role'))
}

if (!(emp_name.equals(''))) {
    WebUI.setText(findTestObject('OrangeHRM_OR/Page_OHRM_Admin/input_employee_name'), emp_name)

    WebUI.delay(5)

    WebUI.click(findTestObject('OrangeHRM_OR/Page_OHRM_Admin/div_employee_name_option'))
}

if (emp_status.equals('Enabled')) {
    WebUI.click(findTestObject('OrangeHRM_OR/Page_OHRM_Admin/i_dropdown_button_status'))

    WebUI.click(findTestObject('OrangeHRM_OR/Page_OHRM_Admin/div_Enabled_option_status'))
} else if (emp_status.equals('Disabled')) {
    WebUI.click(findTestObject('OrangeHRM_OR/Page_OHRM_Admin/i_dropdown_button_status'))

    WebUI.click(findTestObject('Object Repository/OrangeHRM_OR/Page_OHRM_Admin/div_Disabled_option_status'))
}

WebUI.click(findTestObject('OrangeHRM_OR/Page_OHRM_Admin/button_Search'))

WebUI.verifyTextPresent(validation_text, false)

WebUI.delay(2)

