package com.example.demo.service.impl;

import com.example.demo.dao.IEmployeeInfoDao;
import com.example.demo.entity.EmployeeInfo;
import com.example.demo.service.IEmployeeInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeInfoServiceImpl implements IEmployeeInfoService {
    

    @Autowired
    IEmployeeInfoDao employeeInfoDao;

    @Override
    public EmployeeInfo getEmployeeInfoByJobNumber(EmployeeInfo employeeInfo) {
        
        return employeeInfoDao.getEmployeeInfoByJobNumber(employeeInfo);
    }


    
}
