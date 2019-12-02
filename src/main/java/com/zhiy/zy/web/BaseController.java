package com.zhiy.zy.web;

import com.zhiy.zy.domain.Employee;
import com.zhiy.zy.domain.Student;
import com.zhiy.zy.service.EmployeeService;
import com.zhiy.zy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
public class BaseController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String hello(){
        return "祖国你好";
    }

    @GetMapping("/h")
    public List<Employee> getALl(){
        return employeeService.getAll();
    }
    @GetMapping("/s")
    public List<Student> getStudent(){
        return studentService.findStudentAll();
    }
}
