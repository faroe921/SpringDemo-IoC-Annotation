package com.fro.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Auther: Nino
 * @Date: 2024/8/19 - 08 - 19 - 下午11:20
 * @Description: com.fro.spring.entity
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@ToString
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
}
