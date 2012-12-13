package jday.ui.user;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import jday.util.BackgroundPanel;

public class FnBConfirmation extends BackgroundPanel {


	public FnBConfirmation() {
		super();
		initialize();
	}

	public FnBConfirmation(JFrame f) {
		this();
		myFrame = f;
		
	}
	
	private void initialize(){
		setSize(750,500);
		setLayout(null);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new FnBMain(myFrame);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
				
			}
		});
		btnNewButton.setOpaque(false);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(316, 309, 89, 23);
		add(btnNewButton);
		
		JTextPane txtpnDearMemberYou = new JTextPane();
		txtpnDearMemberYou.setBorder(new LineBorder(new Color(123, 104, 238), 4));
		txtpnDearMemberYou.setText("Dear member, you have ordered the following:\r\n\r\n1.\tMushroom Soup\r\n2.\tChicken Cutlet\r\n\t\r\n\t\t\t\t\t\t\t\tYour ordering No. is 5634A\r\n\t\t\t\t\t\t\t\tYour food will be ready in 20 minutes\r\n\t\r\n\t\t\t\t\t\t\t\t\t\t\tThank you\r\n\t\t\t\t\t\t\t\t\t\t\t\t\tfor your order");
		txtpnDearMemberYou.setOpaque(false);
		txtpnDearMemberYou.setEditable(false);
		txtpnDearMemberYou.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtpnDearMemberYou.setForeground(new Color(0, 0, 0));
		txtpnDearMemberYou.setBounds(53, 32, 387, 341);
		add(txtpnDearMemberYou);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(58, 233, 382, 2);
		add(separator);
	}
}
