package com.zerobank.pages;

import com.zerobank.utilties.BrowserUtils;
import com.zerobank.utilties.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public void navigateSection(String str){
        WebElement element = Driver.get().findElement(By.xpath("//strong[.='"+str+"']"));
        BrowserUtils.clickWithJS(element);
    }
}
