package com.example;

//import org.junit.jupiter.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSalary {
    SalaryCalculator obj = new SalaryCalculator();

    @Test
    public void test1(){
        obj.calSal('A');
        assertEquals(11000, obj.calSal('A'));
    }

    @Test
    public void test2(){
        assertEquals(12000, obj.calSal('B'));

    }

//    @Test
//    public void test3(){
//        assertEquals(46000, obj.calSal('C'));
//    }


    @Test
    public void test4(){
        assertEquals(10, obj.calSal2(24));
    }
//    @Test
//    public void test5(){
//        assertEquals(12, obj.calSal2(33));
//    }
}
