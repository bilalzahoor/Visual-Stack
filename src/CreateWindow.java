import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

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
		lblNewLabel.setBounds(10, 31, 94, 14);
		frame.getContentPane().add(lblNewLabel);
		
		no_of_elements = new JTextField();
		no_of_elements.setToolTipText("1-10");
		no_of_elements.setBounds(147, 28, 96, 20);
		frame.getContentPane().add(no_of_elements);
		no_of_elements.setColumns(10);
		
		btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int element_no = Integer.parseInt(no_of_elements.getText());
				
				if (element_no > 10) {
				
					JOptionPane.showMessageDialog(null, "options exceeded");


				}
				else {
					
					
					
					
					OriginalCreateWindow nw = new OriginalCreateWindow();
					nw.OriginalCreateScreen();
					
				}
				
			}
		});
		btnCreate.setBounds(39, 81, 89, 23);
		frame.getContentPane().add(btnCreate);
		
		JList list = new JList();
		list.setBounds(267, 81, 71, 155);
		frame.getContentPane().add(list);
		
		
	}
}
