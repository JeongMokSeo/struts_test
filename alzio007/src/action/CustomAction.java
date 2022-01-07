package action;

import com.opensymphony.xwork2.ActionSupport;

public class CustomAction extends ActionSupport {

	private String name;
	private String pwd;
	private String pwdchk;
	private String hpage;
	private String pic;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPwdchk() {
		return pwdchk;
	}
	public void setPwdchk(String pwdchk) {
		this.pwdchk = pwdchk;
	}
	public String getHpage() {
		return hpage;
	}
	public void setHpage(String hpage) {
		this.hpage = hpage;
	}
	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
	
	
}
