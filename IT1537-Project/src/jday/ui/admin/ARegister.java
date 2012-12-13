package jday.ui.admin;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import jday.util.BackgroundPanel;


public class ARegister extends BackgroundPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Create the panel.
	 */
	public ARegister() {
		super();
		initialize();
	}
	
	public ARegister(JFrame f){
		this();
		myFrame = f;
	}
	
	private void initialize(){
		setSize(new Dimension(750, 500));
		setLayout(null);
		
		JLabel label = new JLabel("logo");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JPanel panel = new AMainpage(myFrame);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
				
			}
		});
		label.setIcon(new ImageIcon(ARegister.class.getResource("/pic/90logo.png")));
		label.setBounds(10, 11, 94, 102);
		add(label);
		
		JButton btnCreate = new JButton("Create member");
		btnCreate.setBounds(573, 409, 140, 23);
		add(btnCreate);
		
		JLabel lblJdayRegister = new JLabel("JDAY Register");
		lblJdayRegister.setFont(new Font("Trebuchet MS", Font.PLAIN, 30));
		lblJdayRegister.setBounds(124, 46, 222, 43);
		add(lblJdayRegister);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setBounds(142, 192, 54, 23);
		add(lblName);
		
		JLabel lblPleaseEnterThe = new JLabel("Please enter the details:");
		lblPleaseEnterThe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPleaseEnterThe.setBounds(44, 125, 246, 29);
		add(lblPleaseEnterThe);
		
		JLabel lblMemberId = new JLabel("Member ID:");
		lblMemberId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMemberId.setBounds(398, 192, 89, 24);
		add(lblMemberId);
		
		JLabel lblContactNumberh = new JLabel("Contact number (H):");
		lblContactNumberh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContactNumberh.setBounds(44, 336, 158, 23);
		add(lblContactNumberh);
		
		JLabel lblContactNumberm = new JLabel("Contact number (M):");
		lblContactNumberm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContactNumberm.setBounds(44, 282, 158, 29);
		add(lblContactNumberm);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setBounds(434, 237, 54, 22);
		add(lblEmail);
		
		JLabel lblBirthDate = new JLabel("Birth date:");
		lblBirthDate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBirthDate.setBounds(118, 237, 81, 23);
		add(lblBirthDate);
		
		JLabel lblAddress = new JLabel("Address: ");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAddress.setBounds(419, 284, 68, 24);
		add(lblAddress);
		
		textField = new JTextField();
		textField.setBounds(206, 192, 140, 23);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(206, 237, 140, 23);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(206, 285, 140, 23);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(206, 336, 140, 23);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(497, 192, 141, 23);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(498, 237, 140, 23);
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(497, 288, 198, 93);
		add(textField_6);

	}
}
