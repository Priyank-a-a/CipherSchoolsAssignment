//Question number 8
package com.example.CipherAssignment;

import java.util.Scanner;

class InvalidTypeException extends Exception{
    InvalidTypeException(String s){
        super(s);
    }
}
public class Generic
{
    static <E>void validate()throws InvalidTypeException{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = (2*num)/3;
        System.out.println("2 3rd of "+num+" is: "+result);
    }

    public static void main(String args[]){
        try{
            validate();
            System.out.println("valid input");

        }
        catch(Exception m){System.out.println("Exception occurred: not integer "+m);}
    }
}