package com.stackroute;

public class CheckCountryVowelConsonant {

        public String[] removeVowels(String []inputstr){

            String result[]=new String[inputstr.length];
            int index=0;
            for(String element:inputstr){     //for loop for strings
                String resultstring="";
                for(char character:element.toCharArray()){
                    if("aeiou".contains(String.valueOf(character))){  //contains checking for each char in string
                        continue;
                    }
                    resultstring= resultstring+character;
                }
                result[index++]=resultstring;  //increment the index in case of vowels
            }
            return result;
        }
}
