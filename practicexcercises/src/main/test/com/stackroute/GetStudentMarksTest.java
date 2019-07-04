package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetStudentMarksTest {

    private static GetStudentMarks obj;

    @Before
    public void setup() throws Exception{

        obj = new GetStudentMarks();
    }

    @After
    public void teardown() throws Exception{

        obj = null;
    }

    @Test
    public void givenGradesShouldReturntrue() {
//        arrange

        boolean expected = true;

        boolean actual = obj.checkGrades(2,new int[]{30,60});

        assertEquals(expected, actual);


    }
//
    @Test
    public void givenGradesShouldReturnfalse() {
//        arrange

        boolean expected = true;

        boolean actual = obj.checkGrades(3,new int[]{30,60,110});

        assertEquals(expected, actual);
    }


}