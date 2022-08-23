package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {

    @Test
    public void calc() {
        int a1 = 1;
        int b1 = 1;
        int c1 = 1;
        int x1 = 1;
        int expected1 = 3;
        int rsl1 = X2.calc(a1, b1, c1, x1);
        Assert.assertEquals(expected1, rsl1);

        int a2 = 0;
        int b2 = 1;
        int c2 = 1;
        int x2 = 1;
        int expected2 = 2;
        int rsl2 = X2.calc(a2, b2, c2, x2);
        Assert.assertEquals(expected2, rsl2);

        int a3 = 1;
        int b3 = 1;
        int c3 = 0;
        int x3 = 1;
        int expected3 = 2;
        int rsl3 = X2.calc(a2, b2, c2, x2);
        Assert.assertEquals(expected3, rsl3);

        int a4 = 0;
        int b4 = 1;
        int c4 = 1;
        int x4 = 1;
        int expected4 = 2;
        int rsl4 = X2.calc(a2, b2, c2, x2);
        Assert.assertEquals(expected4, rsl4);
    }
}