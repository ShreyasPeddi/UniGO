package view.dashboard;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MatchPanel extends JPanel {
	
	public static JButton survey = new JButton("Take a survey!");
	
	public MatchPanel() { 
		
		setLayout(null);
		setBounds(1300,50,570,930);
		setBackground(Color.LIGHT_GRAY);
		
		survey.setBounds(395,875,140,30);
		
		add(survey);
		
	}

}
