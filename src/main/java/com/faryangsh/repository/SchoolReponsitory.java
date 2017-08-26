package com.faryangsh.repository;

import com.faryangsh.mongodb.School;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by 杨志远 on 2017/8/25
 * email faryangsh@163.com.
 */
public interface SchoolReponsitory extends MongoRepository<School,Long> {
    School findSchoolByName(String name);
}
