package jwkj.com.scrolltime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by dxs on 2016/4/6.
 */
public class Utils {
    /**
     * 1393445856--->2014-05-01 00:01:58
     *
     * @param time
     * @return
     */
    public static CharSequence timeLong2Date(long time) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatter.format(time);

    }
    /**
     * 2014-05-01 00:01:58 --->1393445565
     * @param time
     * @return
     */
    public static long date2TimeLong(String time) {
        Calendar c = Calendar.getInstance();

        try {
            c.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(time));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return c.getTimeInMillis();
    }
}
