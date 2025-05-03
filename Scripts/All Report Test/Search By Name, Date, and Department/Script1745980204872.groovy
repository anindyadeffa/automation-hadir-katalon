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

WebUI.delay(2)

// WebUI.click(findTestObject('All Report Page/Button Reset'))
WebUI.setText(findTestObject('All Report Page/Input Search'), 'juned')

WebUI.click(findTestObject('All Report Page/Button Calender Box'))

WebUI.delay(1)

WebUI.click(findTestObject('All Report Page/Prev Button'))

WebUI.click(findTestObject('All Report Page/Prev Button'))

WebUI.delay(1)

WebUI.click(findTestObject('All Report Page/Date 1'))

WebUI.click(findTestObject('All Report Page/Date 31'))

WebUI.click(findTestObject('All Report Page/Button Save Calender'))

WebUI.executeJavaScript('window.scrollTo(0,-7000)', [])

WebUI.delay(1)

WebUI.click(findTestObject('All Report Page/Button Filter'))

WebUI.click(findTestObject('All Report Page/Input Job Department'))

WebUI.delay(1)

WebUI.click(findTestObject('All Report Page/List Department Kopi Susu'))

WebUI.delay(1)

WebUI.click(findTestObject('All Report Page/button_Terapkan'))

WebUI.delay(2)

WebUI.click(findTestObject('All Report Page/Button Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Dashboard Pending Page/Button Reset'))

WebUI.closeBrowser()

