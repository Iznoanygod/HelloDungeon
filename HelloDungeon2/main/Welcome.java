package main;

import java.io.File;
import java.io.IOException;

import main.items.Item;
import main.window.Frame;
import main.classes.Class;

public class Welcome{
	
	public static void welcome(){
		Frame.welcomeWindow("Loading...");
		
		HelloDungeon2.items = Item.itemList();
		HelloDungeon2.classlist = Class.load();
		
		boolean vaultcheck = false;
		boolean savecheck = false;
		savecheck = HelloDungeon2.saveFile.exists();
		vaultcheck = HelloDungeon2.vaultFile.exists();
		if(!savecheck || !vaultcheck){
			File savefolder = new File("savedata");
			savefolder.mkdir();
			File configfolder = new File("config");
			configfolder.mkdir();
				try {
					vaultcheck = HelloDungeon2.vaultFile.createNewFile();
					savecheck = HelloDungeon2.saveFile.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("asd");
		}
		
		
		
		
		
		
		
	}
}
