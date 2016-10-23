package main.classes;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import main.HelloDungeon2;

public class Class {
	public String Name;
	public String Description;
	public int[] baseStat = new int[6];
	public int[] moveset = new int[8];
	public int[] evolution = new int[2];
	public int curve;
	public int tier;
	
	public static Class[] load(){
		Class[] Class = new Class[HelloDungeon2.CLASSCOUNT];
		for(int number = 0; number < HelloDungeon2.CLASSCOUNT; number ++){
	  	  Class[number] = new Class();
	    }
		
	    try {

	  		File fXmlFile = new File("config/class.xml");
	  		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	  		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	  		Document doc = dBuilder.parse(fXmlFile);
	  		doc.getDocumentElement().normalize();
	  				
	  		NodeList nList = doc.getElementsByTagName("class");

	  		for (int temp = 0; temp < nList.getLength(); temp++) {

	  			Node nNode = nList.item(temp);
	  					
	  			if (nNode.getNodeType() == Node.ELEMENT_NODE) {

	  				Element eElement = (Element) nNode;

	  				int number = Integer.parseInt(eElement.getAttribute("id"));
	  				Class[number].Name = eElement.getElementsByTagName("Name").item(0).getTextContent();
	  				Class[number].Description = eElement.getElementsByTagName("Description").item(0).getTextContent();
	  				Class[number].baseStat[0] = Integer.parseInt(eElement.getElementsByTagName("basestat0").item(0).getTextContent());
	  				Class[number].baseStat[1] = Integer.parseInt(eElement.getElementsByTagName("basestat1").item(0).getTextContent());
	  				Class[number].baseStat[2] = Integer.parseInt(eElement.getElementsByTagName("basestat2").item(0).getTextContent());
	  				Class[number].baseStat[3] = Integer.parseInt(eElement.getElementsByTagName("basestat3").item(0).getTextContent());
	  				Class[number].baseStat[4] = Integer.parseInt(eElement.getElementsByTagName("basestat4").item(0).getTextContent());
	  				Class[number].baseStat[5] = Integer.parseInt(eElement.getElementsByTagName("basestat5").item(0).getTextContent());
	  				Class[number].curve = Integer.parseInt(eElement.getElementsByTagName("curve").item(0).getTextContent());
	  				Class[number].tier = Integer.parseInt(eElement.getElementsByTagName("tier").item(0).getTextContent());
	  				Class[number].evolution[0] = Integer.parseInt(eElement.getElementsByTagName("evolution0").item(0).getTextContent());
	  				Class[number].evolution[1] = Integer.parseInt(eElement.getElementsByTagName("evolution1").item(0).getTextContent());
	  			    for(int number2 = 0; number2 < 8; number2 ++){
	  			    	Class[number].moveset[number2] = Integer.parseInt(eElement.getElementsByTagName("move" + number2).item(0).getTextContent());
	  			    }

	  			}
	  		}
	  	    } catch (Exception e) {
	  		e.printStackTrace();
	  	    }
		return Class;
	}
		
}