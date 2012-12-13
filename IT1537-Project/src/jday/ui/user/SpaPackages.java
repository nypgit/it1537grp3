package jday.ui.user;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

import jday.util.BackgroundPanel;

public class SpaPackages extends BackgroundPanel /*BackgroundPanel*/ {

	/**
	 * Create the panel.
	 */
	public SpaPackages() {
		super();
		initialize();
	}
	
	public SpaPackages(JFrame f){
		this();
		myFrame = f;
	}
	
	private void initialize(){
		setSize(new Dimension(750, 500));
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setLayout(null);
		
		JButton btnBookNow = new JButton("Book Now!");
		btnBookNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JPanel panel = new SpaBooking(myFrame);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
			}
		});
		btnBookNow.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBookNow.setOpaque(false);
		btnBookNow.setBounds(617, 419, 103, 35);
		add(btnBookNow);
		
		JList list_1 = new JList();
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"     Berdua-Dua", "", "     Best of Friends", "", "    Couple suite upgrade"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_1.setBounds(39, 372, 218, 102);
		add(list_1);
		list_1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list_1.setOpaque(false);
		list_1.setFont(new Font("Candara", Font.PLAIN, 16));
		list_1.setBackground(SystemColor.menu);
		
		JList list = new JList();
		list.setBounds(39, 190, 218, 136);
		add(list);
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setFont(new Font("Candara", Font.PLAIN, 16));
		list.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		list.setOpaque(false);
		list.setBackground(SystemColor.menu);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"     Balancing Spa Package", "", "     Healing Spa Package", "", "     Purifying Spa Package", "", "     Renewing Spa Package", "", "     JDAY Experience"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 204, 255)));
		panel_1.setBounds(340, 88, 380, 305);
		add(panel_1);
		panel_1.setLayout(null);
		
		JTextPane txtpnHarmonisingTheBody = new JTextPane();
		txtpnHarmonisingTheBody.setEditable(false);
		txtpnHarmonisingTheBody.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtpnHarmonisingTheBody.setBackground(SystemColor.menu);
		txtpnHarmonisingTheBody.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtpnHarmonisingTheBody.setAlignmentX(3.0f);
		txtpnHarmonisingTheBody.setAlignmentY(5.0f);
		txtpnHarmonisingTheBody.setFont(new Font("Candara", Font.PLAIN, 15));
		txtpnHarmonisingTheBody.setText("\r\n\r\nHarmonising the body by unblocking the vital energy, qi, experience the powerful effects of Ginseng and feel the Balancing effects of this traditional Chinese based treatment.\r\n\r\n \r\n4 hours: SGD 460.00 (exclusive of taxes)");
		txtpnHarmonisingTheBody.setBounds(34, 58, 319, 224);
		panel_1.add(txtpnHarmonisingTheBody);
		
		JLabel lblDescription = new JLabel("DESCRIPTION");
		lblDescription.setForeground(Color.WHITE);
		lblDescription.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblDescription.setBounds(144, 22, 103, 14);
		panel_1.add(lblDescription);
		
		JLabel lblJdaysJourneyIndex = new JLabel("JDAY's Journey Index");
		lblJdaysJourneyIndex.setForeground(Color.BLACK);
		lblJdaysJourneyIndex.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblJdaysJourneyIndex.setBounds(51, 160, 173, 19);
		add(lblJdaysJourneyIndex);
		
		JLabel lblJdaysCoupleJourney = new JLabel("JDAY's Couple Journey Index");
		lblJdaysCoupleJourney.setForeground(Color.BLACK);
		lblJdaysCoupleJourney.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblJdaysCoupleJourney.setBounds(25, 342, 220, 19);
		add(lblJdaysCoupleJourney);
		
		JLabel lblSpaPackages = new JLabel("SPA PACKAGES\r\n");
		lblSpaPackages.setIcon(new ImageIcon(SpaPackages.class.getResource("/TaxiKaraokeSpa/img/Logo.png")));
		lblSpaPackages.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblSpaPackages.setBounds(10, 11, 265, 121);
		add(lblSpaPackages);

	}
}
