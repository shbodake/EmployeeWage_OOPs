package com.blp.employeewageoops;

public class Company {
    private String companyName;
    private int empRatePerHr;
    private int maxWorkDays;
    private int maxWorkHrs;
    private int totalWage;

    public Company(String companyName, int empRatePerHr, int maxWorkDays, int maxWorkHrs) {
        this.companyName = companyName;
        this.empRatePerHr = empRatePerHr;
        this.maxWorkDays = maxWorkDays;
        this.maxWorkHrs = maxWorkHrs;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getEmpRatePerHr() {
        return empRatePerHr;
    }

    public void setEmpRatePerHr(int empRatePerHr) {
        this.empRatePerHr = empRatePerHr;
    }

    public int getMaxWorkDays() {
        return maxWorkDays;
    }

    public void setMaxWorkDays(int maxWorkDays) {
        this.maxWorkDays = maxWorkDays;
    }

    public int getMaxWorkHrs() {
        return maxWorkHrs;
    }

    public void setMaxWorkHrs(int maxWorkHrs) {
        this.maxWorkHrs = maxWorkHrs;
    }

    @Override
    public String toString() {
        return "CompanyInfo{" +
                "companyName='" + companyName + '\'' +
                ", empRatePerHr=" + empRatePerHr +
                ", maxWorkDays=" + maxWorkDays +
                ", maxWorkHrs=" + maxWorkHrs +
                ", totalWage=" + totalWage +
                '}';
    }

}
