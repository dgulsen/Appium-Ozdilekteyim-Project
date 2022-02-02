package com.ozdilekteyim.app;

import com.sun.xml.internal.ws.api.client.SelectOptimalEncodingFeature;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import jdk.nashorn.internal.runtime.Context;
import org.junit.Assert;
import org.openqa.selenium.Dimension;

import java.time.Duration;
import java.util.List;
import java.util.Random;


public class StepImplementation extends BaseTest {

    @Step("Uygulamanın çalıştığını kontrol et")
    public void checkOpenApp() throws InterruptedException {
        Thread.sleep(5000);
        String text = appiumDriver.findElement(Selector.CHECK_OPEN_APP).getText();
        Assert.assertEquals("Mağazadan Alışveriş", text);
    }

    @Step("Alışverişe başla butonuna bas")
    public void clickStartShopping() throws InterruptedException {
        Thread.sleep(3000);
        appiumDriver.findElement(Selector.CLICK_START_SHOPPING).click();
    }

    @Step("Alışveriş sayfasının açıldığını kontrol et")
    public void checkShoppingPage() throws InterruptedException {
        Thread.sleep(3000);
        String text = appiumDriver.findElement(Selector.CHECK_SHOPPING_PAGE).getText();
        Assert.assertEquals("Mağaza", text);
    }

    @Step("Kategoriler sayfasını aç")
    public void goToCategories() throws InterruptedException {
        Thread.sleep(3000);
        appiumDriver.findElement(Selector.GO_TO_CATEGORIES).click();
    }

    @Step("Kategoriler sayfasının açıldığını kontrol et")
    public void checkCategoriesPage() throws InterruptedException {
        Thread.sleep(3000);
        String text = appiumDriver.findElement(Selector.CHECK_CATEGORIES_PAGE).getText();
        Assert.assertEquals("Kategoriler", text);
    }

    @Step("Menüden 'Kadın' seçeneğine tıkla")
    public void selectKadinFromCategories() throws InterruptedException {
        Thread.sleep(3000);
        appiumDriver.findElement(Selector.CLICK_KADIN).click();
    }

    @Step("Pantolon kategorisini aç")
    public void selectPantolon() throws InterruptedException {
        Thread.sleep(3000);
        appiumDriver.findElement(Selector.CLICK_PANTS).click();
    }

    @Step("Sayfayı aşağı kaydır")
    public void scrollDown() throws InterruptedException {

        Dimension dimension = appiumDriver.manage().window().getSize();
        int start_x = (int) (dimension.width * 0.5);
        int start_y = (int) (dimension.height * 0.8);

        int end_x = (int) (dimension.width * 0.2);
        int end_y = (int) (dimension.height * 0.2);

        TouchAction touch = new TouchAction(appiumDriver);
        touch.press(PointOption.point(start_x, start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x, end_y)).release().perform();
        Thread.sleep(1000);

    }

    @Step("Ürünlerden rastgele bir ürün seç")
    public void randomSelectProduct() throws InterruptedException {
        Thread.sleep(3000);
        Random random = new Random();
        List<MobileElement> products = appiumDriver.findElements(Selector.RANDOM_SELECT_PRODUCT);
        int index = random.nextInt(products.size());
        products.get(index).click();
    }

    @Step("Ürün detay sayfasının açıldığını kontrol et")
    public void checkProductDetailsPage() throws InterruptedException {
        Thread.sleep(3000);
        String text = appiumDriver.findElement(Selector.CHECK_PRODUCT_DETAILS_PAGE).getText();
        Assert.assertEquals("SEPETE EKLE", text);
    }

    @Step("Favoriler butonuna tıkla")
    public void clickFavorites() throws InterruptedException {
        Thread.sleep(3000);
        appiumDriver.findElement(Selector.ADD_FAV).click();
    }

    @Step("Giriş yapma sayfasının açıldığını kontrol et")
    public void checkLoginPage() throws InterruptedException {
        Thread.sleep(3000);
        String text = appiumDriver.findElement(Selector.CHECK_LOGIN_PAGE).getText();
        Assert.assertEquals("Giriş Yap", text);
    }

    @Step("Kullanıcı adını gir")
    public void writeEmail() throws InterruptedException {
        Thread.sleep(3000);
        appiumDriver.findElement(Selector.EMAIL).sendKeys("devran.gulsen@testinium.com");
    }

    @Step("Şifreyi gir")
    public void writePassword() throws InterruptedException {
        Thread.sleep(3000);
        appiumDriver.findElement(Selector.PASSWORD).sendKeys("1q2w3e4r5t");
        appiumDriver.hideKeyboard();
    }

    @Step("Giriş yap")
    public void login() throws InterruptedException {
        Thread.sleep(3000);
        appiumDriver.findElement(Selector.LOGIN).click();
    }

    @Step("Geri butonuna bas")
    public void clickBack() throws InterruptedException {
        Thread.sleep(3000);
        appiumDriver.findElement(Selector.BACK_BUTTON).click();
    }

    @Step("Seçilen ürünü sepete ekle")
    public void addCart() throws InterruptedException {
        Random random = new Random();
        List<MobileElement> products = appiumDriver.findElements(Selector.SIZE);
        int index = random.nextInt(products.size());
        products.get(index).click();
        Thread.sleep(5000);
        appiumDriver.findElement(Selector.ADD_CART).click();
        Thread.sleep(3000);
    }

}
