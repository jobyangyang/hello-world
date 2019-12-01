package com.zhiy.zy.repository;

import com.zhiy.zy.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class StudentRepository  {

    // mongoTemplate mongoDB的核心core类 主要负责操作MongoDB
    @Autowired
    private MongoTemplate mongoTemplate;

    public void insert(Student student){
        mongoTemplate.insert(student);
    }
}
