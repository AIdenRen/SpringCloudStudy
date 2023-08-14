package top.youngfriends.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.youngfriends.mapper.UserMapper;
import top.youngfriends.po.User;
import top.youngfriends.service.UserService;

/**
 * @author pap
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(int uid) {
        return userMapper.getUserById(uid);
    }
}
