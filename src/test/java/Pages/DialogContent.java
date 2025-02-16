package Pages;

import Utilites.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Samsung']")
    private WebElement messageSamsung;
    @FindBy(xpath = "//*[@href='#delete-bold']")
            private WebElement cookie;
    @FindBy(xpath = "//span[text()='Ekranlar']")
            private WebElement ekranlar;
    @FindBy(xpath = "//a[@data-engname='screens:monitors']")
            private WebElement monitor;
    @FindBy(css = "[an-la=\"screens:monitors:discover monitors\"] span")
            private WebElement mKesfedin;
    @FindBy(xpath = "(//div[contains(@class,'image--main-loaded')]/img)[10]")
    private WebElement ultraGenis;
    @FindBy(xpath = "//*[@data-modelname=\"C34G55TWWR\"]")
            private WebElement monitor2;
    @FindBy(className = "pd-option-selector__main-text")
            private WebElement message34;

    //**************************  Smart Things  **************************//
    @FindBy(xpath = "(//span[text()='SmartThings'])[1]")
            private WebElement smartThingsTitle;
    @FindBy(xpath = "(//div[2]/ul/li[3]/a/span)[7]")
            private WebElement appsAndProductsTitle;

    @FindBy(xpath = "//div[2]/div[@class='st-feature-benefit__cta-wrap']/a[1]")
            private WebElement gPlayStore;

    @FindBy(xpath = "//span[text()='SmartThings']")
            private WebElement verifyPlayStore;

    @FindBy(xpath = "//div[2]/div[@class='st-feature-benefit__cta-wrap']/a[2]")
            private WebElement aAppStore;

    @FindBy(xpath = " //h1[text()='SmartThings']")
            private WebElement verifyAppStore;

    //**************************  Aksesuarlar  **************************//

    @FindBy(xpath = "//*[text()='Aksesuarlar']")
    private WebElement aksesuarlar;
    @FindBy(xpath = "//div[@class='sr03-acc-pcd-search__inner']/button")
    private WebElement searchBox;
    @FindBy(xpath = "//div[@class='sr03-acc-pcd-search__input-field']/input")
    private WebElement sendProduct;
    @FindBy(xpath = "//*[@data-modelname=\"ef-bx900\"]")
    private WebElement tab8;
    @FindBy(xpath = "//*[text()='SATIN AL']")
    private WebElement buy;
    @FindBy(xpath = "(//*[contains(text(),' SEPETE EKLE')])[2]")
    private WebElement addTo;
    @FindBy(xpath = "(//*[contains(text(),'Git')])[2]")
    private WebElement goTo;
    @FindBy(xpath = "(//*[@class='icon-bin'])[2]")
    private WebElement delete;
    @FindBy(xpath = "//*[contains(@class,'line-height-1')]")
    private WebElement messageEmpty;
    @FindBy(xpath = "(//div[contains(@class,'h-100')]/button)[1]")
    private WebElement close;

    //**************************          **************************//

    @FindBy(xpath = "(//a[text()='Destek'])[2]")
    private WebElement destekBtn;

    @FindBy(xpath = "(//a[@aria-label='DAHA FAZLA BİLGİ EDİN'])[1]")
    private WebElement garantiDahaFazlaBtn;

    @FindBy(xpath = "(//ul[@class='warranty-card-info__tab-list']/li)[1]")
    private WebElement mobilCihazBtn;

    @FindBy(xpath = "(//ul[@class='warranty-card-info__tab-list']/li)[2]")
    private WebElement tvVeAydinlatmaBtn;

    @FindBy(xpath = "(//ul[@class='warranty-card-info__tab-list']/li)[3]")
    private WebElement beyazEsyaBtn;

    @FindBy(xpath = "(//ul[@class='warranty-card-info__tab-list']/li)[4]")
    private WebElement bilgisayarVeOfisBtn;

    @FindBy(xpath = "(//ul[@class='warranty-card-info__tab-list']/li)[5]")
    private WebElement kameraVeVideoKameraBtn;

    @FindBy(xpath = "(//ul[@class='warranty-card-info__tab-list']/li)[6]")
    private WebElement depolamaBtn;



    WebElement myElement;

    public void findAndSend(String strElement, String value) {
        switch (strElement) {
            case "sendProduct":myElement=sendProduct;break;


        }
        sendKeysFunction(myElement,value);
    }

    public void findAndClick (String strElement){
        switch (strElement){
            case "cookie":myElement=cookie;break;
            case "ekranlar":myElement=ekranlar;break;
            case "monitor":myElement=monitor;break;
            case "mKesfedin":myElement=mKesfedin;break;
            case "ultraGenis":myElement=ultraGenis;break;
            case "gPlayStore":myElement=gPlayStore;break;
            case "aAppStore":myElement=aAppStore;break;
            case "aksesuarlar":myElement=aksesuarlar;break;
            case "searchBox":myElement=searchBox;break;
            case "tab8":myElement=tab8;break;
            case "buy":myElement=buy;break;
            case "addTo":myElement=addTo;break;
            case "goTo":myElement=goTo;break;
            case "delete":myElement=delete;break;
            case "close":myElement=close;break;
            case "destekBtn":myElement=destekBtn;break;
            case "garantiDahaFazlaBtn":myElement=garantiDahaFazlaBtn;break;
            case "mobilCihazBtn":myElement=mobilCihazBtn;break;
            case "tvVeAydinlatmaBtn":myElement=tvVeAydinlatmaBtn;break;
            case "beyazEsyaBtn":myElement=beyazEsyaBtn;break;
            case "bilgisayarVeOfisBtn":myElement=bilgisayarVeOfisBtn;break;
            case "kameraVeVideoKameraBtn":myElement=kameraVeVideoKameraBtn;break;
            case "depolamaBtn":myElement=depolamaBtn;break;





        }
        clickFunction(myElement);
    }

    public void findAndContainsText (String strElement,String text){
        switch (strElement){
            case "messageSamsung":myElement=messageSamsung;break;
            case "message34":myElement=message34;break;
            case "verifyPlayStore":myElement=verifyPlayStore;break;
            case "verifyAppStore":myElement=verifyAppStore;break;
            case "messageEmpty":myElement=messageEmpty;break;



        }
        verifyContainsText(myElement,text);
    }

    public void SearchAndDelete(String searchText){

    }

    public void actionAndClick (String strElement){
        switch (strElement){
            case "monitor":myElement=monitor;break;
            case "mKesfedin":myElement = mKesfedin;break;
            case "monitor2":myElement = monitor2;break;
            case "smartThingsTitle":myElement = smartThingsTitle;break;
            case "appsAndProductsTitle":myElement = appsAndProductsTitle;break;

        }
        actionFunction(myElement);
    }

    public WebElement getMyElement(String strElement) {
        switch (strElement){
            case "garantiDahaFazlaBtn":myElement=garantiDahaFazlaBtn;break;

        }
        return myElement;
    }
}
