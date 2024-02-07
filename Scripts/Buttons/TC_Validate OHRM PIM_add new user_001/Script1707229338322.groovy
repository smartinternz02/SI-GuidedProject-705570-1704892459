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

WebUI.click(findTestObject('OrangeHRM_OR/Page_OHRM_PIM/a_PIM'))

WebUI.click(findTestObject('OrangeHRM_OR/Page_OHRM_PIM/button_Add'))

WebUI.setText(findTestObject('OrangeHRM_OR/Page_OHRM_PIM/input_Employee Full Name_firstName'), 'Madhav')

WebUI.setText(findTestObject('OrangeHRM_OR/Page_OHRM_PIM/input_Employee Full Name_middleName'), 'Roy')

WebUI.setText(findTestObject('OrangeHRM_OR/Page_OHRM_PIM/input_Employee Full Name_lastName'), 'Aurobindo')

WebUI.setText(findTestObject('OrangeHRM_OR/Page_OHRM_PIM/input_Employee Id'), '033355')

WebUI.click(findTestObject('OrangeHRM_OR/Page_OHRM_PIM/span_switch input checkbox_create login details'))

WebUI.setText(findTestObject('OrangeHRM_OR/Page_OHRM_PIM/input_Username'), 'madroyauro')

WebUI.setText(findTestObject('OrangeHRM_OR/Page_OHRM_PIM/input_Password'), 'abcd123')

WebUI.setText(findTestObject('OrangeHRM_OR/Page_OHRM_PIM/input_Confirm Password'), 'abcd123')

WebUI.click(findTestObject('OrangeHRM_OR/Page_OHRM_PIM/div_Enabled_radio_button'))

WebUI.click(findTestObject('OrangeHRM_OR/Page_OHRM_PIM/button_Save'))

WebUI.delay(8)

WebUI.click(findTestObject('OrangeHRM_OR/Page_OHRM_PIM/li_Employee List_top_navigation'))

WebUI.delay(5)

WebUI.verifyTextPresent('Aurobindo', false)

