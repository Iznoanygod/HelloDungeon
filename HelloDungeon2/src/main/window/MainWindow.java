package main.window;

import java.awt.EventQueue;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import main.HelloDungeon2;

import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;

public class MainWindow {

	private JFrame frmMainMenu = new JFrame();
	private JFrame frmQuitGame = new JFrame();
	/**
	 * Launch the application.
	 */
	public static void quitGameWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmQuitGame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void welcomeWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmMainMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		mainMenuInitialize();
		quitGameInitialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void mainMenuInitialize() {
		frmMainMenu.setTitle("HelloDungeon2");
		frmMainMenu.setResizable(false);
		frmMainMenu.setBounds(100, 100, 1030, 796);
		frmMainMenu.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		frmMainMenu.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
            	quitGameWindow();
            }
        });
		frmMainMenu.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1024, 768);
		frmMainMenu.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.setForeground(Color.WHITE);
		btnNewGame.setFont(HelloDungeon2.font[0].deriveFont(56.0f));
		btnNewGame.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewGame.setHorizontalTextPosition(JButton.CENTER);
		btnNewGame.setVerticalTextPosition(JButton.CENTER);
		btnNewGame.setBorder(BorderFactory.createEmptyBorder());
		btnNewGame.setContentAreaFilled(false);
		btnNewGame.setIcon(new ImageIcon("resources/textures/gui/lbutton.png"));
		btnNewGame.setPressedIcon(new ImageIcon("resources/textures/gui/lbuttonclick.png"));
		btnNewGame.setBounds(277, 225, 480, 96);
		panel.add(btnNewGame);
		
		JButton btnLoadGame = new JButton("Load Game");
		btnLoadGame.setIcon(new ImageIcon("resources/textures/gui/lbutton.png"));
		btnLoadGame.setPressedIcon(new ImageIcon("resources/textures/gui/lbuttonclick.png"));
		btnLoadGame.setVerticalTextPosition(SwingConstants.CENTER);
		btnLoadGame.setHorizontalTextPosition(SwingConstants.CENTER);
		btnLoadGame.setHorizontalAlignment(SwingConstants.LEADING);
		btnLoadGame.setForeground(Color.WHITE);
		btnLoadGame.setFont(HelloDungeon2.font[0].deriveFont(56.0f));
		btnLoadGame.setContentAreaFilled(false);
		btnLoadGame.setBorder(BorderFactory.createEmptyBorder());
		btnLoadGame.setBounds(277, 332, 480, 96);
		btnLoadGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoginWindow.loginWindow();
			}
		});
		panel.add(btnLoadGame);

		JButton btnOptions = new JButton("Options");
		btnOptions.setIcon(new ImageIcon("resources/textures/gui/lhbutton.png"));
		btnOptions.setPressedIcon(new ImageIcon("resources/textures/gui/lhbuttonclick.png"));
		btnOptions.setVerticalTextPosition(SwingConstants.CENTER);
		btnOptions.setHorizontalTextPosition(SwingConstants.CENTER);
		btnOptions.setHorizontalAlignment(SwingConstants.LEADING);
		btnOptions.setForeground(Color.WHITE);
		btnOptions.setFont(HelloDungeon2.font[0].deriveFont(36.0f));
		btnOptions.setContentAreaFilled(false);
		btnOptions.setBorder(BorderFactory.createEmptyBorder());
		btnOptions.setBounds(277, 439, 235, 96);
		panel.add(btnOptions);
		
		JButton btnQuitGame = new JButton("Quit Game");
		btnQuitGame.setIcon(new ImageIcon("resources/textures/gui/lhbutton.png"));
		btnQuitGame.setPressedIcon(new ImageIcon("resources/textures/gui/lhbuttonclick.png"));
		btnQuitGame.setVerticalTextPosition(SwingConstants.CENTER);
		btnQuitGame.setHorizontalTextPosition(SwingConstants.CENTER);
		btnQuitGame.setHorizontalAlignment(SwingConstants.LEADING);
		btnQuitGame.setForeground(Color.WHITE);
		btnQuitGame.setFont(HelloDungeon2.font[0].deriveFont(36.0f));
		btnQuitGame.setContentAreaFilled(false);
		btnQuitGame.setBorder(BorderFactory.createEmptyBorder());
		btnQuitGame.setBounds(522, 439, 235, 96);
		btnQuitGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				quitGameWindow();
			}
		});
		panel.add(btnQuitGame);
		
		JLabel HelloDungeon2 = new JLabel("");
		HelloDungeon2.setIcon(new ImageIcon("resources/textures/gui/Hellodungeon2.png"));
		HelloDungeon2.setBounds(258, 102, 512, 71);
		panel.add(HelloDungeon2);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("resources/textures/gui/blankwindow.png"));
		background.setBounds(0, 0, 1024, 768);
		panel.add(background);
	}
	
	private void quitGameInitialize() {
		frmQuitGame = new JFrame();
		frmQuitGame.setType(Type.POPUP);
		frmQuitGame.setTitle("Quit Game?");
		frmQuitGame.setResizable(false);
		frmQuitGame.getContentPane().setBackground(Color.WHITE);
		frmQuitGame.setBackground(Color.WHITE);
		frmQuitGame.setBounds(100, 100, 320, 180);
		frmQuitGame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmQuitGame.getContentPane().setLayout(null);
		
		JTextPane txtpnQuitGame = new JTextPane();
		txtpnQuitGame.setForeground(Color.WHITE);
		txtpnQuitGame.setBackground(new Color(14, 36, 51));
		txtpnQuitGame.setFont(new Font("Perfect DOS VGA 437 Win", Font.PLAIN, 16));
		txtpnQuitGame.setText("Quit Game?");
		txtpnQuitGame.setBounds(109, 11, 96, 30);
		frmQuitGame.getContentPane().add(txtpnQuitGame);
		
		JButton btnQuitGame = new JButton("Quit Game");
		btnQuitGame.setPressedIcon(new ImageIcon("resources/textures/gui/sbuttonclick.png"));
		btnQuitGame.setIcon(new ImageIcon("resources/textures/gui/sbutton.png"));
		btnQuitGame.setVerticalTextPosition(JButton.CENTER);
		btnQuitGame.setHorizontalTextPosition(JButton.CENTER);
		btnQuitGame.setFont(HelloDungeon2.font[0]);
		btnQuitGame.setForeground(Color.WHITE);
		btnQuitGame.setContentAreaFilled(false);
		btnQuitGame.setBorder(BorderFactory.createEmptyBorder());
		btnQuitGame.setBounds(25, 70, 100, 25);
		btnQuitGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		frmQuitGame.getContentPane().add(btnQuitGame);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setPressedIcon(new ImageIcon("resources/textures/gui/sbuttonclick.png"));
		btnCancel.setIcon(new ImageIcon("resources/textures/gui/sbutton.png"));
		btnCancel.setVerticalTextPosition(JButton.CENTER);
		btnCancel.setHorizontalTextPosition(JButton.CENTER);
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(HelloDungeon2.font[0]);
		btnCancel.setContentAreaFilled(false);
		btnCancel.setBorder(BorderFactory.createEmptyBorder());
		btnCancel.setBounds(189, 70, 100, 25);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmQuitGame.dispose();
			}
		});
		frmQuitGame.getContentPane().add(btnCancel);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("resources/textures/gui/smallwindow.png"));
		background.setBounds(0, 0, 314, 152);
		frmQuitGame.getContentPane().add(background);
	}
}