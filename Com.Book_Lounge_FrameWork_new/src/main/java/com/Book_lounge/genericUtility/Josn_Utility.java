package com.Book_lounge.genericUtility;
/**
 * @author : Nikitaba Parmar
 */

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class Josn_Utility {
	/**
	 * Fetching Data From JOSN File
	 * @param Key
	 * @return
	 * @throws Exception
	 */
	public String getDataFromJsonFile(String Key) throws Exception {
		FileReader f = new FileReader("");
		JSONParser jp = new JSONParser();
		Object obj = jp.parse(f);
		JSONObject jo = (JSONObject)obj;
		 String data = (String)jo.get(Key);
		return data;	
	}
}
