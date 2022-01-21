package com.testing.Testing.util.util;

public class PasswordUtil{
    public enum SecurituLevel{
        WEAK, MEDIUM, STRONG
    }
    public static SecurituLevel assesPassword(String password){
        if(password.length() < 8) {
            return SecurituLevel.WEAK;
        }
        if(password.matches("[a-zA-z]+")){
            return SecurituLevel.WEAK;
        }

        if(password.matches("[a-zA-Z0-9]+")){
            return SecurituLevel.MEDIUM;
        }
        return SecurituLevel.STRONG;
    }
}
