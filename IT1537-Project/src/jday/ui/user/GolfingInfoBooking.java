/*******************************************************************************
 * Program Name: 			GolfingInfoBooking
 * Purpose:					to book golf
 * Name of Author:			Di Yuwen
 * Admin No. of Author:		120923R
 * Module Group: 			IS1201
 * *****************************************************************************/
package jday.ui.user;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import jday.entities.BookingNo;
import jday.entities.GolfingBooking;
import jday.entities.Member;
import jday.entities.dao.BookingNoDAO;
import jday.entities.dao.GolfingBookingDAO;
import jday.util.BackgroundPanel;
import jday.util.EmailSender;

import org.freixas.jcalendar.DateEvent;
import org.freixas.jcalendar.DateListener;
import org.freixas.jcalendar.JCalendar;
import javax.swing.ButtonGroup;

public class GolfingInfoBooking extends BackgroundPanel {
	private final ButtonGroup buttonGroupTime = new ButtonGroup();
	private final ButtonGroup buttonGroupGreenfee = new ButtonGroup();
	private GolfingBooking golfingbooking = new GolfingBooking();

	public GolfingInfoBooking() {
		super();
		initialize();
	}

	public GolfingInfoBooking(JFrame f, Member m) {
		this();
		myFrame = f;
		this.m = m;
		this.m.retrieveMemberInfo();
	}

	/**
	 * Create the panel.
	 */
	public void initialize() {
		setSize(new Dimension(750, 500));
		setLayout(null);

		JButton btnBack = new JButton("Confirm");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String choice = buttonGroupTime.getSelection()
						.getActionCommand();
				System.out.println("test: " + choice);

				String choice2 = buttonGroupGreenfee.getSelection()
						.getActionCommand();
				System.out.println("test: " + choice2);

				BookingNo bookno = new BookingNo();
				bookno.setBookingNo();
				
				golfingbooking.setMemberid(m.getMemberid());
				golfingbooking.setGreenFees(choice2);
				golfingbooking.setTime(choice);
				golfingbooking.setBookingno(bookno.getBookingNo());
				
				// store in DAO
				GolfingBookingDAO.CreateBooking(golfingbooking);
				
				
				EmailSender email = new EmailSender(m);
				email.sendBookingNumber(bookno.getBookingNo());
				JOptionPane.showMessageDialog(null, "Booking successful. An email has been sent containing your booking number.");
				
				JPanel panel = new GolfingInfo(myFrame, m);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();

			}
		});
		btnBack.setBounds(612, 455, 89, 23);
		add(btnBack);

		JLabel lbltimeGreenfee = new JLabel("Golf Booking");
		lbltimeGreenfee.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbltimeGreenfee.setBounds(466, 0, 187, 37);
		add(lbltimeGreenfee);

		JLabel lbltime = new JLabel("Time:");
		lbltime.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lbltime.setBounds(96, 355, 57, 23);
		add(lbltime);

		// time
		JRadioButton rbtnmorning = new JRadioButton("Morning");
		rbtnmorning.setActionCommand("morning");
		buttonGroupTime.add(rbtnmorning);
		rbtnmorning.setOpaque(false);
		rbtnmorning.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rbtnmorning.setBounds(147, 387, 109, 23);
		add(rbtnmorning);

		JRadioButton rbtnafternoon = new JRadioButton("Afternoon");
		rbtnafternoon.setActionCommand("afternoon");
		buttonGroupTime.add(rbtnafternoon);
		rbtnafternoon.setOpaque(false);
		rbtnafternoon.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rbtnafternoon.setBounds(147, 415, 109, 23);
		add(rbtnafternoon);

		JRadioButton rbtnevening = new JRadioButton("Evening");
		rbtnevening.setActionCommand("evening");
		buttonGroupTime.add(rbtnevening);
		rbtnevening.setOpaque(false);
		rbtnevening.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rbtnevening.setBounds(147, 443, 109, 23);
		add(rbtnevening);

		// green fees
		JLabel label_2 = new JLabel("Green Fees:");
		label_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		label_2.setBounds(384, 351, 102, 31);
		add(label_2);

		JRadioButton rbtnnine = new JRadioButton("9 Holes");
		rbtnnine.setActionCommand("9 holes");
		buttonGroupGreenfee.add(rbtnnine);
		rbtnnine.setOpaque(false);
		rbtnnine.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rbtnnine.setBounds(470, 387, 102, 23);
		add(rbtnnine);

		JRadioButton rbtneight = new JRadioButton("18 Holes");
		rbtneight.setActionCommand("18 holes");
		buttonGroupGreenfee.add(rbtneight);
		rbtneight.setOpaque(false);
		rbtneight.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rbtneight.setBounds(470, 415, 102, 23);
		add(rbtneight);

		final JCalendar calendar = new JCalendar();
		calendar.setBorder(new LineBorder(new Color(0, 0, 0)));
		calendar.setBackground(new Color(221, 160, 221));

		Date date = new Date();
		date = calendar.getDate();
		golfingbooking.setDate(date.toString());

		calendar.addDateListener(new DateListener() {
			public void dateChanged(DateEvent arg0) {
				// save date into a variable
				Date date1 = new Date();
				date1 = calendar.getDate();
				
				Date date = new Date();
				/////////////////
				if (date1.before(date)){
					JOptionPane.showMessageDialog(null, "You are unable to book on this day");
				}
				golfingbooking.setDate((date1.toString()));
				System.out.println(date1);

			}

		});

		calendar.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		calendar.setBounds(86, 84, 615, 251);
		add(calendar);

	}
}
