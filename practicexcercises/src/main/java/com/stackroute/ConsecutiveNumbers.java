package com.stackroute;

import java.util.Arrays;

public class ConsecutiveNumbers {

    //Calculate consecutive numbers using loop

    public boolean checkConsecutive(String input){
        String array[] = input.split(",");

        Arrays.sort(array);

        for(int i=0; i<array.length-1;i++){

            if(Integer.valueOf(array[i+1])-Integer.valueOf(array[i]) == 1){

                continue;
            }
            return false;

        }
        return true;
    }

}
