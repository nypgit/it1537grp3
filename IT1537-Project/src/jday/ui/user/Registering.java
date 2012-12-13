package jday.ui.user;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import jday.entities.Member;
import jday.util.BackgroundPanel;

public class Registering extends BackgroundPanel {
	

	private JTextField textFieldMemberId = null;
	private JPasswordField passwordFieldPin = null;

	public Registering(JFrame f) {
		this();
		myFrame = f;
		

	}

	public Registering() {
		super();
		initialize();
	}
	
	private void initialize(){
		setSize(750,500);
		setLayout(null);
		
		JLabel lblMemberId = new JLabel("Member Id:");
		lblMemberId.setFont(new Font("Candara", Font.PLAIN, 16));
		lblMemberId.setHorizontalAlignment(SwingConstants.CENTER);
		lblMemberId.setBounds(55, 98, 257, 47);
		add(lblMemberId);
		
		JLabel lblPin = new JLabel("Pin:");
		lblPin.setHorizontalAlignment(SwingConstants.CENTER);
		lblPin.setFont(new Font("Candara", Font.PLAIN, 16));
		lblPin.setBounds(55, 207, 257, 47);
		add(lblPin);
		
		textFieldMemberId = new JTextField();
		textFieldMemberId.setBounds(348, 98, 213, 47);
		add(textFieldMemberId);
		textFieldMemberId.setColumns(10);
		

		passwordFieldPin = new JPasswordField();
		passwordFieldPin.setBounds(348, 207, 213, 47);
		add(passwordFieldPin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	
				String memberid = textFieldMemberId.getText();
				String pin = passwordFieldPin.getText();
				
				if(memberid ==null && pin ==null)
					JOptionPane.showMessageDialog(null, "*Input Id and pin fields");
				else{
					
				Member m1 = new Member();
				m1.setMemberid(memberid);
				m1.setPin(pin);
				try {
					boolean created = m1.createMember();
					if(created == true){
					JOptionPane.showMessageDialog(null, "Member has been added");
					}
					else{
						JOptionPane.showMessageDialog(null,"Member has not been addded");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
				}
			}
		});
		btnRegister.setBounds(178, 321, 152, 52);
		add(btnRegister);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(348, 321, 152, 52);
		add(btnCancel);
		

		
	}
}
