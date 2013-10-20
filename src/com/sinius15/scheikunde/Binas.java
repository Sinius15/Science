package com.sinius15.scheikunde;

import java.util.ArrayList;

public class Binas {

	public static ArrayList<Matter> matters1 = new ArrayList<>();
	public static ArrayList<Matter> matters2 = new ArrayList<>();
	
	public static void Init(){
		
		try {
			
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			if (classLoader == null) 
			    classLoader = Class.class.getClassLoader();
			
			ArrayList<Matter> temp = IOer.loadfile(classLoader.getResourceAsStream("Data.txt"));
			for(Matter m : temp){
				if(m.symbol().length() == 2)
					matters2.add(m);
				else
					matters1.add(m);
			}
		} catch (Exception e) {
			e.printStackTrace();
//			matters2.add(new Al());
//			matters2.add(new Ar());
//			matters2.add(new Si());
//			matters2.add(new Be());
//			matters2.add(new Cl());
//			matters2.add(new He());
//			matters2.add(new Li());
//			matters2.add(new Mg());
//			matters2.add(new Na());
//			matters2.add(new Ne());
//			matters2.add(new Fe());
//			
//			matters1.add(new O());
//			matters1.add(new P());
//			matters1.add(new S());
//			matters1.add(new B());
//			matters1.add(new C());
//			matters1.add(new F());
//			matters1.add(new H());
//			matters1.add(new N());
			
		}
		
	}
	
	public static Matter getMatterByName(String name){
		for(Matter m : matters2){
			if(m.name().equals(name))
				return m;
		}
		for(Matter m : matters1){
			if(m.name().equals(name))
				return m;
		}	
		return null;
	}
	
	public static Matter getMatterbySymbol(String symbol){
		for(Matter m : matters2)
			if(m.symbol().equals(symbol))
				return m;
		for(Matter m : matters1)
			if(m.symbol().equals(symbol))
				return m;
		return null;
	}
}
