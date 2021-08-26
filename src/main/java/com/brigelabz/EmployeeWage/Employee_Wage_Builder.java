package com.brigelabz.EmployeeWage;

public class Employee_Wage_Builder {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int FULL_TIME_IS = 1;
        double empCheck = Math.floor(Math.random() * 10 ) % 2;
        if (empCheck == FULL_TIME_IS)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is Absent");
    }

}
