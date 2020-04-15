package cn.zstedu.user.dao;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "ApplicationAuu")
public interface AuuFeign {

   // @GetMapping(value = "/oauth/insertuser")


}
