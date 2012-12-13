package jday.ui.user;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;

import jday.entities.Member;
import jday.util.BackgroundPanel;

public class DayCare2 extends BackgroundPanel {


	/**
	 * Create the panel.
	 */
	public DayCare2() {
		super();
		initialize();
	}
	
	public DayCare2(JFrame f, Member m){
		this();
		myFrame = f;
		this.m=m;
	}
	private void initialize(){
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Arial", Font.PLAIN, 14));
		setBackground(new Color(204, 51, 153));
		setSize(new Dimension(750, 500));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBackground(new Color(255, 204, 255));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(70, 0, 643, 478);
		add(panel);
		panel.setLayout(null);
		
		JTextPane txtpnActivitiesRoominformation = new JTextPane();
		txtpnActivitiesRoominformation.setForeground(new Color(0, 0, 0));
		txtpnActivitiesRoominformation.setFont(new Font("Arial", Font.PLAIN, 16));
		txtpnActivitiesRoominformation.setText("Activity rooms:\r\nActivity rooms are equipped with materials and equiptment for the young to explore, create and play with.\r\n\r\nPlease choose the time:\r\n");
		txtpnActivitiesRoominformation.setOpaque(false);
		txtpnActivitiesRoominformation.setBounds(20, 29, 528, 109);
		panel.add(txtpnActivitiesRoominformation);
		
		JLabel lblNewLabel = new JLabel("From:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(20, 155, 64, 23);
		panel.add(lblNewLabel);
		
		JLabel lblTo = new JLabel("To:");
		lblTo.setForeground(new Color(0, 0, 0));
		lblTo.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTo.setBounds(225, 155, 29, 23);
		panel.add(lblTo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"  0900", "  0930", "  1000", "  1030", "  1100", "  1130", "  1200", "  1230", "  1300", "  1330", "  1400", "  1430", "  1500", "  1530", "  1600", "  1630", "  1700", "  1730", "  1800", "  1830", "  1900", "  1930"}));
		comboBox.setBounds(80, 150, 84, 36);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"  0900", "  0930", "  1000", "  1030", "  1100", "  1130", "  1200", "  1230", "  1300", "  1330", "  1400", "  1430", "  1500", "  1530", "  1600", "  1630", "  1700", "  1730", "  1800", "  1830", "  1900", "  1930"}));
		comboBox_1.setFont(new Font("Arial", Font.PLAIN, 16));
		comboBox_1.setBounds(263, 150, 84, 36);
		panel.add(comboBox_1);
		
		JTextPane txtpnStorytellingRoominformation = new JTextPane();
		txtpnStorytellingRoominformation.setText("Story-telling room:\r\nThese rooms are stationed with experienced care-takers who will tell stories at fixed time slots during operating hours. \r\n\r\nPlease choose the time:\r\n");
		txtpnStorytellingRoominformation.setForeground(new Color(0, 0, 0));
		txtpnStorytellingRoominformation.setFont(new Font("Arial", Font.PLAIN, 16));
		txtpnStorytellingRoominformation.setOpaque(false);
		txtpnStorytellingRoominformation.setBounds(20, 244, 528, 109);
		panel.add(txtpnStorytellingRoominformation);
		
		JLabel label = new JLabel("From:");
		label.setForeground(new Color(0, 0, 0));
		label.setFont(new Font("Arial", Font.PLAIN, 16));
		label.setBounds(20, 364, 52, 23);
		panel.add(label);
		
		JLabel label_1 = new JLabel("To:");
		label_1.setForeground(new Color(0, 0, 0));
		label_1.setFont(new Font("Arial", Font.PLAIN, 16));
		label_1.setBounds(225, 364, 29, 23);
		panel.add(label_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"  0900", "  0930", "  1000", "  1030", "  1100", "  1130", "  1200", "  1230", "  1300", "  1330", "  1400", "  1430", "  1500", "  1530", "  1600", "  1630", "  1700", "  1730", "  1800", "  1830", "  1900", "  1930"}));
		comboBox_2.setFont(new Font("Arial", Font.PLAIN, 16));
		comboBox_2.setBounds(80, 359, 84, 36);
		panel.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"  0900", "  0930", "  1000", "  1030", "  1100", "  1130", "  1200", "  1230", "  1300", "  1330", "  1400", "  1430", "  1500", "  1530", "  1600", "  1630", "  1700", "  1730", "  1800", "  1830", "  1900", "  1930"}));
		comboBox_3.setFont(new Font("Arial", Font.PLAIN, 16));
		comboBox_3.setBounds(263, 359, 84, 36);
		panel.add(comboBox_3);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(255, 255, 204));
		separator.setOpaque(true);
		separator.setBounds(20, 244, 602, 2);
		panel.add(separator);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new DayCare3(myFrame);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
			}
		});
		btnConfirm.setBounds(444, 171, 95, 25);
		panel.add(btnConfirm);
		
		JButton button_1 = new JButton("Confirm");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new DayCare3(myFrame);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
			}
		});
		button_1.setBounds(444, 364, 95, 25);
		panel.add(button_1);
		
		JButton btnBack_1 = new JButton("Back");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new DayCareCalendar(myFrame,m);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
			}
		});
		btnBack_1.setBounds(444, 388, 95, 25);
		panel.add(btnBack_1);

	}
}
