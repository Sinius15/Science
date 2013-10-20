package com.sinius15.scheikunde.stoffen;

import com.sinius15.scheikunde.Matter;

public class Mg implements Matter {

	@Override
	public String name() {
		return "magnesium";
	}

	@Override
	public String symbol() {
		return "Mg";
	}

	@Override
	public float atomMassa() {
		return 24.31f;
	}

	@Override
	public int atomNumber() {
		return 12;
	}

}