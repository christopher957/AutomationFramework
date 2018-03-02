package Tools;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Dictionary;

public class Log {

    public void log (String msgIn)
    {
        String msgOut = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date()).toString();

        msgOut += "   " + msgIn;

        System.out.println(msgOut);

    }
}
