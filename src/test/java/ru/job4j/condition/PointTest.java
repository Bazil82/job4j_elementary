package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

class PointTest {

    @Test
    void when00to20then2() {
        double exp = 2;
        Point pointTwo = new Point(2, 0);
        Point pointOne = new Point(0, 0);
        double out = pointTwo.distance(pointOne);
        Assert.assertEquals(exp, out, 0.01);
    }

    @Test
    public void when310to56then4() {
        double exp = 4.47;
        Point pointTwo = new Point(5, 6);
        Point pointOne = new Point(3, 10);
        double out = pointTwo.distance(pointOne);
        Assert.assertEquals(exp, out, 0.01);
    }

    @Test
    public void when07to00then7() {
        double exp = 7;
        Point pointTwo = new Point(0, 0);
        Point pointOne = new Point(0, 7);
        double out = pointTwo.distance(pointOne);
        Assert.assertEquals(exp, out, 0.01);
    }
}