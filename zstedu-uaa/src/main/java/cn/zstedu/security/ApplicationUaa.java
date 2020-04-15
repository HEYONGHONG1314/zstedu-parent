package cn.zstedu.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApplicationUaa {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationUaa.class, args);
        System.out.println("Uaa服务启动");
    }

}
