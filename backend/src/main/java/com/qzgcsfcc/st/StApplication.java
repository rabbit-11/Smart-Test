package com.qzgcsfcc.st;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.qzgcsfcc.st.dao")
@SpringBootApplication
public class StApplication {

    public static void main(String[] args) {
        SpringApplication.run(StApplication.class, args);
    }

}
