package top.youngfriends.service.impl;

import org.springframework.stereotype.Component;
import top.youngfriends.po.User;
import top.youngfriends.service.UserClient;

/**
 * @author pap
 */
@Component
public class UserClientImpl implements UserClient {
    @Override
    public User findUserById(int uid) {
        return new User();
    }
}
