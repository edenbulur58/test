package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NweaPages;
import utilities.ConfigReader;
import utilities.Driver;

public class NWEATest {

    NweaPages nweaPages=new NweaPages();

    @Test
    public  void loginMethod() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url_nwea"));
        nweaPages.logIn("fakeusername","fakepass");
        Thread.sleep(3000);
        Assert.assertTrue(nweaPages.errorMessage.getText().equals("Username and Password do not match"));
    }

}
