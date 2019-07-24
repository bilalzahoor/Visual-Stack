import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelpWindow {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelpWindow window = new HelpWindow();
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
	public HelpWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 445, 292);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(0, 31, 434, 222);
		frame.getContentPane().add(scrollPane);
		
		JTextPane txtpnIntroductionToStack = new JTextPane();
		txtpnIntroductionToStack.setEditable(false);
		scrollPane.setViewportView(txtpnIntroductionToStack);
		txtpnIntroductionToStack.setText("\r\nINTRODUCTION TO STACK:\r\n\r\nA stack is an ordered collection of items where the addition of new items and the removal of existing items always takes place at the same end. This end is commonly referred to as the \u201Ctop\u201D, and the opposite end is known as the \u201Cbase\u201D.\r\nItems that are closer to the base have been in the stack the longest. The most recently added item is always on the top of the stack and thus will be removed first. The stack provides an ordering based on length of time in the collection; the \u201Cage\u201D of any given item increases as you move from top to base.\r\nThere are many examples of stacks in everyday situations. Consider a stack of plates on a table, where it\u2019s only possible to add or remove plates to or from the top. Or imagine a stack of books on a desk. The only book whose cover is visible is the one on top. To access the others, we must first remove the ones sitting on top of them.\r\n\r\n\r\n\r\nSTACK\r\n\r\nA stack is a conceptual structure consisting of a set of homogeneous elements and is based on the principle of last in first out (LIFO). It is a commonly used abstract data type with two major operations, namely push and pop.\r\n\r\n\r\nTYPES OF STACK:\r\n\r\n1.\tSequential\r\n\r\n2.\tLinked List\r\n");
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainWindow.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(0, 0, 94, 28);
		frame.getContentPane().add(btnNewButton);
	}

}
