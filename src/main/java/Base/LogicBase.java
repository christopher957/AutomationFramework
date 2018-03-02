package Base;

import Tools.Log;


public class LogicBase {
    public Log log = new Log();

    public void sleep(Integer sleepTime) {

        try {
            log.log("preparing to sleep for " + sleepTime / 1000 + " seconds");
            Thread.sleep(Long.valueOf(Long.valueOf(sleepTime.toString()))); //dont ask google is hard and I could not be bothered to remember the correct way to cast an int to a long
            log.log("waking up");
        }
        catch(Exception e) {
            log.log(sleepTime.toString());
            }
    }


}
