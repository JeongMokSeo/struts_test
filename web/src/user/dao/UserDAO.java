package user.dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import user.model.userVo;

public class UserDAO {
	
	private static SqlMapClient sqlMapper;	
	userVo user;

	public userVo getUser() {
		return user;
	}

	public void setUser(userVo user) {
		this.user = user;
	}
	
	static {
		try {
			Reader reader = 
					Resources.getResourceAsReader("SqlMapConfig.xml");
			sqlMapper = SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close();
			
		} catch(IOException e) {}
	}
	
	public static userVo confirmLogin(userVo user) {
		userVo result;
		try {
			result =(userVo) sqlMapper.queryForObject("selectUserById", user.getId());
			
		} catch (SQLException se) {
			se.printStackTrace();
			return null;
		}
		return result;

	}
	
	public static boolean userJoin(userVo user) {
		try {
//			System.out.println("user.getId():"+user.getId());
//			System.out.println("user:"+user);
			sqlMapper.insert("insertUser", user);
			return true;
			
		} catch (SQLException se) {
			se.printStackTrace();
			return false;
		}
	}

}
