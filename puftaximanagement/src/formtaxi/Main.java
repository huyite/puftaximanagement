package formtaxi;
import java.awt.EventQueue;
public class Main {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainform window = new Mainform();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
