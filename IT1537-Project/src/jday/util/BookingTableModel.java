/*******************************************************************************
 * Program Name: 			BookingTableModel
 * Purpose:					booking table model
 * Name of Author:			Di Yuwen
 * Admin No. of Author:		120923R
 * Module Group: 			IS1201
 * *****************************************************************************/
package jday.util;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import jday.entities.Booking;
import jday.entities.Member;

public class BookingTableModel extends AbstractTableModel {
	private final long serialVersionUID = 1L;
	private int rowCount, colCount;
	private String[] columnNames = {"Member ID", "Booking No", "Venue" , "Time"};
	private Object [] [] data;
	
	//ArrayList<Booking> bookingList;
	
	public BookingTableModel(ArrayList<Booking> bookingList){
	rowCount = bookingList.size();
	colCount = columnNames.length;
	data = new Object[rowCount][colCount];
	for(int i = 0; i< rowCount; i++){
		/*Copy an ArrayList element to an instance of MyObject*/
	
        Booking booking = bookingList.get(i); 
        data[i][0] = booking.getMemberid();          
        data[i][1] = booking.getBookingno();
        data[i][2] = booking.getVenue();
        data[i][3] = booking.getTime();
        System.out.println(booking.getMemberid());
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


