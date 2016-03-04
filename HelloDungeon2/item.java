package main;
import java.io.*;
public class item implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;
	public String Name;
	public String Description;
	public float[] Stat;
	
	public static void main(String [] args)
	   {
	      item Items[] = new item[1000];
	      boolean initiate = false;
	      int number = 0;
	      while(initiate == false){
	    	  
	    	  Items[number] = new item();
	    	  number++;
	    	  if(number > 999){
	    		  initiate = true;
	    	  }
	      }
 
	      number = 0;
	      initiate = false;
	      while(initiate == false){
	    	  
	    	  Items[number].Name = null;
	    	  Items[number].Description = null;
	    	  number++;
	    	  if(number > 999){
	    		  initiate = true;
	    	  }
	      }
	      
	      
	      
	      Items[0].Name = "item0";
	      Items[0].Description = "description0";
	      Items[1].Name = "item1";
	      Items[2].Name = "item2";
	      try
	      {
	         FileOutputStream fileOut = new FileOutputStream("../config/items.config");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         initiate = false;
	         number = 0;
	         while(initiate == false){
	        	 out.writeObject(Items[number]);
	        	 
	        	 number++;
	        	 if(number > 999){
		    		  initiate = true;
		    	  }
	         }
	         out.close();
	         fileOut.close();
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
	      System.out.println("done");
	   }
	
}
