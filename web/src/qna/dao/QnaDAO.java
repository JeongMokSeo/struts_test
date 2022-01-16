package qna.dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.io.Resources;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import qna.model.comVo;
import qna.model.qnaVo;

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
	
	public static qnaVo qnaSelectOne(int qnaNo) {
		
		try {
			
			return (qnaVo) sqlMapper.queryForObject("qnaSelectOne", qnaNo);
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return null;
	}

	public static List qnaReplyList(qnaVo qna) {
		
		try {
			
			return sqlMapper.queryForList("qnaReplyList", qna);
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return null;
	}
	
	public static boolean qnaUpdateReadHit(int qnaNo) {
		
		try {
			sqlMapper.update("qnaUpdateReadHit", qnaNo);
			return true;
		} catch (SQLException se) {
			se.printStackTrace();
			return false;
		}
	}
	
	public static boolean qnaReplyInsert(comVo comvo) {
		
		try {
			sqlMapper.insert("qnaReplyInsert", comvo);
			return true;
		} catch (SQLException se) {
			se.printStackTrace();
			return false;
		}		
	}
	
	public static boolean qnaInsert(qnaVo qna) {
		try {
			sqlMapper.insert("qnaInsert", qna);
			return true;
		} catch (SQLException se) {
			se.printStackTrace();
			return false;
		}			
	}
	
	public static qnaVo qnaLastNo() {
		try {
			
			return (qnaVo)sqlMapper.queryForObject("qnaLastNo");
		} catch (SQLException se) {
			se.printStackTrace();
			return null;
		}		
	}
	
	public static boolean qnaUpdateFile(qnaVo qna) {
		try {
			sqlMapper.update("qnaUpdateFile", qna);
			return true;
		} catch (SQLException se) {
			se.printStackTrace();
			return false;
		}			
	}
	
	public static boolean qnaUpdate(qnaVo qna) {
		try {
			sqlMapper.update("qnaUpdate", qna);
			return true;
		} catch (SQLException se) {
			se.printStackTrace();
			return false;
		}			
	}
	
	
}
