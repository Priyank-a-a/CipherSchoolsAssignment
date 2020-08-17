//Question number 4
package com.example.CipherAssignment;

public class Circle {
    private double radius = 1.0;
    private String color = "red";


    Circle() { }

    Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {

        return this.radius;
    }

    public double getArea() {
        double area = 3.14 * radius * radius;
        return area;
    }
public static void main(String args[])
{
    Circle circle = new Circle();
    double first1 = circle.getRadius();
    System.out.println(first1);
    double first2 = circle.getArea();
    System.out.println(first2);

    Circle circle2 = new Circle(10.2);
    double second1 = circle2.getRadius();
    System.out.println(second1);
    double second2 = circle2.getArea();
    System.out.println(second2);
}


}
