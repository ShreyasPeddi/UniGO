package view.dashboard;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CriteriaPanel extends JPanel {

	public static JButton checkRequirements = new JButton("Check Program Requirements");
	
	public CriteriaPanel() {
		
		setLayout(null);
		setBounds(50,400,600,580);
		setBackground(Color.LIGHT_GRAY);
		
		checkRequirements.setBounds(355,520,215,30);
		
		add(checkRequirements);
		
	}
	
}
