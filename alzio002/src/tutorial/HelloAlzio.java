package tutorial;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAlzio extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("HelloAlzio");
		return SUCCESS;
	}
	
	private String name;
	private String pass;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
