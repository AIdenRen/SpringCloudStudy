package top.youngfriends.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import top.youngfriends.po.User;
import top.youngfriends.service.impl.UserClientImpl;

/**
 * @author pap
 */
@FeignClient(value = "userService")
public interface UserClient {

    @RequestMapping("/user/{uid}")
    User findUserById(@PathVariable("uid") int uid);

}
