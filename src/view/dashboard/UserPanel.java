package view.dashboard;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

import controller.AppController;

//This class
@SuppressWarnings("serial")
public class UserPanel extends JPanel {

	//Instance variables
	private JLabel welcomeMessage = new JLabel("Welcome!");
	private JLabel name = new JLabel(AppController.loggedInName);
	private JLabel lastName = new JLabel(AppController.loggedInLM);
	private JLabel profilePic = new JLabel(new ImageIcon("images/Anonymous.png"));
	public static JButton checkProfile = new JButton("Check profile");
	public static JButton logOut = new JButton("Log Out");
	
	public UserPanel() {
		
		setLayout(null);
		setBounds(50,50,600,300);
		setBackground(Color.LIGHT_GRAY);
		
		welcomeMessage.setBounds(280,85,340,38);
		welcomeMessage.setFont((new Font("Times New Roman", Font.PLAIN, 26)));
		
		name.setBounds(280,120,340,50);
		name.setFont((new Font("Times New Roman", Font.PLAIN, 42)));
		
		lastName.setBounds(280,170,340,50);
		lastName.setFont((new Font("Times New Roman", Font.PLAIN, 42)));
		
		profilePic.setBounds(50,50,179,179);
		
		checkProfile.setBounds(300,245,120,30);
		logOut.setBounds(435,245,120,30);
		
		add(name);
		add(welcomeMessage);
		add(lastName);
		add(profilePic);
		
		add(checkProfile);
		add(logOut);
		
	}

}
