package com.stackroute;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalculateFirstandLastDateofWeek {

    public static void main(String []args){

        // Get calendar set to current date and time
        Calendar c = Calendar.getInstance();

        // Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);


        // Print dates of the current week starting on Monday

        DateFormat dateformat = new SimpleDateFormat("EEE dd/MM/yyyy");

        System.out.println("First day of week : "+dateformat.format(c.getTime()));

        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        System.out.println("Last day of week : "+dateformat.format(c.getTime()));

    }


}
