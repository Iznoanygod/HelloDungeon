package main;
import java.util.Random;

public class HelloDungeon2 {
	//main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.ceil(202 / 100.0));
	}
	public static float damage (float attack, float defence, float level, float base){
		float damage;
		float modifier;
		Random rn = new Random();
		float random = rn.nextInt(15) + 85;
		float critical = rn.nextInt(2) + 1;
		modifier = random / 100;
		modifier = modifier * critical;
			damage = 2 * level + 10;
			damage = damage / 250;
			damage = damage * attack / defence;
			damage = damage * base;
			damage = damage + 2;
			damage = damage * modifier;
		return damage;
	}

}
