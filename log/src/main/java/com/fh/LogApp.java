package com.fh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient //声明Eureka客户端
public class LogApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(LogApp.class,args);
    }
}
