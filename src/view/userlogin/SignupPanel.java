package view.userlogin;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controller.AppController;

@SuppressWarnings("serial")
public class SignupPanel extends JPanel {

	private JLabel backgroundImg;
	public static JLabel fillFields;
	
	public static JButton loginButton;
	public static JButton signupButton;
	
	public static JTextField nameTextField;
	public static JTextField lastNameTextField;
	public static JTextField userNameTextField;
	public static JPasswordField passwordField;

	public SignupPanel() {
		
		setLayout(null);
		setBounds(0,0,1920,1080);
		
		addButtons();
		addTextField();
		
		fillFields = new JLabel();
		fillFields.setText("Fill out all fields/User Exists!");
		fillFields.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		fillFields.setForeground(Color.RED);
		fillFields.setBounds(840,700,400,40);
		fillFields.setVisible(false);
		add(fillFields);
		
		backgroundImg = new JLabel(new ImageIcon("images/SignupPanel.png"));
		backgroundImg.setBounds(0,0,1920,1080);
		add(backgroundImg);
		
	}
	
	public void addButtons() {
		
		loginButton = new JButton();
		loginButton.setBounds(1020,800,200,70);
		loginButton.setText("Login");
		
		signupButton = new JButton();
		signupButton.setBounds(770,800,200,70);
		signupButton.setText("Sign Up");
		
		add(loginButton);
		add(signupButton);
		
	}
	
	public void addTextField() {
		
		nameTextField = new JTextField();
		nameTextField.setBounds(900,405,380,40);
		nameTextField.setFont(new Font("Arial", Font.PLAIN, 20));
		add(nameTextField);
		
		lastNameTextField = new JTextField();
		lastNameTextField.setBounds(900,485,380,40);
		lastNameTextField.setFont(new Font("Arial", Font.PLAIN, 20));
		add(lastNameTextField);
		
		userNameTextField = new JTextField();
		userNameTextField.setBounds(900,565,380,40);
		userNameTextField.setFont(new Font("Arial", Font.PLAIN, 20));
		add(userNameTextField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(900,645,380,40);
		passwordField.setFont(new Font("Arial", Font.PLAIN, 20));
		add(passwordField);
		
	}

}
