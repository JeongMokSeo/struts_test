package member;

import java.io.Reader;
import java.util.ArrayList;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

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
		
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		Reader rd = Resources.getResourceAsReader("config/configuration.xml");
		SqlSessionFactory factory = builder.build(rd);
		
		SqlSession session = factory.openSession();
		
		//DAO dao = new DAO();
		//aList = dao.select();
		aList = (ArrayList<ValueObject>)session.selectList("selectMemberArray");
		System.out.println("SuccAction aList.size():"+aList.size());
		
		if (aList == null) {
			return "error";
		} else {
			return SUCCESS;
		}
	}
	
	

}
