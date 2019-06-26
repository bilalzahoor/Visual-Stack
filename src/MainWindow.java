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
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;

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
		
		JLabel lblStackImplimentation = new JLabel("Stack Implimentation");
		lblStackImplimentation.setFont(new Font("Malayalam MN", Font.BOLD, 19));
		lblStackImplimentation.setBackground(new Color(0, 191, 255));
		lblStackImplimentation.setForeground(new Color(0, 0, 0));
		lblStackImplimentation.setBounds(200, 0, 206, 25);
		frame.getContentPane().add(lblStackImplimentation);
		
		JList list = new JList();
		list.setBounds(133, 175, -27, -33);
		frame.getContentPane().add(list);
		
		JComboBox comboBox = new JComboBox();
		
		
		comboBox.addItem("Sequintial");
		comboBox.addItem("Linked List");
		comboBox.setBounds(150, 50, 120, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblTypeOfStack = new JLabel("Type Of Stack :");
		lblTypeOfStack.setBounds(20, 50, 125, 25);
		frame.getContentPane().add(lblTypeOfStack);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItem("--MAX Capacity--");
		comboBox_1.addItem("05");
		comboBox_1.addItem("10");
		
		
		comboBox_1.setBounds(300, 50, 170, 22);
		frame.getContentPane().add(comboBox_1);
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Mir Kamran Ellahi\\Documents\\GitHub\\Visual-Stack\\img\\create1-icon.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CreateWindow nw = new CreateWindow();
				nw.CreateScreen();
				
			}
		});
		btnNewButton.setForeground(Color.RED);

		btnNewButton.setBounds(17, 151, 106, 23);


		frame.getContentPane().add(btnNewButton);
		
		JLabel lblStackOperations = new JLabel("Stack Operations :");
		lblStackOperations.setBounds(20, 100, 125, 25);
		frame.getContentPane().add(lblStackOperations);
		
		JButton btnPush = new JButton("Push");
		btnPush.setForeground(Color.RED);
		btnPush.setBounds(150, 150, 100, 23);
		frame.getContentPane().add(btnPush);
		
		JButton btnNewButton_1 = new JButton("Pop");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Mir Kamran Ellahi\\Documents\\GitHub\\Visual-Stack\\img\\pop-icon.png"));
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBounds(280, 150, 100, 23);
		frame.getContentPane().add(btnNewButton_1);
		

		JButton btnNewButton_2 = new JButton("Peep");
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setBounds(17, 203, 106, 22);
		frame.getContentPane().add(btnNewButton_2);
		



		JButton btnNewButton_3 = new JButton("Count");
		btnNewButton_3.setForeground(Color.RED);
		btnNewButton_3.setBounds(150, 200, 100, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Traverse");
		btnNewButton_4.setForeground(Color.RED);
		btnNewButton_4.setBounds(280, 200, 100, 23);
		frame.getContentPane().add(btnNewButton_4);
		

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Mir Kamran Ellahi\\Documents\\GitHub\\Visual-Stack\\img\\stack-icon.png"));
		
		lblNewLabel.setBounds(0, 28, 143, 149);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Mir Kamran Ellahi\\Documents\\GitHub\\Visual-Stack\\img\\stack-icon.png"));
		lblNewLabel_1.setBounds(203, 25, 168, 163);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Mir Kamran Ellahi\\Documents\\GitHub\\Visual-Stack\\img\\stack-icon.png"));
		label.setBounds(398, 25, 176, 163);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Mir Kamran Ellahi\\Documents\\GitHub\\Visual-Stack\\img\\stack-icon.png"));
		label_1.setBounds(77, 192, 143, 139);
		frame.getContentPane().add(label_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Mir Kamran Ellahi\\Documents\\GitHub\\Visual-Stack\\img\\stack-icon.png"));
		lblNewLabel_2.setBounds(292, 185, 143, 146);
		frame.getContentPane().add(lblNewLabel_2);


	}
}
