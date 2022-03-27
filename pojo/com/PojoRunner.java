package com.pojo.com;

import com.pojo.PojoClass;

public class PojoRunner {
	public static void main(String[] args) {
		
		PojoClass obj = new PojoClass();
		
		obj.setName("SAKTHI");
		obj.setAge(25);
		
		int age = obj.getAge();
		String name = obj.getName();
		
		System.out.println("Name="+name+"    "+"Age= "+age);
		
	}

}
