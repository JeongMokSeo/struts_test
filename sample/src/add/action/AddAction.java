package add.action;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;
import javax.servlet.http.*;
import add.model.AddForm;
import add.model.AddResultVO;

public class AddAction extends Action {
    public ActionForward execute(ActionMapping mapping,
                                ActionForm form,
                                HttpServletRequest req,
                                HttpServletResponse res) {
        int op1  = ((AddForm)form).getOp1();
        int op2  = ((AddForm)form).getOp2();
       
        int result = op1 + op2;
       
        AddResultVO vo = new AddResultVO();
        vo.setResult(result);             
       
        req.setAttribute("resultvo", vo);
       
//System.out.println(vo.getResult());       
       
        return (mapping.findForward("success"));
               
    }     
}