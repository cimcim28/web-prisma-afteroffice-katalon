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

WebUI.openBrowser('https://demoqa.com/')

WebUI.maximizeWindow(FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Practice Form Page/menuForm'), 0)

WebUI.scrollToElement(findTestObject('Practice Form Page/menuForm'), 0)

WebUI.click(findTestObject('Practice Form Page/menuForm'))

WebUI.waitForElementPresent(findTestObject('Practice Form Page/navMenuPractice'), 0)

WebUI.click(findTestObject('Practice Form Page/navMenuPractice'), FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Practice Form Page/inputfirstName'), 0)

WebUI.setText(findTestObject('Practice Form Page/inputfirstName'), 'Prisma')

WebUI.setText(findTestObject('Practice Form Page/inputLastName'), 'Muharrom')

WebUI.setText(findTestObject('Practice Form Page/inputEmail'), 'prisma@mail.com')

WebUI.scrollToElement(findTestObject('Practice Form Page/chooseMale'), 0)

WebUI.click(findTestObject('Practice Form Page/chooseMale'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Practice Form Page/inputMobilePhone'), '089612341234')

WebUI.click(findTestObject('Practice Form Page/inputDateOfBirth'), FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Practice Form Page/selectDateYear'), '1995', false)

WebUI.click(findTestObject('Practice Form Page/selectDateDay'))

WebUI.click(findTestObject('Practice Form Page/inputSubjects'))

WebUI.setText(findTestObject('Practice Form Page/inputSubjects'), 'Economics' + Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Practice Form Page/chooseHobySports'))

WebUI.uploadFile(findTestObject('Practice Form Page/uploadPicture'), '/Users/adminjds/Downloads/chrome-capture-2025-6-14.png')

WebUI.click(findTestObject('Practice Form Page/inputCurrentAddress'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Practice Form Page/inputCurrentAddress'), 'Depok, Jawa barat. Indonesia')

WebUI.click(findTestObject('Practice Form Page/clickState'))

WebUI.sendKeys(findTestObject('Practice Form Page/selectState'), 'Rajasthan' + Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Practice Form Page/clickCity'))

WebUI.sendKeys(findTestObject('Practice Form Page/selectCity'), 'Jaipur' + Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Practice Form Page/btnSubmit'))

WebUI.verifyMatch(WebUI.getText(findTestObject('Practice Form Page/successForm')), 'Thanks for submitting the form', false)

