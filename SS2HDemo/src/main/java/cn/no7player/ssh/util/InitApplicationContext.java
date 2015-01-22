package cn.no7player.ssh.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zl on 1/22/2015.
 */
public class InitApplicationContext {

    private static ApplicationContext context = null;

    private InitApplicationContext(){

    }
    public static ApplicationContext getApplicationContext(){
        if(context == null){
            context = new ClassPathXmlApplicationContext("applicationContext.xml");
        }
        return context;
    }
}
