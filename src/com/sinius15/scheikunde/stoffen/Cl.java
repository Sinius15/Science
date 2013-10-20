package com.sinius15.scheikunde.stoffen;

import com.sinius15.scheikunde.Matter;

public class Cl implements Matter {

	@Override
	public String name() {
		return "chloor";
	}

	@Override
	public String symbol() {
		return "Cl";
	}

	@Override
	public float atomMassa() {
		return 35.45f;
	}

	@Override
	public int atomNumber() {
		return 17;
	}

}
