package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/config.properties");// provide the path of property file

		// read the data from proprety file
		Properties prop = new Properties();

		// read the data from proprety file
		prop.load(fis);
           
		String username = prop.getProperty("username");

		System.out.println(username);

	}

}
