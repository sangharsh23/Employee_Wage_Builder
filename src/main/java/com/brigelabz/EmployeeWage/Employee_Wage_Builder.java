package com.brigelabz.EmployeeWage;

public class Employee_Wage_Builder {
    public static final int FULL_TIME_IS = 1;
    public static final int PART_TIME_IS = 2;
    public static final int EMP_WAGE_PER_HOUR = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int empHrs;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        System.out.println("empCheck : " + empCheck);
        switch (empCheck) {
            case FULL_TIME_IS:
                System.out.println("Employee is Full Time present");
                empHrs = 8;
                break;
            case PART_TIME_IS:
                System.out.println("Employee is Part Time Present");
                empHrs = 4;
                break;
            default:
                System.out.println("Employee is Absent");
                empHrs = 0;
        }

                int empWage = EMP_WAGE_PER_HOUR * empHrs;
                System.out.println("empWage : " + empWage);
    }
}
