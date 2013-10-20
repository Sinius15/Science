package com.sinius15.scheikunde.stoffen;

import com.sinius15.scheikunde.Matter;

public class C implements Matter {

	@Override
	public String name() {
		return "koolstof";
	}

	@Override
	public String symbol() {
		return "C";
	}

	@Override
	public float atomMassa() {
		return 12.01f;
	}

	@Override
	public int atomNumber() {
		return 6;
	}

}
