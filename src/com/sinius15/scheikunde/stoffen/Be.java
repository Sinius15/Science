package com.sinius15.scheikunde.stoffen;

import com.sinius15.scheikunde.Matter;

public class Be implements Matter {

	@Override
	public String name() {
		return "9.012";
	}

	@Override
	public String symbol() {
		return "Be";
	}

	@Override
	public float atomMassa() {
		return 9.012f;
	}

	@Override
	public int atomNumber() {
		return 4;
	}

}
