package view.userScreen;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class UserFrame extends JFrame {
	
	public static JButton toDashBoard = new JButton("Back");
	
	private LocationPanel locationPanel = new LocationPanel();
	private GradesPanel gradesPanel = new GradesPanel();
	
	public UserFrame() {
		
		setLayout(null);
		setSize(1920,1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("UniGO - User Profile");
        
		toDashBoard.setBounds(10,10,80,30);
		
		add(toDashBoard);
        add(locationPanel);
        add(gradesPanel);
        
        setVisible(true);
        
		
	}
	
}