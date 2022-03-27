package com.reader.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	static Properties p;

	public Configuration_Reader() throws IOException {
		File f = new File(
				"C:\\Users\\SAKTHI\\eclipse-workspace\\First_Maven\\src\\test\\java\\com\\configuration\\com\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public String getBrowser() {
		String browser = p.getProperty("browser");	
		return browser;
	}
	
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String getUsername() {
		String username = p.getProperty("username");
		return username;
	}

	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
	
	public String getFirstname() {
		String firstname = p.getProperty("firstname");
		return firstname;
	}
	
	public String getLastname() {
		String lastname = p.getProperty("lastname");
		return lastname;
	}
	
	public String getAddress() {
		String address = p.getProperty("address");
		return address;
	}
	
	public String getCardNo() {
		String cardno = p.getProperty("cardno");
		return cardno;
	}
	
	public String getCvv() {
		String cvv = p.getProperty("cvv");
		return cvv;
	}
	
//	public String getLocation() {
//		String location = p.getProperty("location");
//		return location;
//	}
//	
//	public String getValue() {
//		String value = p.getProperty("value");
//		return value;
//	}
//	
//	public String getVisible() {
//		String visible = p.getProperty("visible");
//		return visible;
//
//	}
//	
//	public String getIndex() {
//		String index = p.getProperty("index");
//		return index;
//	}
}
