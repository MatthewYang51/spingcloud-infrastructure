package com.xiaoyang.structure;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author WXY
 * eureka application
 */
@SpringBootApplication
@EnableEurekaServer
public class Application{
    public static void main( String[] args ) {
        SpringApplication.run(Application.class,args);
    }
}
