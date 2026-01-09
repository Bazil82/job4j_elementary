package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        Max maximum = new Max();
        int res = maximum.max(first, second);
        int exp = 2;
        Assert.assertEquals(res, exp);
    }

    @Test
    public void whenMax1To3To2Then3() {
        int first = 1;
        int second = 3;
        int third = 2;
        Max maximum = new Max();
        int res = maximum.max(first, second, third);
        int exp = 3;

        Assert.assertEquals(res, exp);
    }

    @Test
    public void whenMax10To7To2To9Then10() {
        int first = 10;
        int second = 7;
        int third = 2;
        int fourth = 9;
        Max maximum = new Max();
        int res = maximum.max(first, second, third, fourth);
        int exp = 10;
        Assert.assertEquals(res, exp);
    }
}