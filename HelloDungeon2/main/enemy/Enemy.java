package main.enemy;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class Enemy {
public String Name;
public String Description;
public int[] baseStat = new int[6];
public int[] moveset = new int[4];
public int multiplier;
public int[] drop = new int[5];
public int[] dropchance = new int[5];

public static Enemy[] load(){
	Enemy[] Enemy = new Enemy[1000];
	for(int number = 0; number < 1000; number ++){
  	  Enemy[number] = new Enemy();
    }
    for(int number = 0; number < 1000; number ++){
  	  Enemy[number].Name = null;
  	  Enemy[number].Description = null;
  	  Enemy[number].baseStat[0] = 0;
  	  Enemy[number].baseStat[1] = 0;
  	  Enemy[number].baseStat[2] = 0;
  	  Enemy[number].baseStat[3] = 0;
  	  Enemy[number].baseStat[4] = 0;
  	  Enemy[number].baseStat[5] = 0;
  	  Enemy[number].moveset[0] = 0;
  	  Enemy[number].moveset[1] = 0;
  	  Enemy[number].moveset[2] = 0;
  	  Enemy[number].moveset[3] = 0;
  	  Enemy[number].multiplier = 0;
  	  Enemy[number].drop[0] = 0;
  	  Enemy[number].drop[1] = 0;
  	  Enemy[number].drop[2] = 0;
  	  Enemy[number].drop[3] = 0;
  	  Enemy[number].drop[4] = 0;
  	  Enemy[number].drop[5] = 0;
  	  Enemy[number].dropchance[0] = 0;
 	  Enemy[number].dropchance[1] = 0;
 	  Enemy[number].dropchance[2] = 0;
 	  Enemy[number].dropchance[3] = 0;
 	  Enemy[number].dropchance[4] = 0;
 	  Enemy[number].dropchance[5] = 0;
  	 }
    try {

  		File fXmlFile = new File("config/enemy.xml");
  		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
  		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
  		Document doc = dBuilder.parse(fXmlFile);
  		doc.getDocumentElement().normalize();

  				
  		NodeList nList = doc.getElementsByTagName("Enemy");

  		for (int temp = 0; temp < nList.getLength(); temp++) {

  			Node nNode = nList.item(temp);
  					
  			if (nNode.getNodeType() == Node.ELEMENT_NODE) {

  				Element eElement = (Element) nNode;

  				int number = Integer.parseInt(eElement.getAttribute("id"));
  				Enemy[number].Name = eElement.getElementsByTagName("Name").item(0).getTextContent();
  				Enemy[number].Description = eElement.getElementsByTagName("Description").item(0).getTextContent();
  				Enemy[number].baseStat[0] = Integer.parseInt(eElement.getElementsByTagName("basestats0").item(0).getTextContent());
  		    	Enemy[number].baseStat[1] = Integer.parseInt(eElement.getElementsByTagName("basestats1").item(0).getTextContent());
  		    	Enemy[number].baseStat[2] = Integer.parseInt(eElement.getElementsByTagName("basestats2").item(0).getTextContent());
  		    	Enemy[number].baseStat[3] = Integer.parseInt(eElement.getElementsByTagName("basestats3").item(0).getTextContent());
  		    	Enemy[number].baseStat[4] = Integer.parseInt(eElement.getElementsByTagName("basestats4").item(0).getTextContent());
  		    	Enemy[number].baseStat[5] = Integer.parseInt(eElement.getElementsByTagName("basestats5").item(0).getTextContent());
  		    	Enemy[number].moveset[0] = Integer.parseInt(eElement.getElementsByTagName("move0").item(0).getTextContent());
  		    	Enemy[number].moveset[1] = Integer.parseInt(eElement.getElementsByTagName("move1").item(0).getTextContent());
  		    	Enemy[number].moveset[2] = Integer.parseInt(eElement.getElementsByTagName("move2").item(0).getTextContent());
  		    	Enemy[number].moveset[3] = Integer.parseInt(eElement.getElementsByTagName("move3").item(0).getTextContent());
  				Enemy[number].multiplier = Integer.parseInt(eElement.getElementsByTagName("multiplier").item(0).getTextContent());
  				Enemy[number].drop[0] = Integer.parseInt(eElement.getElementsByTagName("drop0").item(0).getTextContent());
  		    	Enemy[number].drop[1] = Integer.parseInt(eElement.getElementsByTagName("drop1").item(0).getTextContent());
  		    	Enemy[number].drop[2] = Integer.parseInt(eElement.getElementsByTagName("drop2").item(0).getTextContent());
  		    	Enemy[number].drop[3] = Integer.parseInt(eElement.getElementsByTagName("drop3").item(0).getTextContent());
  		    	Enemy[number].drop[4] = Integer.parseInt(eElement.getElementsByTagName("drop4").item(0).getTextContent());
  		    	Enemy[number].drop[5] = Integer.parseInt(eElement.getElementsByTagName("drop5").item(0).getTextContent());
  		    	Enemy[number].dropchance[0] = Integer.parseInt(eElement.getElementsByTagName("chance0").item(0).getTextContent());
  		    	Enemy[number].dropchance[1] = Integer.parseInt(eElement.getElementsByTagName("chance1").item(0).getTextContent());
  		    	Enemy[number].dropchance[2] = Integer.parseInt(eElement.getElementsByTagName("chance2").item(0).getTextContent());
  		    	Enemy[number].dropchance[3] = Integer.parseInt(eElement.getElementsByTagName("chance3").item(0).getTextContent());
  		    	Enemy[number].dropchance[4] = Integer.parseInt(eElement.getElementsByTagName("chance4").item(0).getTextContent());
  		    	Enemy[number].dropchance[5] = Integer.parseInt(eElement.getElementsByTagName("chance5").item(0).getTextContent());

  			}
  		}
  	    } catch (Exception e) {
  		e.printStackTrace();
  	    }
	return Enemy;
}
}
