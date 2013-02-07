/*******************************************************************************
 * Program Name: 			AUpdateCourse
 * Purpose:					to update courses
 * Name of Author:			Deane
 * Admin No. of Author:		123188G
 * Module Group: 			IS1201
 * *****************************************************************************/
package jday.ui.admin;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.Timer;

import jday.entities.CourseBooking;
import jday.entities.Member;
import jday.util.BackgroundPanel;
import jday.util.ClassTableModel;
import java.awt.Color;

public class AUpdateCourse extends BackgroundPanel{
	
	final JTable tableList = new JTable();
	Timer timer = new Timer(3000, new ActionListener() {
		  @Override
		  public void actionPerformed(ActionEvent arg0) {
				ClassTableModel model = new ClassTableModel(CourseBooking.retrieveCourses());
				tableList.setModel(model);
		  }
		});

	public AUpdateCourse(){
		super();
		initialize();
	}
	
	public AUpdateCourse(JFrame f, Member m){
		this();
		myFrame = f;
		this.m = m;
	}
	
	private void initialize(){
		setSize(750,500);
		
		JButton btnAddCourse = new JButton("Add Course");
		btnAddCourse.setBounds(364, 433, 130, 29);
		btnAddCourse.setOpaque(false);
		btnAddCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UpdateFrame frame = new UpdateFrame();
				frame.setVisible(true);
					timer.setRepeats(true);
					timer.start(); 
			}
		});
		setLayout(null);
		btnAddCourse.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(btnAddCourse);
		
		JButton btnRemoveCourse = new JButton("Remove Course");
		btnRemoveCourse.setBounds(551, 433, 161, 29);
		btnRemoveCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					actionPerformedDelete();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}});
		btnRemoveCourse.setOpaque(false);
		btnRemoveCourse.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(btnRemoveCourse);
		

		ClassTableModel model = new ClassTableModel(CourseBooking.retrieveCourses());
		tableList.setBackground(new Color(216, 191, 216));
		tableList.setRowHeight(30);
		tableList.setModel(model);
		tableList.setBounds(0,0,850,165);
		tableList.getColumnModel().getColumn(0).setPreferredWidth(75);
		tableList.getColumnModel().getColumn(1).setPreferredWidth(150);
		tableList.getColumnModel().getColumn(2).setPreferredWidth(300);
		tableList.getColumnModel().getColumn(3).setPreferredWidth(200);
		tableList.getColumnModel().getColumn(4).setPreferredWidth(300);
		
		JScrollPane scrollPane = new JScrollPane(tableList);
		scrollPane.setBounds(70, 204, 650, 165);
		add(scrollPane);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				timer.stop();
				JPanel panel = new AMainpage(myFrame,m);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
			}
		});
		lblLogo.setIcon(new ImageIcon(AUpdateCourse.class.getResource("/images/90logo.png")));
		lblLogo.setBounds(58, 38, 99, 97);
		add(lblLogo);
		
		JLabel lblUpdateCourse = new JLabel("Update Course");
		lblUpdateCourse.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblUpdateCourse.setBounds(434, 11, 283, 29);
		add(lblUpdateCourse);

	}
	
	public void actionPerformedDelete() throws SQLException{
		int rowSelected = tableList.getSelectedRow();
		System.out.println(rowSelected);
		if(rowSelected>=0){
		String course = tableList.getValueAt(rowSelected, 0).toString();
		CourseBooking cb1 = new CourseBooking(course);
		int dialog = JOptionPane.showConfirmDialog(null,"Are you sure you want to remove course?");
		if(dialog == JOptionPane.YES_OPTION)
		cb1.deleteCourse();
		else
			cb1 = null;
		
		
		ClassTableModel model = new ClassTableModel(CourseBooking.retrieveCourses());
		tableList.setModel(model);
		
		}
		
		else 
			JOptionPane.showMessageDialog(null,"No record Selected", "Alert",
					JOptionPane.ERROR_MESSAGE);
	}
}
