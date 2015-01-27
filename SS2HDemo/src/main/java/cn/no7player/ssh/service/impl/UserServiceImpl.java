package cn.no7player.ssh.service.impl;

import cn.no7player.ssh.dao.UserDao;
import cn.no7player.ssh.po.User;
import cn.no7player.ssh.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by zl on 1/21/2015.
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao;
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public String addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public List<User> findUserByName(String name) {
        return userDao.findUserByName(name);
    }

    @Override
    public List<User> listAll() {
        return userDao.listAll();
    }
}
