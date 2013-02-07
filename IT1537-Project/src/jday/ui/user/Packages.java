/*******************************************************************************
 * Program Name: 			Packages
 * Purpose:					view packages 
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

public class Packages extends BackgroundPanel {

	/**
	 * Create the panel.
	 */
	public Packages() {
		super();
		initialize();
	}
	
	public Packages (JFrame f, Member m){
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
		
		//main pic
		final JLabel lblMainPic = new JLabel("");
		lblMainPic.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblMainPic.setIcon(new ImageIcon(Packages.class.getResource("/images/wedding.jpg")));
		lblMainPic.setOpaque(true);
		lblMainPic.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMainPic.setForeground(new Color(0, 0, 0));
		lblMainPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblMainPic.setBackground(new Color(240, 255, 255));
		lblMainPic.setBounds(304, 53, 200, 200);
		add(lblMainPic);
		
		
		//wedding button
		JButton btnNewButton = new JButton("");
		
		btnNewButton.setIcon(new ImageIcon(Packages.class.getResource("/images/wedding resized.jpg")));
		btnNewButton.setMargin(new Insets(2, 0, 2, 0));
		btnNewButton.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setBounds(304, 264, 50, 50);
		add(btnNewButton);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblMainPic.setIcon(new ImageIcon(Packages.class.getResource("/images/wedding.jpg")));
			}
		});
		
		//party button
		JButton button = new JButton("");
		
		button.setIcon(new ImageIcon(Packages.class.getResource("/images/party resized.jpg")));
		button.setMargin(new Insets(2, 0, 2, 0));
		button.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		button.setHorizontalTextPosition(SwingConstants.CENTER);
		button.setAlignmentX(0.5f);
		button.setBounds(376, 264, 50, 50);
		add(button);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblMainPic.setIcon(new ImageIcon(Packages.class.getResource("/images/party.jpg")));
			}
		});
		
		//company dinner button
		JButton button_1 = new JButton("");
		
		button_1.setIcon(new ImageIcon(Packages.class.getResource("/images/company dinner resized.jpg")));
		button_1.setMargin(new Insets(2, 0, 2, 0));
		button_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		button_1.setHorizontalTextPosition(SwingConstants.CENTER);
		button_1.setAlignmentX(0.5f);
		button_1.setBounds(454, 264, 50, 50);
		add(button_1);
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblMainPic.setIcon(new ImageIcon(Packages.class.getResource("/images/company dinner.jpg")));
			}
		});
		
		JLabel lblPackages = new JLabel("Packages");
		lblPackages.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblPackages.setForeground(new Color(255, 255, 255));
		lblPackages.setBackground(new Color(153, 51, 153));
		lblPackages.setFont(new Font("Arial", Font.BOLD, 15));
		lblPackages.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPackages.setHorizontalAlignment(SwingConstants.CENTER);
		lblPackages.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblPackages.setOpaque(true);
		lblPackages.setBounds(89, 327, 100, 40);
		add(lblPackages);
		
		JLabel lblMeetingRm = new JLabel("\u2022\tWeddings");
		lblMeetingRm.setHorizontalAlignment(SwingConstants.LEFT);
		lblMeetingRm.setFont(new Font("Arial", Font.PLAIN, 14));
		lblMeetingRm.setForeground(new Color(0, 0, 0));
		lblMeetingRm.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMeetingRm.setBounds(89, 378, 100, 24);
		add(lblMeetingRm);
		
		JLabel lblActivityRm = new JLabel("\u2022\tParty");
		lblActivityRm.setHorizontalTextPosition(SwingConstants.CENTER);
		lblActivityRm.setHorizontalAlignment(SwingConstants.LEFT);
		lblActivityRm.setForeground(new Color(0, 0, 0));
		lblActivityRm.setFont(new Font("Arial", Font.PLAIN, 14));
		lblActivityRm.setBounds(89, 413, 100, 24);
		add(lblActivityRm);
		
		JLabel lblHall = new JLabel("\u2022\tCompany Dinner");
		lblHall.setHorizontalTextPosition(SwingConstants.CENTER);
		lblHall.setHorizontalAlignment(SwingConstants.LEFT);
		lblHall.setForeground(new Color(0, 0, 0));
		lblHall.setFont(new Font("Arial", Font.PLAIN, 14));
		lblHall.setBounds(89, 448, 119, 24);
		add(lblHall);
		
		JLabel lblPrices = new JLabel("Prices");
		lblPrices.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblPrices.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPrices.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrices.setForeground(new Color(255, 255, 255));
		lblPrices.setFont(new Font("Arial", Font.BOLD, 15));
		lblPrices.setOpaque(true);
		lblPrices.setBackground(new Color(153, 51, 153));
		lblPrices.setBounds(234, 327, 100, 40);
		add(lblPrices);
		
		JLabel lblMeetingPrice = new JLabel("$40,000");
		lblMeetingPrice.setForeground(new Color(0, 0, 0));
		lblMeetingPrice.setFont(new Font("Arial", Font.PLAIN, 14));
		lblMeetingPrice.setBounds(244, 378, 90, 24);
		add(lblMeetingPrice);
		
		JLabel lblActivityPrice = new JLabel("$6,000");
		lblActivityPrice.setFont(new Font("Arial", Font.PLAIN, 14));
		lblActivityPrice.setForeground(new Color(0, 0, 0));
		lblActivityPrice.setBounds(244, 416, 90, 19);
		add(lblActivityPrice);
		
		JLabel lblHallPrice = new JLabel("$15,000");
		lblHallPrice.setFont(new Font("Arial", Font.PLAIN, 14));
		lblHallPrice.setForeground(new Color(0, 0, 0));
		lblHallPrice.setBounds(244, 451, 90, 19);
		add(lblHallPrice);
		
		JLabel lblDesc = new JLabel("Description");
		lblDesc.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblDesc.setBackground(new Color(153, 51, 153));
		lblDesc.setOpaque(true);
		lblDesc.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDesc.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesc.setForeground(new Color(255, 255, 255));
		lblDesc.setFont(new Font("Arial", Font.BOLD, 15));
		lblDesc.setBounds(416, 325, 306, 40);
		add(lblDesc);
		
		JTextPane txtpnDescTxt = new JTextPane();
		txtpnDescTxt.setFont(new Font("Arial", Font.PLAIN, 14));
		txtpnDescTxt.setForeground(new Color(0, 0, 0));
		txtpnDescTxt.setOpaque(false);
		txtpnDescTxt.setText("Our packages includes services from our experienced staff and the venue where is occasion is taking place. Please approach the receptionist to book a package or for further enquires.");
		txtpnDescTxt.setBounds(416, 377, 306, 112);
		add(txtpnDescTxt);
		
		JLabel lblPackages_1 = new JLabel("Packages");
		lblPackages_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPackages_1.setBounds(484, 0, 157, 43);
		add(lblPackages_1);

	}
}
