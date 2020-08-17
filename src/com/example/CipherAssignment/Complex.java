//Question number 5
package com.example.CipherAssignment;

import java.util.Scanner;

public class Complex {

    public void sum(int real1,int imaginary1,int real2,int imaginary2)
    {
        int sumReal=real1+real2;
        int sumImag = imaginary1+imaginary2;
        if(sumReal<0)
            System.out.println("Sum is: "+"("+sumReal+")"+"+"+sumImag+"i");
        else if(sumImag<0)
            System.out.println("Sum is: "+sumReal+"+"+"("+sumImag+")"+"i");
        else if(sumImag<0 && sumReal<0)
            System.out.println("Sum is: "+"("+sumReal+")"+"+"+"("+sumImag+")"+"i");
        else
            System.out.println("Sum is: "+sumReal+"+"+sumImag+"i");
    }
    public void difference(int real1,int imaginary1,int real2,int imaginary2)
    {
        int diffReal=real1-real2;
        int diffImag = imaginary1-imaginary2;
        if(diffReal<0)
            System.out.println("Difference is: "+"("+diffReal+")"+"+"+diffImag+"i");
        else if(diffImag<0)
            System.out.println("Difference is: "+diffReal+"+"+"("+diffImag+")"+"i");
        else if(diffReal<0 && diffImag<0)
            System.out.println("Difference is: "+"("+diffReal+")"+"("+diffImag+")"+"i");
        else
            System.out.println("Difference is: "+diffReal+"+"+diffImag+"i");
    }
    public void product(int real1,int imaginary1,int real2,int imaginary2)
    {
        int sum1 =((real1*imaginary2)+(imaginary1*real2));
        int sum2 = ((real1*real2)-(imaginary1*imaginary2));
        if(sum1<0)
            System.out.println("Product is: "+sum2+"+"+"("+sum1+")"+"i");
        else if(sum2<0)
            System.out.println("Product is: "+"("+sum2+")"+"+"+sum1+"i");
        else if(sum1<0 && sum2<0)
            System.out.println("Product is: "+"("+sum2+")"+"("+sum1+")"+"i");
        else
            System.out.println("Product is: "+sum2+"+"+sum1+"i");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part of first number: ");
        int real1=sc.nextInt();
        System.out.println("Enter imaginary part of first number: ");
        int imaginary1=sc.nextInt();
        System.out.println("Enter real part of second number: ");
        int real2=sc.nextInt();
        System.out.println("Enter imaginary part o second number: ");
        int imaginary2=sc.nextInt();
        Complex complex = new Complex();
        complex.sum(real1,imaginary1,real2,imaginary2);
        complex.difference(real1,imaginary1,real2,imaginary2);
        complex.product(real1,imaginary1,real2,imaginary2);
    }


}
