package member;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import data.DAO;
import data.ValueObject;

public class JoinMember extends ActionSupport implements Preparable, ModelDriven<ValueObject> {
	
	private ValueObject vo;
	private String pwdCheck;
	
	@Override
	public String execute() throws Exception {

		DAO dao = new DAO();
		System.out.println("1차 패스워드:" + vo.getPwd());
		System.out.println("2차 패스워드:" + pwdCheck);
		
		if (vo.getPwd().equals(pwdCheck)) {
			//insert
			dao.insert(vo);
			return SUCCESS;
		} else {
			this.addActionMessage("패스워드가 일치하지 않습니다.");
			return "input";
		}
		
	}

	@Override
	public ValueObject getModel() {
		// TODO Auto-generated method stub
		return vo;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		vo = new ValueObject();
		
	}

	public String getPwdCheck() {
		return pwdCheck;
	}

	public void setPwdCheck(String pwdCheck) {
		this.pwdCheck = pwdCheck;
	}
	
	

}
