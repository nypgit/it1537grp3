package jday.ui.user;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import jday.util.BackgroundPanel;

public class KaraokeBooking extends BackgroundPanel /*BackgroundPanel*/{
	private JRadioButton rdbtnpm;
	private JRadioButton rdbtnEveningPm;
	private JRadioButton rdbtnNoonPm;
	private JComboBox comboBoxPackages;

	/**
	 * Create the panel.
	 */
	public KaraokeBooking() {
		super();
		initialize();
	}
	public KaraokeBooking(JFrame f){
		this();
		myFrame = f;
	}
	
	private void initialize(){
		setSize(new Dimension(750, 500));
		setLayout(null);
		
		JTextPane txtpnMonth = new JTextPane();
		txtpnMonth.setFont(new Font("Candara", Font.PLAIN, 14));
		txtpnMonth.setEditable(false);
		txtpnMonth.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtpnMonth.setOpaque(false);
		txtpnMonth.setText("Jan\r\nFeb\r\nMar\r\nApr\r\nMay\r\nJun\r\nJul\r\nAug\r\nSep\r\nOct\r\nNov\r\nDec");
		txtpnMonth.setBounds(241, 268, 49, 23);
		add(txtpnMonth);
		
		rdbtnEveningPm = new JRadioButton("JDAY Dinner (6 pm - 10 pm)");
		rdbtnEveningPm.setOpaque(false);
		rdbtnEveningPm.setBounds(178, 392, 173, 23);
		add(rdbtnEveningPm);
		
		rdbtnNoonPm = new JRadioButton("JDAY Happy (2 pm - 7 pm)");
		rdbtnNoonPm.setOpaque(false);
		rdbtnNoonPm.setBounds(178, 357, 173, 23);
		add(rdbtnNoonPm);
		
		rdbtnpm = new JRadioButton("JDAY Lunch (11 am - 2 pm)");
		rdbtnpm.setOpaque(false);
		rdbtnpm.setBounds(178, 325, 173, 23);
		add(rdbtnpm);
		
		JTextPane txtpnAvailableForGroup = new JTextPane();
		txtpnAvailableForGroup.setFont(new Font("Candara", Font.PLAIN, 15));
		txtpnAvailableForGroup.setEditable(false);
		txtpnAvailableForGroup.setBackground(SystemColor.menu);
		txtpnAvailableForGroup.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtpnAvailableForGroup.setText("All charges are subject to 10% service charge and 7% GST*.\r\n\r\nRooms are subject to availability.\r\n\r\nPlease adhere to the timing generated from the booking system to avoid any inconvenience.\r\n\r\nA grace period of 15 minutes is given from the timing of your booked session.\r\n\r\nAll bookings made cannot be cancelled.\r\n\r\nAll payments made are non refundable.\r\n\r\nAll transactions are in Singapore Dollars (SGD).");
		txtpnAvailableForGroup.setBounds(430, 70, 251, 359);
		add(txtpnAvailableForGroup);
		
		JLabel lblSession = new JLabel("SESSION :");
		lblSession.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblSession.setBounds(51, 210, 89, 14);
		add(lblSession);
		
		JLabel lblDate = new JLabel("DATE :");
		lblDate.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblDate.setBounds(71, 268, 49, 23);
		add(lblDate);
		
		JLabel lblTime = new JLabel("TIME :");
		lblTime.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblTime.setBounds(71, 334, 56, 14);
		add(lblTime);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 30, 1));
		spinner.setBounds(178, 270, 46, 22);
		add(spinner);
		
		JComboBox Month = new JComboBox();
		Month.setToolTipText("");
		Month.setBounds(234, 268, 56, 25);
		add(Month);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerListModel(new String[] {"2012", "2013", "2014", "2015"}));
		spinner_1.setBounds(295, 270, 56, 22);
		add(spinner_1);
		
		comboBoxPackages = new JComboBox();
		comboBoxPackages.setModel(new DefaultComboBoxModel(new String[] {"   JDay's Karaoke", "   Corporate Room", "   Family Room", "   Friend Room"}));
		comboBoxPackages.setFont(new Font("Candara", Font.PLAIN, 14));
		comboBoxPackages.setToolTipText("");
		comboBoxPackages.setBounds(178, 206, 173, 25);
		add(comboBoxPackages);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(590, 442, 89, 23);
		add(btnConfirm);
		
		JLabel lblSpaBooking = new JLabel("KARAOKE BOOKING");
		lblSpaBooking.setIcon(new ImageIcon(KaraokeBooking.class.getResource("/TaxiKaraokeSpa/img/microphone.png")));
		lblSpaBooking.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblSpaBooking.setBounds(35, 13, 297, 155);
		add(lblSpaBooking);
		
		JLabel lblTermsCondition = new JLabel("Terms & Condition :");
		lblTermsCondition.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblTermsCondition.setBounds(430, 35, 163, 14);
		add(lblTermsCondition);

	}
}
