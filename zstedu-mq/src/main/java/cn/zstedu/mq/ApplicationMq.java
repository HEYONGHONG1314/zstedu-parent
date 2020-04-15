package cn.zstedu.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApplicationMq {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationMq.class, args);
        System.out.println("Mq服务开启");
    }

}
