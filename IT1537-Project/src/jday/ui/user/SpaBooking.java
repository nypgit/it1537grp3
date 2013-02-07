package jday.ui.user;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import jday.entities.Member;
import jday.entities.SpaBookingDetails;
import jday.entities.dao.SpaBookingDetailsDAO;
import jday.util.BackgroundPanel;
import jday.util.EmailSender;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.util.Locale;

import javax.swing.ButtonGroup;

public class SpaBooking extends BackgroundPanel implements ActionListener {
	private JRadioButton rdbtnpm;
	private JRadioButton rdbtnNoonPm;
	private JRadioButton rdbtnEveningPm;

	private JSpinner day;
	private JComboBox month;
	private JSpinner year;
	
	private JComboBox session;
	
	private String time; 
	
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private SpaBookingDetails spaBookingDetails;
	

	public SpaBooking() {
		super();
		initialize();
	}

	public SpaBooking(JFrame f, Member m) {
		this();
		myFrame = f;
		this.m = m;
		this.m.retrieveMemberInfo();
	}

	private void initialize() {
		setSize(750, 500);
		setLayout(null);

		/*************************** Select Time ****************************/
		rdbtnpm = new JRadioButton("Morning (10 am - 12 pm)");
		buttonGroup_1.add(rdbtnpm);
		rdbtnpm.setActionCommand("Morning (10 am - 12 pm)");
		rdbtnpm.setOpaque(false);
		rdbtnpm.setBounds(523, 295, 173, 23);
		add(rdbtnpm);

		rdbtnNoonPm = new JRadioButton("Noon (1 pm - 4 pm)");
		buttonGroup_1.add(rdbtnNoonPm);
		rdbtnNoonPm.setActionCommand("Noon (1 pm - 4 pm)");
		rdbtnNoonPm.setOpaque(false);
		rdbtnNoonPm.setBounds(523, 327, 173, 23);
		add(rdbtnNoonPm);

		rdbtnEveningPm = new JRadioButton("Evening (5 pm - 7 pm)");
		buttonGroup_1.add(rdbtnEveningPm);
		rdbtnEveningPm.setActionCommand("Evening (5 pm - 7 pm)");
		rdbtnEveningPm.setOpaque(false);
		rdbtnEveningPm.setBounds(523, 357, 173, 23);
		add(rdbtnEveningPm);

		/*************************** Terms & Condition ****************************/

		/*************************** Labels ****************************/
		JLabel lblSession = new JLabel("SESSION :");
		lblSession.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblSession.setBounds(396, 180, 89, 14);
		add(lblSession);

		JLabel lblDate = new JLabel("DATE :");
		lblDate.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblDate.setBounds(416, 238, 49, 23);
		add(lblDate);

		JLabel lblTime = new JLabel("TIME :");
		lblTime.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblTime.setBounds(416, 304, 56, 14);
		add(lblTime);

		/*************************** Select Day ****************************/
		day = new JSpinner();
		day.setModel(new SpinnerNumberModel(1, 1, 30, 1));
		day.setBounds(523, 240, 46, 22);
		add(day);

		/*************************** Select Month ****************************/
		month = new JComboBox();
		month.setFont(new Font("Candara", Font.PLAIN, 14));
		month.setModel(new DefaultComboBoxModel(new String[] { "  Jan","  Feb", "  Mar", "  Apr", "  May", "  Jun", "  Jul", "  Aug","  Sep", "  Oct", "  Nov", "  Dec" }));
		month.setToolTipText("");
		month.setBounds(574, 238, 61, 25);
		add(month);

		/*************************** Select Year ****************************/
		year = new JSpinner();
		year.setModel(new SpinnerListModel(new String[] {"2013", "2014", "2015", "2016"}));
		year.setBounds(640, 240, 56, 22);
		add(year);

		/*************************** Select Session****************************/
		session = new JComboBox();
		session.setFont(new Font("Candara", Font.PLAIN, 14));
		session.setModel(new DefaultComboBoxModel(new String[] {"  JDay's Spa Packages", "  Balancing Spa Package","  Healing Spa Package", "  JDAY Experience", "  Berdua-Dua","  Best of Friends" }));
		session.setToolTipText("");
		session.setBounds(523, 176, 173, 25);
		add(session);

		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(this);
		btnConfirm.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConfirm.setBounds(607, 419, 89, 23);
		add(btnConfirm);

		JLabel lblSpaBooking = new JLabel("   Spa Booking");
		lblSpaBooking.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblSpaBooking.setBounds(445, -36, 211, 121);
		add(lblSpaBooking);
		
				JLabel lblTermsCondition = new JLabel("Terms & Condition :");
				lblTermsCondition.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
				lblTermsCondition.setBounds(88, 46, 163, 14);
				add(lblTermsCondition);
				JTextPane txtpnAvailableForGroup = new JTextPane();
				txtpnAvailableForGroup.setFont(new Font("Candara", Font.PLAIN, 15));
				txtpnAvailableForGroup.setEditable(false);
				txtpnAvailableForGroup.setBackground(SystemColor.menu);
				txtpnAvailableForGroup.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
				txtpnAvailableForGroup.setText("All charges are subject to 10% service charge and 7% GST*.\r\n\r\nRooms are subject to availability.\r\n\r\nPlease adhere to the timing generated from the booking system to avoid any inconvenience.\r\n\r\nA grace period of 15 minutes is given from the timing of your booked session.\r\n\r\nAll bookings made cannot be cancelled.\r\n\r\nAll payments made are non refundable.\r\n\r\nAll transactions are in Singapore Dollars (SGD).\r\n\r\nBooking number is sent to your email, please present upon arrival.");
				txtpnAvailableForGroup.setBounds(88, 71, 282, 418);
				add(txtpnAvailableForGroup);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		int selectedDay = (int) day.getValue();

		int selected = month.getSelectedIndex();
		System.out.println("selected index = " + selected);
		String selectedMonth = (String) (month.getItemAt(selected));
		System.out.println("Selected month = " + month);
		

		String selectedYear = (String) year.getValue();
		
		
		String selectedT = buttonGroup_1.getSelection().getActionCommand();
		System.out.println("Selected time = " + time);
		
		int selectedS = session.getSelectedIndex();
		System.out.println("selected index = " + selectedS);
		String selectedSession = (String) (session.getItemAt(selectedS));
		System.out.println("Selected session = " + session);

		SpaBookingDetails bookingDetails = new SpaBookingDetails();
		bookingDetails.setDay(selectedDay);
		bookingDetails.setMonth(selectedMonth);
		bookingDetails.setYear(selectedYear);
		bookingDetails.setDate();
		
		bookingDetails.setTime(selectedT);
		
		bookingDetails.setSession(selectedSession);
		
		SpaBookingDetails bookDetails = new SpaBookingDetails();
		bookDetails = SpaBookingDetailsDAO.spaBooking(bookingDetails, m);

		EmailSender email = new EmailSender(m);
		email.sendBookingNumber(bookDetails.getBookingNo());
		
		//SpaConfirmation panel = new SpaConfirmation(myFrame, bookDetails,m);

		//String dateDetails = spaBookingDetails.getDay() + "." + spaBookingDetails.getMonth() + ". " + spaBookingDetails.getYear();
		//String roomsDetails = spaBookingDetails.getSession();
		//String timeDetails = spaBookingDetails.getTime();
		
	
		JOptionPane.showMessageDialog(null, "Booking successful. An email has been sent containing your booking number.");
		
		JPanel panel = new SpaPackages(myFrame,m);
		myFrame.getContentPane().removeAll();
		myFrame.getContentPane().add(panel);
		myFrame.getContentPane().validate();
		myFrame.getContentPane().repaint();
		
	}


}
