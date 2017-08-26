package com.faryangsh.mongodb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

/**
 *
 * Created by 杨志远 on 2017/8/21
 * email faryangsh@163.com.
 */
@AllArgsConstructor
@Data
@ToString
public class Student {
    @Id
    private Long id;

    private String name;
    private Integer age;
    private School shool;

    //第二次执行单元测试加的
//    private String home;

}
