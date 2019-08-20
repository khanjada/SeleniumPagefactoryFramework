package womenCatalog;

import base.ScriptBase;
import controller.WomenCatalog;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WomenCatalogTest extends ScriptBase {


WomenCatalog womenCatalog;
    @BeforeTest
    public void beforetest(){
        init();
    }



    @Test
    public void verifyWomenDress(){

        womenCatalog = new WomenCatalog(driver);
        womenCatalog.WomenProduct("Women",driver);
    }

    @Test
    public void verifyCatalogTabDress(){

        womenCatalog = new WomenCatalog(driver);
        womenCatalog.WomenProduct("Dresses",driver);
    }

    @Test
    public void verifyWomentopTshirt(){

        womenCatalog = new WomenCatalog(driver);
        womenCatalog.WomenTopDress("T-shirts","Women",driver);
    }

    @Test
    public void verifyWomentopBlouses(){

        womenCatalog = new WomenCatalog(driver);
        womenCatalog.WomenTopDress("Blouses","Women",driver);
    }

    @Test
    public void verifyWomenCasualDress(){

        womenCatalog = new WomenCatalog(driver);
        womenCatalog.WomenTopDress("Casual Dresses","Women",driver);
    }
    @Test
    public void verifyWomenEveningDress(){

        womenCatalog = new WomenCatalog(driver);
        womenCatalog.WomenTopDress("Evening Dresses","Women",driver);
    }
    @Test
    public void verifyWomenSummerDress(){

        womenCatalog = new WomenCatalog(driver);
        womenCatalog.WomenTopDress("Summer Dresses","Women",driver);
    }


    @Test
    public void verifyWomenFilerProduct(){
        womenCatalog=new WomenCatalog(driver);
        womenCatalog.womenCatalogeFilter("Tops","T-shirts",driver);

    }

    @Test
    public void verifyWomenFilerProductBlouse(){
        womenCatalog=new WomenCatalog(driver);
        womenCatalog.womenCatalogeFilter("Tops","Blouses",driver);

    }

    @Test
    public void verifyWomenFilerProductSecond(){
        womenCatalog=new WomenCatalog(driver);
        womenCatalog.womenCatalogeFilter("dresses","Casual Dresses",driver);

    }

    @Test
    public void verifyWomenFilerProducDress(){
        womenCatalog=new WomenCatalog(driver);
        womenCatalog.womenCatalogeFilter("Dresses","Casual Dresses",driver);

    }
    @Test
    public void verifyWomenFilerProducDressEvening(){
        womenCatalog=new WomenCatalog(driver);
        womenCatalog.womenCatalogeFilter("Dresses","Evening Dresses",driver);

    }
    @Test
    public void verifyWomenFilerProducDressSummer(){
        womenCatalog=new WomenCatalog(driver);
        womenCatalog.womenCatalogeFilter("Dresses","Summer Dresses",driver);

    }







    @AfterTest
    public void closebrowser(){
        driver.close();
        driver.quit();
    }


}
