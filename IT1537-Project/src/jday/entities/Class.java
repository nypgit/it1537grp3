package jday.entities;
import java.sql.ResultSet;

import jday.entities.dao.DBController;


public class Class{

	private String memberid;
	private String classtype;
	private String fees;
	private String timing;
	private String venue;
	
	
	public Class() {
		super();
	}
	
	public Class(String memberid, String classtype){
		this.memberid = memberid;
		this.classtype = classtype;
	}


	public String getMemberid() {
		return memberid;
	}


	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}


	public String getClasstype() {
		return classtype;
	}


	public void setClasstype(String classtype) {
		this.classtype = classtype;
	}


	public String getFees() {
		return fees;
	}



	public String getTiming() {
		return timing;
	}



	public String getVenue() {
		return venue;
	}

	
	public boolean retrieveClass(){
		boolean success = false;
		ResultSet rs = null;
		DBController db = new DBController();
		
		db.getConnection();

		String sql = "select * from class where class = '"+classtype +"' ;";

	
		rs = db.readRequest(sql);


		try{
			while(rs.next()){
				fees = rs.getString("fees");
				timing = rs.getString("timing");
				venue = rs.getString("venue");
		
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		db.terminate();
		return success;
	}

}
