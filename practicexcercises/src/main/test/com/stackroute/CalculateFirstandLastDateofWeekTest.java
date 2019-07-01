package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class CalculateFirstandLastDateofWeekTest {
    CalculateFirstandLastDateofWeek weekDay;

    @Before
    public void setUp() throws Exception {
        weekDay=new CalculateFirstandLastDateofWeek();
    }

    @After
    public void tearDown() throws Exception {
        weekDay=null;
    }

//@Test
//    public void givenCalenderShouldREturnFirstnLastdayofWeek(){
//
//    Calendar c = Calendar.getInstance();
//
//      Calendar resultdate =   weekDay.firstandlastdayofweek(c);
//
//
//}

}