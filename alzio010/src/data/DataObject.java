package data;

public class DataObject {
	private String deptno;
	private String dname;
	private String dloc;
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDloc() {
		return dloc;
	}
	public void setDloc(String dloc) {
		this.dloc = dloc;
	}
	
	public DataObject() {}
	
	public DataObject(String deptno, String dname, String dloc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.dloc = dloc;
	}
	
	
}
