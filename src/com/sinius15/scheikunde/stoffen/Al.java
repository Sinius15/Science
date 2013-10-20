package com.sinius15.scheikunde.stoffen;

import com.sinius15.scheikunde.Matter;

public class Al implements Matter {

	@Override
	public String name() {
		return "aluminium";
	}

	@Override
	public String symbol() {
		return "Al";
	}

	@Override
	public float atomMassa() {
		return 26.98f;
	}

	@Override
	public int atomNumber() {
		return 13;
	}

}
