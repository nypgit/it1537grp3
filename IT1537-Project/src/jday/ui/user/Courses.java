/*******************************************************************************
 * Program Name: 			Courses
 * Purpose:					view courses 
 * Name of Author:			Deane
 * Admin No. of Author:		123188G
 * Module Group: 			IS1201
 * *****************************************************************************/
package jday.ui.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



import jday.entities.CourseBooking;
import jday.entities.Member;
import jday.util.BackgroundPanel;
import jday.util.ClassTableModel;

public class Courses extends BackgroundPanel{



	private Member m;
	
	public Courses() {
		super();
		initialize();
	}
	
	public Courses(JFrame f){
		this();
		myFrame = f;
	}
	
	public Courses(JFrame f,Member m){
		super();
		myFrame = f;
		this.m = m;
		initialize();
	}
	private void initialize(){
		setSize(750,500);
		setLayout(null);

		
		final JTable tableList = new JTable();
		tableList.setBackground(new Color(216, 191, 216));
		ClassTableModel model = new ClassTableModel(CourseBooking.retrieveCourses());
		tableList.setModel(model);
		tableList.setBounds(0,0,850,165);
		tableList.setRowHeight(30);
		tableList.getColumnModel().getColumn(0).setPreferredWidth(75);
		tableList.getColumnModel().getColumn(1).setPreferredWidth(150);
		tableList.getColumnModel().getColumn(2).setPreferredWidth(300);
		tableList.getColumnModel().getColumn(3).setPreferredWidth(200);
		tableList.getColumnModel().getColumn(4).setPreferredWidth(300);
		tableList.getSelectionModel().addListSelectionListener(new
				ListSelectionListener() {

					@Override
					public void valueChanged(ListSelectionEvent arg0) {
						// TODO Auto-generated method stub
						int dialog = JOptionPane.YES_NO_OPTION;
						JOptionPane.showConfirmDialog(null, "Register?","Register", dialog);
						if(dialog == JOptionPane.YES_OPTION){
									
							String coursetype;	 
						    coursetype = (String)tableList.getValueAt(tableList.getSelectedRow(), 0);  
								System.out.println(coursetype);
							CourseBooking c = new CourseBooking(coursetype);
							JPanel panel = new CoursesRegister(myFrame,m,c);
							myFrame.getContentPane().removeAll();
							myFrame.getContentPane().add(panel);
							myFrame.getContentPane().validate();
							myFrame.getContentPane().repaint();
						}
					} 
			
		});
		JScrollPane scrollPane = new JScrollPane(tableList);
		scrollPane.setBounds(64, 120, 664, 340);
		add(scrollPane);
		
		JLabel lblCourses = new JLabel("Courses");
		lblCourses.setForeground(new Color(0, 0, 0));
		lblCourses.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblCourses.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourses.setBounds(381, 11, 333, 31);
		add(lblCourses);

	}
}
