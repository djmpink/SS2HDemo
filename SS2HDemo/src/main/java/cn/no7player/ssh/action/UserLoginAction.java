package cn.no7player.ssh.action;

import cn.no7player.ssh.po.User;
import cn.no7player.ssh.service.UserService;
import cn.no7player.ssh.util.InitApplicationContext;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.ApplicationContext;

import java.util.List;

/**
 * Created by zl on 1/22/2015.
 */
public class UserLoginAction extends ActionSupport{
    private UserService userService;
    private User user;

    public UserLoginAction() {
        ApplicationContext context = InitApplicationContext.getApplicationContext();
        userService = (UserService) context.getBean("userService");
    }

    @Override
    public String execute() throws Exception {
        System.out.println(user.getName());
        if (!isValid(user.getName())) {
            return INPUT;
        }
        if (!isValid(user.getPassword())) {
            return INPUT;
        }
        if(!userCheck(user)){
            System.out.println("INPUT");
            return INPUT;
        }
        System.out.println("SUCCESS");

        ActionContext.getContext().getSession().put("user" , user);
        return SUCCESS;
    }

    public boolean isValid(String keyword) {
        return keyword != null && keyword != "";
    }

    public boolean userCheck(User user) {
        List<User> userList = userService.findUserByName(user.getName());
        if (userList == null || userList.size() < 1) {
            return false;
        }
        User checkUser = userList.get(0);
        System.out.println(checkUser.getName());
        if (user.getName().equals(checkUser.getName()) && user.getPassword().equals(checkUser.getPassword())) {
            return true;
        }
        addActionError("Username or password is wrong, please check!");
        return false;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
