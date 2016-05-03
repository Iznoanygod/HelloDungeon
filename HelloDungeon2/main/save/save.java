package main.save;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class save {
	
	public static boolean vault(float[] itemID){
		try
	      {
	         FileOutputStream fileOut = new FileOutputStream("../vault.save");
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
	      }
	return true;
	}
}