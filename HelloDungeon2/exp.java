package main;

public class exp {

	public static float Exp (float level, float enemylevel, float multiplier){
		float exp;
		double temp[] = new double[3];
		temp[0] = multiplier * enemylevel / 5;
		temp[1] = Math.pow(2 * enemylevel + 10, 2.5);
		temp[2] = Math.pow(level + enemylevel + 10, 2.5);
		exp = (float) Math.ceil(temp[0] * temp[1] / temp[2] + 1); 
		return exp;
	}

}
