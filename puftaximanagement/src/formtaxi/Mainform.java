package formtaxi;



import javax.swing.JFrame;

public class Mainform {

	private JFrame frame;
	/**
	 * Create the application.
	 */
	public Mainform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
