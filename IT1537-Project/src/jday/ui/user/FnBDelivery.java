package jday.ui.user;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import jday.util.BackgroundPanel;

public class FnBDelivery extends BackgroundPanel{


	private JTextField tfRoom;
	private JTextField tfKRoom;
	
	public FnBDelivery() {
		super();
		initialize();
	}
	
	public FnBDelivery(JFrame f){
		this();
		myFrame = f;
	}
	
	private void initialize(){
		setSize(750,500);
		setLayout(null);
		
		JLabel lbl = new JLabel("Please choose the venue for us to deliver your food.");
		lbl.setFont(new Font("Candara", Font.BOLD, 16));
		lbl.setForeground(new Color(0, 0, 0));
		lbl.setBounds(12, 24, 706, 53);
		add(lbl);
		
		JRadioButton rdbtnRoom = new JRadioButton("Room");
		rdbtnRoom.setFont(new Font("Candara", Font.PLAIN, 16));
		rdbtnRoom.setForeground(new Color(0, 0, 0));
		rdbtnRoom.setOpaque(false);
		rdbtnRoom.setBounds(30, 122, 143, 41);
		add(rdbtnRoom);
		
		JRadioButton rdbtnKaraokeRoom = new JRadioButton("Karaoke Room");
		rdbtnKaraokeRoom.setFont(new Font("Candara", Font.PLAIN, 16));
		rdbtnKaraokeRoom.setForeground(new Color(0, 0, 0));
		rdbtnKaraokeRoom.setOpaque(false);
		rdbtnKaraokeRoom.setBounds(30, 188, 143, 41);
		add(rdbtnKaraokeRoom);
		
		JRadioButton rdbtnPool = new JRadioButton("Pool");
		rdbtnPool.setOpaque(false);
		rdbtnPool.setForeground(Color.BLACK);
		rdbtnPool.setFont(new Font("Candara", Font.PLAIN, 16));
		rdbtnPool.setBounds(30, 255, 143, 41);
		add(rdbtnPool);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new FnBConfirmation(myFrame);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
			}
		});
		btnConfirm.setForeground(new Color(0, 0, 0));
		btnConfirm.setFont(new Font("Candara", Font.PLAIN, 16));
		btnConfirm.setBounds(244, 325, 95, 41);
		add(btnConfirm);
		
		tfRoom = new JTextField();
		tfRoom.setFont(new Font("Candara", Font.PLAIN, 16));
		tfRoom.setForeground(new Color(0, 0, 0));
		tfRoom.setEditable(false);
		tfRoom.setBounds(175, 130, 116, 22);
		add(tfRoom);
		tfRoom.setColumns(10);
		
		tfKRoom = new JTextField();
		tfKRoom.setForeground(Color.BLACK);
		tfKRoom.setFont(new Font("Candara", Font.PLAIN, 16));
		tfKRoom.setEditable(false);
		tfKRoom.setColumns(10);
		tfKRoom.setBounds(175, 196, 116, 22);
		add(tfKRoom);

		
		
	}
}
