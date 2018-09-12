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

	//parser for Json loading
	protected JSONParser parser = new JSONParser();
	
	//Crud constructor
	public Crud() {};
	
	public void searchSpellByIndex(long index) {
		 
		// search result 
		 JSONObject result = new JSONObject();
		 
			 try {
				 
				 //loading json in memory
				 JSONArray dbArray = (JSONArray) parser.parse(new FileReader("E:\\Download\\TestSpellDB.json"));
				 //json iterator declaration
				 Iterator it = dbArray.iterator();
				 
				 //json scrolling loop
				 while(it.hasNext())
				  {					 
					Object spellObj = it.next();
				    JSONObject spell = (JSONObject) spellObj;
				    
				   //putting search result in 'result' variable
				    if(index == (long)spell.get("Index")) { 
				    	
				    	result = spell;				    	
				    }
				  }
				 
			 }catch(Exception e){ 
				 
				 //print error stack trace
				 System.err.println(e); 
			  }
		
		//printing search result
		System.out.println((String)result.get("Name"));
		System.out.println((String)result.get("Level"));
		System.out.println((String)result.get("School"));
		System.out.println((String)result.get("Description"));
	 }

	 
	 public void searchSpellByWord(String word) {
		 
		 //result linked hash map declaration
		 LinkedHashMap<String,String[]> result = new LinkedHashMap<String,String[]>();
		 
			 try {
				 
				 JSONArray dbArray = (JSONArray) parser.parse(new FileReader("TestSpellDB.json"));
				 Iterator it = dbArray.iterator();				 
				 
				 while(it.hasNext())
				  {					 
					Object spellObj = it.next();
				    JSONObject spell = (JSONObject) spellObj;
	   				    	
				    		//setting every spell name as key for spell attribute value
				    		String key = (String)spell.get("Name");
				    		String[] value = new String[3];
				    		
				    		//saving every attribute in a string array
				    		value[0] = (String)spell.get("Level");
				    		value[1] = (String)spell.get("School");
				    		value[2] = (String)spell.get("Description");
				    		
				    		//putting name as 'key' and attribute as 'value'
					    	result.put(key, value);
					    
				  }
				  
				 
			 }catch(Exception e){ 
				 System.err.println(e); 
			  }

		//hashmap scrolling loop
		 for(Map.Entry<String, String[]> entry : result.entrySet()) {
			 
			    String[] value = entry.getValue();
			    
			    //name splitting to find matching words
			    String name = entry.getKey();
			    String[] words = name.split(" ");
			    
		    for(int i = 0; i<words.length; i++){
				
		    	//if atleast one word in the name match the search term print the spell name and attributes
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

