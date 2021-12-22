package view.dashboard;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MapPanel extends JPanel {
	
	public static JButton lookAtPrograms = new JButton("Look at Programs");
	
	public MapPanel() {
		
		setLayout(null);
		setBounds(700,50,550,500);
		setBackground(Color.LIGHT_GRAY);
		
		lookAtPrograms.setBounds(375,445,140,30);
		
		add(lookAtPrograms);
		
	}

}
