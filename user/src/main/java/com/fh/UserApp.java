package com.fh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient //声明是Eureka 客户端
public class UserApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(UserApp.class,args);
    }
}
