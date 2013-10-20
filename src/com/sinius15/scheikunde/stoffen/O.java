package com.sinius15.scheikunde.stoffen;

import com.sinius15.scheikunde.Matter;

public class O implements Matter {

	@Override
	public String name() {
		return "zuurstof";
	}

	@Override
	public String symbol() {
		return "O";
	}

	@Override
	public float atomMassa() {
		return 16.00f;
	}

	@Override
	public int atomNumber() {
		return 8;
	}

}
