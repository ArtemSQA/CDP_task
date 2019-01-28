import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.*;

public class ManualTheBest extends DotNetTheBest{
    @Test
    public void firstTest() throws InterruptedException {
        driver.get("https://www.canadiantire.ca/content/canadian-tire/en.html");
        Thread.sleep(2000);
        //driver.findElementByXPath("//*[@id=\"departmentMegaMenu\"]/div/div[1]/ul/li[1]").click();
        driver.findElementByXPath("//*[@class='departments-megamenu__nav-list__toggle departments-megamenu__nav-list__toggle-Automotive departments-megamenu__nav-list__toggle-flyer']").click();
        //driver.findElementByXPath("//div[@class='department-megamenu__container']//a[@data-analytics='Automotive']").click();
        Thread.sleep(2000);
        String url="https://www.canadiantire.ca/content/canadian-tire/en/automotive.html?adlocation=LOL_AutomotiveDLP_MeganavHeader_18339_en";

        assertTrue(driver.getCurrentUrl().equals(url));
        Thread.sleep(3000);
    }
    @Test
    public void secondTest() throws InterruptedException {
        String check = "RSSW RMG TYPE Alloy Wheel";
        String CorrectUrl = "https://www.canadiantire.ca/en/wheels/pdp/rssw-rmg-type-alloy-wheel-1417043p.html";
        driver.manage().window().maximize();
        driver.get("https://www.canadiantire.ca/content/canadian-tire/en.html");
        Thread.sleep(1500);
        WebElement search = driver.findElementByXPath("//*[@class='global-search__search']");
        search.sendKeys(check);

        search.sendKeys(Keys.ENTER);
        Thread.sleep(5000);


        assertTrue(driver.getCurrentUrl().equals(CorrectUrl));
        // Optional System.out.println(driver.getCurrentUrl());
        Thread.sleep(4000);

    }

    @Test
    public void thirdTest() throws InterruptedException {
        String check = "SHEPPARD AVE., ON";
        driver.get("https://www.canadiantire.ca/content/canadian-tire/en.html");
        Thread.sleep(2000);
        WebElement FindNewStore = driver.findElementByXPath("//div[@class='initial-global-store']//a[@class='global_store__content__store-view__change-store-link']");
        FindNewStore.click();
        Thread.sleep(2000);
        WebElement searchField = driver.findElementByXPath("//input[@id=\'store-locator-search__input\']");
        searchField.clear();
        searchField.sendKeys("yonge toronto");
        Thread.sleep(2000);
        WebElement searchFirst = driver.findElementByXPath("//*[@class=\'store-locator-search__predicted-item-link\']");
        searchFirst.click();
        Thread.sleep(2000);
        WebElement SetButton = driver.findElementByXPath("//*[@class='store-list__tab__content__list-item__accordion__store-pin js-save-as-my-favourite-store store-list_accordion_store-pin-analytics']");
        SetButton.click();
        WebElement StoreName = driver.findElementByXPath("//button[@class='global-header__main-bar__utility-nav__flyout-toggle__inner accessibility-expanded']//*[@class='global-store__content__section__store-name js-chosen-store-city-name']");
        assertTrue(StoreName.getText().equals(check));
        Thread.sleep(4000);
    }
}
