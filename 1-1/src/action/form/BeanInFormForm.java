package action.form;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.chain.commands.servlet.ValidateActionForm;
import org.apache.struts.chain.contexts.ActionContext;
import org.apache.struts.config.ActionConfig;

public class BeanInFormForm extends ValidateActionForm {
	
	

	@Override
	protected ActionErrors validate(ActionContext context,
			ActionConfig actionConfig, ActionForm actionForm) {
		// TODO Auto-generated method stub
		return super.validate(context, actionConfig, actionForm);
	}

}
