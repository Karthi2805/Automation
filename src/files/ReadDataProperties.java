package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataProperties {
	
	public static String sFile = "./files/Data/Environment.Properties";
	public static Properties oProperty;
	
	public static String readpropertyvalue (String propkey) throws Exception {
		String sValue = "";
		File oFile = new File(sFile);
		FileInputStream in = new FileInputStream(oFile); 
		oProperty = new Properties();
		oProperty.load(in);
		sValue = oProperty.getProperty(propkey);
		return sValue;
		
	}

	public static void main(String[] args) throws Exception {
		System.out.println("UAT url is :" + readpropertyvalue("UAT_url"));

	}

}
