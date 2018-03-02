package PageObjects;

import Base.PageObjectBase;
import org.testng.Assert;

public class letMeGoogleThatForYouPage extends PageObjectBase{
    public void launchWebPage() {
        try {

            _driver.get("http://lmgtfy.com/?q=how+to+automate+using+selenium+in+java");
        }catch (Exception e) {
            log.log(e.toString());
            Assert.fail();
        }
        _driver.close();
    }
}
