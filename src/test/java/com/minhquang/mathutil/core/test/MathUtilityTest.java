package com.minhquang.mathutil.core.test;


import com.minhquang.mathutil.core.MathUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */



/**
 *
 * @author hoqua
 */
public class MathUtilityTest {
    //Test case #1 - Verify getFactorial(with n=0)
    // Steps/Procedures
    //  1. Given n = 0
    //  2. Call/Invoke getFactorial(n=0)
    // Expected Result:
    //  The method must return 1 as the result of 0! = 1
    // Status: PASSED ! FAILED chờ đến lúc runtime
    @Test
    public void verifyFactorialGivenRighArgument0ReturnsOk(){
        Assertions.assertEquals(1,MathUtility.getFactorial(0));
    }
    
    @Test
    public void verifyFactorialGivenRighArgument1ReturnsOk(){
        Assertions.assertEquals(1,MathUtility.getFactorial(1));
    }
    
    @Test
    public void verifyFactorialGivenRighArgument5ReturnsOk(){
        Assertions.assertEquals(120,MathUtility.getFactorial(5));
    }
    
}
