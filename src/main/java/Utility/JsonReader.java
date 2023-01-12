package Utility;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader {
	
	 static String  path = "testfiles//TeamRCB.json";
	 static JSONParser parser = new JSONParser();
	 static JSONObject jsonObject = null ;
	


public static  JSONObject readJSONFile()  {

		try {
			 jsonObject = (JSONObject) parser.parse(new FileReader(path));
			 
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		return jsonObject;
	
	
		
		}

}
