package main.level;

public class Stat {
	@SuppressWarnings("null")
	public static int[] stat(float baseStat[], float level, float ev[]){
			int[] stat = null;
			stat[0] = (int) Math.ceil(((baseStat[0] * 2 + (ev[0]/4)) * level / 100 + 10 + level));
			stat[1] = (int) Math.ceil(((baseStat[1] * 2 + (ev[1]/4)) * level / 100 + 10 + level));
			for(int n = 2; n < 7; n++){
			stat[n] = (int) Math.ceil((((baseStat[n] * 2 + (ev[n])) * level / 100) + 5));
			}
		
		
		return stat;
	}
}
//HP
//MP
//ATK
//DEF
//WIS
//SPD