package com.testing.Testing.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordUtilTest{

    @Test
    public void weak_when_has_less_than_8_letteres() {
         assertEquals(PasswordUtil.SecurituLevel.WEAK, PasswordUtil.assesPassword("1234567"));
    }
    @Test
    public void weak_when_has_unly_letters() {
        assertEquals(PasswordUtil.SecurituLevel.WEAK, PasswordUtil.assesPassword("abcdfgh"));
    }

    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(PasswordUtil.SecurituLevel.MEDIUM, PasswordUtil.assesPassword("abcd1234"));
    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols() {
        assertEquals(PasswordUtil.SecurituLevel.STRONG, PasswordUtil.assesPassword("abcd3289*)-"));
    }
}