package view.userlogin;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class LoginPanel extends JPanel  {
	
	private JLabel backgroundImg;
	
	public static JButton loginButton;
	public static JButton signupButton;
	
	public static JTextField userNameTextField;
	public static JPasswordField passwordField;
	
	public static JLabel invalidID;
	
	public LoginPanel() {
		
		setLayout(null);
		setBounds(0,0,1920,1080);
		
		addButtons();
		addTextField();
		
		invalidID = new JLabel();
		invalidID.setText("Invalid username/password! Try again!");
		invalidID.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		invalidID.setForeground(Color.RED);
		invalidID.setBounds(1260,630,500,40);
		invalidID.setVisible(false);
		add(invalidID);
		
		backgroundImg = new JLabel(new ImageIcon("images/LoginPanel.png"));
		backgroundImg.setBounds(0,0,1920,1080);
		add(backgroundImg);
	}
	
	public void addButtons() {
		
		loginButton = new JButton();
		loginButton.setBounds(1270,700,200,70);
		loginButton.setText("Login");
		
		signupButton = new JButton();
		signupButton.setBounds(1520,700,200,70);
		signupButton.setText("Sign Up");
		
		add(loginButton);
		add(signupButton);
		
	}
	
	public void addTextField() {
		
		userNameTextField = new JTextField();
		userNameTextField.setBounds(1395,480,380,40);
		userNameTextField.setFont(new Font("Arial", Font.PLAIN, 20));
		add(userNameTextField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(1395,560,380,40);
		passwordField.setFont(new Font("Arial", Font.PLAIN, 20));
		add(passwordField);
		
	}
		
}

