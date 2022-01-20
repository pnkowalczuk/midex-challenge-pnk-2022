package com.mindex.challenge.data;

import java.time.LocalDate;




public class Compensation {
    private String compensationId;
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

    public void setCompensationId(String id){
        this.compensationId = id;
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
    
    public String getCompensationId(String id){
        return this.compensationId;
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
