package main.window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class DungeonWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void dungeonWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DungeonWindow window = new DungeonWindow();
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
	public DungeonWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1030, 796);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Panel Grid = new Panel();
		Grid.setBounds(0, 0, 1024, 768);
		frame.getContentPane().add(Grid);
		Grid.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 64, 64);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Andrew\\workspace-java\\HelloDungeon2\\resources\\textures\\tiles\\cavewall.png"));
		Grid.add(lblNewLabel);
		
		Panel panel = new Panel();
		panel.setBounds(0, 0, 1024, 768);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblOverlay = new JLabel("");
		lblOverlay.setIcon(new ImageIcon("C:\\Users\\Andrew\\workspace-java\\HelloDungeon2\\resources\\textures\\gui\\borderwindow.png"));
		lblOverlay.setBounds(0, 0, 1024, 768);
		panel.add(lblOverlay);
	}
}
