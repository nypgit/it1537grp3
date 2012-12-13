package jday.ui.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import jday.util.BackgroundPanel;

public class FnBViewOrder extends BackgroundPanel {

	
	public FnBViewOrder() {
		super();
		initialize();
	}
	public FnBViewOrder(JFrame f) {
		this();
		myFrame = f;
	}
	
	private void initialize(){
		setSize(750,500);
		setLayout(null);
		
		JButton btnClose = new JButton("close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new FnBMain(myFrame);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
			}
		});
		btnClose.setOpaque(false);
		btnClose.setFont(new Font("Candara", Font.PLAIN, 16));
		btnClose.setForeground(new Color(0, 0, 0));
		btnClose.setBounds(298, 354, 89, 23);
		add(btnClose);
		
		JTextPane txtpnFoodAndDrinks = new JTextPane();
		txtpnFoodAndDrinks.setForeground(new Color(0, 0, 0));
		txtpnFoodAndDrinks.setFont(new Font("Calibri", Font.PLAIN, 16));
		txtpnFoodAndDrinks.setText("Food and drinks that have been ordered:\r\n\r\n1.\tMushroom Soup\r\n\r\n2.\tChicken Cutlet\r\n\r\n3.\tCheesecake");
		txtpnFoodAndDrinks.setOpaque(false);
		txtpnFoodAndDrinks.setEditable(false);
		txtpnFoodAndDrinks.setBounds(37, 67, 350, 310);
		add(txtpnFoodAndDrinks);
	}



}
