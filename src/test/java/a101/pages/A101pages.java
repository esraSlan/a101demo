package a101.pages;

import a101.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A101pages {
    public A101pages() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    public WebElement alert;
    @FindBy(css = ".desktop-menu > .js-navigation-item:nth-child(4) > a")
    public WebElement giyimAksesuar;
    @FindBy(linkText = "Kadın İç Giyim")
    public WebElement kadinIcgiyim;
    @FindBy(linkText = "Dizaltı Çorap")
    public WebElement dizAltiCorap;
    @FindBy(id = "attributes_integration_colourSİYAH")
    public WebElement TumSiyahCorap;
    @FindBy(css = "a[href='/giyim-aksesuar/penti-kadin-50-denye-pantolon-corabi-siyah/']")
    public WebElement pentiCorap;
    @FindBy(css = ".add-to-basket")
    public WebElement sepeteEkleButon;
    @FindBy(linkText = "Sepeti Görüntüle")
    public WebElement sepetiGoruntuleBtn;
    @FindBy(linkText ="Sepeti Onayla")
    public WebElement sepetiOnaylaBtn;
    //a[@title="Sepeti Onayla"][2]
    @FindBy(linkText ="ÜYE OLMADAN DEVAM ET")
    public WebElement uyeOmdnDvmEtBtn;
    @FindBy(name ="user_email")
    public WebElement userEmail;
    @FindBy(css =".button:nth-child(3)")
    public WebElement dvmEtBtn;
    @FindBy(linkText ="Yeni adres oluştur")
    public WebElement yeniAdres;
    @FindBy(name ="title")
    public WebElement adresBasligi;

    @FindBy(name ="city")
    public WebElement sehirBox;
    @FindBy(css ="select[name='township']")
    public WebElement ilceBox;
    @FindBy(name ="district")
    public WebElement mahalleBox;

    @FindBy(xpath ="//button[@type='submit'][1]")
    public WebElement kaydetVeDvmEtBtn;

    @FindBy(xpath ="//span[@class='order-complete']")
    public WebElement siparisiTmmlaBtn;

    @FindBy(xpath =" //div[@class='card']")
    public WebElement odemeEkrani;






}
