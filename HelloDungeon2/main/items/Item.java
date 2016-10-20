package main.items;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Item{
	public String Name;
	public String Description;
	public int Tier;
	public int[] Stats = new int[6];
	public int Slot;
	
	public static Item[] itemList(){
		Item Items[] = new Item[1000];
	      for(int number = 0; number < 1000; number ++){
	    	  Items[number] = new Item();
	      }
	      
	      /*
	      0=weapon
	      1=armor
	      2=ring
	      3=spell
	      4=potion
	       */
	      
	      
	      try {

	    		File fXmlFile = new File("config/item.xml");
	    		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	    		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	    		Document doc = dBuilder.parse(fXmlFile);
	    		doc.getDocumentElement().normalize();

	    				
	    		NodeList nList = doc.getElementsByTagName("item");

	    		for (int temp = 0; temp < nList.getLength(); temp++) {

	    			Node nNode = nList.item(temp);
	    					
	    			if (nNode.getNodeType() == Node.ELEMENT_NODE) {

	    				Element eElement = (Element) nNode;

	    				int number = Integer.parseInt(eElement.getAttribute("id"));
	    				Items[number].Name = eElement.getElementsByTagName("Name").item(0).getTextContent();
	    				Items[number].Description = eElement.getElementsByTagName("Description").item(0).getTextContent();
	    				Items[number].Tier = Integer.parseInt(eElement.getElementsByTagName("Tier").item(0).getTextContent());
	    				Items[number].Stats[0] = Integer.parseInt(eElement.getElementsByTagName("Stats0").item(0).getTextContent());
	    		    	Items[number].Stats[1] = Integer.parseInt(eElement.getElementsByTagName("Stats1").item(0).getTextContent());
	    		    	Items[number].Stats[2] = Integer.parseInt(eElement.getElementsByTagName("Stats2").item(0).getTextContent());
	    		    	Items[number].Stats[3] = Integer.parseInt(eElement.getElementsByTagName("Stats3").item(0).getTextContent());
	    		    	Items[number].Stats[4] = Integer.parseInt(eElement.getElementsByTagName("Stats4").item(0).getTextContent());
	    		    	Items[number].Stats[5] = Integer.parseInt(eElement.getElementsByTagName("Stats5").item(0).getTextContent());
	    				Items[number].Slot = Integer.parseInt(eElement.getElementsByTagName("Slot").item(0).getTextContent());

	    			}
	    		}
	    	    } catch (Exception e) {
	    		e.printStackTrace();
	    	    }
	      
		return Items;
	}
	
}