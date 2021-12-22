package view.userScreen;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class LocationPanel extends JPanel {
	
	private JLabel backgroundImg;
	public static JTextField city = new JTextField();
	public static JTextField streetNum = new JTextField();
	public static JTextField streetName = new JTextField();
	public static JButton confirm = new JButton("Confirm");
	
	public LocationPanel() {
		
		setLayout(null);
		setBounds(70,500,960,430);
		
		backgroundImg = new JLabel(new ImageIcon("images/LocationPanel.png"));
		backgroundImg.setBounds(0,0,960,430);
		
		confirm.setBounds(830,365,90,40);
		
		add(confirm);
		addTextField();
		add(backgroundImg);
	}
	
	public void addTextField() {
		
		city = new JTextField();
		city.setBounds(270,115,420,40);
		city.setFont(new Font("Arial", Font.PLAIN, 20));
		add(city);
		
		streetNum = new JTextField();
		streetNum.setBounds(270,200,420,40);
		streetNum.setFont(new Font("Arial", Font.PLAIN, 20));
		add(streetNum);
		
		streetName = new JTextField();
		streetName.setBounds(270,290,420,40);
		streetName.setFont(new Font("Arial", Font.PLAIN, 20));
		add(streetName);

	}

}