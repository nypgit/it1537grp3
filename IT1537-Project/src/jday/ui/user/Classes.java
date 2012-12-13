package jday.ui.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import jday.entities.Class;
import jday.entities.Member;
import jday.util.BackgroundPanel;

public class Classes extends BackgroundPanel{



	private Member m;
	
	public Classes() {
		super();
		initialize();
	}
	
	public Classes(JFrame f){
		this();
		myFrame = f;
	}
	
	public Classes(JFrame f,Member m){
		super();
		myFrame = f;
		this.m = m;
		initialize();
	}
	private void initialize(){
		setSize(750,500);
		setLayout(null);

		
		JLabel lblClass = new JLabel("Class");
		lblClass.setForeground(new Color(0, 0, 0));
		lblClass.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblClass.setFont(new Font("Candara", Font.BOLD, 20));
		lblClass.setHorizontalAlignment(SwingConstants.CENTER);
		lblClass.setBounds(42, 13, 261, 42);
		add(lblClass);
		
		JLabel lblInformation = new JLabel("Information");
		lblInformation.setForeground(new Color(0, 0, 0));
		lblInformation.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformation.setFont(new Font("Candara", Font.BOLD, 20));
		lblInformation.setBounds(303, 13, 346, 42);
		add(lblInformation);
		
		JLabel lblYoga = new JLabel("Yoga");
		lblYoga.setForeground(new Color(0, 0, 0));
		lblYoga.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblYoga.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 24));
		lblYoga.setHorizontalAlignment(SwingConstants.CENTER);
		lblYoga.setBounds(42, 55, 261, 186);
		add(lblYoga);

		JLabel lblChess = new JLabel("Chess");
		lblChess.setHorizontalAlignment(SwingConstants.CENTER);
		lblChess.setForeground(Color.BLACK);
		lblChess.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 24));
		lblChess.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblChess.setBounds(42, 241, 261, 186);
		add(lblChess);
		
		JButton btnYogaRegister = new JButton("Register");
		btnYogaRegister.setForeground(new Color(0, 0, 0));
		btnYogaRegister.setFont(new Font("Candara", Font.PLAIN, 16));
		btnYogaRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Class c1 = new Class();
				c1.setClasstype("Yoga");
				JPanel panel = new ClassesRegister(myFrame,m,c1);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
			}
		});
		btnYogaRegister.setOpaque(false);
		btnYogaRegister.setBounds(542, 208, 99, 29);
		add(btnYogaRegister);
		
		JButton btnChessRegister = new JButton("Register");
		btnChessRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Class c1 = new Class();
				c1.setClasstype("Chess");
				JPanel panel = new ClassesRegister(myFrame,m,c1);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
			}
		});
		btnChessRegister.setOpaque(false);
		btnChessRegister.setForeground(new Color(0, 0, 0));
		btnChessRegister.setFont(new Font("Candara", Font.PLAIN, 16));
		btnChessRegister.setBounds(542, 391, 99, 29);
		add(btnChessRegister);
		
		
		JTextPane txtpnDescriptionYoga = new JTextPane();
		txtpnDescriptionYoga.setForeground(new Color(0, 0, 0));
		txtpnDescriptionYoga.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtpnDescriptionYoga.setFont(new Font("Candara", Font.PLAIN, 16));
		txtpnDescriptionYoga.setOpaque(false);
		txtpnDescriptionYoga.setEditable(false);
		txtpnDescriptionYoga.setText(" Description: Yoga brings the mind, body and spirit.\r\n\r\n Fees: $65 per month; $25 per session\r\n\r\n Timing: Tuesdays, 9:30am to 10:30am \r\n\r\n Venue: Island Dance Studio");
		txtpnDescriptionYoga.setBounds(303, 55, 346, 186);
		add(txtpnDescriptionYoga);
		
		
		JTextPane txtpnChess = new JTextPane();
		txtpnChess.setOpaque(false);
		txtpnChess.setEditable(false);
		txtpnChess.setText(" Description: Chess exercises the mind.\r\n\r\n Fees: $60 per hour\r\n\r\n Timing: For members to decide \r\n\r\n Venue: Island Game Room");
		txtpnChess.setForeground(new Color(0, 0, 0));
		txtpnChess.setFont(new Font("Candara", Font.PLAIN, 16));
		txtpnChess.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtpnChess.setBounds(303, 241, 346, 186);
		add(txtpnChess);


	}
}
