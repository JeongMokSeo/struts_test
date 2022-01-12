package qna.dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.io.Resources;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class QnaDAO {
	
	private static SqlMapClient sqlMapper;
	
	static {
		
		try {
			Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
			sqlMapper = SqlMapClientBuilder.buildSqlMapClient(reader);
			
		} catch (IOException e) {
			
		}
		
	}
	
	public static List qnaSelectAll() {
		try {			
			return sqlMapper.queryForList("qnaSelectAll");
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return null;
	}

}
