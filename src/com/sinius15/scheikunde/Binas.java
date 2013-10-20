package com.sinius15.scheikunde;

import java.util.ArrayList;

public class Binas {

	public static ArrayList<Element> matters1 = new ArrayList<>();
	public static ArrayList<Element> matters2 = new ArrayList<>();
	
	public static void Init(){
		
		try {
			
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			if (classLoader == null) 
			    classLoader = Class.class.getClassLoader();
			
			ArrayList<Element> temp = IOer.loadfile(classLoader.getResourceAsStream("Data.txt"));
			for(Element m : temp){
				if(m.symbol().length() == 2)
					matters2.add(m);
				else
					matters1.add(m);
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	public static Element getMatterByName(String name){
		for(Element m : matters2){
			if(m.name().equals(name))
				return m;
		}
		for(Element m : matters1){
			if(m.name().equals(name))
				return m;
		}	
		return null;
	}
	
	public static Element getMatterbySymbol(String symbol){
		for(Element m : matters2)
			if(m.symbol().equals(symbol))
				return m;
		for(Element m : matters1)
			if(m.symbol().equals(symbol))
				return m;
		return null;
	}
}
