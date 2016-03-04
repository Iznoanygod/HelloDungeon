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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class HelloDungeon2 {


	@SuppressWarnings("null")
	public static void main(String[] args){
		//Initiation
		float test[] = new float[12];
		System.out.println("Loading...");
		//item intiate
		item Items[] = new item[1000];
		 Items[0] = new item();    
		 Items[1] = new item();
	      try
	      {
	         FileInputStream fileIn = new FileInputStream("../config/items.config");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         
	         Items[0] =  (item) in.readObject();
	         Items[1] =  (item) in.readObject();
	         Items[2] =  (item) in.readObject();
	         Items[13] =  (item) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	         return;
	      }
	      catch(ClassNotFoundException c)
	      {
	         System.out.println("Item config can not be found");
	         c.printStackTrace();
	         return;
	      }
	     System.out.println(Items[0].Name);
	     System.out.println(Items[1].Name);
	     System.out.println(Items[2].Name);
	     System.out.println(Items[13].Name);
	     System.out.println(Items[0].Description);
	     
	}
}
