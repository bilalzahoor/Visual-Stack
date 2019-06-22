import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 381);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblStackImplimentation = new JLabel("                    Stack Implimentation");
		lblStackImplimentation.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblStackImplimentation.setBackground(Color.CYAN);
		lblStackImplimentation.setForeground(Color.BLUE);
		lblStackImplimentation.setVerticalAlignment(SwingConstants.TOP);
		lblStackImplimentation.setBounds(0, 0, 424, 30);
		frame.getContentPane().add(lblStackImplimentation);
		
		JList list = new JList();
		list.setBounds(133, 175, -27, -33);
		frame.getContentPane().add(list);
		
		JComboBox comboBox = new JComboBox();
		
		
		comboBox.addItem("Sequintial");
		comboBox.addItem("Linked List");
		comboBox.setBounds(133, 49, 105, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblTypeOfStack = new JLabel("Type Of Stack :");
		lblTypeOfStack.setBounds(10, 49, 113, 22);
		frame.getContentPane().add(lblTypeOfStack);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItem("--MAX Capacity--");
		comboBox_1.addItem("05");
		comboBox_1.addItem("10");
		
		
		comboBox_1.setBounds(266, 49, 129, 22);
		frame.getContentPane().add(comboBox_1);
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CreateWindow nw = new CreateWindow();
				nw.CreateScreen();
				
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(17, 151, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblStackOperations = new JLabel("Stack Operations :");
		lblStackOperations.setBounds(129, 99, 136, 14);
		frame.getContentPane().add(lblStackOperations);
		
		JButton btnPush = new JButton("Push");
		btnPush.setForeground(Color.RED);
		btnPush.setBounds(158, 151, 89, 23);
		frame.getContentPane().add(btnPush);
		
		JButton btnNewButton_1 = new JButton("Pop");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBounds(306, 151, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Peep");
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setBounds(17, 203, 89, 22);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Count");
		btnNewButton_3.setForeground(Color.RED);
		btnNewButton_3.setBounds(158, 203, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Traverse");
		btnNewButton_4.setForeground(Color.RED);
		btnNewButton_4.setBounds(306, 203, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
	}
}
