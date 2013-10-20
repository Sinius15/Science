package com.sinius15.scheikunde.stoffen;

import com.sinius15.scheikunde.Matter;

public class P implements Matter {

	@Override
	public String name() {
		return "fosfor";
	}

	@Override
	public String symbol() {
		return "P";
	}

	@Override
	public float atomMassa() {
		return 30.97f;
	}

	@Override
	public int atomNumber() {
		return 15;
	}

}
