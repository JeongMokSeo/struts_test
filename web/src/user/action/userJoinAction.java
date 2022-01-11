package user.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import user.dao.UserDAO;
import user.model.userVo;

public class userJoinAction extends ActionSupport implements ModelDriven<userVo> {
	
	private userVo user = new userVo(); 
	
	public String form() throws Exception  {
		return SUCCESS;
	}

	@Override
	public String execute() throws Exception {
		//System.out.println("userJoinAction user:" + user);
		if (UserDAO.userJoin(user)) {
			user = UserDAO.confirmLogin(user);
			Map session = ActionContext.getContext().getSession();
			session.put("user", user);	
		}		
		return SUCCESS;
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

}
