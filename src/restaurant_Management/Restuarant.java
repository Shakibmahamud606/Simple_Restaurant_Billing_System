package restaurant_Management;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.UIManager;

public class Restuarant {

	public JFrame framea;
	private JTextField textField_01;
	private JTextField textField_02;
	private JTextField textField_03;
	private JTextField textField_04;
	private JTextField textField_05;
	private JTextField textField_06;
	private JTextField textField_07;
	private JTextField textField_08;
	private JTextField textField_09;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restuarant window = new Restuarant();
					window.framea.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Restuarant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		framea = new JFrame();
		framea.setBounds(0, 0, 1350, 750);
		framea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framea.getContentPane().setLayout(null);
		
		JPanel panelMeal = new JPanel();
		panelMeal.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panelMeal.setBounds(43, 77, 507, 311);
		framea.getContentPane().add(panelMeal);
		panelMeal.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Fuchka");
		lblChickenBurger.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblChickenBurger.setBounds(38, 123, 193, 31);
		panelMeal.add(lblChickenBurger);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Chess Burger");
		lblChickenBurgerMeal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblChickenBurgerMeal.setBounds(38, 165, 231, 38);
		panelMeal.add(lblChickenBurgerMeal);
		
		JLabel lblCheeseBurger = new JLabel("Beef Burger");
		lblCheeseBurger.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblCheeseBurger.setBounds(38, 214, 193, 31);
		panelMeal.add(lblCheeseBurger);
		
		textField_02 = new JTextField();
		textField_02.setText("40");
		textField_02.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_02.setBounds(325, 123, 149, 31);
		panelMeal.add(textField_02);
		textField_02.setColumns(10);
		
		textField_01 = new JTextField();
		textField_01.setText("140");
		textField_01.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_01.setColumns(10);
		textField_01.setBounds(325, 81, 149, 31);
		panelMeal.add(textField_01);
		
		textField_04 = new JTextField();
		textField_04.setText("100");
		textField_04.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_04.setColumns(10);
		textField_04.setBounds(325, 214, 149, 31);
		panelMeal.add(textField_04);
		
		JLabel lblNewLabel_2 = new JLabel("Meals");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel_2.setBounds(201, 21, 107, 31);
		panelMeal.add(lblNewLabel_2);
		
		JLabel lblBiriyani = new JLabel("Biriyani");
		lblBiriyani.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblBiriyani.setBounds(38, 81, 193, 31);
		panelMeal.add(lblBiriyani);
		
		textField_03 = new JTextField();
		textField_03.setText("120");
		textField_03.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_03.setColumns(10);
		textField_03.setBounds(325, 169, 149, 31);
		panelMeal.add(textField_03);
		
		textField_05 = new JTextField();
		textField_05.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_05.setColumns(10);
		textField_05.setText("45");
		textField_05.setBounds(325, 256, 149, 31);
		panelMeal.add(textField_05);
		
		JLabel lblChickenBurgerchickenBurger = new JLabel("Sandwitch");
		lblChickenBurgerchickenBurger.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblChickenBurgerchickenBurger.setBounds(38, 256, 207, 31);
		panelMeal.add(lblChickenBurgerchickenBurger);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"0","1", "2", "3", "4", "5", "6", "10", "15"}));
		comboBox_1.setBounds(273, 81, 42, 31);
		panelMeal.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setEditable(true);
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"0","1", "2", "3", "4", "5", "6", "10", "15"}));
		comboBox_2.setBounds(273, 123, 42, 31);
		panelMeal.add(comboBox_2);
		
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setEditable(true);
		comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"0","1", "2", "3", "4", "5", "6", "10", "15"}));
		comboBox_3.setBounds(273, 169, 42, 31);
		panelMeal.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setEditable(true);
		comboBox_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"0","1", "2", "3", "4", "5", "6", "10", "15"}));
		comboBox_4.setBounds(273, 214, 42, 31);
		panelMeal.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setEditable(true);
		comboBox_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"0","1", "2", "3", "4", "5", "6", "10", "15"}));
		comboBox_5.setBounds(273, 256, 42, 31);
		panelMeal.add(comboBox_5);
	
		JPanel panelCost = new JPanel();
		panelCost.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panelCost.setBounds(43, 399, 507, 219);
		framea.getContentPane().add(panelCost);
		panelCost.setLayout(null);
		
		JLabel label = new JLabel("Cost of Drinks");
		label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label.setBounds(36, 84, 193, 31);
		panelCost.add(label);
		
		JLabel label_1 = new JLabel("Cost of Meal");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_1.setBounds(36, 35, 210, 38);
		panelCost.add(label_1);
		
		JLabel lblTotalCostOf = new JLabel("Total Cost of Items");
		lblTotalCostOf.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTotalCostOf.setBounds(36, 125, 234, 31);
		panelCost.add(lblTotalCostOf);
		
		JLabel lblCostOfMeal = new JLabel("");
		lblCostOfMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCostOfMeal.setBounds(280, 35, 193, 31);
		lblCostOfMeal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelCost.add(lblCostOfMeal);
		
		JLabel lblCostOfDrinks = new JLabel("");
		lblCostOfDrinks.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCostOfDrinks.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCostOfDrinks.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblCostOfDrinks.setBounds(280, 84, 193, 31);
		panelCost.add(lblCostOfDrinks);
		
		JLabel lblCostOfItems = new JLabel("");
		lblCostOfItems.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCostOfItems.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCostOfItems.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblCostOfItems.setBounds(280, 126, 193, 31);
		panelCost.add(lblCostOfItems);
		
		JLabel lblDiscountType = new JLabel("Discount (%) :");
		lblDiscountType.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblDiscountType.setBounds(36, 171, 210, 38);
		panelCost.add(lblDiscountType);
		
		JComboBox comboBoxDisc = new JComboBox();
		comboBoxDisc.setEditable(true);
		comboBoxDisc.setModel(new DefaultComboBoxModel(new String[] {"0", "5", "6", "7", "8", "9", "10"}));
		comboBoxDisc.setFont(new Font("Tahoma", Font.BOLD, 17));
		comboBoxDisc.setBackground(Color.LIGHT_GRAY);
		comboBoxDisc.setBounds(313, 175, 62, 31);
		panelCost.add(comboBoxDisc);
		
		
		JPanel panelMemo = new JPanel();
		panelMemo.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panelMemo.setBounds(1013, 77, 314, 541);
		framea.getContentPane().add(panelMemo);
		panelMemo.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 37, 294, 427);
		panelMemo.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Receipt", null, panel, null);
		panel.setLayout(null);
		
		JTextPane textPaneRcpt = new JTextPane();
		textPaneRcpt.setEditable(false);
		textPaneRcpt.setBounds(10, 11, 269, 377);
		panel.add(textPaneRcpt);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("DevInfo", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTextPane txtpnDevelopedByTeam = new JTextPane();
		txtpnDevelopedByTeam.setEditable(false);
		txtpnDevelopedByTeam.setText("Developed By: \r\n\t\tTeam JAVARS\r\n\r\n\r\n\r\n---@MEMBERS@---\r\n\t1. Mohammad Abu Yousuf\r\n\t2. Shakib Mahamud\r\n\t3. Hasan Habib\r\n\t4. Owali Shawon\r\n\t5. Nazmul Antor\r\n\r\n\r\n\r\n---@CONTACT@---\r\n\tabuyousufjy@gmail.com\r\n\t+88017342605*5"

				
				);
		txtpnDevelopedByTeam.setBounds(20, 33, 247, 355);
		panel_1.add(txtpnDevelopedByTeam);
		
		JButton btnPdf = new JButton("PRINT");
		btnPdf.setForeground(Color.WHITE);
		btnPdf.setBackground(Color.BLACK);
		btnPdf.setBounds(159, 476, 132, 43);
		panelMemo.add(btnPdf);
		btnPdf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				try {
					
					boolean complete = textPaneRcpt.print();
				if(complete) {
					
					JOptionPane.showMessageDialog(null, "PRINTED");	
				}	
				} catch (Exception e) {
					
					JOptionPane.showConfirmDialog(null, e);
					
				}
			}
			
			
		});
		btnPdf.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		
		
		
		JPanel panelDrink = new JPanel();
		panelDrink.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panelDrink.setBounds(575, 77, 428, 311);
		framea.getContentPane().add(panelDrink);
		panelDrink.setLayout(null);
		
		JLabel lblDrinks = new JLabel("Drinks");
		lblDrinks.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblDrinks.setBounds(164, 22, 107, 31);
		panelDrink.add(lblDrinks);
		//
		
		JLabel lblClassicVanila = new JLabel("Cold Coffee");
		lblClassicVanila.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblClassicVanila.setBounds(23, 162, 189, 38);
		panelDrink.add(lblClassicVanila);
		
		JLabel lblVanillaCone = new JLabel("Hot Coffee");
		lblVanillaCone.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblVanillaCone.setBounds(23, 120, 177, 31);
		panelDrink.add(lblVanillaCone);
		
		JLabel lblMilkShake = new JLabel("Soft Drinks");
		lblMilkShake.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblMilkShake.setBounds(23, 78, 159, 31);
		panelDrink.add(lblMilkShake);
		
		JLabel lblChocolateMilkShake = new JLabel("Orio Shake");
		lblChocolateMilkShake.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblChocolateMilkShake.setBounds(23, 211, 234, 31);
		panelDrink.add(lblChocolateMilkShake);
		
		//
		textField_09 = new JTextField();
		textField_09.setText("150");
		textField_09.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_09.setColumns(10);
		textField_09.setBounds(310, 211, 91, 31);
		panelDrink.add(textField_09);
		
		textField_08 = new JTextField();
		textField_08.setText("80");
		textField_08.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_08.setColumns(10);
		textField_08.setBounds(310, 166, 91, 31);
		panelDrink.add(textField_08);
		
		textField_07 = new JTextField();
		textField_07.setText("60");
		textField_07.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_07.setColumns(10);
		textField_07.setBounds(310, 120, 91, 31);
		panelDrink.add(textField_07);
		
		textField_06 = new JTextField();
		textField_06.setText("20");
		textField_06.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_06.setColumns(10);
		textField_06.setBounds(310, 78, 91, 31);
		panelDrink.add(textField_06);
		
		JLabel lblVanillaMilkShake = new JLabel("Chocolate Shake");
		lblVanillaMilkShake.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblVanillaMilkShake.setBounds(23, 253, 207, 31);
		panelDrink.add(lblVanillaMilkShake);
		
		textField_10 = new JTextField();
		textField_10.setText("130");
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_10.setColumns(10);
		textField_10.setBounds(310, 253, 91, 31);
		panelDrink.add(textField_10);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_6.setEditable(true);
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"0","1", "2", "3", "4", "5", "6", "10", "15"}));
		comboBox_6.setBounds(258, 78, 42, 31);
		panelDrink.add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_7.setEditable(true);
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"0","1", "2", "3", "4", "5", "6", "10", "15"}));
		comboBox_7.setBounds(258, 120, 42, 31);
		panelDrink.add(comboBox_7);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_8.setEditable(true);
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"0","1", "2", "3", "4", "5", "6", "10", "15"}));
		comboBox_8.setBounds(258, 166, 42, 31);
		panelDrink.add(comboBox_8);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_9.setEditable(true);
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"0","1", "2", "3", "4", "5", "6", "10", "15"}));
		comboBox_9.setBounds(258, 211, 42, 31);
		panelDrink.add(comboBox_9);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_10.setEditable(true);
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"0","1", "2", "3", "4", "5", "6", "10", "15"}));
		comboBox_10.setBounds(258, 253, 42, 31);
		panelDrink.add(comboBox_10);
		
		JPanel panelTax = new JPanel();
		panelTax.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panelTax.setBounds(575, 399, 428, 219);
		framea.getContentPane().add(panelTax);
		panelTax.setLayout(null);
		
		JLabel lblTotal = new JLabel("");
		lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblTotal.setBounds(188, 173, 137, 31);
		panelTax.add(lblTotal);
		
		JLabel lblSubTotal = new JLabel("");
		lblSubTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblSubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblSubTotal.setBounds(188, 21, 137, 31);
		panelTax.add(lblSubTotal);
		
		JLabel lblTax = new JLabel("");
		lblTax.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTax.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblTax.setBounds(188, 70, 137, 31);
		panelTax.add(lblTax);
		
		JLabel labelDiscount = new JLabel("Discount");
		labelDiscount.setFont(new Font("Tahoma", Font.PLAIN, 25));
		labelDiscount.setBounds(26, 118, 152, 31);
		panelTax.add(labelDiscount);
		
		JLabel label_2_SubTotal = new JLabel("Sub Total");
		label_2_SubTotal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_2_SubTotal.setBounds(26, 21, 152, 38);
		panelTax.add(label_2_SubTotal);
		
		JLabel label1_Tax = new JLabel("Tax (6%)");
		label1_Tax.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label1_Tax.setBounds(26, 70, 152, 31);
		panelTax.add(label1_Tax);
		
		JLabel label_2 = new JLabel("Total");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_2.setBounds(26, 173, 152, 31);
		panelTax.add(label_2);
		
		JLabel lblDiscount = new JLabel("");
		lblDiscount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiscount.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDiscount.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblDiscount.setBounds(188, 118, 137, 31);
		panelTax.add(lblDiscount);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.DARK_GRAY);
		separator.setBounds(22, 160, 368, 2);
		panelTax.add(separator);
		
		JPanel panelExit = new JPanel();
		panelExit.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panelExit.setBounds(43, 623, 1284, 66);
		framea.getContentPane().add(panelExit);
		panelExit.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				double item1=Double.parseDouble(textField_01.getText());
				String x_1 = String.valueOf(comboBox_1.getSelectedItem());
				int qty_1 = Integer.parseInt(x_1);
				double prOf_1=(double)qty_1*item1;
				
				double item2=Double.parseDouble(textField_02.getText());
				String x_2 = String.valueOf(comboBox_2.getSelectedItem());
				int qty_2 = Integer.parseInt(x_2);
				double prOf_2=(double)qty_2*item2;
				
				double item3=Double.parseDouble(textField_03.getText());
				String x_3 = String.valueOf(comboBox_3.getSelectedItem());
				int qty_3 = Integer.parseInt(x_3);
				double prOf_3=(double)qty_3*item3;
				
				double item4=Double.parseDouble(textField_04.getText());
				String x_4 = String.valueOf(comboBox_4.getSelectedItem());
				int qty_4 = Integer.parseInt(x_4);
				double prOf_4=(double)qty_4*item4;
				
				double item5=Double.parseDouble(textField_05.getText());
				String x_5 = String.valueOf(comboBox_5.getSelectedItem());
				int qty_5 = Integer.parseInt(x_5);
				double prOf_5=(double)qty_5*item5;
				
				double costOfMeal=prOf_1+prOf_2+prOf_3+prOf_4+prOf_5;
		
				String cMeal=String.format( "%.2f", costOfMeal);
				lblCostOfMeal.setText(cMeal);
				//
				double item6=Double.parseDouble(textField_06.getText());
				String x_6 = String.valueOf(comboBox_6.getSelectedItem());
				int qty_6 = Integer.parseInt(x_6);
				double prOf_6=(double)qty_6*item6;
				
				double item7=Double.parseDouble(textField_07.getText());
				String x_7 = String.valueOf(comboBox_7.getSelectedItem());
				int qty_7 = Integer.parseInt(x_7);
				double prOf_7=(double)qty_7*item7;
				
				double item8=Double.parseDouble(textField_08.getText());
				String x_8 = String.valueOf(comboBox_8.getSelectedItem());
				int qty_8 = Integer.parseInt(x_8);
				double prOf_8=(double)qty_8*item8;
				
				double item9=Double.parseDouble(textField_09.getText());
				String x_9 = String.valueOf(comboBox_9.getSelectedItem());
				int qty_9= Integer.parseInt(x_9);
				double prOf_9=(double)qty_9*item9;
				
				double item10=Double.parseDouble(textField_10.getText());
				String x_10 = String.valueOf(comboBox_10.getSelectedItem());
				int qty_10 = Integer.parseInt(x_10);
				double prOf_10=(double)qty_10*item10;
				
				double costOfDrink=prOf_9+prOf_8+prOf_7+prOf_6+prOf_10;
		
				String cDrink=String.format( "%.2f", costOfDrink);
				lblCostOfDrinks.setText(cDrink);
				
				//
				double costOfDrinkAndMeal=costOfDrink+costOfMeal;
				String cDrinkAndMeal=String.format( "%.2f", costOfDrinkAndMeal);
				lblCostOfItems.setText(cDrinkAndMeal);
				lblSubTotal.setText(cDrinkAndMeal);
				
				double costOfTax =(costOfDrinkAndMeal*0.06);
				
				String cTax=String.format( "%.2f", costOfTax);
				lblTax.setText(cTax);
				
		// Variable name should be replaced by suitable name!!
				//discount !!                                    prb here!!
				
				String dis = String.valueOf(comboBoxDisc.getSelectedItem());
				 int disc = Integer.parseInt(dis);
				 
				 double x= (disc)*0.01; 
				
				 double disca=(costOfDrink+costOfMeal)*x;
				String allDiscaount=String.format( "%.2f", disca);
				lblDiscount.setText(allDiscaount);
			
				// mone thakbe ?? 
				
				
				double total =(costOfTax+costOfDrink+costOfMeal)-disca;				
				String cTotal=String.format( "%.2f", total);
				lblTotal.setText(cTotal);
				
				
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnTotal.setBounds(110, 16, 121, 35);
		panelExit.add(btnTotal);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
		
//				
				String meal = String.valueOf(lblCostOfMeal.getText());
				String drink = String.valueOf(lblCostOfDrinks.getText());
				String subTotal = String.valueOf(lblSubTotal.getText());
				String tax = String.valueOf(lblTax.getText());
				String discaount = String.valueOf(lblDiscount.getText());
				String total = String.valueOf(lblTotal.getText());


				
				Calendar timer=Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime= new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat Tdate= new SimpleDateFormat("dd-MM-yyyy");		
		
				
				
			textPaneRcpt.setText("\n       ***ABAR KHABO RESTORA***\n"
			+"\n\n\nProduct\t\tAmount\n" 
		

					+"\n\nMeals:\t\t"+meal
					+"\nDrinks:\t\t"+drink
					+"\nSub Total:\t\t"+subTotal
					+"\nTax:\t\t"+tax
					+"\nDiscount:\t\t"+discaount
					
					+"\n-------------------------------------------------------------"
					
					+"\nTOTAL\t\t"+total+"  TK"
					
					
					+"\n==================================="+
					"\n\nDate:"+Tdate.format(timer.getTime())+
					"\tTime: "+tTime.format(timer.getTime())
					

					+"\n\n\n\t----THANK YOU----\n"
					
					
					);
			
			
		
				
			}
		});
		
		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReceipt.setBounds(415, 16, 121, 35);
		panelExit.add(btnReceipt);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnExit.setBounds(1029, 16, 198, 35);
		panelExit.add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//things in below can be done by loop!
				/*
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				*/
				lblCostOfMeal.setText(null);
				lblCostOfDrinks.setText(null);
				lblCostOfItems.setText(null);
				
				lblTax.setText(null);
				lblSubTotal.setText(null);
				lblDiscount.setText(null);
				lblTotal.setText(null);
				
				comboBox_1.setSelectedItem("0");
				comboBox_2.setSelectedItem("0");
				comboBox_3.setSelectedItem("0");
				comboBox_4.setSelectedItem("0");
				comboBox_5.setSelectedItem("0");
				comboBox_6.setSelectedItem("0");
				comboBox_7.setSelectedItem("0");
				comboBox_8.setSelectedItem("0");
				comboBox_9.setSelectedItem("0");
				comboBox_10.setSelectedItem("0");
			//	comboBoxDisTyp.setSelectedItem("0");
				
		
				textPaneRcpt.setText(null);


				//make all null here when reset
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReset.setBounds(733, 16, 121, 35);
		panelExit.add(btnReset);
		
		JLabel lblNewLabel = new JLabel("Restaurant Management System");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setBounds(43, 11, 1284, 66);
		framea.getContentPane().add(lblNewLabel);
	}
}