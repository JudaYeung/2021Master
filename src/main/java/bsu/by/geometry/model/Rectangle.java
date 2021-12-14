package bsu.by.geometry.model;

public class Rectangle implements Shape{

    private double x1,x2;
    private double y1,y2;

    public  Rectangle(double x1,double x2,double y1,double y2){
        this.x1 =x1;
        this.x2 =x2;
        this.y1 =y1;
        this.y2 =y2;
}
    @Override
    public double calculateArea() {
        return Math.abs(x1-x2) *  Math.abs(y1 - y2) ;
    }

    @Override
    public double calculatePerimeter() {
        return Math.abs(x1-x2) * 2 + Math.abs(y1 - y2) * 2;
    }
}