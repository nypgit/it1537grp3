/*******************************************************************************
 * Program Name: 			FnBDelivery
 * Purpose:					allow member to choose where to deliver the food 
 * Name of Author:			Deane
 * Admin No. of Author:		123188G
 * Module Group: 			IS1201
 * *****************************************************************************/
package jday.ui.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import jday.entities.FnB;
import jday.entities.Member;
import jday.util.BackgroundPanel;

public class FnBDelivery extends BackgroundPanel{


	private JTextField tfRoom;
	private JTextField tfKRoom;

	public FnBDelivery() {
		super();
}

	
	public FnBDelivery(JFrame f, final ArrayList<FnB> fnb, Member mem){
		this();
		myFrame = f;
		final ArrayList<FnB>Fnb = new ArrayList<FnB>();
		this.m = mem;
	
		
		setSize(750,500);
		setLayout(null);
		
		JLabel lbl = new JLabel("Please choose the venue for us to deliver your food.");
		lbl.setFont(new Font("Candara", Font.BOLD, 16));
		lbl.setForeground(new Color(0, 0, 0));
		lbl.setBounds(185, 100, 706, 53);
		add(lbl);
		
		final JRadioButton rdbtnRoom = new JRadioButton("Room");
		rdbtnRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tfKRoom.setText("");
				tfKRoom.setEditable(false);
				tfRoom.setEditable(true);

			}
		});
		rdbtnRoom.setFont(new Font("Candara", Font.PLAIN, 16));
		rdbtnRoom.setForeground(new Color(0, 0, 0));
		rdbtnRoom.setOpaque(false);
		rdbtnRoom.setBounds(256, 161, 143, 41);
		add(rdbtnRoom);
		
		final JRadioButton rdbtnKaraokeRoom = new JRadioButton("Karaoke Room");
		rdbtnKaraokeRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfRoom.setText("");
				tfRoom.setEditable(false);
				tfKRoom.setEditable(true);

			}
		});
		rdbtnKaraokeRoom.setFont(new Font("Candara", Font.PLAIN, 16));
		rdbtnKaraokeRoom.setForeground(new Color(0, 0, 0));
		rdbtnKaraokeRoom.setOpaque(false);
		rdbtnKaraokeRoom.setBounds(256, 227, 143, 41);
		add(rdbtnKaraokeRoom);
		
		final JRadioButton rdbtnPool = new JRadioButton("Pool");
		rdbtnPool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			tfRoom.setEditable(false);
			tfRoom.setText("");
			tfKRoom.setEditable(false);
			tfKRoom.setText("");

			}
		});
		rdbtnPool.setOpaque(false);
		rdbtnPool.setForeground(Color.BLACK);
		rdbtnPool.setFont(new Font("Candara", Font.PLAIN, 16));
		rdbtnPool.setBounds(256, 294, 143, 41);
		add(rdbtnPool);
		
		final ButtonGroup btnGrp = new ButtonGroup();
		btnGrp.add(rdbtnRoom);
		btnGrp.add(rdbtnKaraokeRoom);
		btnGrp.add(rdbtnPool);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setOpaque(false);
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					
				for(int i=0; i<fnb.size();i++){
					FnB fnb1 = fnb.get(i);
					
					if(rdbtnRoom.isSelected())
						fnb1.setVenue(rdbtnRoom.getText()+" "+tfRoom.getText());
				
					else if(rdbtnKaraokeRoom.isSelected())
						fnb1.setVenue(rdbtnKaraokeRoom.getText()+" "+tfKRoom.getText());
					
					else if(rdbtnPool.isSelected())
						fnb1.setVenue(rdbtnPool.getText());
				}
				
				for(int i=0; i<fnb.size();i++){
					FnB fnb1 = fnb.get(i);
					fnb1.createOrder(fnb1,m);
				}
				JPanel panel = new FnBConfirmation(myFrame,m,fnb);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
			}
		});
		btnConfirm.setForeground(new Color(0, 0, 0));
		btnConfirm.setFont(new Font("Candara", Font.PLAIN, 16));
		btnConfirm.setBounds(535, 440, 95, 30);
		add(btnConfirm);
		
		tfRoom = new JTextField();
		tfRoom.setFont(new Font("Candara", Font.PLAIN, 16));
		tfRoom.setForeground(new Color(0, 0, 0));
		tfRoom.setEditable(false);
		tfRoom.setBounds(401, 169, 116, 22);
		add(tfRoom);
		tfRoom.setColumns(10);
		
		tfKRoom = new JTextField();
		tfKRoom.setForeground(Color.BLACK);
		tfKRoom.setFont(new Font("Candara", Font.PLAIN, 16));
		tfKRoom.setEditable(false);
		tfKRoom.setColumns(10);
		tfKRoom.setBounds(401, 235, 116, 22);
		add(tfKRoom);
		
		JButton btnBack = new JButton("Back");
		btnBack.setOpaque(false);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JPanel panel = new FnBMain(myFrame,m);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Candara", Font.PLAIN, 16));
		btnBack.setBounds(400, 440, 95, 30);
		add(btnBack);
		
		JLabel lblDelivery = new JLabel("Delivery");
		lblDelivery.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblDelivery.setForeground(new Color(0, 0, 0));
		lblDelivery.setBounds(500, 5, 228, 39);
		add(lblDelivery);

		
		
	}
}
