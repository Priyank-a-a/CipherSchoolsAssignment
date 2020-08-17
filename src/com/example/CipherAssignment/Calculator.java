//Question number 1
package com.example.CipherAssignment;
interface subtraction
{
    int subtract(int a,int b);
}
interface multiplication
{
    int multiply(int a,int b);
}
interface  division
{
    int divide(int a,int b);
}
interface addition
{
    int sum(int a,int b);
}
public class Calculator
{
    public static void main(String args[])
    {

        addition add = (int a,int b) -> { return a+b; } ;

        System.out.println(add.sum(2,4));

        subtraction difference = (int a,int b) -> { return a-b ;};

        System.out.println(difference.subtract(4,2));

        division safeDivision = (int a, int b) -> {
            if(b==0)
                return -1;
            return a/b;};

        System.out.println(safeDivision.divide(10,0));

        multiplication product = (int a, int b) -> {return a*b;};

        System.out.println(product.multiply(2,10));
}

}





