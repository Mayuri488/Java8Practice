package com.java8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Mayuri
 */
public class TestDate {
    public static Date getSysDateWithoutTimeStamp() {
        final DateFormat DT_FMT_WITHOUT_TMSTMP =
                new SimpleDateFormat("MM/dd/yyyy");
        Date sysDate = new Date();
        try {
            sysDate = DT_FMT_WITHOUT_TMSTMP
                    .parse(DT_FMT_WITHOUT_TMSTMP.format(new Date()));
        } catch (final ParseException e) {
            //log.error(e);
        }
        return sysDate;
    }
    public static void main(String[] args) {
        Date sysDateWithoutTimeStamp = getSysDateWithoutTimeStamp();
        System.out.println(sysDateWithoutTimeStamp);
    }
}
