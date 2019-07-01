package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {

    private static Matrix matrixObj;

    @Before
    public void setUp() throws Exception {
        matrixObj=new Matrix();
    }

    @After
    public void tearDown() throws Exception {
        matrixObj=null;
    }

    @Test
    public void givenMatrix1andMatrix2ShouldReturnadditionOfMatrices() {
        matrixObj.Matrix1(new int[][]{{1,2},{3,4},{5,6}});
        matrixObj.Matrix2(new int[][]{{9,8},{7,6},{5,4}});
        int[][] actual=matrixObj.addOfMatrices();

        assertArrayEquals(new int[][]{{10,10},{10,10},{10,10}},actual);

    }

    @Test
    public void givenNullShouldReturnadditionOfMatricesNull() {
        int[][] actual = matrixObj.addOfMatrices();

        assertNull(actual);

    }
    }
