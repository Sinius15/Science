package com.sinius15.scheikunde.stoffen;

import com.sinius15.scheikunde.Matter;

public class Na implements Matter {

	@Override
	public String name() {
		return "natrium";
	}

	@Override
	public String symbol() {
		return "Na";
	}

	@Override
	public float atomMassa() {
		return 22.99f;
	}

	@Override
	public int atomNumber() {
		return 11;
	}

}
