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

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.ImageView (6)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.TextView - Log In (2)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText (8)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText (9)'), 
    'bob@example.com', 0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText (10)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText (11)'), 
    '10203040', 0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.TextView - Login (2)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.ImageView (7)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.TextView - Add To Cart (2)'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\AppData\\Local\\Temp\\screenshot7050360574550931426.png')

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.ImageView (8)'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\AppData\\Local\\Temp\\screenshot6128377647016114459.png')

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.TextView - Proceed To Checkout (2)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - Rebecca Winter (10)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - Rebecca Winter (11)'), 
    'akabr', 0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - Mandorley 112 (6)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - Mandorley 112 (7)'), 
    'marolin 1', 0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - Entrance 1 (3)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - Entrance 1 (4)'), 
    'marolin 2', 0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - Truro (4)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - Truro (5)'), 
    'Uilo', 0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - 89750 (4)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - 89750 (5)'), 
    '44418', 0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - Cornwall (4)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - Cornwall (5)'), 
    'LA', 0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - United Kingdom (4)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - United Kingdom (5)'), 
    'USA', 0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.TextView - To Payment (3)'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\AppData\\Local\\Temp\\screenshot812451138029020859.png')

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - Rebecca Winter (12)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - Rebecca Winter (13)'), 
    'akbar', 0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - 3258 1265 7568 789 (4)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - 3258 1265 7568 789 (5)'), 
    '325812657568789', 0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - 0325 (4)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - 0325 (5)'), 
    '08/23', 0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - 123 (4)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.EditText - 123 (5)'), 
    '123', 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\AppData\\Local\\Temp\\screenshot8392159550702073785.png')

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.widget.TextView - Review Order (2)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.view.ViewGroup (4)'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\AppData\\Local\\Temp\\screenshot1072869724074326450.png')

Mobile.tap(findTestObject('Object Repository/Buy Product/TCBuy 02 - melakukan pembelian setelah login/android.view.ViewGroup (5)'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\AppData\\Local\\Temp\\screenshot3135360181106546961.png')

Mobile.closeApplication()

