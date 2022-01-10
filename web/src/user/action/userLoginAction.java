package user.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import user.dao.UserDAO;
import user.model.userVo;

public class userLoginAction extends ActionSupport
implements ModelDriven<userVo>
{
	private userVo user = new userVo();
	private Map session;
	
	public String form() throws Exception {		
		return SUCCESS;
	}
	
	public String logout() throws Exception {
		session = ActionContext.getContext().getSession();
		session.remove("user");
		ActionContext.getContext().setSession(session);
		return SUCCESS;
	}

	@Override
	public String execute() throws Exception {
		int inputId = user.getId();
		String inputPwd = user.getPassword();
		user = UserDAO.confirmLogin(user);
		
		if (user == null) {
			System.out.println("user 에러");
			return SUCCESS;
		} else {
			String pwd = user.getPassword();
			int id = user.getId();
			if (id == inputId && pwd.equals(inputPwd)) {
				session = ActionContext.getContext().getSession();
				session.put( "user", user);
				System.out.println("login OK");
				return SUCCESS;
			} else {
				System.out.println("아이디 또는 패스워드가 일치하지 않습니다.");
				return SUCCESS;
			}
		}
	}

	@Override
	public userVo getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	public userVo getUser() {
		return user;
	}

	public void setUser(userVo user) {
		this.user = user;
	}

	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}
	
}	