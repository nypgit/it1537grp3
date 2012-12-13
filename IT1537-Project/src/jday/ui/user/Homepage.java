package jday.ui.user;

import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Point;
import javax.swing.JButton;

public class Homepage extends GradientPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabelJDay = null;
	private JLabel jLabelInfo = null;
	private JButton jButtonLogout = null;
	private JFrame myFrame = null;
	/**
	 * This is the default constructor
	 */
	public Homepage() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		jLabelInfo = new JLabel();
		jLabelInfo.setBounds(new Rectangle(403, 2, 83, 47));
		jLabelInfo.setText("123188g");
		jLabelJDay = new JLabel();
		jLabelJDay.setFont(new Font("Arial", Font.BOLD, 18));
		jLabelJDay.setHorizontalAlignment(SwingConstants.LEFT);
		jLabelJDay.setLocation(new Point(3, 5));
		jLabelJDay.setSize(new Dimension(106, 39));
		jLabelJDay.setHorizontalTextPosition(SwingConstants.TRAILING);
		jLabelJDay.setVerticalAlignment(SwingConstants.TOP);
		jLabelJDay.setText("JDAY CC");
		this.setSize(600, 400);
		this.setLayout(null);
		this.add(jLabelJDay, null);
		this.add(jLabelInfo, null);
		this.add(getJButtonLogout(), null);
	}

		public Homepage(JFrame f){
			this();
			myFrame = f;
		}
	/**
	 * This method initializes jButtonLogout	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonLogout() {
		if (jButtonLogout == null) {
			jButtonLogout = new JButton();
			jButtonLogout.setBounds(new Rectangle(486, 2, 80, 45));
			jButtonLogout.setText("Logout");
			jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JPanel panel=new LoginPage(myFrame);
					myFrame.getContentPane().removeAll();
					myFrame.getContentPane().add(panel);
					myFrame.getContentPane().validate();
					myFrame.getContentPane().repaint();
					
				}
			});
		}
		return jButtonLogout;
	}

}
