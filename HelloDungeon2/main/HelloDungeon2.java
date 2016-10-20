/* 
  _    _      _ _       _____                                         
 | |  | |    | | |     |  __ \                                        
 | |__| | ___| | | ___ | |  | |_   _ _ __   __ _  ___  ___  _ __      
 |  __  |/ _ \ | |/ _ \| |  | | | | | '_ \ / _` |/ _ \/ _ \| '_ \     
 | |  | |  __/ | | (_) | |__| | |_| | | | | (_| |  __/ (_) | | | |    
 |_|  |_|\___|_|_|\___/|_____/ \__,_|_| |_|\__, |\___|\___/|_| |_| ______
                                            __/ |                 |______|
                                           |___/                  
*/
package main;

import java.io.File;

import main.classes.Class;
import main.enemy.Enemy;
import main.items.Item;

public class HelloDungeon2 {
	public static Item items[] = new Item[1000];
	public static Class[] classlist = new Class[124];
	public static Enemy enemylist[] = new Enemy[1000];
	
	public static File vaultFile = new File("savedata/vault.save");
	public static File saveFile = new File("savedata/save.save");
	public static File enemyFile = new File("config/enemy.xml");
	public static File itemFile = new File("config/item.xml");
	public static File classFIle = new File("config/class.xml");
	
	public static void main(String[] args){
		Welcome.welcome();
		System.out.println(items[2].Name);
		
		
		
		
		
	}
}
