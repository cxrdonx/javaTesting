package com.testing.Testing.util.util;

public class DateUtil {
    public static boolean isLeapYear(int year){
        if(year%400 ==0 || (year%4 == 0 && year%100 != 0)){
            return true;
        }else{
            return false;
        }

    }
}
