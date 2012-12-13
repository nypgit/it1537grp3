package jday.ui.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import jday.entities.Member;
import jday.util.BackgroundPanel;

public class FnBMain extends BackgroundPanel{


	private Member m = null;
	private JList list;
	private JPanel All;
	private JPanel Vegetarian;
	private JPanel Beef;
	private JPanel Chicken;
	private JPanel Fish;
	
	public FnBMain() {
		super();
		initialize();
	
	}
	
	public FnBMain(JFrame f){
	this();
	myFrame = f;
}
	
	public FnBMain(JFrame f, Member m){
		super();
		myFrame = f;
		this.m = m;
		initialize();
	}
	
	private void initialize(){
		setSize(750,500);
		setLayout(null);
		JLabel lblFoodAndBeverages = new JLabel("Food and Beverages");
		lblFoodAndBeverages.setForeground(new Color(0, 0, 0));
		lblFoodAndBeverages.setHorizontalAlignment(SwingConstants.CENTER);
		lblFoodAndBeverages.setFont(new Font("Trebuchet MS", Font.ITALIC, 18));
		lblFoodAndBeverages.setBounds(81, 22, 574, 39);
		add(lblFoodAndBeverages);
		
		JLabel lblPromotions = new JLabel("Chef Specials:");
		lblPromotions.setForeground(new Color(0, 0, 0));
		lblPromotions.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblPromotions.setHorizontalAlignment(SwingConstants.CENTER);
		lblPromotions.setBounds(48, 22, 168, 39);
		add(lblPromotions);
		
		list = new JList();
		list.setForeground(new Color(0, 0, 0));
		list.setFont(new Font("Candara", Font.PLAIN, 16));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"All", "Vegetarian", "Beef", "Chicken", "Fish"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setSelectedIndex(0);
		list.setVisibleRowCount(3);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setOpaque(false);
		list.setBounds(59, 233, 168, 186);
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setOpaque(false);
		scrollPane.setLocation(48, 270);
		scrollPane.setSize(160, 100);
		add(scrollPane);

		
		JLabel lblMainMenu = new JLabel("Main Menu:");
		lblMainMenu.setForeground(new Color(0, 0, 0));
		lblMainMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMainMenu.setFont(new Font("Candara", Font.BOLD, 16));
		lblMainMenu.setBounds(34, 238, 174, 32);
		add(lblMainMenu);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new FnBDelivery(myFrame);
				myFrame .getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
			}
		});
		btnNext.setOpaque(false);
		btnNext.setForeground(new Color(0, 0, 0));
		btnNext.setFont(new Font("Candara", Font.PLAIN, 16));
		btnNext.setBounds(638, 347, 89, 23);
		add(btnNext);
		
		JButton btnViewMyOrder = new JButton("View my order");
		btnViewMyOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new FnBViewOrder(myFrame);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
			}
		});
		btnViewMyOrder.setOpaque(false);
		btnViewMyOrder.setForeground(new Color(0, 0, 0));
		btnViewMyOrder.setFont(new Font("Candara", Font.PLAIN, 16));
		btnViewMyOrder.setBounds(552, 30, 160, 23);
		add(btnViewMyOrder);
		
		All = new JPanel();
		All.setOpaque(false);
		All.setVisible(true);
		All.setBackground(new Color(255, 255, 255));
		All.setBounds(272, 232, 356, 201);
		add(All);
		All.setLayout(null);
		
		JCheckBox chckbxMushroomSoup = new JCheckBox("Mushroom Soup");
		chckbxMushroomSoup.setOpaque(false);
		chckbxMushroomSoup.setBounds(45, 10, 125, 23);
		All.add(chckbxMushroomSoup);
		
		JCheckBox chckbxChickenSoup = new JCheckBox("Chicken Soup");
		chckbxChickenSoup.setOpaque(false);
		chckbxChickenSoup.setBounds(45, 36, 115, 23);
		All.add(chckbxChickenSoup);
		
		JCheckBox chckbxChickenChop = new JCheckBox("Chicken Chop");
		chckbxChickenChop.setOpaque(false);
		chckbxChickenChop.setBounds(45, 64, 115, 23);
		All.add(chckbxChickenChop);
		
		JCheckBox chckbxChickenCutlet = new JCheckBox("Chicken Cutlet");
		chckbxChickenCutlet.setOpaque(false);
		chckbxChickenCutlet.setBounds(45, 90, 115, 23);
		All.add(chckbxChickenCutlet);
		
		JCheckBox chckbxFishNChips = new JCheckBox("Fish n Chips");
		chckbxFishNChips.setOpaque(false);
		chckbxFishNChips.setBounds(45, 116, 115, 23);
		All.add(chckbxFishNChips);
		
		JCheckBox chckbxGrilledfish = new JCheckBox("GrilledFish");
		chckbxGrilledfish.setOpaque(false);
		chckbxGrilledfish.setBounds(45, 142, 115, 23);
		All.add(chckbxGrilledfish);
		
		JCheckBox chckbxRoastBeef = new JCheckBox("Roast Beef");
		chckbxRoastBeef.setOpaque(false);
		chckbxRoastBeef.setBounds(201, 10, 115, 23);
		All.add(chckbxRoastBeef);
		
		JCheckBox chckbxBeefSpaghetti = new JCheckBox("Beef Spaghetti");
		chckbxBeefSpaghetti.setOpaque(false);
		chckbxBeefSpaghetti.setBounds(201, 37, 115, 23);
		All.add(chckbxBeefSpaghetti);
		
		JCheckBox chckbxBeeHoon = new JCheckBox("Bee Hoon");
		chckbxBeeHoon.setOpaque(false);
		chckbxBeeHoon.setBounds(201, 65, 115, 23);
		All.add(chckbxBeeHoon);
		
		JCheckBox chckbxFriedRice = new JCheckBox("Fried Rice");
		chckbxFriedRice.setOpaque(false);
		chckbxFriedRice.setBounds(201, 91, 115, 23);
		All.add(chckbxFriedRice);
		
		JCheckBox chckbxCoke = new JCheckBox("Coke");
		chckbxCoke.setOpaque(false);
		chckbxCoke.setBounds(201, 117, 115, 23);
		All.add(chckbxCoke);
		
		JCheckBox chckbxCheesecake = new JCheckBox("Cheesecake");
		chckbxCheesecake.setOpaque(false);
		chckbxCheesecake.setBounds(201, 143, 115, 23);
		All.add(chckbxCheesecake);
		
		Vegetarian = new JPanel();
		Vegetarian.setOpaque(false);
		Vegetarian.setVisible(false);
		Vegetarian.setBounds(272, 232, 356, 201);
		add(Vegetarian);
		Vegetarian.setLayout(null);
		Vegetarian.setBackground(Color.WHITE);
		
		JCheckBox cb4 = new JCheckBox("Mushroom Soup");
		cb4.setOpaque(false);
		cb4.setBounds(45, 10, 125, 23);
		Vegetarian.add(cb4);
		
		JCheckBox cb5 = new JCheckBox("Bee Hoon");
		cb5.setOpaque(false);
		cb5.setBounds(45, 38, 115, 23);
		Vegetarian.add(cb5);
		
		JCheckBox cb6 = new JCheckBox("Fried Rice");
		cb6.setOpaque(false);
		cb6.setBounds(45, 66, 115, 23);
		Vegetarian.add(cb6);

		Beef = new JPanel();
		Beef.setOpaque(false);
		Beef.setVisible(false);
		Beef.setBounds(272, 232, 356, 201);
		add(Beef);
		Beef.setLayout(null);
		Beef.setBackground(Color.WHITE);
		
		JCheckBox cb2 = new JCheckBox("Roast Beef");
		cb2.setOpaque(false);
		cb2.setBounds(47, 10, 115, 23);
		Beef.add(cb2);
		
		JCheckBox cb3 = new JCheckBox("Beef Spaghetti");
		cb3.setOpaque(false);
		cb3.setBounds(47, 37, 115, 23);
		Beef.add(cb3);
		
		Chicken = new JPanel();
		Chicken.setOpaque(false);
		Chicken.setVisible(false);
		Chicken.setBounds(272, 232, 356, 201);
		add(Chicken);
		Chicken.setLayout(null);
		Chicken.setBackground(Color.WHITE);
		
		JCheckBox cb7 = new JCheckBox("Chicken Soup");
		cb7.setOpaque(false);
		cb7.setBounds(47, 9, 115, 23);
		Chicken.add(cb7);
		
		JCheckBox cb8 = new JCheckBox("Chicken Chop");
		cb8.setOpaque(false);
		cb8.setBounds(47, 37, 115, 23);
		Chicken.add(cb8);
		
		JCheckBox cb9 = new JCheckBox("Chicken Cutlet");
		cb9.setOpaque(false);
		cb9.setBounds(47, 65, 115, 23);
		Chicken.add(cb9);
		
		Fish = new JPanel();
		Fish.setVisible(false);
		Fish.setOpaque(false);
		Fish.setBounds(272, 232, 356, 201);
		add(Fish);
		Fish.setLayout(null);
		Fish.setBackground(Color.WHITE);
		
		JCheckBox cb = new JCheckBox("Fish n Chips");
		cb.setOpaque(false);
		cb.setBounds(47, 10, 115, 23);
		Fish.add(cb);
		
		JCheckBox cb1 = new JCheckBox("GrilledFish");
		cb1.setOpaque(false);
		cb1.setBounds(47, 37, 115, 23);
		Fish.add(cb1);
		
		JLabel lblpekingDuckbefore = new JLabel("<html>Peking Duck<br>\r\n<u>Before: $32.00<br>\r\nAfter: <b>$27.00</b></u>\r\n</html>");
		lblpekingDuckbefore.setForeground(new Color(0, 0, 0));
		lblpekingDuckbefore.setHorizontalTextPosition(SwingConstants.CENTER);
		lblpekingDuckbefore.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblpekingDuckbefore.setFont(new Font("Candara", Font.PLAIN, 16));
		lblpekingDuckbefore.setHorizontalAlignment(SwingConstants.LEFT);
		lblpekingDuckbefore.setVerticalAlignment(SwingConstants.TOP);
		lblpekingDuckbefore.setIcon(new ImageIcon(FnBMain.class.getResource("/pic/pekingduck.jpg")));
		lblpekingDuckbefore.setBounds(34, 72, 206, 167);
		add(lblpekingDuckbefore);
		list.addListSelectionListener(
				new ListSelectionListener(){
					public void valueChanged(ListSelectionEvent e){
						
						if( list.getSelectedIndex()==0){
							Vegetarian.setVisible(false);
							Beef.setVisible(false);
							Chicken.setVisible(false);
							Fish.setVisible(false);
							All.setVisible(true);
						}
						if(list.getSelectedIndex()==1){
							Vegetarian.setVisible(true);
							Beef.setVisible(false);
							Chicken.setVisible(false);
							Fish.setVisible(false);
							All.setVisible(false);
						}
								if(list.getSelectedIndex()==2){
									Vegetarian.setVisible(false);
									Beef.setVisible(true);
									Chicken.setVisible(false);
									Fish.setVisible(false);
									All.setVisible(false);
								}
									if(list.getSelectedIndex()==3){
										Vegetarian.setVisible(false);
										Beef.setVisible(false);
										Chicken.setVisible(true);
										Fish.setVisible(false);
										All.setVisible(false);
									}
										if(list.getSelectedIndex()==4){
											Vegetarian.setVisible(false);
											Beef.setVisible(false);
											Chicken.setVisible(false);
											Fish.setVisible(true);
											All.setVisible(false);
										}
					}
				}
				);

	}
}
