package by.bsu.geometry.model;

import bsu.by.geometry.model.Rectangle;
import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void testArean(){
        Rectangle circle = new Rectangle(1,8,8,-3);
        double arean = circle.calculateArea();
        Assert.assertEquals(77,arean,0.01);
    }

    @Test
    public void testAreanWrong(){
        Rectangle circle = new Rectangle(2,5,7,-4);
        double arean = circle.calculateArea();
        Assert.assertEquals(33,arean,0.01);
    }

    @Test
    public void testPerimeter(){
        Rectangle circle = new Rectangle(1,4,6,-5);
        double perimeter = circle.calculatePerimeter();
        Assert.assertEquals(28,perimeter,0.01);
    }

    @Test
    public void testPerimeterWrong(){
        Rectangle circle = new Rectangle(1,7,9,-8);
        double perimeter = circle.calculatePerimeter();
        Assert.assertEquals(46,perimeter,0.01);
    }
}
