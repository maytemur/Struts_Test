package com.dt;
import javax.servlet.http.*;
import org.apache.struts.action.*;
public class LoginAction extends Action{
    public ActionForward execute(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response){
        LoginActionForm loginform=(LoginActionForm)form;
        String username=loginform.getUsername();
        String password=loginform.getPassword();
        if(username.equals(password)){
            return mapping.findForward("ok");
        }else{
            return mapping.findForward("error");
        }
    }
}