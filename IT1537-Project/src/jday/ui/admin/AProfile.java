package jday.ui.admin;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import jday.util.BackgroundPanel;


public class AProfile extends BackgroundPanel{
	private JTable table;

	/**
	 * Create the panel.
	 */
	public AProfile() {
		super();
		initialize();
	}
	
	public AProfile(JFrame f){
		this();
		myFrame = f;
	}
	
	private void initialize(){
		setSize(new Dimension(750, 500));
		setLayout(null);
		
		JLabel label = new JLabel("logo");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel panel = new AMainpage(myFrame);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
			}
		});
		label.setIcon(new ImageIcon(AProfile.class.getResource("/pic/90logo.png")));
		label.setBounds(10, 11, 94, 102);
		add(label);
		
		table = new JTable();
		table.setBackground(new Color(216, 191, 216));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Birth Date", "Member ID", "PIN", "Contact No.(H)", "Contact No.(M)", "E-mail", "Address"},
				{"John Tan", "01-03-1972", "122347M", "1224", "6555 7333", "9872 3333", "john@yahoo.com", null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setRowHeight(40);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(59, 142, 641, 240);
		add(table);
		
		JLabel lblMemberIdname = new JLabel("Member ID/Name");
		lblMemberIdname.setBounds(59, 399, 85, 25);
		add(lblMemberIdname);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		textArea.setBounds(154, 393, 154, 30);
		add(textArea);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(330, 400, 89, 23);
		add(btnSearch);
		
		JButton btnViewSummary = new JButton("View Summary");
		btnViewSummary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JPanel panel = new AViewSummary(myFrame);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
			}
		});
		btnViewSummary.setBounds(577, 400, 123, 23);
		add(btnViewSummary);
		
		JLabel label_1 = new JLabel("JDAY Members Profile");
		label_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 30));
		label_1.setBounds(114, 43, 312, 42);
		add(label_1);

	}

}
