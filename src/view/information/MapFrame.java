package view.information;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import model.User;

/*
 * Author: Shreyas Peddi
 * This class is the base frame which has the map panel to display the map
 */
public class MapFrame extends JFrame{
	
	//Map panel consists of the map, slider and zoom in/out buttons
	private MapPanel mapPanel = new MapPanel();
	
	//Constructor to initialize the screen
	public MapFrame() {
		
		//Setup the screen
		setLayout(null);
		setSize(1680,1080);
		setTitle("UniGO - Find Your Uni");
		setResizable(false);
		setVisible(true);
		
		//Add the map panel
		add(mapPanel);	
	}

	//GETTERS AND SETTERS
	public MapPanel getMapPanel() {
		return mapPanel;
	}

	public void setMapPanel(MapPanel mapPanel) {
		this.mapPanel = mapPanel;
	}
	
	
	
}
