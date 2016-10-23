package main;

import java.io.File;

import main.items.Item;
import main.window.MainWindow;
import main.classes.Class;
import main.font.FontLoad;

public class Welcome{
	
	public static void welcome(){
		MainWindow.welcomeWindow();
		
		FontLoad.load();
		HelloDungeon2.items = Item.itemList();
		HelloDungeon2.classlist = Class.load();
		
		boolean datacheck = false;
		File savefolder = new File("savedata");
		datacheck = savefolder.mkdir();
		if(datacheck){
			savefolder.mkdir();	
		}
	}
}

