import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Color;

public class AddElementsWindow {

	private JFrame frame;
	 /*
	 *Launch the application.
	 */
	static int noOfElements;
	private JTextField txtElement;
	JTextField[] elements;
	int[] data;
	static int maxCapacity;
	public static void AddElementsScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddElementsWindow window = new AddElementsWindow(noOfElements,maxCapacity);
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
	public AddElementsWindow(int m,int c) {
		noOfElements = m;
		maxCapacity=c;
		elements= new JTextField[m];
		data= new int[c];
		
		if(noOfElements==0)
			JOptionPane.showMessageDialog(null, " what the hell !!! their must be atleast 1 element");
		else
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBackground(new Color(220, 20, 60));
		frame.setForeground(new Color(220, 20, 60));
		frame.getContentPane().setForeground(new Color(220, 20, 60));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//frame.setResizable(false);
		frame.setSize(880,480);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<maxCapacity;i++) {
					if(i<noOfElements)
					data[i]=Integer.parseInt(elements[i].getText().toString());
					
					else
						data[i]=-0;
					
				}
					
				
				Display d=new Display(data);
					d.frame.setVisible(true);
					frame.setVisible(false);
					
				
				
				
			}
		});
		btnAdd.setBounds(396, 404, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(220, 20, 60));
		panel_1.setBounds(0, 0, 864, 393);
		frame.getContentPane().add(panel_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		panel_1.add(scrollPane_2);
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JPanel panelContainer = new JPanel();
		scrollPane_2.setViewportView(panelContainer);
		
		JScrollPane scrollPane = new JScrollPane();
		panelContainer.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panelContainer.add(scrollPane_1);
		
		JPanel panel = new JPanel();
		scrollPane_1.setViewportView(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainWindow mw = new MainWindow();
				mw.frame.setVisible(true);
			}
		});
		btnBack.setBounds(10, 404, 89, 23);
		frame.getContentPane().add(btnBack);
		
		for(int i=0;i<noOfElements;i++) {
		
			JPanel panelElement = new JPanel();
			panel.add(panelElement);
			panelElement.setLayout(new BoxLayout(panelElement, BoxLayout.X_AXIS));
			JLabel lblElement;
			lblElement = new JLabel();
			lblElement.setFont(lblElement.getFont().deriveFont(30.0f));
			lblElement.setText("Add Element no "+(i+1)+": ");
			
			
			panelElement.add(lblElement);
		
			txtElement = new JTextField();
			panelElement.add(txtElement);
			txtElement.setColumns(10);
			elements[i]= txtElement;
			}
		}
		
	
}
