package com.sinius15.scheikunde.stoffen;

import com.sinius15.scheikunde.Matter;

public class S implements Matter {

	@Override
	public String name() {
		return "zwavel";
	}

	@Override
	public String symbol() {
		return "S";
	}

	@Override
	public float atomMassa() {
		return 32.06f;
	}

	@Override
	public int atomNumber() {
		return 16;
	}

}
