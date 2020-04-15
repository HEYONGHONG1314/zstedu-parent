package cn.zstedu.eurekafeign.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import static java.util.concurrent.TimeUnit.SECONDS;

@Component
public class FeignConfig {

    @Bean
    public Retryer feignRetryer(){
        return new Retryer.Default(100, SECONDS.toMillis(1), 5);
    }

}
