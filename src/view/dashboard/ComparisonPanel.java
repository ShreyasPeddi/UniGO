package view.dashboard;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ComparisonPanel extends JPanel{
	
	public static JButton compare = new JButton("Compare programs");

	public ComparisonPanel() {
		
		setLayout(null);
		setBounds(700,600,550,380);
		setBackground(Color.LIGHT_GRAY);
		
		compare.setBounds(360,325,150,30);
		
		add(compare);
		
	}
	
}
