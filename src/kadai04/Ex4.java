package kadai04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex4 {

	private JFrame frame;
	private CurrentColor crrntBckColor = new CurrentColor();
	private JPanel colorPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex4 window = new Ex4();
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
	public Ex4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel btnPanel = new JPanel();
		frame.getContentPane().add(btnPanel, BorderLayout.NORTH);
		
		JButton btnRed = new JButton("Red");
		btnRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color c = crrntBckColor.changeRed();
				colorPanel.setBackground(c);
			}
		});
		btnRed.setForeground(Color.RED);
		btnPanel.add(btnRed);
		
		JButton btnBlue = new JButton("Blue");
		btnBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color c = crrntBckColor.changeBlue();
				colorPanel.setBackground(c);
			}
		});
		btnBlue.setForeground(Color.BLUE);
		btnPanel.add(btnBlue);
		
		JButton btnGreen = new JButton("Green");
		btnGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color c = crrntBckColor.changeGreen();
				colorPanel.setBackground(c);
			}
		});
		btnGreen.setForeground(Color.GREEN);
		btnPanel.add(btnGreen);
		
		colorPanel = new JPanel();
		frame.getContentPane().add(colorPanel, BorderLayout.CENTER);
	}

}
