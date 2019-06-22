import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class ElementsExceededWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void ElementsExceededScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ElementsExceededWindow window = new ElementsExceededWindow();
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
	public ElementsExceededWindow() {
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
		
		JLabel lblElementsExceede = new JLabel("ELEMENTS EXCEEDED");
		lblElementsExceede.setFont(new Font("Tahoma", Font.PLAIN, 42));
		lblElementsExceede.setBounds(10, 43, 424, 146);
		frame.getContentPane().add(lblElementsExceede);
	}

}
