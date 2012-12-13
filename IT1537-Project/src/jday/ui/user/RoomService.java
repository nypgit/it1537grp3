package jday.ui.user;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import jday.entities.Member;
import jday.util.BackgroundPanel;

public class RoomService extends BackgroundPanel {

	/**
	 * Create the panel.
	 */
	public RoomService() {
		super();
		initialize();
	}
	
	public RoomService(JFrame f,Member m){
		this();
		myFrame = f;
		this.m = m;
	}
	private void initialize(){
		
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Arial", Font.PLAIN, 14));
		setBackground(new Color(204, 51, 153));
		setSize(new Dimension(750, 500));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(1, 1, 1, 1));
		panel.setOpaque(false);
		panel.setBounds(10, 11, 730, 478);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblServices = new JLabel("Services");
		lblServices.setForeground(new Color(0, 0, 0));
		lblServices.setHorizontalTextPosition(SwingConstants.CENTER);
		lblServices.setHorizontalAlignment(SwingConstants.CENTER);
		lblServices.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblServices.setBounds(28, 26, 180, 43);
		panel.add(lblServices);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Cleaning Services");
		chckbxNewCheckBox.setForeground(new Color(0, 0, 0));
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setBounds(28, 151, 287, 51);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxAdditionOfTowels = new JCheckBox("Addition of towels and blankets");
		chckbxAdditionOfTowels.setOpaque(false);
		chckbxAdditionOfTowels.setForeground(new Color(0, 0, 0));
		chckbxAdditionOfTowels.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxAdditionOfTowels.setBounds(28, 213, 287, 51);
		panel.add(chckbxAdditionOfTowels);
		
		JCheckBox chckbxLaundryServices = new JCheckBox("Laundry Services");
		chckbxLaundryServices.setOpaque(false);
		chckbxLaundryServices.setForeground(new Color(0, 0, 0));
		chckbxLaundryServices.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxLaundryServices.setBounds(28, 273, 287, 51);
		panel.add(chckbxLaundryServices);
		
		JLabel lblNewLabel = new JLabel("Price");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(451, 85, 187, 35);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Free");
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(451, 151, 187, 39);
		panel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("$5.00");
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(0, 0, 0));
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(451, 213, 187, 39);
		panel.add(label);
		
		JLabel label_1 = new JLabel("$6.00");
		label_1.setHorizontalTextPosition(SwingConstants.CENTER);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(0, 0, 0));
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(451, 273, 187, 39);
		panel.add(label_1);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(new Color(0, 0, 51));
		separator.setBounds(461, 95, 9, 239);
		panel.add(separator);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setOpaque(false);
		btnConfirm.setBounds(484, 361, 95, 25);
		panel.add(btnConfirm);

	}
}
