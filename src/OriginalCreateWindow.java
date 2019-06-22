import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class OriginalCreateWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void OriginalCreateScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OriginalCreateWindow window = new OriginalCreateWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OriginalCreateWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ELEMENTS ARE WITHIN LIMITS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(34, 45, 377, 137);
		frame.getContentPane().add(lblNewLabel);
	}

}
