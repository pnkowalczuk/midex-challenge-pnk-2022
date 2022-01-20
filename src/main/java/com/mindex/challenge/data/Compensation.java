package com.mindex.challenge.data;

import java.time.LocalDate;




public class Compensation {
    private Employee employee;
    private int salary;
    private LocalDate effectiveDate;

    public Compensation(){

    }

    public Compensation(Employee employee, int salary, LocalDate effectiveDate){
        this.employee = employee;
        this.salary = salary;
        this. effectiveDate = effectiveDate;
    }

    public void setEmployee(Employee employee){
        this.employee = employee;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setEffectiveDate(LocalDate effectiveDate){
        this.effectiveDate = effectiveDate;
    }

    public Employee getEmployee(){
        return this.employee;
    }
    public LocalDate getEffectiveDate(){
        return this.effectiveDate;
    }
    public int getSalary(){
        return this.salary;
    }

    
}
