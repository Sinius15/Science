package com.sinius15.scheikunde.stoffen;

import com.sinius15.scheikunde.Matter;

public class Ne implements Matter {

	@Override
	public String name() {
		return "neon";
	}

	@Override
	public String symbol() {
		return "Ne";
	}

	@Override
	public float atomMassa() {
		return 20.18f;
	}

	@Override
	public int atomNumber() {
		return 10;
	}

}
