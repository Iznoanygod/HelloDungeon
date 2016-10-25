package main.window;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class BattleWindow {

	private JFrame frmBattle;

	/**
	 * Launch the application.
	 */
	public static void battleWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BattleWindow window = new BattleWindow();
					window.frmBattle.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BattleWindow() {
		battleWindowInitialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void battleWindowInitialize() {
		frmBattle = new JFrame();
		frmBattle.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Andrew\\workspace-java\\HelloDungeon2\\resources\\textures\\icon.png"));
		frmBattle.setTitle("Battle");
		frmBattle.setResizable(false);
		frmBattle.setBounds(100, 100, 1030, 796);
		frmBattle.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frmBattle.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
            	if(!QuitWindow.frmQuitGame.isVisible())
            		QuitWindow.quitGameWindow();
			
            }
        });
		frmBattle.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1024, 768);
		frmBattle.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChar = new JLabel("");
		lblChar.setIcon(new ImageIcon("C:\\Users\\Andrew\\workspace-java\\HelloDungeon2\\resources\\textures\\sprites\\Dread_Dysipius_Sprite.png"));
		lblChar.setBounds(256, 300, 155, 116);
		panel.add(lblChar);
		
		JLabel lblOverlay = new JLabel();
		lblOverlay.setBounds(0, 0, 1024, 768);
		panel.add(lblOverlay);
		lblOverlay.setIcon(new ImageIcon("C:\\Users\\Andrew\\workspace-java\\HelloDungeon2\\resources\\textures\\gui\\battlewindow.png"));
	}
}
