package com.sinius15.scheikunde.stoffen;

import com.sinius15.scheikunde.Matter;

public class F implements Matter {

	@Override
	public String name() {
		return "fluor";
	}

	@Override
	public String symbol() {
		return "F";
	}

	@Override
	public float atomMassa() {
		return 19.00f;
	}

	@Override
	public int atomNumber() {
		return 9;
	}

}
