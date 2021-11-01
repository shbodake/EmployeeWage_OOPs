package com.blp.employeewageoops;

public interface EmployeeWageByInterface {
    public void addCompanyInfo(String companyName, int empRatePerHr, int noOfWorkingDays, int maxHrsPerMonth);
    public void computeEmpWage();
}
