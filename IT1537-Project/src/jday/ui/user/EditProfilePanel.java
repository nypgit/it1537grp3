/*******************************************************************************
 * Program Name: 			EditProfilePanel
 * Purpose:					edit profile
 * Name of Author:			Deane
 * Admin No. of Author:		123188G
 * Module Group: 			IS1201
 * *****************************************************************************/
package jday.ui.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import jday.entities.Admin;
import jday.entities.KitchenAdmin;
import jday.entities.Member;
import jday.ui.admin.AMainpage;
import jday.ui.admin.AdminMainframe;
import jday.ui.admin.Kitchen;
import jday.util.BackgroundPanel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EditProfilePanel extends BackgroundPanel {
	
	private Member m = null;
	private JTextField tfName;
	private JTextField tfBirthdate;
	private JTextField tfContactNoH;
	private JTextField tfContactNoM;
	private JTextField tfEmail;
	private JTextField tfMemberID;
	private JTextField tfAddress;
	private JLabel lblNameError;
	private JLabel lblContactError;
	private JLabel lblEmailError;
	private JLabel lblErrorMessage;
	private JLabel label;
	public EditProfilePanel(){
		super();
		initialize();
	}
	
	public EditProfilePanel(JFrame f, Member m){
		super();
		myFrame = f;
		this.m = m;
		this.m.retrieveMemberInfo();
		initialize();
	}
	
	private void initialize(){
		setSize(750,500);
		setLayout(null);
		
		JLabel lblCheckingOfParticulars = new JLabel("Checking of particulars");
		lblCheckingOfParticulars.setHorizontalAlignment(SwingConstants.CENTER);
		lblCheckingOfParticulars.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCheckingOfParticulars.setForeground(new Color(0, 0, 0));
		lblCheckingOfParticulars.setBounds(435, 5, 253, 45);
		add(lblCheckingOfParticulars);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Candara", Font.PLAIN, 16));
		lblName.setBounds(60, 207, 178, 36);
		add(lblName);
		
		JLabel lblBirthdate = new JLabel("Birthdate:");
		lblBirthdate.setHorizontalAlignment(SwingConstants.CENTER);
		lblBirthdate.setFont(new Font("Candara", Font.PLAIN, 16));
		lblBirthdate.setBounds(60, 254, 178, 36);
		add(lblBirthdate);
		
		JLabel lblContactNoh = new JLabel("Contact No (H):");
		lblContactNoh.setHorizontalAlignment(SwingConstants.CENTER);
		lblContactNoh.setFont(new Font("Candara", Font.PLAIN, 16));
		lblContactNoh.setBounds(60, 348, 178, 36);
		add(lblContactNoh);
		
		JLabel lblContactNom = new JLabel("Contact No (M):");
		lblContactNom.setHorizontalAlignment(SwingConstants.CENTER);
		lblContactNom.setFont(new Font("Candara", Font.PLAIN, 16));
		lblContactNom.setBounds(60, 301, 178, 36);
		add(lblContactNom);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("Candara", Font.PLAIN, 16));
		lblEmail.setBounds(369, 257, 178, 36);
		add(lblEmail);
		
		JLabel lblMemberId = new JLabel("Member ID:");
		lblMemberId.setHorizontalAlignment(SwingConstants.CENTER);
		lblMemberId.setFont(new Font("Candara", Font.PLAIN, 16));
		lblMemberId.setBounds(369, 207, 178, 36);
		add(lblMemberId);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setFont(new Font("Candara", Font.PLAIN, 16));
		lblAddress.setBounds(369, 304, 178, 36);
		add(lblAddress);
		
		lblNameError = new JLabel("");
		lblNameError.setFont(new Font("Candara", Font.PLAIN, 16));
		lblNameError.setForeground(new Color(255, 0, 0));
		lblNameError.setBounds(316, 92, 330, 20);
		add(lblNameError);
		
		lblContactError = new JLabel("");
		lblContactError.setFont(new Font("Candara", Font.PLAIN, 16));
		lblContactError.setForeground(new Color(255, 0, 0));
		lblContactError.setBounds(316, 123, 330, 20);
		add(lblContactError);
		
		lblEmailError = new JLabel("");
		lblEmailError.setForeground(new Color(255, 0, 0));
		lblEmailError.setFont(new Font("Candara", Font.PLAIN, 16));
		lblEmailError.setBounds(316, 154, 330, 20);
		add(lblEmailError);
		
		lblErrorMessage = new JLabel("");
		lblErrorMessage.setFont(new Font("Candara", Font.PLAIN, 16));
		lblErrorMessage.setForeground(new Color(255, 0, 0));
		lblErrorMessage.setBounds(316, 61, 330, 20);
		add(lblErrorMessage);
		
		tfName = new JTextField();
		tfName.setFont(new Font("Candara", Font.PLAIN, 16));
		tfName.setForeground(new Color(0, 0, 0));
		tfName.setBounds(212, 207, 198, 36);
		tfName.setColumns(10);
		tfName.setText(m.getName());
		add(tfName);


		
		tfBirthdate = new JTextField();
		tfBirthdate.setForeground(Color.BLACK);
		tfBirthdate.setFont(new Font("Candara", Font.PLAIN, 16));
		tfBirthdate.setColumns(10);
		tfBirthdate.setBounds(212, 254, 198, 36);
		tfBirthdate.setText(m.getBirthdate());
		add(tfBirthdate);
		
		tfContactNoH = new JTextField();
		tfContactNoH.setForeground(Color.BLACK);
		tfContactNoH.setFont(new Font("Candara", Font.PLAIN, 16));
		tfContactNoH.setColumns(10);
		tfContactNoH.setBounds(212, 349, 198, 36);
		tfContactNoH.setText(Integer.toString(m.getContactnoH()));
        tfContactNoH.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                    char ch = e.getKeyChar();
                    if ((ch >= '0' && ch <= '9')|| ch =='\b') {
                            tfContactNoH.setEditable(true);
                    } else {
                            tfContactNoH.setEditable(false);
                            tfContactNoH.setText("0");
                            lblErrorMessage.setText("Only numbers can be input");
                            
                    }
            }
    });
		add(tfContactNoH);
		
		tfContactNoM = new JTextField();
		tfContactNoM.setForeground(Color.BLACK);
		tfContactNoM.setFont(new Font("Candara", Font.PLAIN, 16));
		tfContactNoM.setColumns(10);
		tfContactNoM.setBounds(212, 301, 198, 36);
		tfContactNoM.setText(Integer.toString(m.getContactnoM()));
        tfContactNoM.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                    char ch = e.getKeyChar();
                    if ((ch >= '0' && ch <= '9')|| ch =='\b') {
                            tfContactNoM.setEditable(true);
                    } else {
                            tfContactNoM.setEditable(false);
                            tfContactNoM.setText("0");
                            lblErrorMessage.setText("Only numbers can be input");
                            
                    }
            }
    });
		add(tfContactNoM);
		
		tfEmail = new JTextField();
		tfEmail.setForeground(Color.BLACK);
		tfEmail.setFont(new Font("Candara", Font.PLAIN, 16));
		tfEmail.setColumns(10);
		tfEmail.setBounds(512, 258, 198, 36);
		tfEmail.setText(m.getEmail());
		add(tfEmail);
		
		tfMemberID = new JTextField();
		tfMemberID.setEditable(false);
		tfMemberID.setForeground(Color.BLACK);
		tfMemberID.setFont(new Font("Candara", Font.PLAIN, 16));
		tfMemberID.setColumns(10);
		tfMemberID.setBounds(512, 210, 198, 36);
		tfMemberID.setText(m.getMemberid());
		add(tfMemberID);
		
		tfAddress = new JTextField();
		tfAddress.setForeground(Color.BLACK);
		tfAddress.setFont(new Font("Candara", Font.PLAIN, 16));
		tfAddress.setColumns(10);
		tfAddress.setBounds(512, 312, 198, 56);
		tfAddress.setText(m.getAddress());
		add(tfAddress);
		
		
		JButton btnEdit = new JButton("edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tfName.getText().equals(""))
					lblNameError.setText("Name cannot be blank");
				if(Integer.parseInt(tfContactNoH.getText()) == 0)
					lblContactError.setText("Contact number cannot be blank");
				if(tfEmail.getText().equals(""))
					lblEmailError.setText("Email cannot be blank");

				m.setName(tfName.getText());
				m.setBirthdate(tfBirthdate.getText());
				m.setContactnoH(Integer.parseInt(tfContactNoH.getText()));
				m.setContactnoM(Integer.parseInt(tfContactNoM.getText()));
				m.setEmail(tfEmail.getText());
				m.setAddress(tfAddress.getText());
				if(tfName.getText()!="" && Integer.parseInt(tfContactNoH.getText())!=0 && tfEmail.getText()!=""){
				try {
					boolean b = m.updateMemberInfo();
					if(b = false)
						JOptionPane.showMessageDialog(null, "Profile has not been changed");
					if(b = true)
						JOptionPane.showMessageDialog(null, "Profile has been changed");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
			}
		});
		btnEdit.setOpaque(false);
		btnEdit.setFont(new Font("Candara", Font.PLAIN, 16));
		btnEdit.setForeground(new Color(0, 0, 0));
		btnEdit.setBounds(458, 405, 89, 23);
		add(btnEdit);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(myFrame instanceof LoginFrame){
				myFrame.setVisible(false);
				JFrame myFrame = new MainFrame(m);
				myFrame.setVisible(true);
				}
				
				else if(myFrame instanceof MainFrame){
					JPanel panel = new EventCalendar(myFrame,m);
					myFrame.getContentPane().removeAll();
					myFrame.getContentPane().add(panel);
					myFrame.getContentPane().validate();
					myFrame.getContentPane().repaint();
				}
				
				else if(myFrame instanceof AdminMainframe){
					if(m instanceof Admin){
						JPanel panel = new AMainpage(myFrame,m);
						myFrame.getContentPane().removeAll();
						myFrame.getContentPane().add(panel);
						myFrame.getContentPane().validate();
						myFrame.getContentPane().repaint();
					}
					
					else if(m instanceof KitchenAdmin){
						JPanel panel = new Kitchen(myFrame);
						myFrame.getContentPane().removeAll();
						myFrame.setContentPane(panel);
						myFrame.setVisible(false);
						myFrame.getContentPane().validate();
						myFrame.getContentPane().repaint();
						myFrame.setVisible(true);
					
					}
				}
			}
		});
		btnConfirm.setOpaque(false);
		btnConfirm.setForeground(Color.BLACK);
		btnConfirm.setFont(new Font("Candara", Font.PLAIN, 16));
		btnConfirm.setBounds(557, 405, 89, 23);
		add(btnConfirm);
		
		label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(myFrame instanceof LoginFrame){
					JPanel panel = new LoginPage(myFrame);
					myFrame.getContentPane().removeAll();
					myFrame.getContentPane().add(panel);
					myFrame.getContentPane().validate();
					myFrame.getContentPane().repaint();
				}
				else if(myFrame instanceof MainFrame){
					JPanel panel = new EventCalendar(myFrame,m);
					myFrame.getContentPane().removeAll();
					myFrame.getContentPane().add(panel);
					myFrame.getContentPane().validate();
					myFrame.getContentPane().repaint();
				}
				
				else if(myFrame instanceof AdminMainframe){
					if(m instanceof Admin){
					JPanel panel = new AMainpage(myFrame,m);
					myFrame.getContentPane().removeAll();
					myFrame.getContentPane().add(panel);
					myFrame.getContentPane().validate();
					myFrame.getContentPane().repaint();
					}
					
					else if(m instanceof KitchenAdmin){
						JPanel panel = new Kitchen(myFrame);
						myFrame.getContentPane().removeAll();
						myFrame.setContentPane(panel);
						myFrame.setVisible(false);
						myFrame.getContentPane().validate();
						myFrame.getContentPane().repaint();
						myFrame.setVisible(true);
					}
				}
					

			}
		});
		label.setIcon(new ImageIcon(EditProfilePanel.class.getResource("/images/110jday_logo.png")));
		label.setBounds(77, 39, 132, 127);
		add(label);
		

		
		
	}

}
