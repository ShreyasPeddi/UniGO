package view.userlogin;

import javax.swing.*;

@SuppressWarnings("serial")
public class HomePanel extends JPanel {
	
//	private JLabel background;
	
	public static JButton signUp = new JButton("Sign Up");
	
	public static JButton login = new JButton("Login");
	
	public HomePanel() {
		
		setLayout(null);
		setBounds(0,0,1920,1080);
		
		addButtons();
		
	}
	
	
	public void addButtons() {
		
		//ImageIcon signUp = new ImageIcon("images/SignUp.png");
		//buttonArray[0].setIcon(signUp);
		signUp.setBounds(1040,460,400,400);

		//ImageIcon login = new ImageIcon("images/Login.png");
		//buttonArray[1].setIcon(login);
		login.setBounds(1440,460,400,400);
		
		add(signUp);
		add(login);
		
	}

}

