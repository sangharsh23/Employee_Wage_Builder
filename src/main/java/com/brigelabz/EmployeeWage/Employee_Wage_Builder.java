package com.brigelabz.EmployeeWage;

public class Employee_Wage_Builder {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int FULL_TIME_IS = 1;
        int PART_TIME_IS = 2;
        int EMP_WAGE_PER_HOUR = 20;
        int empHrs;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        System.out.println("empCheck : " +empCheck);
        if (empCheck == FULL_TIME_IS){
            System.out.println("Employee is Full Time present");
            empHrs = 8;
        }
        else if(PART_TIME_IS == empCheck) {
            System.out.println("Employee is Part Time Present");
            empHrs = 4;
        }
        else {
            System.out.println("Employee is Absent");
            empHrs = 0;
        }
    int empWage = EMP_WAGE_PER_HOUR * empHrs;
        System.out.println("empWage : "+empWage);
  }
}
