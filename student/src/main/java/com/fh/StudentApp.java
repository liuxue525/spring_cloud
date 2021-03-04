package com.fh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.fh.*.mapper")
@EnableEurekaClient
public class StudentApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(StudentApp.class,args);
    }
}
