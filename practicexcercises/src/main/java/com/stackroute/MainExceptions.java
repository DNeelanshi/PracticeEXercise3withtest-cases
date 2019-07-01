package com.stackroute;

public class MainExceptions extends Exception {


    public MainExceptions(String msg){  //constructor
        super(msg);
    }

    public static void main(String [] args){

        try{
            throw new MainExceptions("Exception in main");

        }catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("FInally block");
        }
        System.out.println("After try-catch-finally");
    }
}