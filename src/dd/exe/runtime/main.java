package dd.exe.runtime;

import dd.pg.classes.*;
import org.json.simple.JSONObject;
import dd.db.crud.*;
import dd.pg.stats.*;

public class main {

	public static void main(String[] args) {
		
		StatHandler stats = new StatHandler(15,15,15,8,8,8);
		Crud db = new Crud();

		Warrior classe = new Warrior(12,12,12,20,4,4,12,12,true, stats);
		
		System.out.println(stats.getSagBonus());
		System.out.println(classe);
		
		long spellindex = 362;
		
		db.searchSpellByWord("Fire");
	}

}
