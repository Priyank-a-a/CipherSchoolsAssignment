//Question number 6
package com.example.CipherAssignment;

public class Employee2 {


    String name;
    int salary ;
    int yearOfJoining;
    String address;

    public void display(String name, int salary,int yearOfJoining,String address)
    {

        System.out.println(String.format( "%6s  %-8s   %10s  %-8s", name,salary,yearOfJoining,address));

    }

    public static void main(String[] args) {
        Employee2 employee2 = new Employee2();
        Employee2 employee3 = new Employee2();
        Employee2 employee4 = new Employee2();
        System.out.println("Name    "+"salary  "+"Year of joining "+"Address     ");
        employee2.display("Robert",20000,1994," 64C-Wallstreet");
        employee3.display("Sam",20000,2000," 68C-Wallstreet");
        employee4.display("John",20000,1999," 69C-Wallstreet");
    }
}
