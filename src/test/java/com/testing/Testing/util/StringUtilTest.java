package com.testing.Testing.util;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class StringUtilTest {
    @Test
    public void repeat_string_multiple_times(){
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test
    public void repeat_string_two_times(){
        Assert.assertEquals("holahola", StringUtil.repeat("hola", 2 ));
    }

    @Test
    public void repeat_string_zero_times(){
        Assert.assertEquals("", StringUtil.repeat("hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_String_negative_times(){
        StringUtil.repeat("hola", -1);
    }




    /*
    private static void assertEquals(String actual, String expected) {
        if(!actual.equals(expected)){
            throw new RuntimeException(actual +" is not equal to " + expected);
        }
    }

     */

}