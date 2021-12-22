package view.comparison;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * Author: Gordon 
 * This class is a frame that contains all the comparison panels which are used for comparing 2 programs 
 * and their numerical information(Tuition, Program rating, and Admission average) 
 */
public class CompareProgramsFrame extends JFrame{
	
	private GraphPanel graphPanel = new GraphPanel();
	private OptionsPanel optionsPanel= new OptionsPanel();
	private JButton goBackButton;
	
	//Constructor
	public CompareProgramsFrame() {
			
		//Set up the frame 
		setTitle("UniGO - Comparison");
		setLayout(null);
		setSize(1920, 1080);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Setup back button
		goBackButton = new JButton(new ImageIcon("images/backIcon.png")); 
		goBackButton.setBounds(this.getX()+30,this.getY()+20,40,40);
		goBackButton.setOpaque(false);
		goBackButton.setContentAreaFilled(false);
		goBackButton.setBorderPainted(false);
		add(goBackButton);
		
		add(optionsPanel); 
		add(graphPanel); 
		setVisible(true);

	}
	

	//Generate getters and setters
	public GraphPanel getGraphPanel() {
		return graphPanel;
	}

	public void setGraphPanel(GraphPanel graphPanel) {
		this.graphPanel = graphPanel;
	}

	public OptionsPanel getOptionsPanel() {
		return optionsPanel;
	}

	public void setOptionsPanel(OptionsPanel optionsPanel) {
		this.optionsPanel = optionsPanel;
	}
	
	public JButton getGoBackButton() {
		return goBackButton;
	}

	public void setGoBackButton(JButton goBackButton) {
		this.goBackButton = goBackButton;
	}
	
	
}