package com.faryangsh.repository;

import com.faryangsh.mongodb.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by 杨志远 on 2017/8/21
 * email faryangsh@163.com.
 */
public interface StudentRepository extends MongoRepository<Student, Long> {
    Student findByName(String name);
}
