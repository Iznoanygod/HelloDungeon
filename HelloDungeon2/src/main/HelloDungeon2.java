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

import java.awt.Font;
import java.io.File;
import java.util.Scanner;

import main.classes.Class;
import main.enemy.Enemy;
import main.items.Item;

public class HelloDungeon2 {
	public static final int FONTCOUNT = 5;
	public static final int ITEMCOUNT = 10000;
	public static final int ENEMYCOUNT = 10000;
	public static final int CLASSCOUNT = 124;
	public static Font font[] = new Font[ITEMCOUNT];
	public static Item items[] = new Item[10000];
	public static Class[] classlist = new Class[CLASSCOUNT];
	public static Enemy enemylist[] = new Enemy[ENEMYCOUNT];
	
	public static File vaultFile = new File("savedata/vault.save");
	public static File enemyFile = new File("config/enemy.xml");
	public static File itemFile = new File("config/item.xml");
	public static File classFIle = new File("config/class.xml");
	
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		
		Welcome.welcome();
		System.out.println(items[2].Name);
		
	}
}