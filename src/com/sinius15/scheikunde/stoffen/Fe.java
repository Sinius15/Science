package com.sinius15.scheikunde.stoffen;

import com.sinius15.scheikunde.Matter;

public class Fe implements Matter {

	@Override
	public String name() {
		return "ijzer";
	}

	@Override
	public String symbol() {
		return "Fe";
	}

	@Override
	public float atomMassa() {
		return 55.85f;
	}

	@Override
	public int atomNumber() {
		return 26;
	}

}
