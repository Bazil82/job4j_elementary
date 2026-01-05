package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int res = Max.max(1, 2);
        int exp = 2;
        Assert.assertEquals(res, exp);
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int res = Max.max(2, 1);
        int exp = 2;
        Assert.assertEquals(res, exp);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int res = Max.max(2, 2);
        int exp = 2;
        Assert.assertEquals(res, exp);
    }
}