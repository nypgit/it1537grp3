package jday.ui.user;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import jday.entities.Member;
import jday.util.BackgroundPanel;


public class Sport extends BackgroundPanel {

	/**
	 * Create the panel.
	 */
	
	
	public Sport() {
		super();
		initialize();
	}
	
	public Sport(JFrame f,Member m){
		this();
		myFrame = f;
		this.m = m;
	}
	
	private void initialize(){
		setSize(new Dimension(750, 500));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Badminton");
		lblNewLabel.setBounds(392, 142, 73, 36);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Basketball");
		lblNewLabel_1.setBounds(101, 150, 58, 21);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Bowling");
		lblNewLabel_2.setBounds(113, 434, 46, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tennis");
		lblNewLabel_3.setBounds(113, 299, 46, 14);
		add(lblNewLabel_3);
		
		JLabel lblVolleyball = new JLabel("Volleyball");
		lblVolleyball.setBounds(392, 295, 46, 14);
		add(lblVolleyball);
		
		JLabel lblIcon = new JLabel("iconbadminton");
		lblIcon.setIcon(new ImageIcon(Sport.class.getResource("/pic/badminton.png")));
		lblIcon.setBounds(362, 46, 103, 101);
		add(lblIcon);
		
		JLabel lblNewLabel_4 = new JLabel("iconBasketball");
		lblNewLabel_4.setIcon(new ImageIcon(Sport.class.getResource("/pic/basketball.png")));
		lblNewLabel_4.setBounds(81, 46, 103, 108);
		add(lblNewLabel_4);
		
		JLabel lblIcontennis = new JLabel("iconTennis");
		lblIcontennis.setIcon(new ImageIcon(Sport.class.getResource("/pic/tennis.png")));
		lblIcontennis.setBounds(81, 196, 103, 102);
		add(lblIcontennis);
		
		JLabel lblIconvolley = new JLabel("iconVolley");
		lblIconvolley.setIcon(new ImageIcon(Sport.class.getResource("/pic/volleyball.png")));
		lblIconvolley.setBounds(362, 193, 103, 101);
		add(lblIconvolley);
		
		JLabel lblIconbowling = new JLabel("iconBowling");
		lblIconbowling.setIcon(new ImageIcon(Sport.class.getResource("/pic/bowling.png")));
		lblIconbowling.setBounds(81, 324, 103, 108);
		add(lblIconbowling);
		
		JButton btnNewButton = new JButton(" Book Now");
		btnNewButton.setOpaque(false);
		btnNewButton.setBounds(new Rectangle(0, 0, 117, 0));
		btnNewButton.setBounds(490, 121, 117, 21);
		add(btnNewButton);
		
		JButton btnBook = new JButton("Book Now");
		btnBook.setBounds(new Rectangle(0, 0, 117, 0));
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new Sport2(myFrame);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
			}
		});
		btnBook.setOpaque(false);
		btnBook.setBounds(194, 124, 117, 23);
		add(btnBook);
		
		JButton btnBook_1 = new JButton("Book Now");
		btnBook_1.setBounds(new Rectangle(0, 0, 117, 0));
		btnBook_1.setOpaque(false);
		btnBook_1.setBounds(194, 275, 117, 23);
		add(btnBook_1);
		
		JButton btnBookNow = new JButton("Book Now");
		btnBookNow.setBounds(new Rectangle(0, 0, 117, 0));
		btnBookNow.setOpaque(false);
		btnBookNow.setBounds(490, 271, 117, 23);
		add(btnBookNow);
		
		JButton btnNewButton_1 = new JButton("Book Now");
		btnNewButton_1.setBounds(new Rectangle(0, 0, 117, 0));
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setBounds(194, 409, 117, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("View Details");
		btnNewButton_2.setBounds(new Rectangle(0, 0, 117, 0));
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.setBounds(194, 367, 117, 23);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("View Details");
		btnNewButton_3.setBounds(new Rectangle(0, 0, 117, 0));
		btnNewButton_3.setOpaque(false);
		btnNewButton_3.setBounds(194, 236, 117, 23);
		add(btnNewButton_3);
		
		JButton btnViewDetails = new JButton("View Details");
		btnViewDetails.setBounds(new Rectangle(0, 0, 117, 0));
		btnViewDetails.setOpaque(false);
		btnViewDetails.setBounds(490, 232, 117, 23);
		add(btnViewDetails);
		
		JButton btnViewDetails_1 = new JButton("View Details");
		btnViewDetails_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new ViewDetail(myFrame,m);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
			}
		});
		btnViewDetails_1.setOpaque(false);
		btnViewDetails_1.setBounds(194, 85, 117, 23);
		add(btnViewDetails_1);
		
		JButton btnViewDetails_2 = new JButton("View Details");
		btnViewDetails_2.setBounds(new Rectangle(0, 0, 117, 0));
		btnViewDetails_2.setOpaque(false);
		btnViewDetails_2.setBounds(490, 81, 117, 23);
		add(btnViewDetails_2);
		
		JButton btnNewButton_4 = new JButton("View Details");
		btnNewButton_4.setBounds(new Rectangle(0, 0, 117, 0));
		btnNewButton_4.setOpaque(false);
		btnNewButton_4.setBounds(490, 367, 117, 23);
		add(btnNewButton_4);
		
		JButton btnBookNow_1 = new JButton("Book Now");
		btnBookNow_1.setBounds(new Rectangle(0, 0, 117, 0));
		btnBookNow_1.setOpaque(false);
		btnBookNow_1.setBounds(490, 409, 117, 23);
		add(btnBookNow_1);
		
		JLabel lblTableTennis = new JLabel("Table tennis");
		lblTableTennis.setBounds(372, 423, 76, 14);
		add(lblTableTennis);
		
		JLabel lblNewLabel_5 = new JLabel("iconTTennis");
		lblNewLabel_5.setIcon(new ImageIcon(Sport.class.getResource("/pic/ttennis.png")));
		lblNewLabel_5.setBounds(362, 325, 103, 106);
		add(lblNewLabel_5);
		
		JLabel lblTheseAreThe = new JLabel("Available courts:");
		lblTheseAreThe.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblTheseAreThe.setBounds(61, 21, 188, 28);
		add(lblTheseAreThe);

	}
}
