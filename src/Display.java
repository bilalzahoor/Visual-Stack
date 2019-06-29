import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Display {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Display window = new Display();
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
	public Display() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panelStack = new JPanel();
		panelStack.setBorder(new MatteBorder(0, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panelStack.setBounds(171, 57, 50, 37);
		panel.add(panelStack);
		panelStack.setLayout(new BoxLayout(panelStack, BoxLayout.X_AXIS));
		
		for(int i=0;i<5;i++) {
		JPanel panelElement = new JPanel();
		panelElement.setBorder(new MatteBorder(3, 0, 0, 0, (Color) new Color(0, 0, 0)));
		panelElement.setAlignmentX(Component.LEFT_ALIGNMENT);
		panelStack.add(panelElement);
		panelElement.setLayout(new BoxLayout(panelElement, BoxLayout.X_AXIS));
		
		JLabel lblIndex = new JLabel("New label");
		panelElement.add(lblIndex);
		
		JLabel lblElement = new JLabel("New label");
		panelElement.add(lblElement);
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


