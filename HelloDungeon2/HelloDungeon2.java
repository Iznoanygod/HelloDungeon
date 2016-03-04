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
import java.io.IOException;
import java.io.ObjectInputStream;

public class HelloDungeon2 {


	public static void main(String[] args){
		System.out.println("Loading...");
		//item intiate
		item Items[] = new item[1000];
	      try
	      {
	         FileInputStream fileIn = new FileInputStream("../config/items.config");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         int number = 0;
	         boolean initiate = false;
	         while(initiate == false){
	        	 Items[number] = (item) in.readObject();
	        	 
	        	 number++;
	        	 if(number > 999){
		    		  initiate = true;
		    	  }
	         }
	         
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
	     
	     
	     
	}
}
