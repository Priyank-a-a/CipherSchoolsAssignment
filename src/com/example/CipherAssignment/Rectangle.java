//Question number 2
package com.example.CipherAssignment;

import java.util.Scanner;

public class Rectangle {
    int width,height;

    void display()
    {
        System.out.println("width: "+width+" "+"height: " +height);
    }
}
class RectangleArea extends Rectangle
{
    void read_input()
    {
        Scanner sc = new Scanner(System.in);
         width = sc.nextInt();
         height = sc.nextInt();
    }
    void display()
    {
        super.display();
        System.out.println("Area is: "+width*height);
    }

}
class Test
{
    public  static void main(String args[])
    {
        RectangleArea r = new RectangleArea();
        Rectangle r1 = new Rectangle();
        r.read_input();
        r.display();
    }
}


