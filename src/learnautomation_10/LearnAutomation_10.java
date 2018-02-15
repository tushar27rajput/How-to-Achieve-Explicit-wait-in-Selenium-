/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnautomation_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 *
 * @author tusshar
 */
public class LearnAutomation_10 {

    /**
     * @param args the command line arguments
     */
    @Test
    public static void main(String[] args) {
        
        
                          System.setProperty("webdriver.gecko.driver","C:\\Users\\tusshar\\Downloads\\geckodriver.exe");
                          
                          WebDriver driver = new FirefoxDriver();
                          
                          driver.get("http://demowebshop.tricentis.com/register");
                          
                          driver.manage().window().maximize();
                          
                          //define webdriver wait statement with time specified
                          WebDriverWait wait = new WebDriverWait(driver,10);
                          
                          //apply the wait for specific element. Below statement will wait for element to be present till 10 sec as specified by above
                          wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[@class='ico-register']")));
                          
                          driver.close();
                          
                          driver.quit();
    }
    
}
