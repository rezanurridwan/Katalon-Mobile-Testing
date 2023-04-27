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

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 01 - melakukan pembelian sebelum login akun/android.widget.ImageView'), 
    0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 01 - melakukan pembelian sebelum login akun/android.widget.TextView - Add To Cart'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\AppData\\Local\\Temp\\screenshot12010662545930255.png')

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 01 - melakukan pembelian sebelum login akun/android.widget.ImageView (1)'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\AppData\\Local\\Temp\\screenshot243265550342391287.png')

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 01 - melakukan pembelian sebelum login akun/android.widget.TextView - Proceed To Checkout'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\AppData\\Local\\Temp\\screenshot756448206847375935.png')

Mobile.closeApplication()

