package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int start = 5;
        int res = Factorial.calc(start);
        int exp = 120;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int start = 0;
        int res = Factorial.calc(start);
        int exp = 1;
        Assert.assertEquals(exp, res);
    }
}