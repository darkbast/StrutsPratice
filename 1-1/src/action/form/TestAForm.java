package action.form;

import org.apache.struts.action.ActionForm;

public class TestAForm extends ActionForm {
	private String testName;
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}
	
	public TestAForm() {
		// TODO Auto-generated constructor stub
		testName="testtest";
	}
}
