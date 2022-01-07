package mystruts;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import data.DAO;
import data.DataObject;

public class SuccAction extends ActionSupport {
	
	private ArrayList<DataObject> aList = null;

	public ArrayList<DataObject> getAList() {
		return aList;
	}

	public void setAList(ArrayList<DataObject> aList) {
		this.aList = aList;
	}

	@Override
	public String execute() throws Exception {
		DAO dao = new DAO();
		aList = dao.select();
		return SUCCESS;
	}
	
	

}
