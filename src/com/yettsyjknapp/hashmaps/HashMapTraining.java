package com.yettsyjknapp.hashmaps;

import java.util.HashMap;

public class HashMapTraining {

	public static void main(String[] args) {
//		int a = 10;
//		int b = 3;
//		int c = 88;
//		
//		HashMap<String, Integer> happy = new HashMap<String, Integer>();
//		happy.put("a",10);
//		happy.put("b", 3);
//		happy.put("c", 88);
//		System.out.println(happy);
//		System.out.println(happy.get("c"));
//	}
		
		HashMap<String, String> fun = new HashMap<>();
			fun.put("bobby1998joe", "Password!@#");
			fun.put("helloKitty", "Password!23");
			
			System.out.println(fun.replace("Password!23", "P123"));
			
//			fun.remove("helloKitty");
			System.out.println(fun.containsValue("Password!23"));//true or false within an if statement
			
			
			System.out.println(fun);
			
	}

}
