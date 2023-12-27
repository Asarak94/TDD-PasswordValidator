package org.wsu.softwaretesting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {


    @Test
    public void testInvalidPassword(){
        //Test 1: Test an invalid password that doesn't meet minimum length
        assertEquals("Invalid Password!",PasswordValidator.validatePassword("shortpass"));
    }
    @Test
    public void testStrongPasswordLength(){
        //Test 2: Test a weak password with char length less than 14
        assertEquals("Weak password",PasswordValidator.validatePassword("shortpassssss"));
    }
    @Test
    public void testUppercaseWeak(){
        //Test 3: Test  a weak password without uppercases
        assertEquals("Weak password",PasswordValidator.validatePassword("aaaaaaaaaaaaaaaaaa"));
    }
    @Test
    public void testLowercaseWeak(){
        //Test 4: Test  a weak password without lowecases
        assertEquals("Weak password",PasswordValidator.validatePassword("1232212152131AS36336713AA"));
    }
    @Test
    public void testNumbersWeak(){
        //Test 5: Test  a weak password without Numbers
        assertEquals("Weak password",PasswordValidator.validatePassword("AAAAAAAAAAAAAAAaaaaaaaaaaaa"));
    }
    @Test
    public void testSpecialWeak(){
        //Test 6: Test  a weak password with less than 2 special characters
        assertEquals("Weak password",PasswordValidator.validatePassword("ASAS4232ASadababa@42351"));
    }
    @Test
    public void testStrongPassword(){
        //Test 7: Test  a Strong password that meet evey conditions
        assertEquals("Strong password",PasswordValidator.validatePassword("ASAS4232ASadababa@$#42351"));
    }
}
