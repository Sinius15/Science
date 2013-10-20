package com.sinius15.scheikunde;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class IOer {

	public static void saveFile(File f, ArrayList<Element> in) throws IOException{
		if(!f.exists())
			f.createNewFile();
		PrintWriter out = new PrintWriter(f);
		for(Element m : in){
			out.println(m.symbol() + ";" + m.name() + ";" + m.atomNumber() + ";" + m.atomMassa());
		}
		out.close();
	}
	
	public static ArrayList<Element> loadfile(InputStream inputStream) throws FileNotFoundException{
		ArrayList<Element> out = new ArrayList<>();
		Scanner scan = new Scanner(inputStream);
		String line;
		while(scan.hasNextLine()){
			line = scan.nextLine();
			final String[] split = line.split(";");
			Element temp = new Element() {
				@Override
				public String symbol() {
					return split[0];
				}
				
				@Override
				public String name() {
					return split[1];
				}
				
				@Override
				public int atomNumber() {
					return Integer.parseInt(split[2]);
				}
				
				@Override
				public float atomMassa() {
					return Float.parseFloat(split[3]);
				}
			};
			out.add(temp);
		}	
		scan.close();
		
		return out;
	}
	
}
