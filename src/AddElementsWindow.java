import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;

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
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<maxCapacity;i++) {
					if(i<noOfElements)
					data[i]=Integer.parseInt(elements[i].getText().toString());
					else
						data[i]=-1;
					
				}
					
				
				Display d=new Display(data);
					d.frame.setVisible(true);
					frame.setVisible(false);
					
				
				
				
			}
		});
		btnAdd.setBounds(201, 232, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 444, 220);
		frame.getContentPane().add(scrollPane);
		
		JPanel panelContainer = new JPanel();
		scrollPane.setViewportView(panelContainer);
		
		JPanel panel = new JPanel();
		panelContainer.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		for(int i=0;i<noOfElements;i++) {
		
			JPanel panelElement = new JPanel();
			panel.add(panelElement);
			panelElement.setLayout(new BoxLayout(panelElement, BoxLayout.X_AXIS));
		
			JLabel lblElement = new JLabel("Add Element no "+(i+1)+": ");
			panelElement.add(lblElement);
		
			txtElement = new JTextField();
			panelElement.add(txtElement);
			txtElement.setColumns(10);
			elements[i]= txtElement;
			}
		}
		
	
}