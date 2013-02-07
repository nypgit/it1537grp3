/*******************************************************************************
 * Program Name: 			Rooms
 * Purpose:					view room 
 * Name of Author:			Junaidi
 * Admin No. of Author:		123588N
 * Module Group: 			IS1201
 * *****************************************************************************/
package jday.ui.user;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import jday.entities.Member;
import jday.util.BackgroundPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Rooms extends BackgroundPanel {

	/**
	 * Create the panel.
	 */
	public Rooms() {
		super();
		initialize();
	}
	
	public Rooms(JFrame f, Member m){
		this();
		myFrame = f;
		this.m = m;
		initialize();
	}
	
	private void initialize(){
		setFont(new Font("Arial", Font.PLAIN, 14));
		setBackground(new Color(204, 51, 153));
		setSize(new Dimension(750, 500));
		setLayout(null);
		
		//big pic
		final JLabel lblMainPic = new JLabel("");
		lblMainPic.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblMainPic.setIcon(new ImageIcon(Rooms.class.getResource("/images/meeting room.jpg")));
		lblMainPic.setOpaque(true);
		lblMainPic.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMainPic.setForeground(new Color(0, 0, 0));
		lblMainPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblMainPic.setBackground(new Color(240, 255, 255));
		lblMainPic.setBounds(304, 55, 200, 200);
		add(lblMainPic);
		
		//meeting room button
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblMainPic.setIcon(new ImageIcon(Packages.class.getResource("/images/meeting room.jpg")));
			}
		});
		btnNewButton.setIcon(new ImageIcon(Rooms.class.getResource("/images/meeting room resized.jpg")));
		btnNewButton.setMargin(new Insets(2, 0, 2, 0));
		btnNewButton.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setBounds(304, 266, 50, 50);
		add(btnNewButton);
		
		//activity room button
		JButton button = new JButton("");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblMainPic.setIcon(new ImageIcon(Packages.class.getResource("/images/activity room.jpg")));
			}
		});
		button.setIcon(new ImageIcon(Rooms.class.getResource("/images/activity room resized.jpg")));
		button.setMargin(new Insets(2, 0, 2, 0));
		button.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		button.setHorizontalTextPosition(SwingConstants.CENTER);
		button.setAlignmentX(0.5f);
		button.setBounds(376, 266, 50, 50);
		add(button);
		
		//multi purpose hall button
		JButton button_1 = new JButton("");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblMainPic.setIcon(new ImageIcon(Packages.class.getResource("/images/Multi-Purpose-Hall.jpg")));
			}
		});
		button_1.setIcon(new ImageIcon(Rooms.class.getResource("/images/Multi-Purpose-Hall resized.jpg")));
		button_1.setMargin(new Insets(2, 0, 2, 0));
		button_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		button_1.setHorizontalTextPosition(SwingConstants.CENTER);
		button_1.setAlignmentX(0.5f);
		button_1.setBounds(454, 266, 50, 50);
		add(button_1);
		
		JLabel lblRooms = new JLabel("Rooms");
		lblRooms.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblRooms.setForeground(new Color(255, 255, 255));
		lblRooms.setBackground(new Color(153, 51, 153));
		lblRooms.setFont(new Font("Arial", Font.BOLD, 15));
		lblRooms.setHorizontalTextPosition(SwingConstants.CENTER);
		lblRooms.setHorizontalAlignment(SwingConstants.CENTER);
		lblRooms.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblRooms.setOpaque(true);
		lblRooms.setBounds(89, 329, 100, 40);
		add(lblRooms);
		
		JLabel lblMeetingRm = new JLabel("\u2022\tMeeting Rooms");
		lblMeetingRm.setHorizontalAlignment(SwingConstants.LEFT);
		lblMeetingRm.setFont(new Font("Arial", Font.PLAIN, 14));
		lblMeetingRm.setForeground(new Color(0, 0, 0));
		lblMeetingRm.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMeetingRm.setBounds(89, 380, 129, 26);
		add(lblMeetingRm);
		
		JLabel lblActivityRm = new JLabel("\u2022\tActivity Rooms");
		lblActivityRm.setHorizontalTextPosition(SwingConstants.CENTER);
		lblActivityRm.setHorizontalAlignment(SwingConstants.LEFT);
		lblActivityRm.setForeground(new Color(0, 0, 0));
		lblActivityRm.setFont(new Font("Arial", Font.PLAIN, 14));
		lblActivityRm.setBounds(89, 417, 129, 26);
		add(lblActivityRm);
		
		JLabel lblHall = new JLabel("\u2022\tMulti-purpose Hall");
		lblHall.setHorizontalTextPosition(SwingConstants.CENTER);
		lblHall.setHorizontalAlignment(SwingConstants.LEFT);
		lblHall.setForeground(new Color(0, 0, 0));
		lblHall.setFont(new Font("Arial", Font.PLAIN, 14));
		lblHall.setBounds(89, 454, 129, 22);
		add(lblHall);
		
		JLabel lblPrices = new JLabel("Prices");
		lblPrices.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblPrices.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPrices.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrices.setForeground(new Color(255, 255, 255));
		lblPrices.setFont(new Font("Arial", Font.BOLD, 15));
		lblPrices.setOpaque(true);
		lblPrices.setBackground(new Color(153, 51, 153));
		lblPrices.setBounds(234, 329, 100, 40);
		add(lblPrices);
		
		JLabel lblMeetingPrice = new JLabel("$1000");
		lblMeetingPrice.setForeground(new Color(0, 0, 0));
		lblMeetingPrice.setFont(new Font("Arial", Font.PLAIN, 14));
		lblMeetingPrice.setBounds(248, 380, 106, 26);
		add(lblMeetingPrice);
		
		JLabel lblActivityPrice = new JLabel("$5000");
		lblActivityPrice.setFont(new Font("Arial", Font.PLAIN, 14));
		lblActivityPrice.setForeground(new Color(0, 0, 0));
		lblActivityPrice.setBounds(248, 417, 106, 26);
		add(lblActivityPrice);
		
		JLabel lblHallPrice = new JLabel("$10,000");
		lblHallPrice.setFont(new Font("Arial", Font.PLAIN, 14));
		lblHallPrice.setForeground(new Color(0, 0, 0));
		lblHallPrice.setBounds(248, 452, 106, 26);
		add(lblHallPrice);
		
		JLabel lblDesc = new JLabel("Description");
		lblDesc.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblDesc.setBackground(new Color(153, 51, 153));
		lblDesc.setOpaque(true);
		lblDesc.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDesc.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesc.setForeground(new Color(255, 255, 255));
		lblDesc.setFont(new Font("Arial", Font.BOLD, 15));
		lblDesc.setBounds(416, 327, 306, 40);
		add(lblDesc);
		
		JTextPane txtpnDescTxt = new JTextPane();
		txtpnDescTxt.setFont(new Font("Arial", Font.PLAIN, 14));
		txtpnDescTxt.setForeground(new Color(0, 0, 0));
		txtpnDescTxt.setOpaque(false);
		txtpnDescTxt.setText("Our rooms may be used for occasions such as off-site company meetings, functions and seminars. Please approach the receptionist to book these rooms or for further enquiries.");
		txtpnDescTxt.setBounds(416, 379, 306, 112);
		add(txtpnDescTxt);
		
		JLabel lblRooms_1 = new JLabel("Rooms");
		lblRooms_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblRooms_1.setBounds(510, 0, 106, 43);
		add(lblRooms_1);

	}
}
