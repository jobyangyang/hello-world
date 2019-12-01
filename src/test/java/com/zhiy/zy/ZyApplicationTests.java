package com.zhiy.zy;

import com.zhiy.zy.domain.Student;
import com.zhiy.zy.repository.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZyApplicationTests {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void contextLoads() {
        Student student = new Student();
        student.setName("Jack");
        studentRepository.insert(student);
    }

}
