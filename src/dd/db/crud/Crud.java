package dd.db.crud;

import java.awt.List;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Crud {

	protected JSONParser parser = new JSONParser();

	public Crud() {};
	
	 public void searchSpellByIndex(long index) {
		 
		 JSONObject result = new JSONObject();
		 
			 try {
				 
				 JSONArray dbArray = (JSONArray) parser.parse(new FileReader("E:\\Download\\TestSpellDB.json"));
				 Iterator it = dbArray.iterator();
				 
				 while(it.hasNext())
				  {					 
					Object spellObj = it.next();
				    JSONObject spell = (JSONObject) spellObj;
	
				    if(index == (long)spell.get("Index")) { 
				    	
				    	result = spell;				    	
				    }
				  }
				 
			 }catch(Exception e){ 
				 System.err.println(e); 
			  }
			 
		System.out.println((String)result.get("Name"));
		System.out.println((String)result.get("Level"));
		System.out.println((String)result.get("School"));
		System.out.println((String)result.get("Description"));
	 }

	 
	 public void searchSpellByWord(String word) {
		 
		 LinkedHashMap<String,String[]> result = new LinkedHashMap<String,String[]>();
		 
			 try {
				 
				 JSONArray dbArray = (JSONArray) parser.parse(new FileReader("TestSpellDB.json"));
				 Iterator it = dbArray.iterator();				 
				 
				 while(it.hasNext())
				  {					 
					Object spellObj = it.next();
				    JSONObject spell = (JSONObject) spellObj;
	   				    				
				    		String key = (String)spell.get("Name");
				    		String[] value = new String[3];
				    		
				    		value[0] = (String)spell.get("Level");
				    		value[1] = (String)spell.get("School");
				    		value[2] = (String)spell.get("Description");
				    		
					    	result.put(key, value);
					    
				    
				  }
				  
				 
			 }catch(Exception e){ 
				 System.err.println(e); 
			  }
	/*	
		for(int i = 0; i<result.size(); i++) {
			
			Object spellObj = result.get(i);
		    JSONObject spell = (JSONObject) spellObj;
			
		System.out.println((String)spell.get("Name"));
		System.out.println((String)spell.get("Level"));
		System.out.println((String)spell.get("School"));
		System.out.println((String)spell.get("Description"));
	
		}
	*/
			 
		 for(Map.Entry<String, String[]> entry : result.entrySet()) {
			 
			    String[] value = entry.getValue();
	
			    String name = entry.getKey();
			    String[] words = name.split(" ");
			    
		    for(int i = 0; i<words.length; i++){
				
		    	if(word.equals(words[i])) {
			
		    		System.out.println("");
		    		System.out.println(entry.getKey());
		    		System.out.println(value[0]);
		    		System.out.println(value[1]);
		    		System.out.println(value[2]);
		    		System.out.println("");
		    	}
		    }	
		 }
		 
	}
}

