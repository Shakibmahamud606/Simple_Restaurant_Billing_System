package loginPage;


import java.sql.*;
import java.util.Iterator;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import restaurant_Management.Restuarant;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
// import java.


public class FirstLayout {

	private JFrame frame;
	private JPasswordField passwordField_1;
	private JTextField textField;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstLayout window = new FirstLayout();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FirstLayout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 950,580);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("LOG IN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uname=textField.getText();
				String pass=passwordField_1.getText();
	
				if(uname.contains("APOYS") && pass.contains("abc123")) {
					
					// U have to put the Username=Almas and pass=abc123
					
					textField.setText(null);
					passwordField_1.setText(null);
					
					Restuarant res=new Restuarant();
					res.main(null);			
				}
				else {
					
					textField.setText(null);
					passwordField_1.setText(null);
					JOptionPane.showMessageDialog(null, "INVALID USERNAME OR PASSWORD");
					
				}
				
					
		/*		try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
					Statement stmt=con.createStatement();
				//	String sql="Select * from tbLogin where UserName='"+textField.getText()+"' and Password='"+passwordField_1.getText().toString()+'";
					ResultSet rs=stmt.executeQuery(sql);
					if (rs.next()) {
						JOptionPane.showConfirmDialog(null, "LOGGED IN");
					} else {
						JOptionPane.showConfirmDialog(null, "INVALID pass")
					}
					
				} catch (Exception e2) {
			//	System.out.println(e2);
				}
				
			*/
				
				//Ignore this block above in the commented area! It was for database but failed to connect!!!
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(668, 408, 116, 43);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(490, 283, 130, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(490, 336, 126, 43);
		frame.getContentPane().add(lblNewLabel_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(662, 340, 242, 43);
		frame.getContentPane().add(passwordField_1);
		
		textField = new JTextField();
		textField.setBounds(662, 287, 242, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnNewButton_1 = new JButton("EXIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
			
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_1.setBounds(794, 408, 116, 43);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel label = new JLabel("Restaurant Management System");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 50));
		label.setBounds(0, 11, 934, 89);
		frame.getContentPane().add(label);
		
		JLabel lblLoginPannel = new JLabel("LOGIN PAGE");
		lblLoginPannel.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginPannel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblLoginPannel.setBounds(55, 111, 327, 89);
		frame.getContentPane().add(lblLoginPannel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ASUS\\Pictures\\For presentation\\restaurant-chief-food-hotel-logo-9DE9D03812-seeklogo.com (3).png"));
		lblNewLabel_2.setBounds(65, 210, 346, 270);
		frame.getContentPane().add(lblNewLabel_2);
	}
}

