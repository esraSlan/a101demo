package a101.stepDefinitions;

import a101.pages.A101pages;
import a101.utilities.ConfigReader;
import a101.utilities.Driver;
import a101.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class A101StepDefinition {
    Faker faker = new Faker();
    A101pages patika = new A101pages();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici {string}ya gider")
    public void kullanici_gider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
        }

      @And("Cookies kabul eder")
      public void cookiesKabulEder() {
          if ((patika.alert).isDisplayed()) {
              patika.alert.click(); }
      }


    @Then("Kullanici uye olmadan Giyim Aksesuardan Kadin ic giyim kismindan dizalti corap bolumunu secer")
    public void kullanici_uye_olmadan_giyim_aksesuardan_kadin_ic_giyim_kismindan_dizalti_corap_bolumunu_secer() {

        js.executeScript("arguments[0].click();", patika.giyimAksesuar);
       ReusableMethods.waitForVisibility(patika.kadinIcgiyim,3).click();
        js.executeScript("arguments[0].click();", patika.dizAltiCorap);


    }

    @Then("Tum dizalti siyah coraplar secilir")
    public void tum_dizalti_siyah_coraplar_secilir() {
        js.executeScript("arguments[0].click();", patika.TumSiyahCorap);
        Driver.wait(2);

    }

    @Then("Secilen urun sepete eklenir")
    public void secilen_urun_sepete_eklenir() {
        js.executeScript("arguments[0].click();", patika.pentiCorap);
        Driver.waitForVisibility(patika.sepeteEkleButon,2);
        js.executeScript("arguments[0].click();", patika.sepeteEkleButon);


    }

    @Then("Sepeti Goruntule butonuna tiklar")
    public void sepeti_goruntule_butonuna_tiklar() {

        Driver.waitForVisibility(patika.sepetiGoruntuleBtn,2);
     js.executeScript("arguments[0].click();", patika.sepetiGoruntuleBtn);
    }

    @Then("Sepeti Onayla butonuna tiklar")
    public void sepeti_onayla_butonuna_tiklar() {
        ReusableMethods.waitForClickablility(patika.sepetiOnaylaBtn,2);
        js.executeScript("arguments[0].click();", patika.sepetiOnaylaBtn);
    }

    @Then("uye olmadan devam et butonuna tiklar")
    public void uye_olmadan_devam_et_butonuna_tiklar() {
        Driver.waitForClickablility(patika.uyeOmdnDvmEtBtn,2).click();

    }

    @Then("gelen ekrana gecerli bir email girer")
    public void gelen_ekrana_gecerli_bir_email_girer() {
        actions.sendKeys(patika.userEmail,"esas12@gmail.com").click(patika.dvmEtBtn).perform();

    }

    @Then("gelen ekrana gecerli bilgiler girerek bir adres olusturur")
    public void gelen_ekrana_gecerli_bilgiler_girerek_bir_adres_olusturur() {
        actions.click(patika.yeniAdres).sendKeys(patika.adresBasligi,"ev") .
                sendKeys(Keys.TAB).sendKeys("esra").sendKeys(Keys.TAB).sendKeys("Aslan").
                sendKeys(Keys.TAB).sendKeys("5436561234").perform();

        Select dropdown = new Select(patika.sehirBox);
        dropdown.selectByVisibleText("ADANA");
        Driver.wait(2);
         dropdown = new Select(patika.ilceBox);
         dropdown.selectByVisibleText("ALADAĞ");
        Driver.wait(2);
        dropdown = new Select(patika.mahalleBox);
        dropdown.selectByVisibleText("MANSURLU MAH");
        actions.sendKeys(Keys.TAB).sendKeys("cicek sk. no:10").sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

    }

    @Then("Odeme ekranina gelir")
    public void odeme_ekranina_gelir() {
        ReusableMethods.waitForVisibility(patika.kaydetVeDvmEtBtn,2);
        patika.kaydetVeDvmEtBtn.submit();

    }

    @Then("kullanici siparisi tamamla butonuna tiklar")
    public void kullanici_siparisi_tamamla_butonuna_tiklar() {

        ReusableMethods.waitForVisibility(patika.siparisiTmmlaBtn,2);
        patika.siparisiTmmlaBtn.submit();
    }

    @Then("odeme ekranina gidildigi dogrulanir")
    public void odeme_ekranina_gidildigi_dogrulanir() {
        ReusableMethods.waitForVisibility(patika.odemeEkrani,2);
        Assert.assertTrue(patika.odemeEkrani.isDisplayed());
        Driver.getDriver().quit();

    }


}
