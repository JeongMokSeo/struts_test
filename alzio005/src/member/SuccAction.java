package member;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import data.DAO;
import data.ValueObject;

public class SuccAction extends ActionSupport {
	
	ArrayList<ValueObject> aList = null;

	public ArrayList<ValueObject> getAList() {
		return aList;
	}

	public void setAList(ArrayList<ValueObject> aList) {
		this.aList = aList;
	}

	@Override
	public String execute() throws Exception {
		DAO dao = new DAO();
		aList = dao.select();
		System.out.println("SuccAction aList.size():"+aList.size());
		
		if (aList == null) {
			return "error";
		} else {
			return SUCCESS;
		}
	}
	
	

}
