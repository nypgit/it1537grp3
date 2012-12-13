package jday.ui.user;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import jday.util.BackgroundPanel;

public class DayCare3 extends BackgroundPanel {

	private JFrame myFrame = null;
	/**
	 * Create the panel.
	 */
	public DayCare3() {
		super();
		initialize();
	}
	
	public DayCare3(JFrame f){
		this();
		myFrame = f;
	}
	private void initialize(){
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Arial", Font.PLAIN, 14));
		setBackground(new Color(204, 51, 153));
		setSize(new Dimension(750, 500));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setFont(new Font("Arial", Font.PLAIN, 16));
		panel.setBounds(10, 22, 730, 467);
		add(panel);
		panel.setLayout(null);
		
		JTextPane txtpnDearMemberYou = new JTextPane();
		txtpnDearMemberYou.setEditable(false);
		txtpnDearMemberYou.setForeground(new Color(0, 0, 0));
		txtpnDearMemberYou.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtpnDearMemberYou.setText("Dear member, you have booked the following time:");
		txtpnDearMemberYou.setOpaque(false);
		txtpnDearMemberYou.setBounds(71, 51, 588, 49);
		panel.add(txtpnDearMemberYou);
		
		JLabel lblNewLabel = new JLabel("From:");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(147, 111, 111, 41);
		panel.add(lblNewLabel);
		
		JLabel lblTo = new JLabel("To:");
		lblTo.setForeground(new Color(0, 0, 0));
		lblTo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTo.setBounds(170, 163, 111, 41);
		panel.add(lblTo);
		
		JLabel lblVenue = new JLabel("Venue:");
		lblVenue.setForeground(new Color(0, 0, 0));
		lblVenue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVenue.setBounds(137, 215, 111, 41);
		panel.add(lblVenue);
		
		JLabel lblNewLabel_1 = new JLabel("0900");
		lblNewLabel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(51, 0, 51)));
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(153, 51, 153));
		lblNewLabel_1.setForeground(new Color(255, 204, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(262, 111, 205, 41);
		panel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("2100");
		label.setOpaque(true);
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(255, 204, 255));
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(51, 0, 51)));
		label.setBackground(new Color(153, 51, 153));
		label.setBounds(262, 163, 205, 41);
		panel.add(label);
		
		JLabel lblActivitiesRoom = new JLabel("Story-telling Room");
		lblActivitiesRoom.setOpaque(true);
		lblActivitiesRoom.setHorizontalTextPosition(SwingConstants.CENTER);
		lblActivitiesRoom.setHorizontalAlignment(SwingConstants.CENTER);
		lblActivitiesRoom.setForeground(new Color(255, 204, 255));
		lblActivitiesRoom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblActivitiesRoom.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(51, 0, 51)));
		lblActivitiesRoom.setBackground(new Color(153, 51, 153));
		lblActivitiesRoom.setBounds(262, 215, 205, 41);
		panel.add(lblActivitiesRoom);
		
		JLabel lblNewLabel_2 = new JLabel("Your booking No. is :");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(388, 296, 170, 41);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("5639");
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3.setBounds(548, 293, 111, 41);
		panel.add(lblNewLabel_3);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(51, 0, 51));
		separator.setBounds(10, 348, 710, 18);
		panel.add(separator);
		
		JLabel lblNewLabel_4 = new JLabel("Thank you");
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_4.setBounds(383, 366, 241, 41);
		panel.add(lblNewLabel_4);
		
		JLabel lblForYouBooking = new JLabel("for your booking");
		lblForYouBooking.setHorizontalAlignment(SwingConstants.CENTER);
		lblForYouBooking.setForeground(new Color(0, 0, 0));
		lblForYouBooking.setFont(new Font("Tahoma", Font.ITALIC, 21));
		lblForYouBooking.setBounds(418, 396, 241, 41);
		panel.add(lblForYouBooking);

	}
}
