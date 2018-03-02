package Logic;

import Base.LogicBase;
import Tools.Log;
import PageObjects.letMeGoogleThatForYouPage;

public class ExampleLogic extends LogicBase {
    Log log = new Log();
    public void hereLetMeGoogleThatForYou() {
        letMeGoogleThatForYouPage page = new letMeGoogleThatForYouPage();
        page.launchWebPage();

    }

    public void shortTest() {
        log.log("This is a short test");
    }

    public void longtest() {
        log.log("This is a much longer test");
        sleep(10000);
    }

}
