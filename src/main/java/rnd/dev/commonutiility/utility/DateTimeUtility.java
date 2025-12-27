package rnd.dev.commonutiility.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

import static rnd.dev.commonutiility.constants.DateTimePatternConstants.DATE_TIME_PATTERN;

public class DateTimeUtility {

    private DateTimeUtility() {

    }

    public static String getCurrentDateTime() {
        return new SimpleDateFormat(DATE_TIME_PATTERN).format(new Date());
    }
}
