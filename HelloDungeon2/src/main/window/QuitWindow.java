package main.window;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;

import main.HelloDungeon2;

public class QuitWindow {

	public static JFrame frmQuitGame = new JFrame();
	
	public QuitWindow(){
		quitGameInitialize();
	}
	
	public static void quitGameWindow() {
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("static-access")
			public void run() {
				try {
					QuitWindow window = new QuitWindow();
					window.frmQuitGame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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
