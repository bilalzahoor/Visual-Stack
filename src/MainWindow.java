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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ItemEvent;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.MatteBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainWindow {

	static JFrame frame;
	private JComboBox cmbMaxCapacity;
	
	static int maxCapacity;
	private JTextField txtSize;
	static int ElementNo;
	

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
		//ElementNo=0;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 519);
		frame.getContentPane().setBackground(new Color(30, 144, 255));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//frame.setResizable(false);
		frame.setSize(880,522);	
		
		JPanel panelCreate = new JPanel();
		panelCreate.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		panelCreate.setBackground(new Color(30, 144, 255));
		panelCreate.setBounds(515, 133, 349, 348);
		frame.getContentPane().add(panelCreate);
		panelCreate.setLayout(null);
		panelCreate.setVisible(false);
		
		
		
		
		
		
		
		
		JLabel lblTypeOfStack = new JLabel("MAX Capacity :");
		lblTypeOfStack.setForeground(new Color(255, 255, 255));
		lblTypeOfStack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblTypeOfStack.setBounds(10, 69, 171, 30);
		panelCreate.add(lblTypeOfStack);
		
		cmbMaxCapacity = new JComboBox();
		cmbMaxCapacity.setBounds(10, 110, 155, 30);
		panelCreate.add(cmbMaxCapacity);
		cmbMaxCapacity.addItem("05");
		cmbMaxCapacity.addItem("10");
		cmbMaxCapacity.addItem("15");
		
		JButton btnCreate = new JButton("CREATE");
		btnCreate.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnCreate.setBounds(130, 268, 99, 41);
		panelCreate.add(btnCreate);
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ElementNo	 = Integer.parseInt(txtSize.getText());
				
			
				
				
				 if (ElementNo > maxCapacity ) {
					
						JOptionPane.showMessageDialog(null, "options exceeded... Total capacity is: "+ maxCapacity);

						frame.setVisible(true);
				}
				
				else {
					
					frame.setVisible(false);
					AddElementsWindow nw = new AddElementsWindow(ElementNo,maxCapacity);
					nw.AddElementsScreen();
					
				
			
					}
			}
				
				
		
			});
		btnCreate.setForeground(Color.RED);
		
		JLabel lblSize = new JLabel("Size :");
		lblSize.setForeground(new Color(255, 255, 255));
		lblSize.setBounds(10, 151, 143, 30);
		panelCreate.add(lblSize);
		lblSize.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		
		txtSize = new JTextField();
		txtSize.setFocusable(true);
		txtSize.setBounds(10, 185, 130, 30);
		
		panelCreate.add(txtSize);
		
		txtSize.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
	char c = e.getKeyChar();
			
				
				if(! (Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)) {
					
			
					e.consume();
					
					
				}
			}
		});
		txtSize.setColumns(10);
		
		JLabel lblSimpleStackOperations = new JLabel("SIMPLE STACK OPERATIONS");
		lblSimpleStackOperations.setForeground(new Color(255, 255, 255));
		lblSimpleStackOperations.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSimpleStackOperations.setBounds(50, 11, 289, 30);
		panelCreate.add(lblSimpleStackOperations);
		cmbMaxCapacity.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				maxCapacity=Integer.parseInt(cmbMaxCapacity.getSelectedItem().toString());
				
				
			}
		});
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 135, 40);
		frame.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setIcon(new ImageIcon("C:\\Users\\Mir Kamran Ellahi\\Documents\\GitHub\\Visual-Stack\\img\\create1-icon.png"));
		mnFile.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnFile);
		
		JMenu mnFile_1 = new JMenu("File");
		mnFile_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnFile.add(mnFile_1);
		
		JMenu mnOperations = new JMenu("Operations");
		mnOperations.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnFile_1.add(mnOperations);
		
		JMenuItem mntmSimpleStackOperations = new JMenuItem("Simple Stack Operations");
		mntmSimpleStackOperations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCreate.setVisible(true);
			}
		});
		
		mnOperations.add(mntmSimpleStackOperations);
		
		JMenu mnApplicationsofStack = new JMenu("ApplicationsOf Stack");
		mnOperations.add(mnApplicationsofStack);
		
		JMenuItem mntmStringReversal = new JMenuItem("String Reversal");
		mnApplicationsofStack.add(mntmStringReversal);
		
		JMenuItem mntmEquationConversion = new JMenuItem("Equation Conversion");
		mnApplicationsofStack.add(mntmEquationConversion);
		
		JMenuItem mntmEquationEvaluation = new JMenuItem("Equation Evaluation");
		mnApplicationsofStack.add(mntmEquationEvaluation);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		mntmExit.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnFile.add(mntmExit);
		
		JMenu mnHelp = new JMenu("Help");
		mnHelp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HelpWindow hw = new HelpWindow();
				hw.frame.setVisible(true);
			}
		});
		
		
		mnHelp.setIcon(new ImageIcon("C:\\Users\\Mir Kamran Ellahi\\Documents\\GitHub\\Visual-Stack\\img\\Actions-help-about-icon1.png"));
		mnHelp.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnHelp);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(0, 42, 864, 92);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Mir Kamran Ellahi\\Documents\\GitHub\\Visual-Stack\\img\\Screenshot (82).png"));
		label_1.setBounds(112, 11, 615, 70);
		panel_1.add(label_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Mir Kamran Ellahi\\Documents\\GitHub\\Visual-Stack\\img\\stack_representation.jpg"));
		label.setBounds(10, 133, 519, 348);
		frame.getContentPane().add(label);
		

	}

	
}
