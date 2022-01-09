package member;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.opensymphony.xwork2.ActionSupport;

import data.DAO;
import data.ValueObject;

public class LoginAction extends ActionSupport {

	private String id;
	private String pwd;
	
	private ValueObject vo;
	
	

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


	public ValueObject getVo() {
		return vo;
	}


	public void setVo(ValueObject vo) {
		this.vo = vo;
	}
	
	@Override
	public String execute() throws Exception {
		
		//빌더 생성
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		//팩토리 생성
		Reader rd = Resources.getResourceAsReader("config/configuration.xml");
		SqlSessionFactory factory = builder.build(rd);
		//객체 생성
		SqlSession session = factory.openSession();		
		
		//DAO dao = new DAO();
		//vo = dao.select(this.id);	
		
		vo = (ValueObject)session.selectOne("selectMember", this.id);
		
		if (vo ==null || !pwd.equals(vo.getPwd())) {
			String msg = "등록되지 않은 사용자이거나 패스워드가 일치하지 않습니다.";
			this.addActionMessage(msg);
			return "input";
		} else {
			return SUCCESS;
		}
	}

	

}
