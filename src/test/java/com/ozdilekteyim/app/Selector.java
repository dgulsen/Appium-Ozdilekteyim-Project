package com.ozdilekteyim.app;

import org.openqa.selenium.By;

public class Selector {

    public static By CHECK_OPEN_APP = By.id("com.ozdilek.ozdilekteyim:id/textView");
    public static By CLICK_START_SHOPPING = By.id("com.ozdilek.ozdilekteyim:id/tv_startShoppingStore");
    public static By CHECK_SHOPPING_PAGE =  By.xpath("//android.widget.FrameLayout[@resource-id='com.ozdilek.ozdilekteyim:id/relLayStore']/android.widget.TextView");
    public static By GO_TO_CATEGORIES = By.id("com.ozdilek.ozdilekteyim:id/nav_categories");
    public static By CHECK_CATEGORIES_PAGE = By.xpath("//android.widget.LinearLayout[@content-desc='Kategoriler']/android.widget.TextView");
    public static By CLICK_KADIN = By.xpath("//android.widget.RelativeLayout[@resource-id='com.ozdilek.ozdilekteyim:id/relLayCategoriesItem'][2]");
    public static By CLICK_PANTS = By.xpath("//android.widget.RelativeLayout[@resource-id='com.ozdilek.ozdilekteyim:id/relLayCategoriesItem'][14]");
    public static By RANDOM_SELECT_PRODUCT = By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.ozdilek.ozdilekteyim:id/recyclerView']/android.widget.FrameLayout");
    public static By CHECK_PRODUCT_DETAILS_PAGE = By.xpath("//android.widget.RelativeLayout[@resource-id='com.ozdilek.ozdilekteyim:id/relLayAddCartBtn']/android.widget.RelativeLayout/android.widget.TextView");
    public static By ADD_FAV = By.id("com.ozdilek.ozdilekteyim:id/relLayFav");
    public static By CHECK_LOGIN_PAGE = By.id("com.ozdilek.ozdilekteyim:id/btnLogin");
    public static By EMAIL = By.id("com.ozdilek.ozdilekteyim:id/etEposta");
    public static By PASSWORD = By.id("com.ozdilek.ozdilekteyim:id/etPassword");
    public static By LOGIN = By.id("com.ozdilek.ozdilekteyim:id/btnLogin");
    public static By BACK_BUTTON = By.id("com.ozdilek.ozdilekteyim:id/ivBack");
    public static By SIZE = By.id("com.ozdilek.ozdilekteyim:id/tvInSizeItem");
    public static By ADD_CART = By.id("com.ozdilek.ozdilekteyim:id/cardAddToCart");

}
