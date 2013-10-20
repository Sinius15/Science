package com.sinius15.scheikunde.stoffen;

import com.sinius15.scheikunde.Matter;

public class Li implements Matter {

	@Override
	public String name() {
		return "lithium";
	}

	@Override
	public String symbol() {
		return "Li";
	}

	@Override
	public float atomMassa() {
		return 6.941f;
	}

	@Override
	public int atomNumber() {
		return 3;
	}

}
