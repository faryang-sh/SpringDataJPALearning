package com.faryangsh.mongodb;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

/**
 * Created by 杨志远 on 2017/8/25
 * email faryangsh@163.com.
 */
@AllArgsConstructor
@Data
@Builder
@ToString
public class School {
    @Id
    private Long id;

    private String name;
    private String address;

}
