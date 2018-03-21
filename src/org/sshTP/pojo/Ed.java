package org.sshTP.pojo;

public class Ed {
	private Integer id;
	private String ename;
	private String dname;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Ed(String ename, String dname) {
		super();
		this.ename = ename;
		this.dname = dname;
	}
	public Ed() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Ed [ename=" + ename + ", dname=" + dname + "]";
	}
	
	

}
