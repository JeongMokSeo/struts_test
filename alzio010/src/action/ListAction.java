package action;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import data.DataObject;

public class ListAction extends ActionSupport implements Preparable, ModelDriven<DataObject> {

	private DataObject dataObject;
	private ArrayList<DataObject> list;
	
	
	@Override
	public String execute() throws Exception {
		//빌더 생성
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		//팩토리 생성
		Reader rd = Resources.getResourceAsReader("config/configuration.xml");
		SqlSessionFactory factory = builder.build(rd);
		//객체 생성
		SqlSession session = factory.openSession();
		
		//session.update("updateDept");
		//session.selectOne("selectDeptOne", dataObject);
		
		list =(ArrayList<DataObject>) session.selectList("selectDept");
		
		System.out.println();
		System.out.println("부코드 부서명 부서장소");
		for (int j=0; j < list.size(); j++) {
					
			dataObject=	(DataObject)list.get(j);
			System.out.println(
					dataObject.getDeptno() + "\t" +
					dataObject.getDname() + "\t" +
					dataObject.getDloc()
					);	
		}
		
		
		return SUCCESS;
	}
	
	

	@Override
	public DataObject getModel() {
		// TODO Auto-generated method stub
		return dataObject;
	}

	@Override
	public void prepare() throws Exception {
		dataObject = new DataObject();
		
	}



	public DataObject getDataObject() {
		return dataObject;
	}



	public void setDataObject(DataObject dataObject) {
		this.dataObject = dataObject;
	}



	public ArrayList<DataObject> getList() {
		return list;
	}



	public void setList(ArrayList<DataObject> list) {
		this.list = list;
	}



	

}
