import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

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
		
		JLabel lblNewLabel = new JLabel("Elements Are Within Limits");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("STIXSizeFourSym", Font.PLAIN, 20));
		lblNewLabel.setBounds(100, 50, 270, 100);
		frame.getContentPane().add(lblNewLabel);
	}

}
