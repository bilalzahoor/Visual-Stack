import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddElementsWindow {

	private JFrame frame;
	 /*
	 *Launch the application.
	 */
	static int Elements;
	private JTextField txtElements;
	public static void AddElementsScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddElementsWindow window = new AddElementsWindow(Elements);
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
	public AddElementsWindow(int m) {
		Elements = m;
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
		
		JLabel lblElements = new JLabel("Add Element no. : ");
		lblElements.setBounds(0, 25, 117, 14);
		frame.getContentPane().add(lblElements);
		
		
		txtElements = new JTextField();
		txtElements.setBounds(165, 22, 96, 20);
		frame.getContentPane().add(txtElements);
		txtElements.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(int i=0;i<Elements;i++) {
					lblElements.setText("Add Element no. : "+(i+1));
					
					
				}
				
				
				
			}
		});
		btnAdd.setBounds(312, 21, 89, 23);
		frame.getContentPane().add(btnAdd);
	
		
	}
}
