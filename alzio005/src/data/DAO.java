package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {

	public DAO() {}
	public DAO(ValueObject vo) {
		this.vo = vo;
	}
	
	private ValueObject vo;
	private Connection conn = null;
	private ResultSet rs;
	private PreparedStatement pstmt;
	
	private final String driver = "oracle.jdbc.driver.OracleDriver";
	private final String url = "jdbc:oracle:thin:@localhost:1521/xe";
	private final String id = "test";
	private final String pwd = "1234";
	
	public void makeConnection() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,id,pwd);
			
		} catch(ClassNotFoundException cfe) {
		} catch(SQLException se) {
			
		}
	}
	
	public void close() {
		
		try {
			if (rs != null) {rs.close();rs=null; }
		} catch(SQLException se) {
			se.printStackTrace();
		}
		try {
			if (pstmt != null) {pstmt.close();pstmt=null; }
		} catch(SQLException se) {
			se.printStackTrace();
		}
		try {
			if (conn != null) {conn.close();conn=null; }
		} catch(SQLException se) {
			se.printStackTrace();
		}
	}
	
	public ValueObject select(String id) {
		String sql = "";
		ValueObject vo = null;
		
		sql = "select id,pwd from member where id = ?";
		makeConnection();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs =pstmt.executeQuery();
			while(rs.next()) {
				vo = new ValueObject();
				vo.setId(rs.getString(1));
				vo.setPwd(rs.getString(2));
			}
		} catch (SQLException se) {
			vo = null;
			se.printStackTrace();
		}
		
		close();
		return vo;
	}
	
	
	public ArrayList<ValueObject> select() {
		String sql = "";
		ArrayList<ValueObject> aList = new ArrayList<ValueObject>();
		ValueObject vo = null;
		
		sql = "select * from member";
		makeConnection();
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs =pstmt.executeQuery();
			while(rs.next()) {
				vo = new ValueObject();
				vo.setSeq(rs.getInt("seq"));
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setPwd(rs.getString("pwd"));
				vo.setTel1(rs.getString("tel1"));
				vo.setTel2(rs.getString("tel2"));
				vo.setTel3(rs.getString("tel3"));
				aList.add(vo);
			}
		} catch (SQLException se) {
			vo = null;
			se.printStackTrace();
		}
		
		close();
		System.out.println("DAO aList.size():"+aList.size());
		return aList;
	}
	
	
}
