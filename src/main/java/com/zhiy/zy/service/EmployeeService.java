package com.zhiy.zy.service;

import com.zhiy.zy.domain.Employee;
import com.zhiy.zy.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired(required = false)
    private EmployeeMapper employeeMapper;

   public List<Employee> getAll(){
        return employeeMapper.getAll();
    }
}
