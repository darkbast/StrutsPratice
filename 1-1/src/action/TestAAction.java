package action;

import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import action.form.TestAForm;

public class TestAAction extends DispatchAction {
	public ActionForward check1(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		prop.getProperty("message");
		String message=System.getProperty("welcome");
		System.out.println(message);
		return mapping.findForward("list");
	}

	public ActionForward check2(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return mapping.findForward("read");
	}
}
