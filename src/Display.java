import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

public class Display {

	public JFrame frame;
	int[] data;
	JPanel panel;
	JPanel panelStack;
	JPanel panelArray;
	JLabel[] stack;
	JLabel[] array;
	int top = AddElementsWindow.noOfElements - 1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Display window = new Display(null);
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
	public Display(int[] d) {
		data=d;
		stack=new JLabel[MainWindow.maxCapacity];
		array=new JLabel[MainWindow.maxCapacity];
		initialize();
		visualizeArray();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 822, 598);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(6, 157, 435, 413);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(35, 45, 348, 334);
		panel.add(panel_1);
		
        panelStack = new JPanel();
		panelStack.setBorder(new MatteBorder(0, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_1.add(panelStack);
		panelStack.setLayout(new BoxLayout(panelStack, BoxLayout.Y_AXIS));
		
		JButton btnPush = new JButton("PUSH");
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(AddElementsWindow.noOfElements == MainWindow.maxCapacity)
				{
					JOptionPane.showMessageDialog(null, "STACK OVERFLOW");
					
				}	
				else {
				String input = JOptionPane.showInputDialog("Enter the Element:");
				int ElementInput = Integer.parseInt(input);
				top++;
				AddElementsWindow.noOfElements++;
				data[top]= ElementInput;
				panelStack.removeAll();
				visualize();
				panelStack.getRootPane().revalidate();
				
				
				}
			}
		});
		btnPush.setBounds(510, 354, 89, 23);
		frame.getContentPane().add(btnPush);
		
		JButton btnPop = new JButton("POP");
		btnPop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (AddElementsWindow.noOfElements == 0) {
					
					JOptionPane.showMessageDialog(null, "STACK UNDERFLOW");
					
				}
				else {
					
					data[top]=-0;
					top--;
					AddElementsWindow.noOfElements--;
					panelStack.removeAll();
					visualize();
					panelStack.getRootPane().revalidate();
				}
				
			}
		});
		btnPop.setBounds(510, 389, 89, 23);
		frame.getContentPane().add(btnPop);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				data=null;
				panelStack.removeAll();
				JOptionPane.showMessageDialog(null, "Stack Deleted");
				btnDelete.setVisible(false);
				panelStack.getRootPane().revalidate();
				
				
			}
		});
		btnDelete.setBounds(510, 422, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(26, 32, 733, 123);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 694, 101);
		panel_2.add(scrollPane);
		
		JPanel panel_3 = new JPanel();
		scrollPane.setViewportView(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		 panelArray = new JPanel();
		 panelArray.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.add(panelArray);
		panelArray.setLayout(new BoxLayout(panelArray, BoxLayout.X_AXIS));
		
		JButton btnNewButton = new JButton("Build Stack");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visualize();
			}
		});
		btnNewButton.setBounds(510, 320, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
				
		
	}
	 void visualize() {
		 int max=MainWindow.maxCapacity;
		
	for(int i=0;i<max;i++) {
		JLabel lblIndex =new JLabel();
		
			if((max-1-i)==AddElementsWindow.noOfElements-1) {
				lblIndex.setText((data[max-1-i]+"  (TOP)"));
				
			}
			
			else {
				if((data[max-1-i]) == -0)
						lblIndex.setText("");	
				else
				 lblIndex.setText((data[max-1-i]+""));
				
			}
			lblIndex.setHorizontalAlignment(SwingConstants.CENTER);
			lblIndex.setPreferredSize(new Dimension(100, 16));
			lblIndex.setMaximumSize(new Dimension(100, 16));
			lblIndex.setMinimumSize(new Dimension(100, 16));
			lblIndex.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
			
			panelStack.add(lblIndex);
			stack[i]=lblIndex;
		}
	 }
	void visualizeArray() {
		 int max=MainWindow.maxCapacity;
		 for(int i=0;i<max;i++) {
			 JLabel lblIndex =new JLabel();
				if((data[i]) == -0)
						lblIndex.setText("");	
				else
				 lblIndex.setText((data[i]+""));
				
			lblIndex.setHorizontalAlignment(SwingConstants.CENTER);
			lblIndex.setPreferredSize(new Dimension(100, 16));
			lblIndex.setMaximumSize(new Dimension(100, 16));
			lblIndex.setMinimumSize(new Dimension(100, 16));
			lblIndex.setBorder(new MatteBorder(0, 1, 0, 1, (Color) new Color(0, 0, 0)));
			panelArray.add(lblIndex);
			array[i]=lblIndex;
		}
					

		
		
	}
	 

	public class UpsideDownJPanel extends JPanel {

	    public UpsideDownJPanel() {}

	    public void paintComponent(Graphics graphics) {
	            Graphics2D g = (Graphics2D) graphics;
	            int x = this.getWidth() / 2;
	            int y = this.getHeight() / 2;
	            g.rotate(Math.toRadians(180.0), x, y);
	            super.paintComponent(g);
	    }

	}
}


