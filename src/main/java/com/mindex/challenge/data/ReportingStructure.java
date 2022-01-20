package com.mindex.challenge.data;


import java.util.List;
import java.util.Objects;
import java.util.HashSet;
import java.util.ArrayList;

import com.mindex.challenge.dao.EmployeeRepository;

public class ReportingStructure {
    private String employeeId;
    private int directReports;


    public ReportingStructure(String id, EmployeeRepository employeeRepository){
        this.employeeId = id;
        List<Employee> reportingEmployees = employeeRepository.findByEmployeeId(id).getDirectReports();
        directReports = getTotalReports(reportingEmployees, employeeRepository);


    }



    public int getTotalReports(List<Employee> directReportsList, EmployeeRepository employeeRepository){
        for(int i = 0; i < directReportsList.size(); i++){
            
            Employee curEmp = employeeRepository.findByEmployeeId(directReportsList.get(i).getEmployeeId());
            List<Employee> curEmpReports = curEmp.getDirectReports();
            if(!Objects.isNull(curEmpReports) && curEmpReports.size() > 0){
                directReportsList.addAll(curEmpReports);
            }
        }

        List<String> employeeIdList = new ArrayList<>();
        for(Employee e : directReportsList){
            employeeIdList.add(e.getEmployeeId());
        }

        List<String> directReportsListNoDuplicates = new ArrayList<>(new HashSet<>(employeeIdList));
        return directReportsListNoDuplicates.size();
    }

    public String getId(){
        return employeeId;
    }
    public int getDirectReports(){
        return directReports;
    }
}
