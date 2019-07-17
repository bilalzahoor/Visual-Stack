import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class MainWindow {

	private JFrame frame;
	private JComboBox cmbMaxCapacity;
	static int maxCapacity;
	private JComboBox cmbStackType;
	

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
		maxCapacity=5;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 381);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblStackImplimentation = new JLabel("Stack Implementation");
		lblStackImplimentation.setFont(new Font("Malayalam MN", Font.BOLD, 19));
		lblStackImplimentation.setBackground(new Color(0, 191, 255));
		lblStackImplimentation.setForeground(new Color(0, 0, 0));
		lblStackImplimentation.setBounds(200, 0, 206, 25);
		frame.getContentPane().add(lblStackImplimentation);
		
		JList list = new JList();
		list.setBounds(133, 175, -27, -33);
		frame.getContentPane().add(list);
		
		cmbStackType = new JComboBox();
		cmbStackType.addItem("Sequential");
		cmbStackType.addItem("Linked List");
		cmbStackType.setBounds(150, 50, 120, 22);
		frame.getContentPane().add(cmbStackType);
		cmbStackType.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (cmbStackType.getSelectedItem().toString().compareTo("Sequential")==0) {
					cmbMaxCapacity.setVisible(true);
				}
				else
					cmbMaxCapacity.setVisible(false);
			}
		});
		
		
		
		
		JLabel lblTypeOfStack = new JLabel("Type Of Stack :");
		lblTypeOfStack.setBounds(20, 50, 170, 25);
		frame.getContentPane().add(lblTypeOfStack);
		
		cmbMaxCapacity = new JComboBox();
		cmbMaxCapacity.addItem("05");
		cmbMaxCapacity.addItem("10");
		cmbMaxCapacity.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				maxCapacity=Integer.parseInt(cmbMaxCapacity.getSelectedItem().toString());
				
				
			}
		});
		
		
		
		cmbMaxCapacity.setBounds(300, 50, 170, 22);
		frame.getContentPane().add(cmbMaxCapacity);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CreateWindow nw = new CreateWindow(maxCapacity);
				nw.CreateScreen();
				
			}
		});
		btnCreate.setForeground(Color.RED);

		btnCreate.setBounds(200, 175, 187, 76);


		frame.getContentPane().add(btnCreate);
		
		JLabel lblStackOperations = new JLabel("Stack Operations :");
		lblStackOperations.setBounds(20, 100, 125, 25);
		frame.getContentPane().add(lblStackOperations);


	}
}
