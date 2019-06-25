import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		

		JLabel lblNewLabel = new JLabel("ELEMENTS ARE WITHIN LIMITS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(34, 45, 377, 106);

		

		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblDoYouWant = new JLabel("Do You Want To Continue : ");
		lblDoYouWant.setBounds(10, 175, 219, 14);
		frame.getContentPane().add(lblDoYouWant);
	}
}
