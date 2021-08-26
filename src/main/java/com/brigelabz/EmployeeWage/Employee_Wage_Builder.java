package com.brigelabz.EmployeeWage;

public class Employee_Wage_Builder {
    public static final int FULL_TIME_IS = 1;
    public static final int PART_TIME_IS = 2;
    public static final int EMP_WAGE_PER_HOUR = 20;
    public static final int NO_OF_WORK_DAY = 20;
    public static final int MAX_MONTH_WORK_HRS = 100;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int empHrs = 0;
        int totalWorkday = 0;
        int totalEmpHrs = 0;
        int totalWage = 0;
        while ( totalEmpHrs <= MAX_MONTH_WORK_HRS && totalWorkday < NO_OF_WORK_DAY) {
            totalWorkday++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println("empCheck : " + empCheck);
            System.out.println("Day : " +totalWorkday);
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
            totalEmpHrs += empHrs;
            System.out.println("totalWorkday" + " Emp Hrs :" + totalEmpHrs);
        }
            int totalEmpWage = EMP_WAGE_PER_HOUR * totalEmpHrs;
            System.out.println("total Emp Wage: " + totalEmpWage);
        }
    }
