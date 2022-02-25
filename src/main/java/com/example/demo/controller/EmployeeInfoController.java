package com.example.demo.controller;

import com.example.demo.entity.EmployeeInfo;
import com.example.demo.service.IEmployeeInfoService;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeInfoController {
    
    @Autowired
    IEmployeeInfoService employeeInfoService;


    @PostMapping("/getEmployeeInfoByJobNumber")
    public EmployeeInfo getEmployeeInfoByJobNumber(@RequestBody EmployeeInfo employeeInfo){
        System.out.println(employeeInfo.jobNumber);
        return employeeInfoService.getEmployeeInfoByJobNumber(employeeInfo);
    }
}
