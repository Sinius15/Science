package com.sinius15.scheikunde;

import com.sinius15.scheikunde.gui.SKFrame;

public class Start {
	
	public static SKFrame frame;

	public static void main(String[] args) {
		frame = new SKFrame();
		frame.setVisible(true);
		Binas.Init();
	}
	
}
