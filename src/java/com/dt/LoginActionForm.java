package com.dt;
import javax.servlet.http.*;
import org.apache.struts.action.*;
public class LoginActionForm extends ActionForm{
    private String username;
    private String password;
    
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
}