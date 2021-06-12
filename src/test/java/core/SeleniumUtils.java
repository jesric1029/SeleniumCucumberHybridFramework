package core;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {

    public String search(String text){

        WebElement element = SeleniumCore.driver.findElement(By.name("q"));
        element.sendKeys(text);
        element.submit();
        //Wait until the google page shows the result
        String currentElement = SeleniumCore.driver.getCurrentUrl();
        System.out.println("Printing current element: "+currentElement);
        if(SeleniumCore.driver.getPageSource().contains("Google")) {
            //Test Passes
        }else{
            Assert.fail("Test failed when searching keyword " + text);
        }
        return text;

    }

    public void testGoogleStore(String device, String model) {

        WebElement storeButton = SeleniumCore.driver.findElement(By.linkText("Store"));
        storeButton.click();
        WebElement deviceElement = new WebDriverWait(SeleniumCore.driver,10).until(ExpectedConditions.elementToBeClickable(By.cssSelector(device)));
        deviceElement.click();
        WebElement modelElement = new WebDriverWait(SeleniumCore.driver,10).until(ExpectedConditions.elementToBeClickable(By.linkText(model)));
        modelElement.click();


    }

}
