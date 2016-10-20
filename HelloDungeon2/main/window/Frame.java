package main.window;

import java.awt.BorderLayout;

import java.awt.*;
import javax.swing.*;

public class Frame {
	public static JFrame frame = new JFrame();
	public static void welcomeWindow(String a){
		frame.setTitle("HelloDungeon2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel emptyLabel = new JLabel(a);
        emptyLabel.setPreferredSize(new Dimension(1920, 1080));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
	}
}
