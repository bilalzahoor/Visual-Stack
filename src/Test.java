import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
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
	public Test() {
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
		
		JButton btn1 = new JButton("New button");
		
		btn1.addActionListener(new ActionListener() {
			boolean pressed = false;
			public void actionPerformed(ActionEvent e) {
				
				
				 {
					 JOptionPane.showMessageDialog(null, "hello");
				 }

				if (!pressed) {
					btn1.setText("Create");
					btn1.setVisible(false);
				    pressed = true;
				}
			}
		});
		btn1.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(btn1);
	}

}
