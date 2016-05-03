package main.classes;

public class Mage {
	public static Class Stat(){
		Class Class = new Class();
		Class.Name = "Mage";
		Class.Description = "Basic magic user";
		Class.baseStat[0] = 35;//HP
		Class.baseStat[1] = 50;//MP
		Class.baseStat[2] = 25;//ATK
		Class.baseStat[3] = 30;//DEF
		Class.baseStat[4] = 70;//WIS
		Class.baseStat[5] = 45;//SPD
		Class.evolution[0] = "Warlock";
		Class.evolution[1] = "Sorceror";
		Class.curve = 2;
		return Class;
	}
}
