package com.brigelabz.EmployeeWage;

public class Employee_Wage_Builder {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int FULL_TIME_IS = 1;
        int EMP_WAGE_PER_HOUR = 20;
        int empHrs;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == FULL_TIME_IS) {
            System.out.println("Employee is present");
            empHrs = 8;
        }
        else{
            System.out.println("Employee is Absent");
            empHrs = 0;
    }

    int daily_Wage = EMP_WAGE_PER_HOUR * empHrs;
        System.out.println("daily_Wage : "+daily_Wage);
  }
}
