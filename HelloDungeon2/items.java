package main;
import java.io.*;
import java.util.Arrays;
public class item implements java.io.Serializable{
	
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
	      Items[0].Name = "item0";
	      Items[0].Description = "description0";
	      Items[1].Name = "item1";
	         
	      Items[2].Name = "item2";
	      Items[13].Name = "item0";
	      try
	      {
	         FileOutputStream fileOut = new FileOutputStream("../config/items.config");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(Items[0]);
	         out.writeObject(Items[1]);
	         out.writeObject(Items[2]);
	         out.writeObject(Items[13]);
	         out.close();
	         fileOut.close();
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
	      System.out.println("done");
	   }
	
}
