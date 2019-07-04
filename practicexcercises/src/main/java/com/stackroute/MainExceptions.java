package com.stackroute;

public class MainExceptions extends Exception {


    public MainExceptions(String msg){  //constructor
        super(msg);  //using super to invoke Exception constructor
    }

    public static void main(String [] args){

        try{

            throw new MainExceptions("Exception in main");

        }catch(Exception e){

            System.out.println(e);
        }
        finally {
//finally block to be executed
            System.out.println("FInally block");
        }

        System.out.println("After try-catch-finally");
    }
}