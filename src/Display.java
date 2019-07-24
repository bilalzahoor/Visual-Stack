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
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;

import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.ScrollPaneConstants;


public class Display {

	public JFrame frame;
	int[] data;
	JPanel panel;
	JPanel panelStack;
	JPanel panelArray;
	JLabel[] stack;

	JLabel[] array;

	JFrame j;
	int max;

	int top = AddElementsWindow.noOfElements - 1;
	
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

	
	public Display(int[] d) {
		data=d;
		stack=new JLabel[MainWindow.maxCapacity];

		array=new JLabel[MainWindow.maxCapacity];
	

	
	initialize();
	visualizeArray();
}

	
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 822, 598);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//frame.setResizable(false);
		frame.setSize(880,500);
		
		panel = new JPanel();
		panel.setBounds(6, 157, 435, 413);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBounds(35, 48, 348, 263);
		panel.add(scrollPane_1);
		
		JPanel panel_1 = new JPanel();
		scrollPane_1.setViewportView(panel_1);
		
        panelStack = new JPanel();
		panelStack.setBorder(new MatteBorder(0, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_1.add(panelStack);
		panelStack.setLayout(new BoxLayout(panelStack, BoxLayout.Y_AXIS));
		
		JLabel lblStackRepresention = new JLabel("STACK REPRESENTATION");
		lblStackRepresention.setBounds(150, 23, 176, 14);
		panel.add(lblStackRepresention);
		lblStackRepresention.setVisible(false);
		

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
				panelArray.removeAll();
				visualizeArray();
				panelStack.getRootPane().revalidate();
				
				
				}
			}
		});
		btnPush.setBounds(510, 255, 129, 23);
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
					panelArray.removeAll();
					visualizeArray();
					panelStack.getRootPane().revalidate();
					panelArray.getRootPane().revalidate();
				}
				
			}
		});
		btnPop.setBounds(510, 311, 129, 23);
		frame.getContentPane().add(btnPop);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				data=null;
				panelStack.removeAll();
				btnDelete.setVisible(false);
				panelStack.getRootPane().revalidate();
				JOptionPane.showMessageDialog(null, "Stack Deleted");
				frame.setVisible(false);
				
				MainWindow.frame.setVisible(true);
				
			}
			});
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

		btnDelete.setBounds(510, 365, 129, 23);
		frame.getContentPane().add(btnDelete);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(26, 32, 733, 123);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 38, 694, 74);
		panel_2.add(scrollPane);
		
		JPanel panel_3 = new JPanel();
		scrollPane.setViewportView(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		 panelArray = new JPanel();
		 panelArray.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.add(panelArray);
		panelArray.setLayout(new BoxLayout(panelArray, BoxLayout.X_AXIS));
		
		JButton btnShowStack = new JButton("SHOW STACK");
		btnShowStack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visualize();
				btnShowStack.setVisible(false);
				lblStackRepresention.setVisible(true);
				panelStack.getRootPane().revalidate();
			}
		});
		btnShowStack.setBounds(510, 203, 129, 23);
		frame.getContentPane().add(btnShowStack);
		
		JLabel lblArrayRepresention = new JLabel("ARRAY REPRESENTATION");
		lblArrayRepresention.setBounds(313, 11, 214, 23);
		frame.getContentPane().add(lblArrayRepresention);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String filename="test.txt";
				try {
					FileOutputStream output = new FileOutputStream(filename);
					//String data ="welcome";
					try {
						ObjectOutputStream obj = new ObjectOutputStream(output);
						obj.writeObject(data);
						output.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JFileChooser f = new JFileChooser("C:");
				f.showSaveDialog(null);
			}
		});
		btnSave.setBounds(510, 410, 129, 23);
		frame.getContentPane().add(btnSave);
		
		JButton btnOpen = new JButton("Open");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String filename="test.txt";
				try {
					FileInputStream input = new FileInputStream(filename);
					//String data ="welcome";
					try {
						ObjectInputStream obj = new ObjectInputStream(input);
						try {
							data= (int[])obj.readObject();
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						input.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JFileChooser f = new JFileChooser("C:");
				f.showSaveDialog(null);
			}
		});
		btnOpen.setBounds(531, 166, 89, 23);
		frame.getContentPane().add(btnOpen);
		
		JButton btnNewButton = new JButton("Build Stack");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visualize();
			}
		});
		
		
				
		
	}
	 void visualize() {
		 max=MainWindow.maxCapacity;
		 //panelStack.removeAll();
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
			lblIndex.setPreferredSize(new Dimension(150, 30));
			lblIndex.setMaximumSize(new Dimension(150, 30));
			lblIndex.setMinimumSize(new Dimension(150, 30));
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
	}

	


