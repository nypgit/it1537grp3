package jday.ui.user;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import jday.entities.Member;
import jday.util.BackgroundPanel;


public class Golfing4 extends BackgroundPanel {

	/**
	 * Create the panel.
	 */
	public Golfing4() {
		super();
		initialize();
	}
	
	public Golfing4(JFrame f,Member m){
		this();
		myFrame = f;
		this.m = m;
	}
	
	private void initialize(){
		setSize(new Dimension(750, 500));
		setLayout(null);
		
		JLabel label = new JLabel("Time:");
		label.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		label.setBounds(71, 171, 57, 23);
		add(label);
		
		JRadioButton radioButton = new JRadioButton("Morning");
		radioButton.setOpaque(false);
		radioButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton.setBounds(120, 218, 109, 23);
		add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Afternoon");
		radioButton_1.setOpaque(false);
		radioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_1.setBounds(120, 264, 109, 23);
		add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Evening");
		radioButton_2.setOpaque(false);
		radioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_2.setBounds(120, 313, 109, 23);
		add(radioButton_2);
		
		JLabel label_1 = new JLabel("Green Fees:");
		label_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		label_1.setBounds(363, 167, 102, 31);
		add(label_1);
		
		JRadioButton radioButton_3 = new JRadioButton("9 Holes");
		radioButton_3.setOpaque(false);
		radioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_3.setBounds(448, 218, 102, 23);
		add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("18 Holes");
		radioButton_4.setOpaque(false);
		radioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_4.setBounds(448, 282, 102, 23);
		add(radioButton_4);
		
		JButton button = new JButton("Back");
		button.setBounds(546, 447, 79, 23);
		add(button);
		
		JButton button_1 = new JButton("Confirm");
		button_1.setBounds(624, 391, 79, 23);
		add(button_1);
		
		JLabel lblPleaseChooseThe = new JLabel("Please choose the time and Green fees");
		lblPleaseChooseThe.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblPleaseChooseThe.setBounds(71, 87, 329, 23);
		add(lblPleaseChooseThe);

	}

}
