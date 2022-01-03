package user;

import com.opensymphony.xwork2.ActionSupport;

public class LoginCheck extends ActionSupport {
	private String id;
	private String pwd;
	
	private final static String ID="admin";
	private final static String PWD="admin";
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String execute() throws Exception {

		if (id.equals(ID) && pwd.equals(PWD)) {
			return SUCCESS;
		} else {
			if (id.equals(ID)) {
				if  (pwd.equals(PWD)) return SUCCESS;
				else {
					this.addActionError("패스워드를 확인하세요");
					return INPUT;
				}
			} else {
				this.addActionError("아이디를 확인하세요");
				return INPUT;
			}
		}
	}
}
