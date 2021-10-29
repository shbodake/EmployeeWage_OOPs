package com.blp.employeewageoops;

public class EmployeeWage_OOPs {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static void main(String[] args) {
        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == IS_FULL_TIME) {
            empHrs = 8;
            System.out.println("Employee present for Full Time");
        } else if (empCheck == IS_PART_TIME) {
            empHrs = 4;
            System.out.println("Employee present for Part Time");
        } else {
            empHrs = 0;
            System.out.println("Employee is absent");
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage: " + empWage);
    }
}
