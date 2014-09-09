//System.out.println("");
//try {Thread.sleep(1000L);}catch (Exception e) {}
import java.util.*;
import java.lang.*;
public class HelloDungeon2 {
	public static void main(String[] args) {
float loop = 0;
	System.out.println("HelloDungeon2");
	System.out.println("By Andrew Park");
	try {
		  Thread.sleep(1000L);    // one second
		}
		catch (Exception e) {}
while(loop == 0){//flag2
int menuoption;
float stat[] = new float[3];//1:magic 2:health 3:attack
float basestat[] = new float[3];
int fighterc = 0;
float game = 0;
float dungeontemp = 0;
float fighter = 0;
float gold = 0;
float elixer = 0;
float level = 0;
float exp = 0;
float menuloop = 0;
System.out.println("What is your name?");
Scanner name = new Scanner(System.in);
String hero = name.nextLine();	
while (menuloop == 0){//flag4
System.out.println("1: New Game");
System.out.println("2: Load Game");
Scanner input = new Scanner(System.in);
menuoption = input.nextInt();
switch(menuoption){//flag3
case 1:
System.out.println("The Dragon Slayer has been long gone\nA new hero has been born");
try {
		  Thread.sleep(1000L);    // one second
		}
		catch (Exception e) {}
		while(fighter == 0){//flag1
		System.out.println("Okay, " + hero + ", what class do you pick?");
		try {
			Thread.sleep(1000L);
		} catch (Exception e) {}
		System.out.println("[1] Sorceror");
		System.out.println("High magic and decent health");
		try {Thread.sleep(2000L);}catch (Exception e) {}
		System.out.println("[2] Wizard");
		System.out.println("Very high magic");
		try {Thread.sleep(2000L);}catch (Exception e) {}
		System.out.println("[3] Necromancer");
		System.out.println("Jack of all trades");
		try {Thread.sleep(2000L);}catch (Exception e) {}
		System.out.println("[4] Warrior");
		System.out.println("High attack and decent health");
		try {Thread.sleep(2000L);}catch (Exception e) {}
		System.out.println("[5] Archer");
		System.out.println("High health and decent attack");
		try {Thread.sleep(2000L);}catch (Exception e) {}
		System.out.println("[6] Barbarian");
		System.out.println("Very high attack");
		try {Thread.sleep(2000L);}catch (Exception e) {}
		System.out.println("[7] Knight");
		System.out.println("Very high health");
		try {Thread.sleep(1000L);}catch (Exception e) {}
		System.out.println("Choice: ");
		fighterc = input.nextInt();
		switch(fighterc){
		case 1:
			System.out.println("You chose Sorceror as your class");
			basestat[0] = 30;
			basestat[1] = 20;
			basestat[2] = 10;
			fighter = 1;
		break;
		case 2:
			System.out.println("You chose Wizard as your class");
			basestat[0] = 40;
			basestat[1] = 10;
			basestat[2] = 10;
			fighter = 2;
		break;
		case 3:
			System.out.println("You chose Necromancer as your class");
			basestat[0] = 20;
			basestat[1] = 20;
			basestat[2] = 20;
			fighter = 3;
		break;
		case 4:
			System.out.println("You chose Warrior as your class");
			basestat[0] = 10;
			basestat[1] = 30;
			basestat[2] = 20;
			fighter = 4;
		break;
		case 5:
			System.out.println("You chose Archer as your class");
			basestat[0] = 10;
			basestat[1] = 20;
			basestat[2] = 30;
			fighter = 5;
			break;
		case 6:
			System.out.println("You chose Barbarian as your class");
			basestat[0] = 10;
			basestat[1] = 40;
			basestat[2] = 10;
			fighter = 6;
			break;
		case 7:
			System.out.println("You chose Knight as your class");
			basestat[0] = 10;
			basestat[1] = 10;
			basestat[2] = 40;
			fighter = 7;
		break;
		default:
			System.out.println("That is not an option");
		break;
		}
		menuloop = 1;
		}//flag1
break;		
case 2:		
long load;
long random;
long temp;
try {Thread.sleep(1000L);}catch (Exception e) {}
System.out.println("Enter User-Data Code");
System.out.println("[ 1 ]-[ 2 ]-[ 3 ]-[ 4 ]-[ 5 ]-[ 6 ]-[ 7 ]-[ 8 ]-[ 9 ]");//[base1]-[base2]-[base3]-[gold]-[elixer]-[level]-[exp]-[fighter]
try {
	  Thread.sleep(1000L);    // one second
	}
	catch (Exception e) {}
System.out.println("Input [ 1 ]");
random = (long) input.nextLong();
random = (long) Math.sqrt(random - 9);
random = random / 2;
try {
	  Thread.sleep(1000L);    // one second
	}
	catch (Exception e) {}
System.out.println("Input [ 2 ]");
load = (long) input.nextLong();
temp = (long) Math.sqrt(load - random);
basestat[0] = temp / random;
try {i
	  Thread.sleep(1000L);    // one second
	}
	catch (Exception e) {}
System.out.println("Input [ 3 ]");
load = (long) input.nextLong();
temp = (long) Math.sqrt(load - random);
basestat[1] = temp / random;
try {
	  Thread.sleep(1000L);    // one second
	}
	catch (Exception e) {}
System.out.println("Input [ 4 ]");
load = (long) input.nextLong();
temp = (long) Math.sqrt(load - random);
basestat[2] = temp / random;
try {
	  Thread.sleep(1000L);    // one second
	}
	catch (Exception e) {}
System.out.println("Input [ 5 ]");
load = (long) input.nextLong();
temp = (long) Math.sqrt(load - random);
gold = temp / random;
try {
	  Thread.sleep(1000L);    // one second
	}
	catch (Exception e) {}
System.out.println("Input [ 6 ]");
load = (long) input.nextLong();
temp = (long) Math.sqrt(load - random);
elixer = temp / random;
try {
	  Thread.sleep(1000L);    // one second
	}
	catch (Exception e) {}
System.out.println("Input [ 7 ]");
load = (long) input.nextLong();
temp = (long) Math.sqrt(load - random);
level = temp / random;
try {
	  Thread.sleep(1000L);    // one second
	}
	catch (Exception e) {}
System.out.println("Input [ 8 ]");
load = (long) input.nextLong();
temp = (long) Math.sqrt(load - random);
exp = temp / random;
try {
	  Thread.sleep(1000L);    // one second
	}
	catch (Exception e) {}
System.out.println("Input [ 9 ]");
load = (long) input.nextLong();
temp = (long) Math.sqrt(load - random);
fighter = temp / random;
try {
	  Thread.sleep(1000L);    // one second
	}
	catch (Exception e) {}
menuloop = 1;
break;
default:
	System.out.println("That is not an option");
break;
}//flag3
}//flag4
//actual game
int dungeon = (int) dungeontemp;
// TODO add store and dungeon and option and my account
int location;
String town = null;
switch(dungeon){//flag town
case 0:
	town = "Dungeon-Town";
	break;
}//flag town
System.out.println("You are in: " + town);
try {Thread.sleep(1000L);}catch (Exception e) {}
System.out.println("Options:\n[1] Enter Shop\n[2] Enter Alchemy Lab\n[3] Enter Dungeon\n [4] Options\n[5] Save Game");
Scanner input = new Scanner(System.in);
location = input.nextInt();
try {Thread.sleep(1000L);}catch (Exception e) {}
switch(location){//flag location
case 1:
System.out.println("Welcome to the " + town + " shop");
break;

}//flag location
}//flag game
}//flag2
}
