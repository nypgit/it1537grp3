package jday.ui.admin;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Member;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import jday.util.BackgroundPanel;

public class Kitchen extends BackgroundPanel {
	private JTable table;


	/**
	 * Create the panel.
	 */
	public Kitchen() {
		super();
		initialize();
	}
	
	public Kitchen(JFrame f){
		super();
		myFrame = f;
		initialize();
	}
	public Kitchen(JFrame f, Member m){
		this();
		myFrame = f;
	}
	
	private void initialize(){
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(-6, -16, 762, 523);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblAddress = new JLabel("Status");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAddress.setBounds(580, 117, 79, 14);
		panel.add(lblAddress);
		
		JLabel lblName = new JLabel("No.");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName.setBounds(84, 106, 54, 36);
		panel.add(lblName);
		lblName.setHorizontalAlignment(SwingConstants.TRAILING);
		
		JLabel lblBirthdate = new JLabel("Order(s)");
		lblBirthdate.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBirthdate.setBounds(190, 101, 60, 46);
		panel.add(lblBirthdate);
		lblBirthdate.setHorizontalAlignment(SwingConstants.TRAILING);
		
		JLabel lblMembersId = new JLabel("Qty.");
		lblMembersId.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMembersId.setBounds(316, 106, 67, 36);
		panel.add(lblMembersId);
		
		JLabel lblGivenPin = new JLabel("Location");
		lblGivenPin.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGivenPin.setBounds(411, 98, 67, 52);
		panel.add(lblGivenPin);
		
		JLabel lblMembersParticular = new JLabel("RESTAURANT ORDER SUMMARY");
		lblMembersParticular.setForeground(new Color(0, 0, 0));
		lblMembersParticular.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblMembersParticular.setBounds(272, 54, 268, 46);
		panel.add(lblMembersParticular);
		lblMembersParticular.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewPin = new JLabel("Completed");
		lblNewPin.setFont(new Font("Candara", Font.PLAIN, 12));
		lblNewPin.setBounds(573, 142, 86, 30);
		panel.add(lblNewPin);
		
		JButton btnCancel = new JButton("Pending");
		btnCancel.setFont(new Font("Candara", Font.PLAIN, 12));
		btnCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancel.setOpaque(false);
		btnCancel.setBounds(557, 184, 86, 23);
		panel.add(btnCancel);
		
		JButton button = new JButton("Pending");
		button.setFont(new Font("Candara", Font.PLAIN, 12));
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setOpaque(false);
		button.setBounds(557, 247, 86, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("Pending");
		button_1.setFont(new Font("Candara", Font.PLAIN, 12));
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_1.setOpaque(false);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_1.setBounds(557, 343, 86, 23);
		panel.add(button_1);
		
		table = new JTable();
		table.setRowHeight(32);
		table.setBounds(113, 116, 575, 288);
		panel.add(table);
		table.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		table.setOpaque(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"", "", null, null, null},
				{"1", "Grilled Fish", "1", "Pool", null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Number", "Food", "Qty.", "Location", "Status"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(30);
		table.getColumnModel().getColumn(0).setMinWidth(30);
		table.getColumnModel().getColumn(0).setMaxWidth(30);
		table.getColumnModel().getColumn(2).setPreferredWidth(38);
		table.getColumnModel().getColumn(2).setMinWidth(38);
		table.getColumnModel().getColumn(2).setMaxWidth(45);

	}
}
