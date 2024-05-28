package com.Book_lounge.genericUtility;
/**
 * @author Nikitaba Parmar
 */

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	/**
	 * Fetching Data From Property File
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public String getDataFromProperyFile(String key) throws Exception {
		FileInputStream fis= new FileInputStream("./src/main/resources/Propery_Book_lounge.properties");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
}
