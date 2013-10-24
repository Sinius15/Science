package com.sinius15.science;

import com.sinius15.science.general.Binas;

public class Startup {
	
	public static void main(String[] args) {
		MainScreen f = new MainScreen();
		f.setVisible(true);
		
		Binas.Init();
	}

}
