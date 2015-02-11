package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import action.form.HelloWorldForm;
import action.form.MainForm;

public class MainAction extends DispatchAction {

	public ActionForward movingFormTest(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		MainForm castForm = (MainForm) form;
		
		return mapping.findForward("list");
	}

}
