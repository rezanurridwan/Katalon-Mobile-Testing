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

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.ImageView (3)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.TextView - Log In (1)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText (5)'), 
    0)

Mobile.setText(findTestObject('Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText (5)'), 'bob@example.com', 
    0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText (6)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText (7)'), 
    '10203040', 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\AppData\\Local\\Temp\\screenshot6327100834544555918.png')

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.TextView - Login (1)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.ImageView (4)'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\AppData\\Local\\Temp\\screenshot9004135753480454147.png')

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.TextView - Add To Cart (1)'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\AppData\\Local\\Temp\\screenshot2389423249242109946.png')

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.ImageView (5)'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\AppData\\Local\\Temp\\screenshot8611587560641307874.png')

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.TextView - Proceed To Checkout (1)'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\AppData\\Local\\Temp\\screenshot7310524404775856166.png')

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - Rebecca Winter (6)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - Rebecca Winter (7)'), 
    'Akbar', 0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - Mandorley 112 (4)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - Mandorley 112 (5)'), 
    'Montreal 11', 0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - Entrance 1 (1)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - Entrance 1 (2)'), 
    'Montreal 12', 0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - Truro (2)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - Truro (3)'), 
    'LA', 0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - Cornwall (2)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - Cornwall (3)'), 
    'Texas', 0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - 89750 (2)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - 89750 (3)'), 
    '44181', 0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - United Kingdom (2)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - United Kingdom (3)'), 
    'USA', 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\AppData\\Local\\Temp\\screenshot6013631767067185090.png')

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.TextView - To Payment (2)'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\AppData\\Local\\Temp\\screenshot2969355933801263876.png')

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - Rebecca Winter (8)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - Rebecca Winter (9)'), 
    'Akbar', 0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - 3258 1265 7568 789 (2)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - 3258 1265 7568 789 (3)'), 
    '325812657568789', 0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - 0325 (2)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - 0325 (3)'), 
    '03/23', 0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - 123 (2)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - 123 (3)'), 
    '771', 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\AppData\\Local\\Temp\\screenshot5646500188904808475.png')

Mobile.tap(findTestObject('Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.TextView - Review Order (1)'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\AppData\\Local\\Temp\\screenshot8176705719589903527.png')

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.TextView - Place Order (1)'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\AppData\\Local\\Temp\\screenshot375071418936390280.png')

Mobile.closeApplication()

