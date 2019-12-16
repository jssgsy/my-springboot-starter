package com.univ.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * @author univ
 * @date 2019/12/16 4:39 PM
 * @description
 */
@ConfigurationProperties("univ.starter")
@Data
public class UnivProperty {

    private String name;

    private Integer age;
}
