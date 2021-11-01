package com.blp.employeewageoops;

public class EmployeeWage_OOPs {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private int numOfCompany = 0;
    private final Company[] companyArray;
    public EmployeeWage_OOPs() {
        companyArray = new Company[2];
    }
    private void addCompany(String companyName, int empRatePerHr, int maxWorkDays, int maxWorkHrs) {
        companyArray[numOfCompany] = new Company(companyName,  empRatePerHr, maxWorkDays, maxWorkHrs);
        numOfCompany++;
    }
    private void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyArray[i].setTotalWage(this.computeEmpWage(companyArray[i]));
            System.out.println(companyArray[i]);
        }
    }
    public int empWage(Company companyInfo) {
        int empHrs, empWage;
        int day = 1;
        int totalHours = 0;
        int totalWage = 0;
        while (day <= companyInfo.getMaxWorkDays() && totalHours <= companyInfo.getMaxWorkHrs()) {
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

            empWage = empHrs * companyInfo.getEmpRatePerHr();
            totalWage = totalWage + empWage;
            System.out.println("Emp Wage: " + empWage);
        }

        System.out.println("The emp wage for employee in the " + companyInfo+ " is " + totalWage);
        return totalWage;
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");
        EmployeeWage_OOPs wage = new EmployeeWage_OOPs();
        wage.addCompany("TCS", 20,15,60);
        wage.addCompany("Mindtree", 18,20,90);
        wage.computeEmpWage();
    }

}