package com.sinius15.science.reactionSolver;

import com.sinius15.science.general.Binas;
import com.sinius15.science.general.Element;

public class Stof {

	public float molMassa = 0;
	public int aantalMols = 1;
	public String originalIn = "";
	public String name;
	
	public Stof(String in) throws Exception{
		originalIn = in;
		//decode first number!
		String temp = getNumbersInBegin(in);
		if(!temp.equals("")){
			aantalMols = Integer.parseInt(temp);
			in = in.replaceFirst(temp, "");
		}
		name = in;
		while(in.length() != 0){
			Element cur = null;
			int curAmount = 1;
			for(Element m : Binas.matters2)
				if(in.startsWith(m.symbol()))
					cur = m;
			if(cur == null)
				for(Element m : Binas.matters1)
					if(in.startsWith(m.symbol()))
						cur = m;
			if(cur == null)
				throw new Exception("could not found the matter that this string starts with: " + in);
			in = in.replaceFirst(cur.symbol(), "");
			temp = getNumbersInBegin(in);
			if(!temp.equals("")){
				in = in.replaceFirst(temp, "");
				curAmount = Integer.parseInt(temp);
			}
			molMassa = molMassa + (cur.atomMassa() * curAmount);
		}
	}
	
	public static String getNumbersInBegin(String s){
		String out = "";
		while(true){
			if(s.length() != 0 && isNumber(s.substring(0, 1))){
				out = out + s.substring(0, 1);
				s = s.substring(1, s.length());
			}else
				return out;
		}
	}
	
	public static boolean isNumber(String s){
		try{
			Integer.parseInt(s);
			return true;
		}catch(NumberFormatException e){
			return false; 
		}
	}
	
}
