package main.dungeon;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import main.HelloDungeon2;

public class Dungeon {
	public String Name;
	public int difficulty;
	public int minLevel;
	public int floors;
	public String[] textureMap = new String[10];
	public char[][][] tiles = new char[5][12][7];			//floor, x, y
	public char[][][] mapaccess = new char[5][12][7];		//floor, x, y
	public String background;
	
	
	public static Dungeon[] load(){
		Dungeon[] Dungeon = new Dungeon[HelloDungeon2.DUNGEONCOUNT];
		for(int number = 0; number < HelloDungeon2.DUNGEONCOUNT; number ++){
	  	  Dungeon[number] = new Dungeon();
	    }
		
	    try {

	  		File fXmlFile = new File("config/dungeon.xml");
	  		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	  		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	  		Document doc = dBuilder.parse(fXmlFile);
	  		doc.getDocumentElement().normalize();
	  				
	  		NodeList nList = doc.getElementsByTagName("dungeon");

	  		for (int temp = 0; temp < nList.getLength(); temp++) {

	  			Node nNode = nList.item(temp);
	  					
	  			if (nNode.getNodeType() == Node.ELEMENT_NODE) {

	  				Element eElement = (Element) nNode;

	  				int number = Integer.parseInt(eElement.getAttribute("id"));
	  				Dungeon[number].Name = eElement.getElementsByTagName("Name").item(0).getTextContent();
	  				Dungeon[number].background = eElement.getElementsByTagName("background").item(0).getTextContent();
	  				Dungeon[number].floors = Integer.parseInt(eElement.getElementsByTagName("floors").item(0).getTextContent());
	  				Dungeon[number].difficulty = Integer.parseInt(eElement.getElementsByTagName("difficulty").item(0).getTextContent());
	  				Dungeon[number].minLevel = Integer.parseInt(eElement.getElementsByTagName("minlevel").item(0).getTextContent());
	  				for(int number2 = 0; number2 < 10; number2 ++){
	  			    	Dungeon[number].textureMap[number2] =eElement.getElementsByTagName("texture" + number2).item(0).getTextContent();
	  			    }
	  				for(int i = 0; i < Dungeon[number].floors; i++){//i is which floor
	  					String Floor;
	  					String[] FloorArray = new String[7];
	  					Floor = eElement.getElementsByTagName("floor" + i).item(0).getTextContent();
	  					for(int j = 0; j < 6; j++){//which row
	  						FloorArray[j] = Floor.substring(j * 13 , j* 13 + 12);
	  						System.out.println(FloorArray[j]);
	  					}
	  						FloorArray[6] = Floor.substring(78);
	  					for(int j = 0; j < 7 ; j++){
	  						//Dungeon[number].tiles[i][][j] = FloorArray[j].toCharArray();
	  						for(int k = 0; k < 12; k++){
	  							Dungeon[number].tiles[i][k][j] = FloorArray[j].charAt(k);
	  						}
	  					}
	  				}
	  				
	  			}
	  		}
	  	    } catch (Exception e) {
	  		e.printStackTrace();
	  	    }
		return Dungeon;
	}
}
