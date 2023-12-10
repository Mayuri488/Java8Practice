package com.java8;

import javax.xml.datatype.XMLGregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Mayuri
 */
public class DateTest {

    public static void main(String[] args) {
        List<Long> arpParty = new ArrayList<>();
        Long party1 = new Long(0);
        //arpParty.add(party1);
        Long minArpParty = Collections.min(arpParty);
        System.out.println(minArpParty);
    }


}
