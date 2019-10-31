package com.zhiy.zy.web;

import com.zhiy.zy.domain.Employee;
import com.zhiy.zy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@EnableAutoConfiguration
public class BaseController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String hello(){
        return "祖国你好";
    }

    @GetMapping("/h")
    public List<Employee> getALl(){
        return employeeService.getAll();
    }
}
