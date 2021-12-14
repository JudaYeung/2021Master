package by.bsu.geometry.model;

import bsu.by.geometry.model.Circle;
import bsu.by.geometry.model.Triangle;
import bsu.by.geometry.model.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void testArean(){
        Triangle triangle = new Triangle(6,7,4,5,6,-7);
        double arean = triangle.calculateArea();
        Assert.assertEquals(5,arean,0.01);
    }

    @Test
    public void testAreanWrong(){
        Triangle triangle = new Triangle(9,4,3,5,6,-7);
        double arean = triangle.calculateArea();
        Assert.assertEquals(33,arean,0.1);
    }
    @Test
    public void testPerimeter(){
        Triangle circle = new Triangle(1,4,6,5,5,-3);
        double perimeter = circle.calculatePerimeter();
        Assert.assertEquals(20.68,perimeter,0.01);
    }

    @Test
    public void testPerimeterWrong(){
        Triangle circle = new Triangle(1,7,9,8,5,-3);
        double perimeter = circle.calculatePerimeter();
        Assert.assertEquals(28.55,perimeter,0.01);
    }
}
