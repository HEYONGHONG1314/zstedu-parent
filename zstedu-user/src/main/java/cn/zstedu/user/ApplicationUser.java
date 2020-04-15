package cn.zstedu.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "cn.zstedu.user.*")
@EnableEurekaClient
@EnableFeignClients
public class ApplicationUser {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationUser.class,args);
        System.out.println("User服务启动");
    }


}
