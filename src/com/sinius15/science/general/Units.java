package com.sinius15.science.general;

public class Units {

	public static final int UGRAM = 0;
	public static final int MGRAM = 1;
	public static final int GRAM = 2;
	public static final int KGRAM = 3;
	public static final int TON = 4;
	
	public static float to(float in, int curEenheid, int toEenheid){
		float out = 0.0f;
		switch (toEenheid) {
		case UGRAM:
			out = toUGram(in, curEenheid);
			break;
		case MGRAM:
			out = toMGram(in, curEenheid);
			break;
		case GRAM:
			out = toGram(in, curEenheid);
			break;
		case KGRAM:
			out = toKGram(in, curEenheid);
			break;
		case TON:
			out = toTon(in, curEenheid);
			break;
		default:
			out = in;
			break;
		}
		return out;
	}
	
	public static String eenheidToString(int eenheid){
		String out = "";
		switch(eenheid){
			case UGRAM:
				out = "micro gram";
				break;
			case MGRAM:
				out = "mili gram";
				break;
			case GRAM:
				out = "gram";
				break;
			case KGRAM:
				out = "kilo gram";
				break;
			case TON:
				out = "ton";
				break;
			default:
				break;
		}
		return out;
	}
	
	public static float toUGram(float in, int curEenheid){
		float out = 0.0f;
		switch (curEenheid) {
		case UGRAM:
			out = in;
			break;
		case MGRAM:
			out = in * 1000;
			break;
		case GRAM:
			out = in * 1000 * 1000;
			break;
		case KGRAM:
			out = in * 1000 * 1000 * 1000;
			break;
		case TON:
			out = in * 1000 * 1000 * 1000 * 1000;
			break;
		default:
			out = in;
			break;
		}
		return out;
	}
	
	public static float toMGram(float in, int curEenheid){
		float out = 0.0f;
		switch (curEenheid) {
		case UGRAM:
			out = in / 1000;
			break;
		case MGRAM:
			out = in;
			break;
		case GRAM:
			out = in * 1000;
			break;
		case KGRAM:
			out = in * 1000 * 1000;
			break;
		case TON:
			out = in * 1000 * 1000 * 1000;
			break;
		default:
			out = in;
			break;
		}
		return out;
	}
	
	public static float toGram(float in, int curEenheid){
		float out = 0.0f;
		switch (curEenheid) {
		case UGRAM:
			out = in / 1000 / 1000;   
			break;
		case MGRAM:
			out = in / 1000;
			break;
		case GRAM:
			out = in;
			break;
		case KGRAM:
			out = in * 1000;
			break;
		case TON:
			out = in * 1000 * 1000;
			break;
		default:
			out = in;
			break;
		}
		return out;
	}
	
	public static float toKGram(float in, int curEenheid){
		float out = 0.0f;
		switch (curEenheid) {
		case UGRAM:
			out = in / 1000 / 1000 / 1000;   
			break;
		case MGRAM:
			out = in / 1000 / 1000;
			break;
		case GRAM:
			out = in / 1000;
			break;
		case KGRAM:
			out = in;
			break;
		case TON:
			out = in * 1000;
			break;
		default:
			out = in;
			break;
		}
		return out;
	}
	
	public static float toTon(float in, int curEenheid){
		float out = 0.0f;
		switch (curEenheid) {
		case UGRAM:
			out = in / 1000 / 1000 / 1000 / 1000;   
			break;
		case MGRAM:
			out = in / 1000 / 1000 / 1000;
			break;
		case GRAM:
			out = in / 1000 / 1000;
			break;
		case KGRAM:
			out = in / 1000;
			break;
		case TON:
			out = in;
			break;
		default:
			out = in;
			break;
		}
		return out;
	}
	
	
}
