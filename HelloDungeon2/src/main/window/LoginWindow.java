package main.window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import java.awt.FontFormatException;

import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextPane;

import main.HelloDungeon2;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionEvent;

import java.awt.Window.Type;

public class LoginWindow {
	public static JFrame frmLogin = new JFrame();
	private JTextField usernameField;
	private JPasswordField passwordField;
	
	//login checks
	
	/**
	 * Launch the application.
	 */
	public static void loginWindow() {
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("static-access")
			public void run() {
				try {
					LoginWindow window = new LoginWindow();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public LoginWindow() throws FileNotFoundException, FontFormatException, IOException{
		initialize();
	}

	private void initialize() throws FileNotFoundException, FontFormatException, IOException {
		frmLogin = new JFrame();
		frmLogin.setType(Type.POPUP);
		frmLogin.setTitle("Login");
		frmLogin.setResizable(false);
		frmLogin.getContentPane().setBackground(Color.WHITE);
		frmLogin.setBackground(Color.WHITE);
		frmLogin.setBounds(100, 100, 320, 180);
		frmLogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JTextPane txtpnUsername = new JTextPane();
		txtpnUsername.setForeground(Color.WHITE);
		txtpnUsername.setBackground(new Color(14, 36, 51));
		txtpnUsername.setFont(HelloDungeon2.font[0]);
		txtpnUsername.setEditable(false);
		txtpnUsername.setText("Username");
		txtpnUsername.setBounds(10, 45, 102, 20);
		frmLogin.getContentPane().add(txtpnUsername);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setForeground(Color.WHITE);
		txtpnPassword.setBackground(new Color(14, 36, 51));
		txtpnPassword.setFont(HelloDungeon2.font[0]);
		txtpnPassword.setEditable(false);
		txtpnPassword.setText("Password");
		txtpnPassword.setBounds(10, 76, 102, 20);
		frmLogin.getContentPane().add(txtpnPassword);
		
		usernameField = new JTextField();
		usernameField.setForeground(Color.WHITE);
		usernameField.setFont(HelloDungeon2.font[0]);
		usernameField.setBackground(Color.DARK_GRAY);
		usernameField.setBounds(122, 45, 172, 20);
		usernameField.setBorder(BorderFactory.createEmptyBorder());
		frmLogin.getContentPane().add(usernameField);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setForeground(Color.WHITE);
		passwordField.setFont(HelloDungeon2.font[0]);
		passwordField.setBackground(Color.DARK_GRAY);
		passwordField.setBounds(122, 76, 172, 20);
		passwordField.setBorder(BorderFactory.createEmptyBorder());
		frmLogin.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(HelloDungeon2.font[0]);
		btnLogin.setHorizontalTextPosition(JButton.CENTER);
		btnLogin.setVerticalTextPosition(JButton.CENTER);
		btnLogin.setIcon(new ImageIcon("resources/textures/gui/sbutton.png"));
		btnLogin.setBorder(BorderFactory.createEmptyBorder());
		btnLogin.setContentAreaFilled(false);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			usernameField.getText();
			}
		});
		btnLogin.setPressedIcon(new ImageIcon("resources/textures/gui/sbuttonclick.png"));
		btnLogin.setBounds(122, 107, 100, 25);
		frmLogin.getContentPane().add(btnLogin);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("resources/textures/gui/smallwindow.png"));
		background.setBounds(0, 0, 314, 152);
		frmLogin.getContentPane().add(background);
	}
}
