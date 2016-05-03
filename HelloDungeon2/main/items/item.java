package main.items;
public class item{
	public String Name;
	public String Description;
	public int[] Stats = new int[6];
	public int Slot;
	
	public static item[] itemList(){
		item Items[] = new item[1000];
	      for(int number = 0; number < 1000; number ++){
	    	  Items[number] = new item();
	      }
	      for(int number = 0; number < 1000; number ++){
	    	  Items[number].Name = null;
	    	  Items[number].Description = null;
	    	  Items[number].Stats[0] = 0;
	    	  Items[number].Stats[1] = 0;
	    	  Items[number].Stats[2] = 0;
	    	  Items[number].Stats[3] = 0;
	    	  Items[number].Stats[4] = 0;
	    	  Items[number].Stats[5] = 0;
	    	  Items[number].Slot = 0;
	    	 }
		return Items;
		
		
		
	}
	
}