package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionHandlingTest {


    ExceptionHandling numberobj;

    @Before
    public void setUp() throws Exception {
        numberobj=new ExceptionHandling();
    }

    @After
    public void tearDown() throws Exception {
        numberobj=null;
    }

    @Test
    public void checkException (){
        //        NegativeArraySizeException
        try{
            int arr[]=new int[-2];
        }catch(NegativeArraySizeException e){
            System.out.println(e);
        }

//        IndexOutOfBoundsException
        try{
            int arr[]=new int[3];
            arr[3]=30;
        }catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }

//        NullPointerException
        try{
            int arr[]=null;
            int length=arr.length;
        }catch(NullPointerException e){
            System.out.println(e);
        }

    }



}