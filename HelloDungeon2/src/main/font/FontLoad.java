package main.font;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.FileInputStream;
import java.io.IOException;

import main.HelloDungeon2;

public class FontLoad {
	public static void load(){
		
		try {
			for(int temp = 0; temp < HelloDungeon2.FONTCOUNT; temp++){
			HelloDungeon2.font[temp] = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream("resources/fonts/font" + temp + ".ttf")).deriveFont(16f);
			}
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}