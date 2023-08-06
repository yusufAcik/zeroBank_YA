package com.zerobank.pages;

import com.zerobank.utilties.BrowserUtils;
import com.zerobank.utilties.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OnlineBankingPage extends BasePage{
    public void navigateToMenu(String str){
        WebElement element = Driver.get().findElement(By.xpath("//span[.='"+str+"']"));
        BrowserUtils.clickWithJS(element);
    }
}
