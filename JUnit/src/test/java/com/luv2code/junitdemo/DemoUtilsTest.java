package com.luv2code.junitdemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilsTest {


    @Test
    void testEqualsAndNotEquals() {
        //set up
        DemoUtils demoUtils = new DemoUtils();

        int expected = 6;
        int unexpected = 8;

        //execute
        int actual = demoUtils.add(2, 4);

        //assert
        assertEquals(expected, actual, "2+4 must be 6");
        assertNotEquals(unexpected, actual, "2+4 must not be 8");

    }

    @Test
    void testNullAndNotNull(){
        //set up
        DemoUtils demoUtils = new DemoUtils();

        String str1 = null;
        String str2 = "luv2code";


        //assert
        assertNull(demoUtils.checkNull(str1));
        assertNotNull(demoUtils.checkNull(str2));
    }

}