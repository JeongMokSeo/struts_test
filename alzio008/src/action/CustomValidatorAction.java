package action;

import com.opensymphony.xwork2.ActionSupport;

public class CustomValidatorAction extends ActionSupport {
	private String requiredValidator;
	private String customValidator;
	public String getRequiredValidator() {
		return requiredValidator;
	}
	public void setRequiredValidator(String requiredValidator) {
		this.requiredValidator = requiredValidator;
	}
	public String getCustomValidator() {
		return customValidator;
	}
	public void setCustomValidator(String customValidator) {
		this.customValidator = customValidator;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
	
	
	
	

}
