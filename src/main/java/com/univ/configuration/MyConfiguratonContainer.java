package com.univ.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.univ.property.UnivProperty;

/**
 * @author univ
 * @date 2019/12/16 4:56 PM
 * @description
 */

@Configuration
public class MyConfiguratonContainer {

    /**
     * 此时BeanFactory中已经有UnivProperty对象了，此时，
     * @return
     */
    @Bean
    // @ConditionalOnClass  //实际使用中可以加一些条件
    public UnivProperty univProperty(){
        return new UnivProperty();
    }
}
