package mystruts;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import data.DAO;
import data.DataObject;

public class InsertAction extends ActionSupport implements Preparable, ModelDriven<DataObject> {
	
	private DataObject vo;

	public DataObject getVo() {
		return vo;
	}

	public void setVo(DataObject vo) {
		this.vo = vo;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		// DAO 파일이 있어야 함
		// Dao 파일에서 insert
		DAO dao = new DAO();
		if(dao.insert(vo)) {
			return SUCCESS;
		} else {
			return INPUT;
		}

	}

	@Override
	public DataObject getModel() {
		// TODO Auto-generated method stub
		return vo;
	}

	@Override
	public void prepare() throws Exception {
		vo = new DataObject();
		
	} 

}
