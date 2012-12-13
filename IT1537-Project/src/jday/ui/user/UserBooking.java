package jday.ui.user;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import jday.entities.Member;
import jday.util.BackgroundPanel;

public class UserBooking extends BackgroundPanel {

	/**
	 * Create the panel.
	 */
	public UserBooking() {
		super();
		initialize();
	}
	
	public UserBooking(JFrame f, Member m){
		this();
		myFrame = f;
		this.m = m;
	}
	
	private void initialize(){
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Arial", Font.PLAIN, 14));
		setBackground(new Color(204, 51, 153));
		setSize(new Dimension(750, 500));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(10, 113, 730, 152);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Service:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(44, 31, 95, 28);
		panel.add(lblNewLabel);
		
		JLabel lblVenue = new JLabel("Venue:");
		lblVenue.setHorizontalAlignment(SwingConstants.CENTER);
		lblVenue.setForeground(new Color(0, 0, 0));
		lblVenue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVenue.setBounds(44, 97, 95, 28);
		panel.add(lblVenue);
		
		JLabel lblFrom = new JLabel("From:");
		lblFrom.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrom.setForeground(new Color(0, 0, 0));
		lblFrom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFrom.setBounds(413, 31, 95, 28);
		panel.add(lblFrom);
		
		JLabel lblTo = new JLabel("To:");
		lblTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo.setForeground(new Color(0, 0, 0));
		lblTo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTo.setBounds(413, 97, 95, 28);
		panel.add(lblTo);
		
		JLabel lblNewLabel_1 = new JLabel("Day Care");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(153, 51, 153));
		lblNewLabel_1.setForeground(new Color(255, 204, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(149, 25, 172, 40);
		panel.add(lblNewLabel_1);
		
		JLabel lblActivityRoom = new JLabel("Activity Room");
		lblActivityRoom.setOpaque(true);
		lblActivityRoom.setHorizontalAlignment(SwingConstants.CENTER);
		lblActivityRoom.setForeground(new Color(255, 204, 255));
		lblActivityRoom.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblActivityRoom.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		lblActivityRoom.setBackground(new Color(153, 51, 153));
		lblActivityRoom.setBounds(149, 97, 172, 40);
		panel.add(lblActivityRoom);
		
		JLabel label_1 = new JLabel("0900");
		label_1.setOpaque(true);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(255, 204, 255));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		label_1.setBackground(new Color(153, 51, 153));
		label_1.setBounds(530, 25, 172, 40);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("2100");
		label_2.setOpaque(true);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(255, 204, 255));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		label_2.setBackground(new Color(153, 51, 153));
		label_2.setBounds(530, 97, 172, 40);
		panel.add(label_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setOpaque(false);
		panel_1.setBounds(10, 294, 730, 152);
		add(panel_1);
		
		JLabel label = new JLabel("Service:");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(0, 0, 0));
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(44, 31, 95, 28);
		panel_1.add(label);
		
		JLabel label_3 = new JLabel("Venue:");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(new Color(0, 0, 0));
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_3.setBounds(44, 97, 95, 28);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("From:");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(new Color(0, 0, 0));
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_4.setBounds(413, 31, 95, 28);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("To:");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(new Color(0, 0, 0));
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_5.setBounds(413, 97, 95, 28);
		panel_1.add(label_5);
		
		JLabel lblTennis = new JLabel("Tennis");
		lblTennis.setOpaque(true);
		lblTennis.setHorizontalAlignment(SwingConstants.CENTER);
		lblTennis.setForeground(new Color(255, 204, 255));
		lblTennis.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTennis.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		lblTennis.setBackground(new Color(153, 51, 153));
		lblTennis.setBounds(149, 31, 172, 40);
		panel_1.add(lblTennis);
		
		JLabel lblTennisCourt = new JLabel("Tennis Court");
		lblTennisCourt.setOpaque(true);
		lblTennisCourt.setHorizontalAlignment(SwingConstants.CENTER);
		lblTennisCourt.setForeground(new Color(255, 204, 255));
		lblTennisCourt.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTennisCourt.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		lblTennisCourt.setBackground(new Color(153, 51, 153));
		lblTennisCourt.setBounds(149, 97, 172, 40);
		panel_1.add(lblTennisCourt);
		
		JLabel label_6 = new JLabel("1000");
		label_6.setOpaque(true);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(new Color(255, 204, 255));
		label_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_6.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		label_6.setBackground(new Color(153, 51, 153));
		label_6.setBounds(530, 31, 172, 40);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("1200");
		label_7.setOpaque(true);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(new Color(255, 204, 255));
		label_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_7.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		label_7.setBackground(new Color(153, 51, 153));
		label_7.setBounds(530, 97, 172, 40);
		panel_1.add(label_7);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 51));
		separator.setBounds(20, 276, 730, 7);
		add(separator);
		
		JLabel lblBookings = new JLabel("Bookings");
		lblBookings.setForeground(new Color(0, 0, 0));
		lblBookings.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblBookings.setBounds(42, 25, 207, 50);
		add(lblBookings);

	}
}
