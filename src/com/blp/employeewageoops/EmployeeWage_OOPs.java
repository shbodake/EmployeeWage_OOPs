package com.blp.employeewageoops;

public class EmployeeWage_OOPs {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public static void main(String[] args) {
        empWage("Atos", 19, 16, 80);
        empWage("Capgemini", 15, 20, 90);

    }

    public static void empWage(String company, int empRatePerHr, int maxWorkDays, int maxWorkHrs) {
        int empHrs, empWage;
        int day = 1;
        int totalHours = 0;
        int totalWage = 0;
        while (day <= maxWorkDays && totalHours <= maxWorkHrs) {
            day++;
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * empRatePerHr;
            totalWage = totalWage + empWage;
            System.out.println("Emp Wage: " + empWage);
        }
        System.out.println("The emp wage for employee in the " + company + " is " + totalWage);
        return totalWage;
    }
}



