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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CreateWindow {

	static JFrame CreateWindowframe;
	private JTextField no_of_elements;
	private JButton btnOriginalCreate;
	private static int capacity;
	int element_no;

	/**
	 * Launch the application.
	 */
	public static void CreateScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateWindow window = new CreateWindow(capacity);
					window.CreateWindowframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CreateWindow(int m) {
		capacity=m;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		CreateWindowframe = new JFrame();
		CreateWindowframe.setBounds(100, 100, 450, 300);
		CreateWindowframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CreateWindowframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("No. Of Elements :");
		lblNewLabel.setBounds(10, 31, 94, 14);
		CreateWindowframe.getContentPane().add(lblNewLabel);
		
		no_of_elements = new JTextField();
		no_of_elements.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					
					element_no = Integer.parseInt(no_of_elements.getText());
				
				if (element_no > capacity) {
				
					JOptionPane.showMessageDialog(null, "options exceeded... Total capacity is: "+ capacity);


				}
				else {
					
					
					AddElementsWindow nw = new AddElementsWindow(element_no,capacity);
					nw.AddElementsScreen();
					
				
			}
				}
				e.consume();
			
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
			
				
				if(! (Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)) {
					
			
					e.consume();
					
					
				}
				
				
			}
			});
		no_of_elements.setToolTipText("");
		no_of_elements.setBounds(147, 28, 96, 20);
		CreateWindowframe.getContentPane().add(no_of_elements);
		no_of_elements.setColumns(10);
		
		btnOriginalCreate = new JButton("Create");
		btnOriginalCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				element_no = Integer.parseInt(no_of_elements.getText());
				
				if (element_no > capacity) {
				
					JOptionPane.showMessageDialog(null, "options exceeded... Total capacity is: "+ capacity);


				}
				else if (element_no == 0) {
					
					JOptionPane.showMessageDialog(null, "There Must Be Atleast one Element ");
				}
				else {
					
					
					AddElementsWindow nw = new AddElementsWindow(element_no,capacity);
					nw.AddElementsScreen();
					CreateWindowframe.setVisible(false);
					
				}
				
			}
		});
		btnOriginalCreate.setBounds(39, 81, 89, 23);
		CreateWindowframe.getContentPane().add(btnOriginalCreate);
		
		
	}
}
