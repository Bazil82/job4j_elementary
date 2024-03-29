package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double exp = 2;
        Point pointTwo = new Point(2, 0);
        Point pointOne = new Point(0, 0);
        double out = pointTwo.distance(pointOne);
        Assert.assertEquals(exp, out, 0.01);
    }

    @Test
    public void when310to56then4dot47() {
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

    @Test
    public void when0minus33to313then7() {
        double exp = 5;
        Point pointTwo = new Point(0, -3, 3);
        Point pointOne = new Point(3, 1, 3);
        double out = pointTwo.distance3d(pointOne);
        Assert.assertEquals(exp, out, 0.01);
    }

    @Test
    public void when11minus5tominus12minus3then3() {
        double exp = 3;
        Point pointTwo = new Point(1, 1, -5);
        Point pointOne = new Point(-1, 2, -3);
        double out = pointTwo.distance3d(pointOne);
        Assert.assertEquals(exp, out, 0.01);
    }
}