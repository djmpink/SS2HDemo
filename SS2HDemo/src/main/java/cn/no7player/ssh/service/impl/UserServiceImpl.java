package cn.no7player.ssh.service.impl;

import cn.no7player.ssh.dao.UserDao;
import cn.no7player.ssh.po.User;
import cn.no7player.ssh.service.UserService;

import java.util.List;

/**
 * Created by zl on 1/21/2015.
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public UserDao getUserDAO() {
        return userDao;
    }

    public void setUserDAO(UserDao userDao) {
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
