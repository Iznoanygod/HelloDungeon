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
float difficulty;
float dungeontemp = 0;
float swordown[] = new float[9];
float staffown[] = new float[9];
float keyown[] = new float[9];
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
System.out.println("[ 1 ]-[ 2 ]-[ 3 ]-[ 4 ]-[ 5 ]-[ 6 ]-[ 7 ]-[ 8 ]-[ 9 ]-[ 10 ]-[ 11 ]");//[base1]-[base2]-[base3]-[gold]-[elixer]-[level]-[exp]-[fighter]
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
try {
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
System.out.println("Input [ 10 ]");
load = (long) input.nextLong();
temp = (long) Math.sqrt(load - random);
difficulty = temp / random;
try {
	  Thread.sleep(1000L);    // one second
	}
	catch (Exception e) {}
System.out.println("Input [ 11 ]");
load = (long) input.nextLong();
temp = (long) Math.sqrt(load - random);
dungeontemp = temp / random;
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
while(game == 0){//flag game
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
System.out.println("Options:\n[1] Enter Shop\n[2] Enter Dungeon\n[3] Options\n[4] My Profile\n[5] Save Game");
Scanner input = new Scanner(System.in);
location = input.nextInt();
try {Thread.sleep(1000L);}catch (Exception e) {}
switch(location){//flag location
case 1:
int store;
System.out.println("Welcome to the " + town + " shop");
try {Thread.sleep(1000L);}catch (Exception e) {}
System.out.println("What would you like?\n[1] Swords\n[2] Staves\n[3] Potions\n[4] Keys\n[5] Leave");
store = input.nextInt();
float storetemp = 0;
float sword;;
float staff;
float potion;
float key;
String swordname = null;
switch(store){//flag store
	case 1:
	try {Thread.sleep(1000L);}catch (Exception e) {}
	System.out.println("What kind of sword do you want?\nGold: " + gold);
	System.out.println("[1] Wooden Sword\n+10 Attack\n20 Gold\n[2] Stone Sword\n+20 Attack\n40 Gold\n[3] Iron Sword\n+40 Attack\n80 Gold\n[4] Gold Sword\n+80 Attack\n160 Gold\n[5] Diamond Sword\n+160 Attack\n320 Gold\n[6] Flaming Sword\n+320 Attack\n+640 Gold\n[7] Sword of Oblivion\n+640 Attack\n1280 Gold[\n8] Sword of the Master\n+1280 Attack\n2560 Gold\n[9] Sword of the Dragon Slayer\n+2560 Attack\n5120 Gold");
	sword = input.nextFloat();
	//sword name
	if(sword == 1){swordname = "Wooden Sword";}
	if(sword == 2){swordname = "Stone Sword";}
	if(sword == 3){swordname = "Iron Sword";}
	if(sword == 4){swordname = "Gold Sword";}
	if(sword == 5){swordname = "Diamond Sword";}
	if(sword == 6){swordname = "Flaming Sword";}
	if(sword == 7){swordname = "Sword of Oblivion";}
	if(sword == 8){swordname = "Sword of the Master";}
	if(sword == 9){swordname = "Sword of the Dragon Slayer";}
	elif(sword<=0){System.out.println("That is not an option");storetemp = 1;}
	elif(sword>=10){System.out.println("That is not an option");storetemp = 1;}
	if(storetemp == 0){
		if(gold >= (Math.pow(2,sword) * 10)/2){
		if(swordown[0] == 1){System.out.println("You already own the " + swordname);}
		if(swordown[1] == 1){System.out.println("You already own the " + swordname);}
		if(swordown[2] == 1){System.out.println("You already own the " + swordname);}
		if(swordown[3] == 1){System.out.println("You already own the " + swordname);}
		if(swordown[4] == 1){System.out.println("You already own the " + swordname);}
		if(swordown[5] == 1){System.out.println("You already own the " + swordname);}
		if(swordown[6] == 1){System.out.println("You already own the " + swordname);}
		if(swordown[7] == 1){System.out.println("You already own the " + swordname);}
		if(swordown[8] == 1){System.out.println("You already own the " + swordname);}
	if(sword == 1){swordown[0] = 1;}
	if(sword == 2){swordown[1] = 1;}
	if(sword == 3){swordown[2] = 1;}
	if(sword == 4){swordown[3] = 1;}
	if(sword == 5){swordown[4] = 1;}
	if(sword == 6){swordown[5] = 1;}
	if(sword == 7){swordown[6] = 1;}
	if(sword == 8){swordown[7] = 1;}
	if(sword == 9){swordown[8] = 1;}
			basestat[2] = (float) (gold - (Math.pow(2,sword) * 10)/2);
			gold = (float) (basestat[2] + Math.pow(2, sword) * 10);
			System.out.println("You bought a " + swordname);

		}
		else{System.out.println("You do not have enough gold");};
	}
	//sword name
	break;

}//flag store
break;
}//flag location
}//flag game
}//flag2
}
}
//System.out.println("");
//try {Thread.sleep(1000L);}catch (Exception e) {}
