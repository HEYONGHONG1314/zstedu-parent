package cn.zstedu.eurekafeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "cn.zstedu.eurekafeign.*")
@EnableEurekaClient
@EnableFeignClients(basePackages = "cn.zstedu.eurekafeign.feignclient")
public class ApplicationEurekaFeign {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationEurekaFeign.class,args);
        System.out.println("Feign服务启动");
    }


}
