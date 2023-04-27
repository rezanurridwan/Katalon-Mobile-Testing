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

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\Android-MyDemoAppRN.1.2.0.build-231.apk', true)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\AppData\\Local\\Temp\\screenshot7602340115604597821.png')

Mobile.tap(findTestObject('Object Repository/Login/TCLog 03 - username valid password null/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Login/TCLog 03 - username valid password null/android.widget.TextView - Log In'), 
    0)

Mobile.tap(findTestObject('Object Repository/Login/TCLog 03 - username valid password null/android.widget.EditText'), 0)

Mobile.setText(findTestObject('Object Repository/Login/TCLog 03 - username valid password null/android.widget.EditText (1)'), 
    'bob@example.com', 0)

Mobile.tap(findTestObject('Object Repository/Login/TCLog 03 - username valid password null/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Login/TCLog 03 - username valid password null/android.view.ViewGroup (1)'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\AppData\\Local\\Temp\\screenshot1104389025135011384.png')

Mobile.closeApplication()

