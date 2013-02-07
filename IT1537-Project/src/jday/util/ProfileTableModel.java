/*******************************************************************************
 * Program Name: 			ProfileTableModel
 * Purpose:					profile table model
 * Name of Author:			Di Yuwen
 * Admin No. of Author:		120923R
 * Module Group: 			IS1201
 * *****************************************************************************/
package jday.util;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;
import jday.entities.Member;

public class ProfileTableModel extends AbstractTableModel {
	private final long serialVersionUID = 1L;
	private int rowCount, colCount;
	private String[] columnNames = {"Member ID", "Name", "Birthdate" , "Home No", "Moblie No", "Email" , "Address"};
	private Object [] [] data;
	
	ArrayList<Member> memberList = new ArrayList<Member>();
	
	public ProfileTableModel(ArrayList<Member>memberList){
	rowCount = memberList.size();
	colCount = columnNames.length;
	data = new Object[rowCount][colCount];
	for(int i = 0; i< rowCount; i++){
		/*Copy an ArrayList element to an instance of MyObject*/
        Member member = memberList.get(i); 
        data[i][0] = member.getMemberid();          
        data[i][1] = member.getName();
        data[i][2] = member.getBirthdate();
        data[i][3] = member.getContactnoH();
        data[i][4] = member.getContactnoM();
        data[i][5] = member.getEmail();
        data[i][6] = member.getAddress();
	}
	
	}
	@Override public int getColumnCount() {
		return colCount;
	}

	@Override public int getRowCount() {
		return rowCount;
	}
	
	@Override public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }

	public String getColumnName(int col){
		return columnNames[col];
	}
	
}


