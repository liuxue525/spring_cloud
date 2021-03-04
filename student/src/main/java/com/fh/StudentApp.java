package com.fh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.fh.*.mapper")
//@EnableDiscoveryClient //声明是eureka客户端
public class StudentApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(StudentApp.class,args);
    }
}
