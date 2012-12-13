package jday.ui.admin;
import javax.swing.JPanel;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import jday.util.BackgroundPanel;


public class ABooking extends BackgroundPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public ABooking() {
		super();
		initialize();
	}
	
	public ABooking(JFrame f){
		this();
		myFrame = f;
	}
	
	private void initialize(){
		setSize(new Dimension(750, 500));
		setLayout(null);
		
		JLabel label = new JLabel("logo");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel panel = new AMainpage(myFrame);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
			}
		});
		label.setBounds(10, 11, 94, 102);
		label.setIcon(new ImageIcon(ABooking.class.getResource("/pic/90logo.png")));
		add(label);
		
		JLabel lblJdayBooking = new JLabel("JDAY View Booking");
		lblJdayBooking.setBounds(125, 42, 277, 42);
		lblJdayBooking.setFont(new Font("Trebuchet MS", Font.PLAIN, 30));
		add(lblJdayBooking);
		
		table = new JTable();
		table.setBounds(83, 124, 583, 240);
		table.setBackground(new Color(216, 191, 216));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setRowHeight(30);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Member ID ", "Booking No.", "Description"},
				{"765432B", "7654", "Badminton court 1100-1300"},
				{"245367C", "3644", "Spa Thai Massage 1500-1600"},
				{"173547M", "9897", "D and D event 1900-2200"},
				{"173547M", "7468", "Day care service 1200-2100"},
				{"128786S", "9845", "Room service - laundry"},
				{"987435T", "0954", "Karaoke- roomA 1300-1500"},
				{"347689K", "7343", "Golfing-18-afternoon"},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(15);
		table.getColumnModel().getColumn(1).setPreferredWidth(15);
		table.getColumnModel().getColumn(2).setPreferredWidth(300);
		add(table);
		
		JButton btnCancelBooking = new JButton("Cancel booking");
		btnCancelBooking.setBounds(538, 375, 128, 23);
		add(btnCancelBooking);

	}
}
