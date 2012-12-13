package jday.ui.user;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import jday.util.BackgroundPanel;


public class Sport2 extends BackgroundPanel {
	private JTable table;
	private JTable table_1;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Sport2() {
		super();
		initialize();
	}
	
	public Sport2(JFrame f){
		this();
		myFrame = f;
	}
	
	private void initialize(){
		setSize(new Dimension(750, 500));
		setLayout(null);
		
		JLabel lblDearMemberThe = new JLabel("Dear member, the maximum time for booking is 2 hours.");
		lblDearMemberThe.setBounds(89, 30, 486, 25);
		lblDearMemberThe.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		add(lblDearMemberThe);
		
		JButton button = new JButton("Confirm");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"Your booking no. is 123212");
			}
		});
		button.setBounds(640, 430, 87, 23);
		add(button);
		
		JButton button_1 = new JButton("Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new Sport(myFrame,m);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
			}
		});
		button_1.setBounds(640, 464, 87, 23);
		add(button_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(new Color(139, 0, 139));
		panel.setBounds(145, 84, 486, 46);
		add(panel);
		panel.setLayout(null);
		
		JButton button_2 = new JButton("<");
		button_2.setBounds(104, 12, 41, 25);
		panel.add(button_2);
		
		JLabel label = new JLabel("MAY");
		label.setBounds(185, 7, 40, 30);
		label.setPreferredSize(new Dimension(40, 30));
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(label);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(237, 7, 80, 30);
		spinner.setModel(new SpinnerListModel(new String[] {"2012"}));
		spinner.setPreferredSize(new Dimension(80, 30));
		panel.add(spinner);
		
		JButton button_3 = new JButton(">");
		button_3.setBounds(361, 12, 41, 25);
		panel.add(button_3);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"SUN ", "MON", "TUE", "WED", "THU", "FRI", "SAT"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setRowHeight(35);
		table.setForeground(Color.WHITE);
		table.setFont(new Font("Tahoma", Font.PLAIN, 17));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBackground(Color.DARK_GRAY);
		table.setBounds(145, 129, 486, 25);
		add(table);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"", "", "1", "2", "3", "4", "5"},
				{"6", "7", "8", "9", "10", "11", "12"},
				{"13", "14", "15", "16", "17", "18", "19"},
				{"20", "21", "22", "23", "24", "25", "26"},
				{"27", "28", "29", "30", "31", null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table_1.getColumnModel().getColumn(0).setResizable(false);
		table_1.setSelectionBackground(Color.WHITE);
		table_1.setRowHeight(35);
		table_1.setOpaque(true);
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table_1.setEnabled(false);
		table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_1.setBackground(new Color(255, 240, 245));
		table_1.setBounds(145, 155, 486, 175);
		add(table_1);
		
		JLabel label_1 = new JLabel("Please  choose your date");
		label_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		label_1.setBounds(89, 57, 246, 23);
		add(label_1);
		
		JLabel label_2 = new JLabel("Booking time:");
		label_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		label_2.setBounds(89, 343, 129, 25);
		add(label_2);
		
		JLabel label_3 = new JLabel("Court:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_3.setBounds(145, 381, 70, 25);
		add(label_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(210, 381, 176, 30);
		add(textField);
		
		JLabel label_4 = new JLabel("Start:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_4.setBounds(145, 419, 57, 23);
		add(label_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Please choose the time", "0800-0900", "0900-1000", "1000-1100", "1100-1200", "1200-1300", "1300-1400", "1400-1500", "1500-1600", "1600-1700", "1700-1800", "1800-1900", "1900-2000"}));
		comboBox.setBounds(210, 419, 157, 20);
		add(comboBox);
		
		JLabel label_5 = new JLabel("End:");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_5.setBounds(399, 414, 46, 33);
		add(label_5);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Please choose the time", "0800-0900", "0900-1000", "1000-1100", "1100-1200", "1200-1300", "1300-1400", "1400-1500", "1500-1600", "1600-1700", "1700-1800", "1800-1900", "1900-2000"}));
		comboBox_1.setBounds(457, 421, 157, 20);
		add(comboBox_1);

	}
}
