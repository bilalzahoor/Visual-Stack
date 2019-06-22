import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateWindow {

	private JFrame frame;
	private JTextField no_of_elements;
	private JButton btnCreate;

	/**
	 * Launch the application.
	 */
	public static void CreateScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateWindow window = new CreateWindow();
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
	public CreateWindow() {
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
		
		JLabel lblNewLabel = new JLabel("No. Of Elements :");
		lblNewLabel.setBounds(72, 28, 94, 14);
		frame.getContentPane().add(lblNewLabel);
		
		no_of_elements = new JTextField();
		no_of_elements.setBounds(192, 28, 96, 20);
		frame.getContentPane().add(no_of_elements);
		no_of_elements.setColumns(10);
		
		btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int element_no = Integer.parseInt(no_of_elements.getText());
				
				if (element_no > 10) {
					ElementsExceededWindow nw = new ElementsExceededWindow();
					nw.ElementsExceededScreen();
				}
				else {
					
					OriginalCreateWindow nw = new OriginalCreateWindow();
					nw.OriginalCreateScreen();
					
				}
				
			}
		});
		btnCreate.setBounds(136, 83, 89, 23);
		frame.getContentPane().add(btnCreate);
	}
}
