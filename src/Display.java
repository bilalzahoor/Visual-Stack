import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.SwingConstants;

public class Display {

	public JFrame frame;
	JTextField[] elements;
	JPanel panel;
	JPanel panelStack;
	JLabel[] stack;
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
	public Display(JTextField[] e) {
		elements=e;
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
		
				
		
	}
	 void visualize() {
		 int max=MainWindow.maxCapacity;
		
	for(int i=0;i<max;i++) {
			JTextField t = elements[max-1-i];
			
			JLabel lblIndex = new JLabel(t.getText());
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


