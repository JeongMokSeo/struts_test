package user;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class LoginCheck2 extends ActionSupport implements Preparable, ModelDriven<LoginData>{

	private LoginData Id;
	
	private final static String ID="admin";
	private final static String PWD="admin";
	
	@Override
	public String execute() throws Exception {
		if(Id.getId().equals(ID) && Id.getPwd().equals(PWD)) {
			return SUCCESS;
		} else {
			this.addActionError("아이디 또는 패스워드를  다시확인하세요");
			return INPUT;
		}
	}

	@Override
	public LoginData getModel() {
		// TODO Auto-generated method stub
		return Id;
	}

	@Override
	public void prepare() throws Exception {
		Id = new LoginData();
		
	}

}
