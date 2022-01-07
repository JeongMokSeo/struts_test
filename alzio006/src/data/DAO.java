package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DAO {
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs;
	
	private String driver =  "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521/xe";
	private String id = "test";
	private String pwd = "1234";
	
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

	public boolean insert(DataObject vo) {
		
		boolean res = false;
		System.out.println("============================================");
		System.out.println("제품번호 :" + vo.getPno());
		System.out.println("제품이름 :" + vo.getPname());
		System.out.println("제품가격 :" + vo.getPprice());
		System.out.println("구매수량 :" + vo.getPcnt());
		System.out.println("============================================");
		
		String sql = "insert into market values (?,?,?,?)";
		try {
			makeConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getPno());
			pstmt.setString(2, vo.getPname());
			pstmt.setString(3, vo.getPprice());
			pstmt.setString(4, vo.getPcnt());
			pstmt.execute();
			close();
			res = true;
		}catch(Exception e) {
			res = false;
			e.printStackTrace();
		}
		
		return res;
		
	}
	
	public ArrayList<DataObject> select() {
		
		ArrayList<DataObject> aList = new ArrayList<DataObject>();
		DataObject vo = null;
		
		String sql = "select * from market";
		
		try {
			makeConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new DataObject();
				vo.setPno(rs.getString("pno"));
				vo.setPname(rs.getString("pname"));
				vo.setPprice(rs.getString("pprice"));
				vo.setPcnt(rs.getString("pcnt"));
				aList.add(vo);
			}
			
			close();

		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return aList;
		
	}
	
}
