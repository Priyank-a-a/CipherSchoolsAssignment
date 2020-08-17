//Question number 3
package com.example.CipherAssignment;

import java.util.Arrays;
import java.util.List;

public class Employee {
    int empId,empSalary;
    String empName, empDesignation, empLocation;
    Employee(int empId, int empSalary,String empName, String empDesignation,String empLocation)
    {
        this.empDesignation=empDesignation;
        this.empName = empName;
        this.empId=empId;
        this.empSalary=empSalary;
        this.empLocation = empLocation;
    }
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public String getEmpLocation() {
        return empLocation;
    }

    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }

    public static void main(String args[])
    {
        List<Employee> employees = Arrays.asList(
                new Employee(101,20000,"Rohit","Manager","Delhi"),
                new Employee(102,70000,"Mohit","Software developer","Delhi"),
                new Employee(103,50000,"Rajat","Technical assistant","Pune"),
                new Employee(104,10000,"Rahul","Developer","Gurgaon"),
                new Employee(105,30000,"Priyanka","Content writer","Bikaner"),
                new Employee(106,20000,"Anjali","Technician","Goa"),
                new Employee(107,80000,"Ankit","Speaker","Noida"),
                new Employee(108,50000,"Kartik","Content creator","Delhi"),
                new Employee(109,20000,"Himanshu","App developer","Manipur"),
                new Employee(1010,60000,"Subodh","ManagerE","Delhi")
                );
        employees.forEach(e -> System.out.println(e.getEmpName()));
        employees.stream().filter(e -> e.getEmpSalary()>50000).forEach(e -> System.out.println(e.getEmpSalary()));
        employees.stream().filter(e -> e.getEmpLocation().startsWith("M")).forEach(e -> System.out.println(e.empLocation));
        employees.stream().filter(e -> e.getEmpDesignation().endsWith("E")).forEach(e -> System.out.println(e.empDesignation));
    }

}
