package top.youngfriends.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.youngfriends.po.User;
import top.youngfriends.service.UserService;

/**
 * @author pap
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/user/{uid}")
    public User getFindUser(@PathVariable("uid") int uid) {
        return userService.getUserById(uid);
    }
}
