package jday.ui.user;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import jday.entities.Member;
import jday.util.BackgroundPanel;


public class Golfing2 extends BackgroundPanel {
	private JTable table;
	private JTable table_1;
	
	public Golfing2() {
		super();
		initialize();
	}
	
	public Golfing2(JFrame f,Member m){
		this();
		myFrame = f;
		this.m = m;
	}

	/**
	 * Create the panel.
	 */
	public void initialize() {
		setSize(new Dimension(750, 500));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 0, 139));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(118, 59, 547, 44);
		add(panel);
		panel.setLayout(null);
		
		JButton button = new JButton("<");
		button.setBounds(111, 5, 41, 25);
		panel.add(button);
		
		JLabel lblNewLabel = new JLabel("MAY");
		lblNewLabel.setBounds(194, 5, 40, 30);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setPreferredSize(new Dimension(40, 30));
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(246, 10, 80, 26);
		spinner.setModel(new SpinnerNumberModel(2012, 0, 2013, 0));
		spinner.setPreferredSize(new Dimension(80, 30));
		panel.add(spinner);
		
		JButton button_1 = new JButton(">");
		button_1.setBounds(397, 7, 41, 25);
		panel.add(button_1);
		
		
		table = new JTable();
		table.setCellSelectionEnabled(true);
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table.setOpaque(true);
		table.setBackground(new Color(255, 240, 245));
		table.setSelectionBackground(Color.WHITE);
		table.setRowHeight(35);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, "1", "2", "3", "4"},
				{"5", "6", "7", "8", "9", "10", "11"},
				{"12", "13", "14", "15", "16", "17", "18"},
				{"19", "20", "21", "22", "23", "24", "25"},
				{"26", "27", "28", "29", "30", null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(118, 133, 547, 175);
		add(table);
		
		table_1 = new JTable();
		table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		table_1.setForeground(new Color(216, 191, 216));
		table_1.setBackground(Color.DARK_GRAY);
		table_1.setRowHeight(30);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"SUN", "MON", "TUES", "WED", "THUR", "FRI", "SAT"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table_1.setBounds(118, 102, 547, 30);
		add(table_1);
		
		JButton btnBack = new JButton("Confirm");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JPanel panel = new Golfing(myFrame,m);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
			}
		});
		btnBack.setBounds(632, 448, 89, 23);
		add(btnBack);
		
		JLabel lblPleaseChooseYour = new JLabel("Please  choose your date");
		lblPleaseChooseYour.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblPleaseChooseYour.setBounds(89, 25, 246, 23);
		add(lblPleaseChooseYour);
		
		JLabel label = new JLabel("Please choose the time and Green fees");
		label.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		label.setBounds(89, 321, 329, 23);
		add(label);
		
		JLabel label_1 = new JLabel("Time:");
		label_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		label_1.setBounds(92, 366, 57, 23);
		add(label_1);
		
		JRadioButton radioButton = new JRadioButton("Morning");
		radioButton.setOpaque(false);
		radioButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		radioButton.setBounds(143, 398, 109, 23);
		add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Afternoon");
		radioButton_1.setOpaque(false);
		radioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		radioButton_1.setBounds(143, 426, 109, 23);
		add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Evening");
		radioButton_2.setOpaque(false);
		radioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		radioButton_2.setBounds(143, 454, 109, 23);
		add(radioButton_2);
		
		JLabel label_2 = new JLabel("Green Fees:");
		label_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		label_2.setBounds(380, 362, 102, 31);
		add(label_2);
		
		JRadioButton radioButton_3 = new JRadioButton("9 Holes");
		radioButton_3.setOpaque(false);
		radioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		radioButton_3.setBounds(466, 398, 102, 23);
		add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("18 Holes");
		radioButton_4.setOpaque(false);
		radioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		radioButton_4.setBounds(466, 426, 102, 23);
		add(radioButton_4);
	

	}
}
