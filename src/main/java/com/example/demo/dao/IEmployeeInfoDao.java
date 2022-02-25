package com.example.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.EmployeeInfo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface IEmployeeInfoDao extends BaseMapper<EmployeeInfo>{
    
    @Select("select * from employeeinfo where jobNumber=#{jobNumber}")
    com.example.demo.entity.EmployeeInfo getEmployeeInfoByJobNumber(com.example.demo.entity.EmployeeInfo employeeInfo);
}
