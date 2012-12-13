package jday.ui.user;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import jday.util.BackgroundPanel;

public class KaraokeRegular extends BackgroundPanel /*BackgroundPanel*/{

	/**
	 * Create the panel.
	 */
	public KaraokeRegular() {
		super();
		initialize();
	}
	
	public KaraokeRegular(JFrame f){
		this();
		myFrame = f;
	}
	
	private void initialize(){
		setSize(new Dimension(750, 500));
		setLayout(null);
		
		JLabel lblKaraokeRooms = new JLabel("KARAOKE ROOMS");
		lblKaraokeRooms.setIcon(new ImageIcon(KaraokeRegular.class.getResource("/TaxiKaraokeSpa/img/microphone.png")));
		lblKaraokeRooms.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblKaraokeRooms.setBounds(12, -14, 286, 155);
		add(lblKaraokeRooms);
		
		JLabel lblNewLabel_1 = new JLabel("              Friends Room");
		lblNewLabel_1.setFont(new Font("Candara", Font.PLAIN, 16));
		lblNewLabel_1.setIcon(new ImageIcon(KaraokeRegular.class.getResource("/TaxiKaraokeSpa/img/FriendsRoom.png")));
		lblNewLabel_1.setBounds(329, 175, 375, 155);
		add(lblNewLabel_1);
		
		JButton button = new JButton("Book Now!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JPanel panel = new KaraokeBooking(myFrame);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
			}
		});
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setOpaque(false);
		button.setBounds(116, 445, 100, 42);
		add(button);
		
		JTextPane txtpnRoomType = new JTextPane();
		txtpnRoomType.setText("\r\nRoom Type\t: \tFriends Room\r\nNo. of Person :\t2 - 4 pax\r\n\r\nJDAY Lunch :  11 pm - 2 pm\r\n$9++ or  $12++\r\n1 set Lunch + 1 Soft Drinks/Hot Drinks\r\n\r\nJDAY Happy : 2 pm - 7 pm\r\n$13++ or $16++\r\n2 Standard Drinks Per Pax\r\n\r\nJDAY Dinner : 6 pm - 10 pm\r\n$19++ or $23 ++\r\n1 set Dinner + 1 Standard Drink");
		txtpnRoomType.setFont(new Font("Candara", Font.PLAIN, 15));
		txtpnRoomType.setEditable(false);
		txtpnRoomType.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtpnRoomType.setBackground(SystemColor.menu);
		txtpnRoomType.setAlignmentY(5.0f);
		txtpnRoomType.setAlignmentX(3.0f);
		txtpnRoomType.setBounds(12, 125, 286, 312);
		add(txtpnRoomType);
		
		JLabel lblFamilyroom = new JLabel("              Family Room");
		lblFamilyroom.setFont(new Font("Candara", Font.PLAIN, 16));
		lblFamilyroom.setIcon(new ImageIcon(KaraokeRegular.class.getResource("/TaxiKaraokeSpa/img/FamilyRoom.png")));
		lblFamilyroom.setBounds(329, 327, 385, 173);
		add(lblFamilyroom);
		
		JLabel lblBusinessRoom = new JLabel("               Corporate Room");
		lblBusinessRoom.setFont(new Font("Candara", Font.PLAIN, 16));
		lblBusinessRoom.setIcon(new ImageIcon(KaraokeRegular.class.getResource("/TaxiKaraokeSpa/img/BusinessRoom.png")));
		lblBusinessRoom.setBounds(329, 22, 375, 141);
		add(lblBusinessRoom);

	}
}
