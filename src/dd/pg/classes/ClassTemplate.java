package dd.pg.classes;

import dd.iface.all.Classes;
import dd.pg.stats.StatHandler;

public class ClassTemplate implements Classes{

	// Working variables
	
	protected int max_tmp;
	protected int max_rif;
	protected int max_vol;
	protected int max_atk_to20;
	protected int pa_lv1;
	protected int pa_molt;
	protected int pf_dice;
	
	// Result variables
	
	protected int tmp;
	protected int rif;
	protected int vol;
	protected int atk;
	protected int pa;
	
	// Initialization variables
	protected int lvl;
	protected boolean firstClass;
	protected StatHandler stats;
	
	public ClassTemplate(int max_tmp, int max_rif, int max_vol, int max_atk_to20, int pa_lv1, int pa_molt, int pf_dice, int lvl, boolean firstClass){
		
		this.max_tmp = max_tmp;
		this.max_rif = max_rif;
		this.max_vol = max_vol;
		this.max_atk_to20 = max_atk_to20;
		this.pa_lv1 = pa_lv1;
		this.pa_molt = pa_molt;
		this.pf_dice = pf_dice;
		this.lvl = lvl;
		this.firstClass = firstClass;
	}

	public void setStats(StatHandler stats) {
		
		this.stats = stats;
				
		tmpCurve();
		rifCurve();
		volCurve();
		atkCurve();
		paAtStart();
	}
	
	@Override
	public void tmpCurve() {
		
		int selector = (this.max_tmp == 12 ? 1 : 2);
		int val = 0;
		
		switch(selector) {
		
		case 1:
		
			val += (this.lvl == 1 ? 2 : 0);
			val += (this.lvl == 2 ? 3 : 0);
			val += (this.lvl == 3 ? 3 : 0);
			val += (this.lvl == 4 ? 4 : 0);
			val += (this.lvl == 5 ? 4 : 0);
			val += (this.lvl == 6 ? 5 : 0);
			val += (this.lvl == 7 ? 5 : 0);
			val += (this.lvl == 8 ? 6 : 0);
			val += (this.lvl == 9 ? 6 : 0);
			val += (this.lvl == 10 ? 7 : 0);
			val += (this.lvl == 11 ? 7 : 0);
			val += (this.lvl == 12 ? 8 : 0);
			val += (this.lvl == 13 ? 8 : 0);
			val += (this.lvl == 14 ? 9 : 0);
			val += (this.lvl == 15 ? 9 : 0);
			val += (this.lvl == 16 ? 10 : 0);
			val += (this.lvl == 17 ? 10 : 0);
			val += (this.lvl == 18 ? 11 : 0);
			val += (this.lvl == 19 ? 11 : 0);
			val += (this.lvl == 20 ? 12 : 0);
			
			tmp = val;
			break;
			
		case 2:
		
			val += (this.lvl == 1 ? 0 : 0);
			val += (this.lvl == 2 ? 0 : 0);
			val += (this.lvl == 3 ? 1 : 0);
			val += (this.lvl == 4 ? 1 : 0);
			val += (this.lvl == 5 ? 1 : 0);
			val += (this.lvl == 6 ? 2 : 0);
			val += (this.lvl == 7 ? 2 : 0);
			val += (this.lvl == 8 ? 2 : 0);
			val += (this.lvl == 9 ? 3 : 0);
			val += (this.lvl == 10 ? 3 : 0);
			val += (this.lvl == 11 ? 3 : 0);
			val += (this.lvl == 12 ? 4 : 0);
			val += (this.lvl == 13 ? 4 : 0);
			val += (this.lvl == 14 ? 4 : 0);
			val += (this.lvl == 15 ? 5 : 0);
			val += (this.lvl == 16 ? 5 : 0);
			val += (this.lvl == 17 ? 5 : 0);
			val += (this.lvl == 18 ? 6 : 0);
			val += (this.lvl == 19 ? 6 : 0);
			val += (this.lvl == 20 ? 6 : 0);
	
			tmp= val;
			break;
			
		default:
			
			tmp = 0;
			break;
		}
	}

	@Override
	public void rifCurve() {

		int selector = (this.max_rif == 12 ? 1 : 2);
		int val = 0;
		
		switch(selector) {
		
		case 1:
		
			val += (this.lvl == 1 ? 2 : 0);
			val += (this.lvl == 2 ? 3 : 0);
			val += (this.lvl == 3 ? 3 : 0);
			val += (this.lvl == 4 ? 4 : 0);
			val += (this.lvl == 5 ? 4 : 0);
			val += (this.lvl == 6 ? 5 : 0);
			val += (this.lvl == 7 ? 5 : 0);
			val += (this.lvl == 8 ? 6 : 0);
			val += (this.lvl == 9 ? 6 : 0);
			val += (this.lvl == 10 ? 7 : 0);
			val += (this.lvl == 11 ? 7 : 0);
			val += (this.lvl == 12 ? 8 : 0);
			val += (this.lvl == 13 ? 8 : 0);
			val += (this.lvl == 14 ? 9 : 0);
			val += (this.lvl == 15 ? 9 : 0);
			val += (this.lvl == 16 ? 10 : 0);
			val += (this.lvl == 17 ? 10 : 0);
			val += (this.lvl == 18 ? 11 : 0);
			val += (this.lvl == 19 ? 11 : 0);
			val += (this.lvl == 20 ? 12 : 0);
	
			rif = val;
			break;
			
		case 2:
		
			val += (this.lvl == 1 ? 0 : 0);
			val += (this.lvl == 2 ? 0 : 0);
			val += (this.lvl == 3 ? 1 : 0);
			val += (this.lvl == 4 ? 1 : 0);
			val += (this.lvl == 5 ? 1 : 0);
			val += (this.lvl == 6 ? 2 : 0);
			val += (this.lvl == 7 ? 2 : 0);
			val += (this.lvl == 8 ? 2 : 0);
			val += (this.lvl == 9 ? 3 : 0);
			val += (this.lvl == 10 ? 3 : 0);
			val += (this.lvl == 11 ? 3 : 0);
			val += (this.lvl == 12 ? 4 : 0);
			val += (this.lvl == 13 ? 4 : 0);
			val += (this.lvl == 14 ? 4 : 0);
			val += (this.lvl == 15 ? 5 : 0);
			val += (this.lvl == 16 ? 5 : 0);
			val += (this.lvl == 17 ? 5 : 0);
			val += (this.lvl == 18 ? 6 : 0);
			val += (this.lvl == 19 ? 6 : 0);
			val += (this.lvl == 20 ? 6 : 0);
	
			rif = val;
			break;
			
		default:
			
			rif = 0;
			break;
		}
		
	}

	@Override
	public void volCurve() {

		int selector = (this.max_vol == 12 ? 1 : 2);
		int val = 0;
		
		switch(selector) {
		
		case 1:
		
			val += (this.lvl == 1 ? 2 : 0);
			val += (this.lvl == 2 ? 3 : 0);
			val += (this.lvl == 3 ? 3 : 0);
			val += (this.lvl == 4 ? 4 : 0);
			val += (this.lvl == 5 ? 4 : 0);
			val += (this.lvl == 6 ? 5 : 0);
			val += (this.lvl == 7 ? 5 : 0);
			val += (this.lvl == 8 ? 6 : 0);
			val += (this.lvl == 9 ? 6 : 0);
			val += (this.lvl == 10 ? 7 : 0);
			val += (this.lvl == 11 ? 7 : 0);
			val += (this.lvl == 12 ? 8 : 0);
			val += (this.lvl == 13 ? 8 : 0);
			val += (this.lvl == 14 ? 9 : 0);
			val += (this.lvl == 15 ? 9 : 0);
			val += (this.lvl == 16 ? 10 : 0);
			val += (this.lvl == 17 ? 10 : 0);
			val += (this.lvl == 18 ? 11 : 0);
			val += (this.lvl == 19 ? 11 : 0);
			val += (this.lvl == 20 ? 12 : 0);
			
			vol = val;
			break;
			
		case 2:
		
			val += (this.lvl == 1 ? 0 : 0);
			val += (this.lvl == 2 ? 0 : 0);
			val += (this.lvl == 3 ? 1 : 0);
			val += (this.lvl == 4 ? 1 : 0);
			val += (this.lvl == 5 ? 1 : 0);
			val += (this.lvl == 6 ? 2 : 0);
			val += (this.lvl == 7 ? 2 : 0);
			val += (this.lvl == 8 ? 2 : 0);
			val += (this.lvl == 9 ? 3 : 0);
			val += (this.lvl == 10 ? 3 : 0);
			val += (this.lvl == 11 ? 3 : 0);
			val += (this.lvl == 12 ? 4 : 0);
			val += (this.lvl == 13 ? 4 : 0);
			val += (this.lvl == 14 ? 4 : 0);
			val += (this.lvl == 15 ? 5 : 0);
			val += (this.lvl == 16 ? 5 : 0);
			val += (this.lvl == 17 ? 5 : 0);
			val += (this.lvl == 18 ? 6 : 0);
			val += (this.lvl == 19 ? 6 : 0);
			val += (this.lvl == 20 ? 6 : 0);
			
			vol = val;
			break;
			
		default:
			
			vol = 0;
			break;
		}
		
	}

	@Override
	public void atkCurve() {
		
		int selector = (this.max_atk_to20 == 20 ? 1 : (this.max_atk_to20 == 15 ? 2 : 3));
		int val = 0;
		
		switch(selector) {
		
		case 1:
		
			val += (this.lvl == 1 ? 1 : 0);
			val += (this.lvl == 2 ? 2 : 0);
			val += (this.lvl == 3 ? 3 : 0);
			val += (this.lvl == 4 ? 4 : 0);
			val += (this.lvl == 5 ? 5 : 0);
			val += (this.lvl == 6 ? 6 : 0);
			val += (this.lvl == 7 ? 7 : 0);
			val += (this.lvl == 8 ? 8 : 0);
			val += (this.lvl == 9 ? 9 : 0);
			val += (this.lvl == 10 ? 10 : 0);
			val += (this.lvl == 11 ? 11 : 0);
			val += (this.lvl == 12 ? 12 : 0);
			val += (this.lvl == 13 ? 13 : 0);
			val += (this.lvl == 14 ? 14 : 0);
			val += (this.lvl == 15 ? 15 : 0);
			val += (this.lvl == 16 ? 16 : 0);
			val += (this.lvl == 17 ? 17 : 0);
			val += (this.lvl == 18 ? 18 : 0);
			val += (this.lvl == 19 ? 19 : 0);
			val += (this.lvl == 20 ? 20 : 0);
			
			atk = val;
			break;
			
		case 2:
		
			val += (this.lvl == 1 ? 0 : 0);
			val += (this.lvl == 2 ? 1 : 0);
			val += (this.lvl == 3 ? 2 : 0);
			val += (this.lvl == 4 ? 3 : 0);
			val += (this.lvl == 5 ? 3 : 0);
			val += (this.lvl == 6 ? 4 : 0);
			val += (this.lvl == 7 ? 5 : 0);
			val += (this.lvl == 8 ? 6 : 0);
			val += (this.lvl == 9 ? 6 : 0);
			val += (this.lvl == 10 ? 7 : 0);
			val += (this.lvl == 11 ? 8 : 0);
			val += (this.lvl == 12 ? 9 : 0);
			val += (this.lvl == 13 ? 9 : 0);
			val += (this.lvl == 14 ? 10 : 0);
			val += (this.lvl == 15 ? 11 : 0);
			val += (this.lvl == 16 ? 12 : 0);
			val += (this.lvl == 17 ? 12 : 0);
			val += (this.lvl == 18 ? 13 : 0);
			val += (this.lvl == 19 ? 14 : 0);
			val += (this.lvl == 20 ? 15 : 0);
			
			atk = val;
			break;
			
		case 3:
			
			val += (this.lvl == 1 ? 0 : 0);
			val += (this.lvl == 2 ? 1 : 0);
			val += (this.lvl == 3 ? 1 : 0);
			val += (this.lvl == 4 ? 2 : 0);
			val += (this.lvl == 5 ? 2 : 0);
			val += (this.lvl == 6 ? 3 : 0);
			val += (this.lvl == 7 ? 3 : 0);
			val += (this.lvl == 8 ? 4 : 0);
			val += (this.lvl == 9 ? 4 : 0);
			val += (this.lvl == 10 ? 5 : 0);
			val += (this.lvl == 11 ? 5 : 0);
			val += (this.lvl == 12 ? 6 : 0);
			val += (this.lvl == 13 ? 6 : 0);
			val += (this.lvl == 14 ? 7 : 0);
			val += (this.lvl == 15 ? 7 : 0);
			val += (this.lvl == 16 ? 8 : 0);
			val += (this.lvl == 17 ? 8 : 0);
			val += (this.lvl == 18 ? 9 : 0);
			val += (this.lvl == 19 ? 9 : 0);
			val += (this.lvl == 20 ? 10 : 0);
			
			atk = val;
			break;
			
		default:
			
			atk = 0;
			break;
		}
		
	}

	@Override
	public void paAtStart() {
		
		int selector = (this.firstClass == true ? 1 : 2);
		int val;
		
		switch(selector) {
		
		case 1:
			
			val = (pa_lv1 + stats.getIntBonus())*pa_molt;
			
			pa = val;
			break;
			
		case 2:
			
			val = 0;
			
			pa = val;
			break;
			
		default:
			
			val = 0;
			
			pa = val;
			break;
		
		}
	}

	public String toString() {
		
		
		return "tempra: "+ tmp +" riflessi: " + rif + " volonta: " + vol + " attacco: " + atk + " punti: " + pa;
	}
	
}
