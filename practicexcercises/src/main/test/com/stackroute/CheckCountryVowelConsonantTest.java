package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckCountryVowelConsonantTest {
    CheckCountryVowelConsonant countryobj;

    @Before
    public void setUp() {
        countryobj=new CheckCountryVowelConsonant();
    }

    @After
    public void tearDown(){
        countryobj=null;
    }

    @Test
    public void givenInputCountriesShouldReturnStringsRemovedVowels() {
        String []input={"India",
                "United States" ,
                "Germany",
                "Egypt" ,
                "czechoslovakia"};
        String []expected={"Ind","Untd Stts","Grmny","Egypt","czchslvk"};
        assertArrayEquals(expected,countryobj.removeVowels(input));
    }

    @Test
    public void givenInputConsonantCountriesShouldReturnStringsSame() {
        String []input={"jkljkl",
                "bdbdbdbd"};
        String []expected={"jkljkl","bdbdbdbd"};
        assertArrayEquals(expected,countryobj.removeVowels(input));
    }

}


