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
        womenCatalog.WomenTop("T-shirts","Women",driver);
    }

    @Test
    public void verifyWomentopBlouses(){

        womenCatalog = new WomenCatalog(driver);
        womenCatalog.WomenTop("Blouses","Women",driver);
    }

    @Test
    public void verifyWomenCasualDress(){

        womenCatalog = new WomenCatalog(driver);
        womenCatalog.WomenDresses("Casual Dresses","Women",driver);
    }
    @Test
    public void verifyWomenEveningDress(){

        womenCatalog = new WomenCatalog(driver);
        womenCatalog.WomenDresses("Evening Dresses","Women",driver);
    }
    @Test
    public void verifyWomenSummerDress(){

        womenCatalog = new WomenCatalog(driver);
        womenCatalog.WomenDresses("Summer Dresses","Women",driver);
    }


    @Test
    public void verifyWomenFilerProduct(){
        womenCatalog=new WomenCatalog(driver);
        womenCatalog.womenCatalogeFilter("Tops","T-shirts",driver);

    }





    @AfterTest
    public void closebrowser(){
//        driver.close();
//        driver.quit();
    }


}
