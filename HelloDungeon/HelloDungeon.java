import java.util.*;
public class HelloDungeon {
public static void main(String[] args) {
float gameloop = 0;
float beatgame = 0;
do{
int difficulty = 0;
float fchoice = 0;//fighter
float lchoice = 0;//location
double damage = 0;// damage = strength / 2
float gold = 0;
float dkey = 0;//damage taken = enemy strength * difficulty multiplier / 2
double multdiff = 0;
float dchoice = 0;
int achoice;
float enemy2 = 0;
float enemy3 = 0;
float enemy1 = 0;
float fboss = 0;
int vstore = 0;
int dk;
double rda;
		Scanner name = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		double stat[] = new double[3];
		double basestat[] = new double[3];
		double enemystat[] = new double[3];
		double enemybasestat[] = new double[3];
		//array update
		System.out.println("Come hero, A dungeon awaits!");
		System.out.println("What is your name, young hero?");
        String hero = name.nextLine();
do{// 1 loop start
        System.out.println("OK " + hero + ", what class do you pick?");
int option;
		System.out.println("Character Choices");
		System.out.println("<1> Wizard");
		System.out.println("<2> Archer");
		System.out.println("<3> Warrior");
		System.out.println("<4> Necromancer");
		if (beatgame == 1){
	    	System.out.println("<5> Dragon Slayer");
	    	}
		System.out.println("Choose your character class: ");
		option = input.nextInt();
		switch (option){//1 start
		case 1:
			System.out.println("You have chosen the wizard");
			System.out.println("Your character stats are:");
			System.out.println("Strength = 5");
			System.out.println("Health = 10");
			System.out.println("Magic = 20");
			fchoice = 1;
			stat[0] = 5;
			stat[1] = 10;
			stat[2] = 20;
			basestat[0] = 5;
			basestat[1] = 10;
			basestat[2] = 20;
		break;
		case 2:
			System.out.println("You have chosen the archer");
			System.out.println("Your character stats are:");
			System.out.println("Strength = 10");
			System.out.println("health = 20");
			System.out.println("Magic = 5");
			fchoice = 2;
			stat[0] = 10;
			stat[1] = 20;
			stat[2] = 5;
			basestat[0] = 10;
			basestat[1] = 20;
			basestat[2] = 5;
		break;
		case 3:
			System.out.println("You have chosen the warrior");
			System.out.println("Your character stats are:");
			System.out.println("Strength = 20");
			System.out.println("health = 10");
			System.out.println("Magic = 5");
			fchoice = 3;
			stat[0] = 20;//strength
			stat[1] = 10;//health
			stat[2] = 5;//magic
			basestat[0] = 20;
			basestat[1] = 10;
			basestat[2] = 5;
		break;
		case 4:
			System.out.println("You have chosen the necromancer");
			System.out.println("Your character stats are:");
			System.out.println("Strength = 5");
			System.out.println("Health = 20");
			System.out.println("Magic = 10");
			fchoice = 4;
			stat[0] = 5;
			stat[1] = 20;
			stat[2] = 10;
			basestat[0] = 5;
			basestat[1] = 20;
			basestat[2] = 10;
		break;
		case 5:
			if (beatgame == 1){
    			System.out.println("You have chose the Dragon Slayer");
    			System.out.println("Your character stats are:");
    			System.out.println("Strength = 100");
    			System.out.println("Health = 100");
    			System.out.println("Magic = 100");
    			fchoice = 5;
    			stat[0] = 100;
    			stat[1] = 100;
    			stat[2] = 100;
    			basestat[0] = 100;
    			basestat[1] = 100;
    			basestat[2] = 100;
    			}
    			else {
    				System.out.println("That is not an option");
    			}
		break;
		default:
		System.out.println("Sorry, that option is not avaliable");
		break;
		}
} while (fchoice == 0);//start 1 end
//difficulty
do{
	System.out.println("OK " + hero + ", what difficulty do you pick?");
	System.out.println("<1> Easy");
	System.out.println("Damage done by enemies is decreased by 25%\nFor the inexperienced");
	System.out.println("<2> Normal");
	System.out.println("No special conditions\nFor the average");
	System.out.println("<3> Hard");
	System.out.println("Damage done by enemies is increased by 50%\nFor those who want a challenge");
	System.out.println("<4> Hero");
	System.out.println("Damage done by enemies is DOUBLED\nFor the experienced\nNOT RECOMMENDED");
	if (beatgame == 1){
    	System.out.println("<5> Dragon Slayer");
    	System.out.println("Damage done by enemies is !!TRIPLED!!\nFor those who beat the game\nDO NOT PLAY UNLESS YOU ARE A DRAGON SLAYER");
	}
    	difficulty = input.nextInt();
    	switch (difficulty){
    		case 1:
    			System.out.println("You chose easy as your difficulty");
    			multdiff = .75;
    			dchoice = 1;
    			break;
    		case 2:
    			System.out.println("You chose normal as your difficulty");
    			multdiff = 1;
    			dchoice = 1;
    			break;
    		case 3:
    			System.out.println("You chose hard as your difficulty");
    			multdiff = 1.5;
    			dchoice = 1;
    			break;
    		case 4:
    			System.out.println("You chose hero as your difficulty");
    			multdiff = 2;
    			dchoice = 1;
    			break;
    		case 5:
    			if (beatgame == 1){
    			System.out.println("You chose Dragon Slayer as your difficulty");
    			multdiff = 3;
    			dchoice = 1;
    			}
    			else {
    				System.out.println("That is not an option");
    			}
    			break;
    			default:
    				System.out.println("That is not an option");
    				break;
	}
    }while(dchoice == 0);

//difficulty end
        //townin
do{//2 start
	stat[0] = basestat[0];
	stat[1] = basestat[1];
	stat[2] = basestat[2];
        System.out.println("Welcome to Dungeon-Town");      
        System.out.println("What would you like to do");
        System.out.println("<1> Enter the store");
        System.out.println("<2> Enter the alchemy lab");
        System.out.println("<3> Enter the dungeon");
        if (dkey == 1){
        	System.out.println("<4> Enter the Dragon's Lair");
        }
        int location;
        location = input.nextInt();
        switch (location){
        case 1://stre
        	int storechoice;
        	System.out.println("Welcome to Dungeon-Town Store");
        	System.out.println("What would you like?");
        	System.out.println("Gold:" + gold);
        	System.out.println("<1> Swords\n<2> Staves\n<3> Misc.\n<4> Leave");
        	vstore = input.nextInt();
        	switch(vstore){
        	case 1:
        	System.out.println("<1> Basic Swords");
        	System.out.println("+10 Damage");
        	System.out.println("10 Gold");
        	System.out.println("<2> Iron Sword");
        	System.out.println("+20 Damage");
        	System.out.println("20 Gold");
        	System.out.println("<3> Fire Sword");
        	System.out.println("+50 Damage");
        	System.out.println("50 Gold");
        	System.out.println("<4> Master Sword");
        	System.out.println("+100 Damage");
        	System.out.println("100 Gold");
        	System.out.println("<5> Leave");
        	storechoice = input.nextInt();
        	switch (storechoice){
        	case 1:
        		if (gold >= 10){
        			System.out.println("You have bought the Basic Sword");	
        			basestat[0] = basestat[0] + 10;
        			gold = gold - 10;
        		}
        		else{
        			System.out.println("You do not have enough gold for the Basic Sword");
        		}
        		break;
        	case 2:
        		if (gold >= 20){
        			System.out.println("You have bought the Iron Sword");	
        			basestat[0] = basestat[0] + 20;
        			gold = gold - 20;
        		}
        		else{
        			System.out.println("You do not have enough gold for the Iron Sword");
        		}
        	break;
        	case 3:
        		if (gold >= 50){
        			System.out.println("You have bought the Fire Sword");	
        			basestat[0] = basestat[0] + 50;
        			gold = gold - 50;
        		}
        		else{
        			System.out.println("You do not have enough gold for the Fire Sword");
        		}
        		break;
        	case 4:
        		if (gold >= 100){
        			System.out.println("You have bought the Master Sword");	
        			basestat[0] = basestat[0] + 100;
        			gold = gold - 100;
        		}
        		else{
        			System.out.println("You do not have enough gold for the Master Sword");
        		}
        		break;
        	case 5:
        		System.out.println("You left");
        		break;
        	default:
        		System.out.println("That is not an option");
        		break;
        	}
        	break;
        	case 2:
        		System.out.println("<1> Basic Staff");
            	System.out.println("+10 Magic");
            	System.out.println("10 Gold");
            	System.out.println("<2> Energy Staff");
            	System.out.println("+20 Magic");
            	System.out.println("20 Gold");
            	System.out.println("<3> Staff of Destruction");
            	System.out.println("+50 Magic");
            	System.out.println("50 Gold");
            	System.out.println("<4> Staff of Horror");
            	System.out.println("+100 Magic");
            	System.out.println("100 Gold");
            	System.out.println("<5> Leave");
            	storechoice = input.nextInt();
            	switch (storechoice){
            	case 1:
            		if (gold >= 10){
            			System.out.println("You have bought the Basic Staff");	
            			basestat[2] = basestat[2] + 10;
            			gold = gold - 10;
            		}
            		else{
            			System.out.println("You do not have enough gold for the Basic Staff");
            		}
            		break;
            	case 2:
            		if (gold >= 20){
            			System.out.println("You have bought the Energy Staff");	
            			basestat[2] = basestat[2] + 20;
            			gold = gold - 20;
            		}
            		else{
            			System.out.println("You do not have enough gold for the Energy Staff");
            		}
            	break;
            	case 3:
            		if (gold >= 50){
            			System.out.println("You have bought the Staff of Destruction");	
            			basestat[2] = basestat[2] + 50;
            			gold = gold - 50;
            		}
            		else{
            			System.out.println("You do not have enough gold for the Staff of Destruction");
            		}
            		break;
            	case 4:
            		if (gold >= 100){
            			System.out.println("You have bought the Staff of Horror");	
            			basestat[2] = basestat[2] + 100;
            			gold = gold - 100;
            		}
            		else{
            			System.out.println("You do not have enough gold for the Staff of Horror");
            		}
            		break;
            	case 5:           		
            		System.out.println("You left");
            		break;
            	default:
            		System.out.println("That is not an option");
            		break;
            	}
        		break;
        	case 3:
        		System.out.println("Unlock the Dragon's lair");
        		System.out.println("1000 Gold");
        		System.out.println("<1> Yes <2> No");
        		dk = input.nextInt();
        		switch(dk){
        		case 1:
        			if (gold >= 1000){
        				if (dkey == 0){
            			System.out.println("You have unlocked the Dragon's Lair");
            			gold = gold - 1000;
            			dkey = 1;
        				}
        				else{
        					System.out.println("You already unlocked the Dragon's Lair");
        				}
            		}
            		else{
            			if (dkey == 0){
            			System.out.println("You do not have enough gold to unlock the Dragon's Lair");
            		}
            			
            		}
        			break;
        		case 2:
        			System.out.println("You did not unlock the Dragon's Lair");
        			break;
        			default:
        				System.out.println("That is not an option");
        				break;
        		}
        		break;
        	case 4:
        		System.out.println("You left");
        		break;
        		default:
        			System.out.println("That is not an option");
        			break;
        	}
        	//endofstore
        	break;//store end
        case 2://alchemy lab start
        	int alchemychoice;
        	System.out.println("Welcome to the Alchemy Lab");
        	System.out.println("What would you like?");
        	System.out.println("Gold:" + gold);
        	System.out.println("<1> Small Health Potion\n+10 Health\n10 gold\n<2> Health Potion\n+50 Health\n50 Gold\n<3>Large Health Potion\n+100 Health\n100 Gold");
        	System.out.println("<4> Small Mana Potion\n+10 Magic\n10 Gold\n<5> Mana Potion\n+50 Magic\n50 Gold\n<6>Large Mana Potion\n+100 Magic\n100 Gold");
        	System.out.println("<7> Small Maxy Potion\n+10 on all stats\n30 Gold\n<8> Maxy Potion\n+50 on all stats\n150 Gold\n<9>Large Maxy Potion\n+100 on all stats\n300 Gold");
        	System.out.println("<10> Leave");
        	alchemychoice = input.nextInt();
        	switch(alchemychoice){
        	case 1:
        		if (gold >= 10){
        			System.out.println("You have bought a Small Health Potion");	
        			basestat[1] = basestat[1] + 10;
        			gold = gold - 10;
        		}
        		else{
        			System.out.println("You do not have enough gold for a Small Health Potion");
        		}
        		break;
        	case 2:
        		if (gold >= 50){
        			System.out.println("You have bought a Health Potion");	
        			basestat[1] = basestat[1] + 50;
        			gold = gold - 50;
        		}
        		else{
        			System.out.println("You do not have enough gold for a Health Potion");
        		}
        	break;
        	case 3:
        		if (gold >= 100){
        			System.out.println("You have bought a Large Health Potion");	
        			basestat[1] = basestat[1] + 100;
        			gold = gold - 100;
        		}
        		else{
        			System.out.println("You do not have enough gold for a Large Health Potion");
        		}
        		break;
        		//magic
        	case 4:
        		if (gold >= 10){
        			System.out.println("You have bought a Small Mana Potion");	
        			basestat[2] = basestat[2] + 10;
        			gold = gold - 10;
        		}
        		else{
        			System.out.println("You do not have enough gold for a Small Mana Potion");
        		}
        		break;
        	case 5:
        		if (gold >= 50){
        			System.out.println("You have bought a Mana Potion");	
        			basestat[2] = basestat[2] + 50;
        			gold = gold - 50;
        		}
        		else{
        			System.out.println("You do not have enough gold for a Mana Potion");
        		}
        	break;
        	case 6:
        		if (gold >= 100){
        			System.out.println("You have bought a Large Mana Potion");	
        			basestat[2] = basestat[2] + 100;
        			gold = gold - 100;
        		}
        		else{
        			System.out.println("You do not have enough gold for a Large Mana Potion");
        		}
        		break;
        	//maxy potion
        	case 7:
        		if (gold >= 30){
        			System.out.println("You have bought a Small Maxy Potion");	
        			basestat[0] = basestat[0] + 10;
        			basestat[1] = basestat[1] + 10;
        			basestat[2] = basestat[2] + 10;
        			gold = gold - 30;
        		}
        		else{
        			System.out.println("You do not have enough gold for a Small Maxy Potion");
        		}
        		break;
        	case 8:
        		if (gold >= 150){
        			System.out.println("You have bought a Maxy Potion");	
        			basestat[0] = basestat[0] + 50;
        			basestat[1] = basestat[1] + 50;
        			basestat[2] = basestat[2] + 50;
        			gold = gold - 150;
        		}
        		else{
        			System.out.println("You do not have enough gold for a Maxy Potion");
        		}
        	break;
        	case 9:
        		if (gold >= 300){
        			System.out.println("You have bought a Large Maxy Potion");	
        			basestat[0] = basestat[0] + 100;
        			basestat[1] = basestat[1] + 100;
        			basestat[2] = basestat[2] + 100;
        			gold = gold - 300;
        		}
        		else{
        			System.out.println("You do not have enough gold for a Large Maxy Potion");
        		}
        		break;
        	case 10:
        		System.out.println("You left");
        		break;
        	}
        	//alchemy end
        	break;
        case 3://dungeon
        	enemy1 = 0;
        	enemystat[0] = 10;
        	enemystat[1] = 10;
        	enemystat[2] = 10;
        	enemybasestat[0] = 10;
        	enemybasestat[1] = 10;
        	enemybasestat[2] = 10;
        		System.out.println("You have met your first enemy, the Green Slime");
        		while (enemy1 == 0){
        		System.out.println("HP:" + stat[1] + "/" + basestat[1]);
        		System.out.println("Enemy HP:" + enemystat[1] + "/" + enemybasestat[1]);
        		System.out.println("What will you do?\n<1>Attack\n<2>Shoot Fireball\n<3>Launch Ice Spikes\n<4>Create a Tornado");
        		if (beatgame == 1){
        			System.out.println("<5>Put the Green Slime into eternal damnation");
        		}
        		achoice = input.nextInt();
        		switch (achoice){
        		case 1:
        			Random generator1 = new Random();
            		double randomd = generator1.nextInt(2);
            		Random generator2 = new Random();
            		double randomd2 = generator2.nextInt(10);
            		rda = randomd + ( randomd2 / 10 );
        			System.out.println("You attacked the Green Slime");
        			damage = stat[0] * rda;
        			enemystat[1] = (enemystat[1] - damage);
        			System.out.println("You did " + damage + " damage");
        			break;
        		case 2:
        			Random generator3 = new Random();
            		double randomd3 = generator3.nextInt(2);
            		Random generator4 = new Random();
            		double randomd4 = generator4.nextInt(10);
            		rda = randomd3 + ( randomd4 / 10 );
        			System.out.println("You shot a fireball at the Green Slime");
        			damage = stat[2] * rda;
        			enemystat[1] = (enemystat[1] - damage);
        			System.out.println("You did " + damage + " damage");
        			break;
        		case 3:
        			Random generator5 = new Random();
            		double randomd5 = generator5.nextInt(2);
            		Random generator6 = new Random();
            		double randomd6 = generator6.nextInt(10);
            		rda = randomd5 + ( randomd6 / 10 );
        			System.out.println("You launched ice spikes at the Green Slime");
        			damage = stat[2] * rda;
        			enemystat[1] = (enemystat[1] - damage);
        			System.out.println("You did " + damage + " damage");
        			break;
        		case 4:
        			Random generator7 = new Random();
            		double randomd7 = generator7.nextInt(2);
            		Random generator8 = new Random();
            		double randomd8 = generator8.nextInt(10);
            		rda = randomd7 + ( randomd8 / 10 );
        			System.out.println("You created a tornado and sucked in the Green Slime");
        			damage = stat[2] * rda;
        			enemystat[1] = (enemystat[1] - damage);
        			System.out.println("You did " + damage + " damage");
        			break;
        		case 5:
        			if (beatgame == 1){
        				Random generatored = new Random();
                		int randomed = generatored.nextInt(10);	
                		if(randomed == 0){
                			System.out.println("The Green Slime has been put into eternal damnation");
                			damage = stat[2] * 10000;
                			enemystat[1] = enemystat[1] - damage;
                			System.out.println("You did " + damage + " damage");
                		}
                		else{
                			System.out.println("The move failed");
                		}
        			}
        			
        			else{
        				System.out.println("That is not an option");
        			}
        			break;
        		default:
        			System.out.println("That is not an option");
        			break;
        		}
        		if(enemystat[1] <= 0){
        			System.out.println("You killed the Green Slime");
        			gold = gold + 10;
        			System.out.println("You found 10 gold");
        			enemy1 = 1;
        		}
        		}
        		Random generator = new Random();
        		int chest1 = generator.nextInt(4);
        		if (chest1 == 1){
        			System.out.println("You have come across a chest with 50 Gold in it!");
        			gold = gold + 50;
        		}
        		//second enemy
        		enemy2 = 0;
        		enemystat[0] = 20;
            	enemystat[1] = 20;
            	enemystat[2] = 20;
            	enemybasestat[0] = 20;
            	enemybasestat[1] = 20;
            	enemybasestat[2] = 20;
            	System.out.println("You have met your second enemy, the Rock Golem");
            	while (enemy2 == 0){
            		achoice = 0;
            		//battle functions
            		System.out.println("HP:" + stat[1] + "/" + basestat[1]);
            		System.out.println("Enemy HP:" + enemystat[1] + "/" + enemybasestat[1]);
            		System.out.println("What will you do?\n<1>Attack\n<2>Shoot Fireball\n<3>Launch Ice Spikes\n<4>Create a Tornado");
            		if (beatgame == 1){
            			System.out.println("<5>Put Rock Golem into eternal damnation");
            		}
            		achoice = input.nextInt();
            		switch(achoice){
            		//battle
            			case 1:
            				Random generator1 = new Random();
                    		double randomd = generator1.nextInt(2);
                    		Random generator2 = new Random();
                    		double randomd2 = generator2.nextInt(10);
                    		rda = randomd + ( randomd2 / 10 );
            				System.out.println("You chose to attack the Rock Golem");
            				damage = stat[0] * rda;
            				enemystat[1] = (enemystat[1] - damage);
            				System.out.println("You did " + damage + " damage");
            				break;
            			case 2:
                			Random generator3 = new Random();
                    		double randomd3 = generator3.nextInt(2);
                    		Random generator4 = new Random();
                    		double randomd4 = generator4.nextInt(10);
                    		rda = randomd3 + ( randomd4 / 10 );
                			System.out.println("You shot a fireball at the Rock Golem");
                			damage = stat[2] * rda;
                			enemystat[1] = (enemystat[1] - damage);
                			System.out.println("You did " + damage + " damage");
                			break;
                		case 3:
                			Random generator5 = new Random();
                    		double randomd5 = generator5.nextInt(2);
                    		Random generator6 = new Random();
                    		double randomd6 = generator6.nextInt(10);
                    		rda = randomd5 + ( randomd6 / 10 );
                			System.out.println("You launched ice spikes at the Rock Golem");
                			damage = stat[2] * rda;
                			enemystat[1] = (enemystat[1] - damage);
                			System.out.println("You did " + damage + " damage");
                			break;
                		case 4:
                			Random generator7 = new Random();
                    		double randomd7 = generator7.nextInt(2);
                    		Random generator8 = new Random();
                    		double randomd8 = generator8.nextInt(10);
                    		rda = randomd7 + ( randomd8 / 10 );
                			System.out.println("You created a tornado and sucked in the Rock Golem");
                			damage = stat[2] * rda;
                			enemystat[1] = (enemystat[1] - damage);
                			System.out.println("You did " + damage + " damage");
                			break;
                		case 5:
                			if (beatgame == 1){
                				Random generatored = new Random();
                        		int randomed = generatored.nextInt(10);	
                        		if(randomed == 1){
                        			System.out.println("The Rock Golem has been put into eternal damnation");
                        			damage = stat[2] * 10000;
                        			enemystat[1] = enemystat[1] - damage;
                        			System.out.println("You did " + damage + " damage");
                        		}
                        		else{
                        			System.out.println("The move failed");
                        		}
                			}
                			
                			else{
                				System.out.println("That is not an option");
                			}
                			break;
            		default:
            			System.out.println("That is not an option");
            			break;
            		}
            		if (enemystat[1] <= 0){
            			System.out.println("You killed the Rock Golem");
            			gold = gold + 30;
            			System.out.println("You found 30 gold");
            			enemy2 = 1;
            		}//end if statement
            		else{
            			Random egenerator1 = new Random();
                		double erandomd = egenerator1.nextInt(2);
                		Random egenerator2 = new Random();
                		double erandomd2 = egenerator2.nextInt(10);
                		rda = erandomd + ( erandomd2 / 10 );
            			System.out.println("The Rock Golem attacked back");
            			damage = enemystat[0] * multdiff / rda;
            			System.out.println("He did " + damage + " damage");
            			stat[1] = (stat[1] - damage);
            		}
            		if (stat[1] <= 0){
            			System.out.println("You died");
            			enemy2 = 1;
            		}
            		}
            	if (stat[1] > 0){
            		Random generator1 = new Random();
            		int chest2 = generator1.nextInt(4);
            		if (chest2 == 1){
            			System.out.println("You have come across a chest with 50 Gold in it!");
            			gold = gold + 50;
            		}
            		enemy3 = 0;
                	enemystat[0] = 100;
                	enemystat[1] = 100;
                	enemystat[2] = 100;
                	enemybasestat[0] = 100;
                	enemybasestat[1] = 100;
                	enemybasestat[2] = 100;
            		System.out.println("You now face the boss of the dungeon, the Elemental Beast");
            		while (enemy3 == 0){
            			achoice = 0;
            			System.out.println("HP:" + stat[1] + "/" + basestat[1]);
                		System.out.println("Enemy HP:" + enemystat[1] + "/" + enemybasestat[1]);
                		System.out.println("What will you do?\n<1>Attack\n<2>Shoot Fireball\n<3>Launch Ice Spikes\n<4>Create a Tornado");
                		if (beatgame == 1){
                			System.out.println("<5>Put the Elemental Beast into eternal damnation");
                		}
                		achoice = input.nextInt();
                		switch(achoice){
                		case 1:
                			Random generator3 = new Random();
                    		double randomd = generator3.nextInt(2);
                    		Random generator2 = new Random();
                    		double randomd2 = generator2.nextInt(10);
                    		rda = randomd + ( randomd2 / 10 );
                			System.out.println("You chose to attack the Elemental Beast");
            				damage = stat[0] / rda;
            				enemystat[1] = (enemystat[1] - damage);
            				System.out.println("You did " + damage + " damage");
                		break;
                		case 2:
                			Random generator5 = new Random();
                    		double randomd5 = generator5.nextInt(2);
                    		Random generator6 = new Random();
                    		double randomd6 = generator6.nextInt(10);
                    		rda = randomd5 + ( randomd6 / 10 );
                			System.out.println("You shot a fireball at the Elemental Beast");
                			damage = stat[2] * rda;
                			enemystat[1] = (enemystat[1] - damage);
                			System.out.println("You did " + damage + " damage");
                			break;
                		case 3:
                			Random generator9 = new Random();
                    		double randomd9 = generator9.nextInt(2);
                    		Random generator10 = new Random();
                    		double randomd10 = generator10.nextInt(10);
                    		rda = randomd9 + ( randomd10 / 10 );
                			System.out.println("You launched ice spikes at the Elemental Beast");
                			damage = stat[2] * rda;
                			enemystat[1] = (enemystat[1] - damage);
                			System.out.println("You did " + damage + " damage");
                			break;
                		case 4:
                			Random generator7 = new Random();
                    		double randomd7 = generator7.nextInt(2);
                    		Random generator8 = new Random();
                    		double randomd8 = generator8.nextInt(10);
                    		rda = randomd7 + ( randomd8 / 10 );
                			System.out.println("You created a tornado and sucked in the Elemental Beast");
                			damage = stat[2] * rda;
                			enemystat[1] = (enemystat[1] - damage);
                			System.out.println("You did " + damage + " damage");
                			break;
                		case 5:
                			if (beatgame == 1){
                				Random generatored = new Random();
                        		int randomed = generatored.nextInt(10);	
                        		if(randomed == 1){
                        			System.out.println("The Elemental Beast has been put into eternal damnation");
                        			damage = stat[2] * 10000;
                        			enemystat[1] = enemystat[1] - damage;
                        			System.out.println("You did " + damage + " damage");
                        		}
                        		else{
                        			System.out.println("The move failed");
                        		}
                			}
                			
                			else{
                				System.out.println("That is not an option");
                			}
                			break;
                		default:
                			System.out.println("That is not an option");
                		break;
                		}
                		if (enemystat[1] <= 0){//start
                			System.out.println("You killed the Elemental Beast");
                			gold = gold + 100;
                			System.out.println("You found 100 gold");
                			enemy3 = 1;
                		}//end if statement
                		else{
                			Random egenerator1 = new Random();
                    		double erandomd = egenerator1.nextInt(2);
                    		Random egenerator2 = new Random();
                    		double erandomd2 = egenerator2.nextInt(10);
                    		rda = erandomd + ( erandomd2 / 10 );
                			System.out.println("The Elemental Beast attacked back");
                			damage = enemystat[0] * multdiff * rda;
                			System.out.println("He did " + damage + " damage");
                			stat[1] = (stat[1] - damage);
                		}
                		if (stat[1] <= 0){
                			System.out.println("You died");
                			enemy3 = 1;
                		}//end of enemy battle
            		}
            	}//end of three
        	break;
        case 4:
        	if (dkey == 0){
        			System.out.println("That is not a option");	
        	}
        	if (dkey == 1){
        	System.out.println("Enter the Dragon's Den");
        	System.out.println("Dragon: Welcome to my lair\nDragon: You dare face me with that sword?\nDragon: I SHALL DESTROY YOU!!");
        	if (stat[1] > 0){
        		fboss = 0;
            	enemystat[0] = 500;
            	enemystat[1] = 10000;
            	enemystat[2] = 500;
            	enemybasestat[0] = 500;
            	enemybasestat[1] = 10000;
            	enemybasestat[2] = 500;
        		System.out.println("You are the world's last hope, make this count");
        		while (fboss == 0){
        			achoice = 0;
        			System.out.println("HP:" + stat[1] + "/" + basestat[1]);
            		System.out.println("Enemy HP:" + enemystat[1] + "/" + enemybasestat[1]);
            		System.out.println("What will you do?\n<1>Attack\n<2>Shoot Fireball\n<3>Launch Ice Spikes\n<4>Create a Tornado");
            		if (beatgame == 1){
            			System.out.println("<5>Put the Dragon into eternal damnation");
            		}
            		achoice = input.nextInt();
            		switch(achoice){
            		case 1:
            			Random generator1 = new Random();
                		double randomd = generator1.nextInt(2);
                		Random generator2 = new Random();
                		double randomd2 = generator2.nextInt(10);
                		rda = randomd + ( randomd2 / 10 );
            			System.out.println("You chose to attack the Dragon");
        				damage = stat[0] / rda;
        				enemystat[1] = (enemystat[1] - damage);
        				System.out.println("You did " + damage + " damage");
            		break;
            		case 2:
            			Random generator3 = new Random();
                		double randomd3 = generator3.nextInt(2);
                		Random generator4 = new Random();
                		double randomd4 = generator4.nextInt(10);
                		rda = randomd3 + ( randomd4 / 10 );
            			System.out.println("You shot a fireball at the Dragon");
            			damage = stat[2] * rda;
            			enemystat[1] = (enemystat[1] - damage);
            			System.out.println("You did " + damage + " damage");
            			break;
            		case 3:
            			Random generator5 = new Random();
                		double randomd5 = generator5.nextInt(2);
                		Random generator6 = new Random();
                		double randomd6 = generator6.nextInt(10);
                		rda = randomd5 + ( randomd6 / 10 );
            			System.out.println("You launched ice spikes at the Dragon");
            			damage = stat[2] * rda;
            			enemystat[1] = (enemystat[1] - damage);
            			System.out.println("You did " + damage + " damage");
            			break;
            		case 4:
            			Random generator7 = new Random();
                		double randomd7 = generator7.nextInt(2);
                		Random generator8 = new Random();
                		double randomd8 = generator8.nextInt(10);
                		rda = randomd7 + ( randomd8 / 10 );
            			System.out.println("You created a tornado and sucked in the Dragon");
            			damage = stat[2] * rda;
            			enemystat[1] = (enemystat[1] - damage);
            			System.out.println("You did " + damage + " damage");
            			break;
            		case 5:
            			if (beatgame == 1){
            				Random generatored = new Random();
                    		int randomed = generatored.nextInt(10);	
                    		if(randomed == 1){
                    			System.out.println("The Dragon has been put into eternal damnation");
                    			damage = stat[2] * 10000;
                    			enemystat[1] = enemystat[1] - damage;
                    			System.out.println("You did " + damage + " damage");
                    		}
                    		else{
                    			System.out.println("The move failed");
                    		}
            			}
            			
            			else{
            				System.out.println("That is not an option");
            			}
            			break;
            		default:
            			System.out.println("That is not an option");
            		break;
            		}
            		if (enemystat[1] <= 0){//start
            			System.out.println("You killed the Dragon");
            			fboss = 1;
            			lchoice = 1;
            			beatgame = 1;
            		}//end if statement
            		else{
            			Random egenerator1 = new Random();
                		double erandomd = egenerator1.nextInt(2);
                		Random egenerator2 = new Random();
                		double erandomd2 = egenerator2.nextInt(10);
                		rda = erandomd + ( erandomd2 / 10 );
            			System.out.println("The Dragon attacked back");
            			damage = enemystat[0] * multdiff * rda;
            			System.out.println("He did " + damage + " damage");
            			stat[1] = (stat[1] - damage);
            		}
            		if (stat[1] <= 0){
            			System.out.println("You died");
            			fboss = 1;
            		}//end of enemy battle
        		}
        	}
        	}//finish boss
        	break; 	
        default:
        	System.out.println("That is not a option");
        	break;
        }
}while (lchoice == 0);
System.out.println("You have defeated the dragon");
System.out.println("You Win!!");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
if (fchoice == 5){
	if (difficulty == 5){
		System.out.println("And so, the dragon slayer returns back home and waits for his next journey");
		System.out.println("He waits in his house, sharpening his sword");
		System.out.println("HelloDungeon2 coming soon");
		gameloop = 1;
	}
}
}while(gameloop == 0);
System.out.println("Congratulations\nYou beat the game\nEnd");
}
}
