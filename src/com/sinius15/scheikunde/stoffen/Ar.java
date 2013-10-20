package com.sinius15.scheikunde.stoffen;

import com.sinius15.scheikunde.Matter;

public class Ar implements Matter {

	@Override
	public String name() {
		return "argon";
	}

	@Override
	public String symbol() {
		return "Ar";
	}

	@Override
	public float atomMassa() {
		return 39.95f;
	}

	@Override
	public int atomNumber() {
		return 18;
	}

}
