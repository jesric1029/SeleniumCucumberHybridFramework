package core;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumCore{



    public static WebDriver driver;

    //Default method with no parameter passed
    public static void setDriver(){




        System.setProperty("webdriver.chrome.driver","src/test/resource/drivers/chromedriver.exe");
        driver = new ChromeDriver();

    }

    //Overloading method
    public static void setDriver(String browser){

        if(browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","src/test/resource/drivers/chromedriver.exe");
            driver = new ChromeDriver();



        }else{
            throw new IllegalArgumentException("Only Chrome browser is currently supported by this framework");
        }


    }

    public static void driverCleanup(){
        driver.quit();
    }

}
