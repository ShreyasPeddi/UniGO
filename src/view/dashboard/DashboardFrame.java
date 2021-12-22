package view.dashboard;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class DashboardFrame extends JFrame {
	
	private UserPanel userPanel = new UserPanel();
	private CriteriaPanel marksPanel = new CriteriaPanel();
	private MapPanel mapPanel = new MapPanel();
	private ComparisonPanel comparisonPanel = new ComparisonPanel();
	private MatchPanel matchPanel = new MatchPanel();
	
	public DashboardFrame() {
		
		setLayout(null);
		setSize(1920,1080);
		setTitle("UniGO - Dashboard");
		setVisible(true);
		
		add(userPanel);
		add(marksPanel);
		add(mapPanel);
		add(comparisonPanel);
		add(matchPanel);
		
	}

}
