package main.level;

public class expcurves {
	public static float exp(int level, int curve){
		float exp = 0;
		switch(curve){
		case 0://fast
			exp = (4 / 5 * (level ^ 3) );
		break;
		case 1://med-fast
			exp = level ^ 3;
		break;
		case 2://medslow
			exp = (6 / 5) * (level ^ 3 ) - (15 * ( level ^ 2 ) ) + (100 * level ) - 140;
		break;
		case 3://slow
			exp = (5 / 4 * (level ^ 3) );
		break;
		case 4://erratic
			if(level <= 50){
			exp = (level ^ 3) * (100 - level) / 50;
			}
			else if(level > 50 && level <= 68){
			exp = (level ^ 3) * (150 - level) / 100;
			}
			else if (level > 68 && level <= 98){
			exp = (float) ((level ^ 3 )* Math.floor((1911 - 10 * level) / 3 ) / 500);
			}
			else{
			exp = (level ^ 3) * (160 - level) / 100;	
			}
		break;
		case 5://fluctuating
			if(level <= 15){
				exp = (float) ((level ^ 3) * (Math.floor((level + 1) / 3 ) + 24)/50);
			}
			else if(level > 15 && level <= 36){
				exp = (level ^ 3) * ((level + 14) / 50);
			}
			else{
				exp = (float) ((level ^ 3) * (Math.floor(level / 2) + 32)/50);
			}
		break;
		
		}
		return exp;
	}
}
