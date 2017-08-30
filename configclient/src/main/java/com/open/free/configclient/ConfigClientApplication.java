package com.open.free.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;

/**
 * Created by lcssx on 8/29/2017.
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication {

    public static void main(String[] args){
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    @Autowired
    public void setEnvironment(Environment env){
        System.out.println("config.test from env: " + env.getProperty("config.test"));
    }
}
