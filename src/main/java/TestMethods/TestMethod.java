package TestMethods;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import Utility.JsonReader;

public class TestMethod extends JsonReader {

static JSONObject PlayerJsonObject = readJSONFile();
	
public static int numberofForeignPlayers() throws IOException {
		
		JSONArray players = (JSONArray) PlayerJsonObject.get("player");
		int countOfFP = 0;
		for(int i=0;i<players.size();i++) {
			
			JSONObject obj =(JSONObject) players.get(i);
			if(!(obj.get("country").toString().equals("India"))) {
				countOfFP++;
			}
		}
		return countOfFP;
	}


public static int numberofWicketKeepers() throws IOException {
		
		JSONArray players = (JSONArray) PlayerJsonObject.get("player");
		int countOfWK = 0;
		for(int i=0;i<players.size();i++) {
			
			JSONObject obj =(JSONObject) players.get(i);
			if(obj.get("role").toString().equals("Wicket-keeper")) {
				countOfWK++;
			}
		}
		return countOfWK;
	}
	


}
