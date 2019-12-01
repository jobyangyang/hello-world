package com.zhiy.zy.service;

import com.zhiy.zy.domain.Student;
import com.zhiy.zy.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findStudentAll(){
        System.out.println("结果");
        List<Student>  list = null;
        return  list;
    }
}
