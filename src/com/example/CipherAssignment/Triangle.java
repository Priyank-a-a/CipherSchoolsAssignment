//Question number 7
package com.example.CipherAssignment;

import java.util.Scanner;

public class Triangle {
    double area(int a,int b,int c)
    {
        if((a+b)>c && (a+c)>b && (b+c)>a)
        {
        int p = (a+b+c)/2 ;
        double areaOfTriangle = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Area of triangle is: "+areaOfTriangle);

        }
        return 0;

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Triangle triangle = new Triangle();
        triangle.area(a,b,c);
    }
}
