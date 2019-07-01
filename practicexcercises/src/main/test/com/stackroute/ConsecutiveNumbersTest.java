package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {


    ConsecutiveNumbers numberobj;

    @Before
    public void setUp() throws Exception {
        numberobj=new ConsecutiveNumbers();
    }

    @After
    public void tearDown() throws Exception {
        numberobj=null;
    }

    @Test
    public void givenNumbersShouldReturnConsecutiveFailure() {
        boolean expected=false;
        boolean actual=numberobj.checkConsecutive("98,96,95,94,93");
        assertEquals(expected,actual);

    }

    @Test
    public void givenNumbersShouldReturnConsecutiveSuccess() {
        boolean expected=true;
        boolean actual=numberobj.checkConsecutive("54,53,52,51,50,49,48");
        assertEquals(expected,actual);

    }

}