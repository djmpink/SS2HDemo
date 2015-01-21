package cn.no7player.ssh.po;

/**
 * Created by zl on 1/21/2015.
 */
public class User {
    private int id;
    private String name;
    private String password;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

}
