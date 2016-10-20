package main.save;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Save {
	
	public static boolean vault(float[] itemID){
		try
	      {
	         FileOutputStream fileOut = new FileOutputStream("savedata/vault.save");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         
	        	 for(int number = 0; number < 100; number++){
	        	 out.writeObject(itemID[number]);
	        	 
	         }
	         out.close();
	         fileOut.close();
	         
	      }
		catch(IOException i)
	      {
	          i.printStackTrace();
	          return false;
	      }
	return true;
	}
}