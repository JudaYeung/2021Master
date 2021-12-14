package bsu.by.geometry.model;

public class Triangle implements Shape{

    private  double x1,x2,x3;
    private  double y1,y2,y3;

    public  Triangle(double x1,double x2,double x3,double y1,double y2,double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
}
    @Override
    public double calculateArea() {
        double length1 = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        double length2 = Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
        double length3 = Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
        double length = length1+length2+length3;
        double halfPerimeter2 = length/2;
        double arean1 = halfPerimeter2-length1;
        double arean2 = halfPerimeter2-length2;
        double arean3 = halfPerimeter2-length3;
        double arean = Math.sqrt(halfPerimeter2 * arean1 * arean2 * arean3);
        return arean;
    }

    @Override
    public double calculatePerimeter() {
        double length1 = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        double length2 = Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
        double length3 = Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
        double length = length1+length2+length3;
        return length;
    }
}