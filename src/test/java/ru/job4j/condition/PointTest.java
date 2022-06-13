package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double exp = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(exp, out, 0.01);
    }

    @Test
    public void when310to56then4() {
        double exp = 4.47;
        int x1 = 3;
        int y1 = 10;
        int x2 = 5;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(exp, out, 0.01);
    }

    @Test
    public void when07to00then7() {
        double exp = 7;
        int x1 = 0;
        int y1 = 7;
        int x2 = 0;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(exp, out, 0.01);
    }
}