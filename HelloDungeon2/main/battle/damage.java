package main.battle;

import java.util.Random;

public class damage{

	public static float Damage (float attack, float defence, float level, float base){
		float damage;
		float modifier;
		Random rn = new Random();
		float random = rn.nextInt(15) + 85;
		modifier = random / 100;
			damage = 2 * level + 10;
			damage = damage / 250;
			damage =  (damage * attack / defence);
			damage =  (damage * base);
			damage = damage + 2;
			damage =  (damage * modifier);
		return (int) Math.ceil(damage);
	}

}
