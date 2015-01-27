package cn.no7player.ssh.dao.impl;
import cn.no7player.ssh.dao.UserDao;
import cn.no7player.ssh.po.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by zl on 1/21/2015.
 */
@SuppressWarnings("ALL")
public class UserDaoImpl extends HibernateDaoSupport implements UserDao{
    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
    @Override
    public String addUser(User user) {
        String success = "";
        String name = user.getName();
        if(findUserByName(name).size() == 0){
            try {
                getHibernateTemplate().save(user);
                success = "User saved ok!";
            } catch (DataAccessException e) {
                success = "Sorry, user can't be added.";
            }
        } else {
            success = "The username has been existed!";
        }
        return success;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> findUserByName(String name) {
        return getHibernateTemplate().find("from User where name = ?",name);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> listAll() {
        return getHibernateTemplate().find(" from User ");
    }
}
