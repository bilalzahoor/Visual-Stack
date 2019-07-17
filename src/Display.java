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
import java.awt.TrayIcon.MessageType;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Display {

	public JFrame frame;
	int[] data;
	JPanel panel;
	JPanel panelStack;
	JLabel[] stack;
	JFrame j;
	int max;
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
		
		initialize();
		visualize();
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
		panel.setBounds(6, 77, 435, 493);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(35, 45, 348, 403);
		panel.add(panel_1);
		
        panelStack = new JPanel();
		panelStack.setBorder(new MatteBorder(0, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_1.add(panelStack);
		panelStack.setLayout(new BoxLayout(panelStack, BoxLayout.Y_AXIS));
		
		
		JButton btnCreate = new JButton("PUSH");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(top==max-1) {
					
					
				}
				else {
				j= new JFrame();
				
				String input=JOptionPane.showInputDialog(j, "Enter the Element");
				top=top+1;
				AddElementsWindow.noOfElements++;
			
			data[top]=Integer.parseInt(input);
			panelStack.removeAll();
			visualize();
				}
				
				
				
			}
		});
		btnCreate.setBounds(489, 132, 117, 29);
		frame.getContentPane().add(btnCreate);
		
		JButton btnPop = new JButton("POP");
		btnPop.setBounds(489, 202, 117, 29);
		frame.getContentPane().add(btnPop);
		
		JButton btnCount = new JButton("COUNT");
		btnCount.setBounds(489, 278, 117, 29);
		frame.getContentPane().add(btnCount);
		
		JButton btnPeep = new JButton("PEEP");
		btnPeep.setBounds(491, 357, 117, 29);
		frame.getContentPane().add(btnPeep);
		
				
		
	}
	 void visualize() {
		 max=MainWindow.maxCapacity;
		 //panelStack.removeAll();
		 for(int i=0;i<max;i++) {
		JLabel lblIndex =new JLabel();
		
			if((max-1-i)==AddElementsWindow.noOfElements-1) {
				lblIndex.setText((data[max-1-i]+" (TOP)"));
			}
			
			else {
				//if((data[max-1-i]) == -1)
						//lblIndex.setText("");	
			//	else
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


