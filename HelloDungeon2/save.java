package main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class save {
	
	public static boolean vault(float[] itemID){
		try
	      {
			boolean initiate = false;
			int number = 0;
	         FileOutputStream fileOut = new FileOutputStream("../saves/vault.save");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         while(initiate == false){
	        	 out.writeObject(itemID[number]);
	        	 
	        	 number++;
	        	 if(number > 99){
		    		  initiate = true;
		    	  }
	         }
	         out.close();
	         fileOut.close();
	         
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
		return true;
	}
	
	
	
	
	
	
	
	
	
}
