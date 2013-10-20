package com.sinius15.scheikunde.stoffen;

import com.sinius15.scheikunde.Matter;

public class N implements Matter {

	@Override
	public String name() {
		return "stikstof";
	}

	@Override
	public String symbol() {
		return "N";
	}

	@Override
	public float atomMassa() {
		return 14.01f;
	}

	@Override
	public int atomNumber() {
		return 7;
	}

}
