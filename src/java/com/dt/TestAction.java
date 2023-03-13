package com.dt;
import javax.servlet.http.*;
import org.apache.struts.action.*;
/**
 *
 * @author Mustafa
 */
public class TestAction extends Action{
    /** Creates a new instance of TestAction */
    public ActionForward execute(ActionMapping mapping,ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response) {
        //burada çe?itli i?lemler yap?labilir
        return mapping.findForward("tamam");
    }
}