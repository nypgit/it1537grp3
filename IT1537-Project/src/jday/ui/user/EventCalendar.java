package jday.ui.user;

import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JLabel;

import jday.entities.Member;
import jday.util.BackgroundPanel;


public class EventCalendar extends BackgroundPanel {



	private static final long serialVersionUID = 1L;
	private JLabel jLabelCalendar = null;
	private Member m = null;

	/**
	 * This is the default constructor
	 */
	public EventCalendar() {
		super();
		initialize();
	}
	public EventCalendar(JFrame f){
		this();
		myFrame= f;
	}

	public EventCalendar(JFrame f, Member m) {
		super();
		myFrame = f;
		this.m = m;
		initialize();
	}
	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		jLabelCalendar = new JLabel();
		jLabelCalendar.setBounds(new Rectangle(48, 25, 495, 149));
		jLabelCalendar.setText("Event Calender");
		this.setSize(750,500);
		this.setLayout(null);

		this.add(jLabelCalendar, null);
		
	}

	}  //  @jve:decl-index=0:visual-constraint="2,4"
