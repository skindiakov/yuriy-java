package com.learn.java;

import org.junit.Assert;
import org.junit.Test;

public class FindSmallestAbsentTest {

    private FindSmallestAbsent service = new FindSmallestAbsent();
    
    @Test
    public void test() {
        findSmallestAndTest(new int[] {33, 39, 21, 45, 23, 3}, 4); // Result must be 1
        findSmallestAndTest(new int[] {5, 1, 2, 3, 4}, 6);
        findSmallestAndTest(new int[]{-5, -1, 1, 3, 4}, 2);
        findSmallestAndTest(new int[]{-5, -1, -1, -3, -4}, -1);
    }

    private void findSmallestAndTest(int[] input, int expectedResult){
        int smallestAbsentValue = service.smallestFind(input);
        System.out.println("Result is: " + smallestAbsentValue +", expected: " + expectedResult);
        Assert.assertEquals(smallestAbsentValue, expectedResult); // Such construction is used in tests
    }

}
