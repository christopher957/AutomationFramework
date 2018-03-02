package TestsSuites;

import Logic.ExampleLogic;
import Tools.Log;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestExample {
    Log log = new Log();
    @BeforeClass
    public void setUp() {
        log.log("This is where we would do any thing that had to be done to set up for all tests");
    }

    @AfterClass
    public void tearDown() {
        log.log("Comtria!");

    }

    @Test(groups = { "fast" })
    public void aFastTest() {
        ExampleLogic logic = new ExampleLogic();
        logic.shortTest();
    }

    @Test(groups = { "slow" })
    public void aSlowTest() {
        ExampleLogic logic = new ExampleLogic();
        logic.longtest();
    }

    @Test()
    public void letMeGoogleThatForYou() {
        ExampleLogic logic = new ExampleLogic();
        logic.hereLetMeGoogleThatForYou();
    }

}
