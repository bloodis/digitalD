/**
 * 
 */
package dd.pg.classes;

import dd.pg.stats.*;
/**
 * @author piral
 *
 */
public class Warrior extends ClassTemplate {

	/**
	 * @param max_tmp
	 * @param max_rif
	 * @param max_vol
	 * @param max_atk_to20
	 * @param pa_lv1
	 * @param pa_molt
	 * @param pf_dice
	 * @param lvl
	 * @param firstClass
	 */
	public Warrior(int max_tmp, int max_rif, int max_vol, int max_atk_to20, int pa_lv1, int pa_molt, int pf_dice,int lvl, boolean firstClass, StatHandler stats) {
		super(max_tmp, max_rif, max_vol, max_atk_to20, pa_lv1, pa_molt, pf_dice, lvl, firstClass);
		super.setStats(stats);
	}

	
	
}
