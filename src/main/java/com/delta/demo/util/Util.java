package com.delta.demo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by maiquelknechtel on 2/3/22.
 */
public class Util {

    public static Date convertStringToDate(String date){
        try {

            return new SimpleDateFormat("yyyy-MM-dd").parse(date);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return  null;
    }
}
