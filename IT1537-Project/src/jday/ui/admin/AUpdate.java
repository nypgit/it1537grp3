package jday.ui.admin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import jday.util.BackgroundPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AUpdate extends BackgroundPanel {
	private JTable table;
	private JTable table_1;

	/**
	 * Create the panel.
	 */
	public AUpdate() {
		super();
		initialize();
	}
	
	public AUpdate(JFrame f){
		this();
		myFrame = f;
	}
	
	private void initialize(){
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Arial", Font.PLAIN, 14));
		setBackground(new Color(204, 51, 153));
		setSize(new Dimension(750, 500));
		setLayout(null);
		
		JLabel label = new JLabel("logo");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JPanel panel = new AMainpage(myFrame);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
				
			}
		});
		label.setIcon(new ImageIcon(ARegister.class.getResource("/pic/90logo.png")));
		label.setBounds(10, 11, 94, 102);
		add(label);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			JPanel panel = new AUpdate2(myFrame);
			myFrame.getContentPane().removeAll();
			myFrame.getContentPane().add(panel);
			myFrame.getContentPane().validate();
			myFrame.getContentPane().repaint();
			}
		});
		table.setRowHeight(50);
		table.setName("Calendar");
		table.setFont(new Font("Arial", Font.PLAIN, 15));
		table.setCellSelectionEnabled(true);
		table.setBackground(new Color(255, 204, 204));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, "1", "2", "3"},
				{"4", "5", "6", "7", "8", "9", "10"},
				{"11", "12", "13", "14", "15", "16", "17"},
				{"18", "19", "20", "21", "22", "23", "24"},
				{"25", "26", "27", "28", "29", "30", null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(12, 237, 730, 250);
		add(table);
		
		table_1 = new JTable();
		table_1.setForeground(Color.WHITE);
		table_1.setBackground(new Color(0, 0, 51));
		table_1.setRowHeight(35);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_1.setFont(new Font("Arial", Font.PLAIN, 15));
		table_1.setRowMargin(0);
		table_1.setBounds(12, 202, 730, 35);
		add(table_1);
		
		JPanel panel = new JPanel();
		panel.setFont(new Font("Arial", Font.PLAIN, 15));
		panel.setBackground(new Color(102, 0, 102));
		panel.setBounds(12, 131, 730, 71);
		add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("<");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 21));
		btnNewButton.setBounds(89, 11, 89, 49);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("November");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(188, 11, 258, 49);
		panel.add(lblNewLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(2012, 2012, 2050, 1));
		spinner.setFont(new Font("Arial", Font.PLAIN, 20));
		spinner.setBounds(429, 11, 82, 49);
		panel.add(spinner);
		
		JButton button_1 = new JButton(">");
		button_1.setFont(new Font("Arial", Font.PLAIN, 21));
		button_1.setBounds(553, 11, 89, 49);
		panel.add(button_1);

	}
}
