package com.mindex.challenge.data;


public class ReportingStructure {
    private String employeeId;
    private int directReports;


    public ReportingStructure(String id){
        this.employeeId = id;
    }

    public void setDirectReports(int directReports){
        this.directReports = directReports;
    }

    public String getId(){
        return employeeId;
    }
    public int getDirectReports(){
        return directReports;
    }

}
