package cn.zstedu.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApplicationGateway {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationGateway.class, args);
        System.out.println("Gateway服务开启");
    }

}
