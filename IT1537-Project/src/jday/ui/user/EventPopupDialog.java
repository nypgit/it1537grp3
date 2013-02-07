/*******************************************************************************
 * Program Name: 			EventPopupDialog
 * Purpose:					view event 
 * Name of Author:			Junaidi
 * Admin No. of Author:		123588N
 * Module Group: 			IS1201
 * *****************************************************************************/
package jday.ui.user;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.border.MatteBorder;

import jday.entities.Event;
import jday.entities.dao.EventDAO;
import javax.swing.SwingConstants;
import org.freixas.jcalendar.JCalendar;

public class EventPopupDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			EventPopupDialog dialog = new EventPopupDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 * @param date2 
	 * @throws SQLException 
	 */
	public EventPopupDialog(Date date2) throws SQLException {
		// call DAO to retrieve DB 
		//Event event = EventDAO.getEventByDate("1/2/2013");
		//jtect.settext(event.getDescrt())
		String info = "There are no events on this date.";
		String title = " - ";
		String venue = " - ";
		String date1 = EventDAO.dateToString(date2);
		
		
		Event event01 = EventDAO.getEventByDate(date2);
		if (event01.getDate() != null){
		info = event01.getInfo();
		title = event01.getTitle();
		venue = event01.getVenue();
		}
		
		
		getContentPane().setBackground(new Color(125, 51, 96));
		setBounds(new Rectangle(0, 0, 700, 450));
		setSize(new Dimension(700, 450));
		setResizable(false);
		setBounds(100, 100, 593, 393);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(125, 51, 96));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblTitle = new JLabel(" " + title);
		lblTitle.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblTitle.setForeground(new Color(0, 0, 51));
		lblTitle.setOpaque(true);
		lblTitle.setBackground(new Color(255, 204, 204));
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitle.setBounds(10, 11, 251, 36);
		contentPanel.add(lblTitle);
		
		JLabel lblDate = new JLabel(" " + date1);
		lblDate.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblDate.setForeground(new Color(0, 0, 51));
		lblDate.setOpaque(true);
		lblDate.setBackground(new Color(255, 204, 204));
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDate.setBounds(10, 58, 251, 36);
		contentPanel.add(lblDate);
		
		JLabel lblVenue = new JLabel(" " + venue);
		lblVenue.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblVenue.setForeground(new Color(0, 0, 51));
		lblVenue.setOpaque(true);
		lblVenue.setBackground(new Color(255, 204, 204));
		lblVenue.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblVenue.setBounds(10, 105, 251, 36);
		contentPanel.add(lblVenue);
		
		JTextPane txpInfo = new JTextPane();
		txpInfo.setEditable(false);
		txpInfo.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txpInfo.setForeground(new Color(0, 0, 51));
		txpInfo.setBackground(new Color(255, 204, 204));
		txpInfo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txpInfo.setText(info);
		txpInfo.setBounds(271, 11, 306, 310);
		contentPanel.add(txpInfo);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(125, 51, 96));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//close the dialog box
						EventPopupDialog.super.dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

	public EventPopupDialog() {
		// TODO Auto-generated constructor stub
	}
}
