package com.sinius15.scheikunde.stoffen;

import com.sinius15.scheikunde.Matter;

public class He implements Matter {

	@Override
	public String name() {
		return "helium";
	}

	@Override
	public String symbol() {
		return "He";
	}

	@Override
	public float atomMassa() {
		return 4.003f;
	}

	@Override
	public int atomNumber() {
		return 2;
	}

}
