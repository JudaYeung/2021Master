package bsu.by.geometry;

import bsu.by.geometry.model.Circle;
import bsu.by.geometry.model.Rectangle;
import bsu.by.geometry.model.Triangle;
import bsu.by.geometry.view.ShaperPrinter;

public class main {
    public static <string> void main(String[] args){
        ShaperPrinter printer = new ShaperPrinter();

        Circle circle = new Circle(1,2,3);
        printer.print(circle);

        Rectangle rectangle = new Rectangle(2,5,3,4);
        printer.print(rectangle);

        Triangle triangle = new Triangle(1,2,3,7,8,9);
        printer.print(triangle);
    }
}
