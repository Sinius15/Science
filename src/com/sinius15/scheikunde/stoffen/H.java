package com.sinius15.scheikunde.stoffen;

import com.sinius15.scheikunde.Matter;

public class H implements Matter {

	@Override
	public String name() {
		return "waterstof";
	}

	@Override
	public String symbol() {
		return "H";
	}

	@Override
	public float atomMassa() {
		return 1.008f;
	}

	@Override
	public int atomNumber() {
		return 1;
	}

}
